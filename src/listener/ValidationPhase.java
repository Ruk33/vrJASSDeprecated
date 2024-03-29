package listener;

import java.util.LinkedList;

import org.antlr.v4.runtime.tree.TerminalNode;

import expression.ABExpression;
import expression.MathExpression;
import expression.VariableExpression;
import statement.ReturnStatement;
import statement.SetVariableStatement;
import symbol.PrimitiveType;
import symbol.Symbol;
import util.ElementContainer;
import util.Error;
import validator.AndOrExpressionValidator;
import validator.FunctionReturnStatementValidator;
import validator.MathExpressionValidator;
import validator.SetVariableStatementValidator;
import validator.Validator;
import validator.VariableExpressionValidator;
import vrjass.vrJASSBaseListener;
import vrjass.vrJASSParser.AndExpressionContext;
import vrjass.vrJASSParser.LocalVariableStatementContext;
import vrjass.vrJASSParser.MathExpressionContext;
import vrjass.vrJASSParser.OrExpressionContext;
import vrjass.vrJASSParser.RequirementListContext;
import vrjass.vrJASSParser.ReturnStatementContext;
import vrjass.vrJASSParser.SetVariableStatementContext;

public class ValidationPhase extends vrJASSBaseListener {

	protected ElementContainer elementContainer;
	protected Validator validator;

	public ValidationPhase(ElementContainer elementContainer) {
		this.elementContainer = elementContainer;
		this.validator = new Validator();
	}

	public LinkedList<Error> getErrors() {
		return this.validator.getErrors();
	}

	public boolean validateAll() {
		return this.validator.validateAll();
	}

	@Override
	public void enterRequirementList(RequirementListContext ctx) {
		Symbol symbol = this.elementContainer.getSymbols().get(ctx);

		for (TerminalNode requirement : ctx.ID()) {
			if (symbol.resolve(requirement.getText(), PrimitiveType.LIBRARY) == null) {
				this.validator.getErrors().add(Error.createFromToken(requirement.getSymbol(), "Library " + requirement.getText() + " not found, u mad?"));
			}
		}
	}

	@Override
	public void exitReturnStatement(ReturnStatementContext ctx) {
		this.validator.add(new FunctionReturnStatementValidator((ReturnStatement) this.elementContainer.getStatements().get(ctx), ctx.expr().getStart()));
	}

	@Override
	public void exitOrExpression(OrExpressionContext ctx) {
		ABExpression expression = (ABExpression) this.elementContainer.getExpressions().get(ctx);
		this.validator.add(new AndOrExpressionValidator(expression, ctx.getStart()));
	}

	@Override
	public void exitAndExpression(AndExpressionContext ctx) {
		ABExpression expression = (ABExpression) this.elementContainer.getExpressions().get(ctx);
		this.validator.add(new AndOrExpressionValidator(expression, ctx.getStart()));
	}

	@Override
	public void exitMathExpression(MathExpressionContext ctx) {
		this.validator.add(new MathExpressionValidator((MathExpression) this.elementContainer.getExpressions().get(ctx), ctx.getStart()));
	}

	@Override
	public void exitSetVariableStatement(SetVariableStatementContext ctx) {
		this.validator.add(new VariableExpressionValidator((VariableExpression) this.elementContainer.getExpressions().get(ctx.expr(0)), ctx.getStart()));
		this.validator.add(new SetVariableStatementValidator((SetVariableStatement) this.elementContainer.getStatements().get(ctx), ctx.getStart()));
	}

	@Override
	public void exitLocalVariableStatement(LocalVariableStatementContext ctx) {
		if (ctx.variableStatement().expr() != null) {
			this.validator.add(new VariableExpressionValidator((VariableExpression) this.elementContainer.getExpressions().get(ctx), ctx.getStart()));
		}
	}

}
