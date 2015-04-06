package validator;

import java.util.LinkedList;

import expression.ComparisonBooleanExpression;
import expression.Expression;
import statement.ReturnStatement;
import symbol.FunctionSymbol;
import symbol.PrimitiveType;
import symbol.Symbol;
import util.ErrorBag;
import util.VariableTypeDetector;

public class FunctionValidator implements Validator {

	protected ComparisonBooleanExpressionValidator comparisonBooleanExpressionValidator;
	protected ErrorBag errorBag;
	protected FunctionSymbol function;

	public FunctionValidator(FunctionSymbol function) {
		this.comparisonBooleanExpressionValidator = new ComparisonBooleanExpressionValidator();
		this.errorBag = new ErrorBag();
		this.function = function;
	}

	public ErrorBag getErrorBag() {
		return this.errorBag;
	}

	protected boolean checkReturnExpressions() {
		for (ReturnStatement returnStatement : this.function.getReturnStatements()) {
			Expression returnExpression = returnStatement.getExpression();

			if (returnExpression instanceof ComparisonBooleanExpression) {
				if (!this.comparisonBooleanExpressionValidator.setExpression((ComparisonBooleanExpression) returnExpression).check()) {
					this.errorBag.addAll(this.comparisonBooleanExpressionValidator.getErrorBag().getMessages());
					return false;
				}
			}
		}

		return true;
	}

	protected boolean checkReturnType() {
		String returnType = this.function.getReturnType();

		if (VariableTypeDetector.isUserType(returnType)) {
			Symbol resolvedReturnType = this.function.resolveBackwards(returnType, PrimitiveType.CLASS);

			if (resolvedReturnType == null) {
				this.errorBag.add("Return type " + returnType + " is not defined");
				return false;
			}

			if (!this.function.hasAccess(resolvedReturnType)) {
				this.errorBag.add("Function " + this.function.getFullName() + " does not have access to " + returnType);
				return false;
			}
		}

		LinkedList<ReturnStatement> returnStatements = this.function.getReturnStatements();

		if (returnStatements.size() == 0) {
			if (!returnType.equals("nothing")) {
				this.errorBag.add("Function " + this.function.getFullName() + " is missing return statement(s)");
				return false;
			}
		} else {
			for (ReturnStatement returnStatement : returnStatements) {
				if (!returnStatement.getExpression().getType().equals(returnType)) {
					this.errorBag.add("Function " + this.function.getFullName() + " returns " + returnType + ", but it is actually trying to return " + returnStatement.getExpression().getType());
					return false;
				}
			}
		}

		return true;
	}

	@Override
	public boolean check() {
		return this.checkReturnType() && this.checkReturnExpressions();
	}

}
