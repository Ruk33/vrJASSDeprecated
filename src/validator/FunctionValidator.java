package validator;

import java.util.LinkedList;

import statement.ReturnStatement;
import symbol.FunctionSymbol;
import symbol.PrimitiveType;
import symbol.Symbol;
import util.ErrorBag;
import util.VariableTypeDetector;

public class FunctionValidator implements Validator {

	protected FunctionSymbol function;
	protected ErrorBag errorBag;

	public FunctionValidator(FunctionSymbol function) {
		this.function = function;
		this.errorBag = new ErrorBag();
	}

	public ErrorBag getErrorBag() {
		return this.errorBag;
	}

	public boolean checkReturnType() {
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
				if (returnStatement.getExpression() == null) {
					continue;
				}

				if (!returnStatement.getExpression().getType().equals(returnType)) {
					this.errorBag.add("Function " + this.function.getFullName() + " returns " + returnType + ", but it is actually trying to return " + returnStatement.getExpression().getType());
					return false;
				}
			}
		}

		return true;
	}

}
