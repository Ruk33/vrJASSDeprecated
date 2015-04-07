package listener;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import expression.ABExpression;
import expression.BooleanExpression;
import expression.ComparisonBooleanExpression;
import expression.ComparisonBooleanExpression.Operator;
import expression.Expression;
import expression.IntegerExpression;
import expression.MathExpression;
import expression.MathExpression.Operation;
import expression.NullExpression;
import expression.ParenthesisExpression;
import expression.VariableExpression;
import statement.ReturnStatement;
import symbol.ArgumentSymbol;
import symbol.DependencyDefiner;
import symbol.FunctionSymbol;
import symbol.LibrarySymbol;
import symbol.LimboSymbol;
import symbol.LocalVariableSymbol;
import symbol.PrimitiveType;
import symbol.ScopeSymbol;
import symbol.VariableSymbol;
import symbol.Visibility;
import util.ElementContainer;
import vrjass.vrJASSBaseListener;
import vrjass.vrJASSParser.BooleanExpressionContext;
import vrjass.vrJASSParser.ComparisonExpressionContext;
import vrjass.vrJASSParser.FunctionStatementContext;
import vrjass.vrJASSParser.IntegerExpressionContext;
import vrjass.vrJASSParser.LibraryBlockStatementContext;
import vrjass.vrJASSParser.LocalVariableArrayStatementContext;
import vrjass.vrJASSParser.LocalVariableStatementContext;
import vrjass.vrJASSParser.MathExpressionContext;
import vrjass.vrJASSParser.NullExpressionContext;
import vrjass.vrJASSParser.ParenthesisExpressionContext;
import vrjass.vrJASSParser.RequirementListContext;
import vrjass.vrJASSParser.ReturnStatementContext;
import vrjass.vrJASSParser.TypeArgumentContext;
import vrjass.vrJASSParser.VariableArrayExpressionContext;
import vrjass.vrJASSParser.VariableExpressionContext;

public class DefPhase extends vrJASSBaseListener {

	protected ElementContainer elementContainer;

	protected LimboSymbol limboSymbol;
	protected ScopeSymbol scopeSymbol;

	protected DependencyDefiner dependencyDefiner;

	public DefPhase() {
		this.elementContainer = new ElementContainer();

		this.limboSymbol = new LimboSymbol();
		this.scopeSymbol = this.limboSymbol;

		this.dependencyDefiner = new DependencyDefiner(this.limboSymbol);
	}

	public ElementContainer getElementContainer() {
		return this.elementContainer;
	}

	public DefPhase defineAllDependencies() {
		this.dependencyDefiner.defineAll();
		return this;
	}

	protected Visibility getVisibilityFromCtx(ParserRuleContext ctx) {
		if (ctx != null) {
			if (ctx.getText().equals("private")) {
				return Visibility.PRIVATE;
			} else if (ctx.getText().equals("protected")) {
				return Visibility.PROTECTED;
			}
		}

		return Visibility.PUBLIC;
	}

	protected DefPhase enterScope(ScopeSymbol scopeSymbol) {
		this.scopeSymbol = scopeSymbol;
		return this;
	}

	protected DefPhase exitScope() {
		this.scopeSymbol = (ScopeSymbol) this.scopeSymbol.getParent();
		return this;
	}

	@Override
	public void enterLibraryBlockStatement(LibraryBlockStatementContext ctx) {
		LibrarySymbol library = new LibrarySymbol(ctx.ID(0).getText(), this.limboSymbol);

		this.enterScope(library);
		this.elementContainer.getSymbols().put(ctx, library);
	}

	@Override
	public void enterRequirementList(RequirementListContext ctx) {
		for (TerminalNode requirement : ctx.ID()) {
			this.dependencyDefiner.add(this.scopeSymbol, requirement.getText(), PrimitiveType.LIBRARY);
		}
	}

	@Override
	public void exitLibraryBlockStatement(LibraryBlockStatementContext ctx) {
		this.exitScope();
	}

	@Override
	public void enterFunctionStatement(FunctionStatementContext ctx) {
		String name = ctx.ID(0).getText();
		Visibility visibility = this.getVisibilityFromCtx(ctx.nonePublicPrivateVisibility());

		FunctionSymbol function = new FunctionSymbol(name, visibility, this.scopeSymbol);

		if (ctx.ID(1) != null) {
			function.setReturnType(ctx.ID(1).getText());
		}

		this.enterScope(function);
		this.elementContainer.getSymbols().put(ctx, function);
	}

	@Override
	public void enterTypeArgument(TypeArgumentContext ctx) {
		this.elementContainer.getSymbols().put(ctx, new ArgumentSymbol(ctx.getText(), ctx.variableType().getText(), this.scopeSymbol));
	}

	@Override
	public void enterLocalVariableStatement(LocalVariableStatementContext ctx) {
		String name = ctx.variableStatement().getText();
		String type = ctx.variableStatement().variableType().getText();

		this.elementContainer.getSymbols().put(ctx, new LocalVariableSymbol(name, type, false, this.scopeSymbol));
	}

	@Override
	public void enterLocalVariableArrayStatement(LocalVariableArrayStatementContext ctx) {
		String name = ctx.ID().getText();
		String type = ctx.variableType().getText();

		this.elementContainer.getSymbols().put(ctx, new LocalVariableSymbol(name, type, true, this.scopeSymbol));
	}

	@Override
	public void exitMathExpression(MathExpressionContext ctx) {
		Operation operation;

		if (ctx.MULT() != null) {
			operation = Operation.MULT;
		} else if (ctx.DIV() != null) {
			operation = Operation.DIV;
		} else if (ctx.MINUS() != null) {
			operation = Operation.MINUS;
		} else {
			operation = Operation.PLUS;
		}

		Expression a = this.elementContainer.getExpressions().get(ctx.expr(0));
		Expression b = this.elementContainer.getExpressions().get(ctx.expr(1));

		ABExpression expression = new MathExpression(operation);
		expression.setExpressionA(a);
		expression.setExpressionB(b);

		this.elementContainer.getExpressions().put(ctx, expression);
	}

	@Override
	public void exitComparisonExpression(ComparisonExpressionContext ctx) {
		Operator operator;

		if (ctx.EQUAL() != null) {
			operator = Operator.EQUAL;
		} else if (ctx.NOT_EQUAL() != null) {
			operator = Operator.NOT_EQUAL;
		} else if (ctx.GREATER_THAN() != null) {
			operator = Operator.GREATER_THAN;
		} else if (ctx.GREATER_THAN_OR_EQUAL_THAN() != null) {
			operator = Operator.GREATER_OR_EQUAL_THAN;
		} else if (ctx.LOWER_THAN() != null) {
			operator = Operator.LOWER_THAN;
		} else {
			operator = Operator.LOWER_OR_EQUAL_THAN;
		}

		Expression a = this.elementContainer.getExpressions().get(ctx.expr(0));
		Expression b = this.elementContainer.getExpressions().get(ctx.expr(1));

		ABExpression expression = new ComparisonBooleanExpression(operator);
		expression.setExpressionA(a);
		expression.setExpressionB(b);

		this.elementContainer.getExpressions().put(ctx, expression);
	}

	@Override
	public void enterIntegerExpression(IntegerExpressionContext ctx) {
		this.elementContainer.getExpressions().put(ctx, new IntegerExpression(ctx.INTEGER().getText()));
	}

	@Override
	public void enterVariableExpression(VariableExpressionContext ctx) {
		VariableSymbol variableSymbol = (VariableSymbol) this.scopeSymbol.resolveBackwards(ctx.ID().getText(), PrimitiveType.VARIABLE);
		this.elementContainer.getExpressions().put(ctx, new VariableExpression(variableSymbol, null));
	}

	@Override
	public void exitVariableArrayExpression(VariableArrayExpressionContext ctx) {
		VariableSymbol variableSymbol = (VariableSymbol) this.scopeSymbol.resolveBackwards(ctx.ID().getText(), PrimitiveType.VARIABLE);
		Expression expression = this.elementContainer.getExpressions().get(ctx.expr());

		this.elementContainer.getExpressions().put(ctx, new VariableExpression(variableSymbol, expression));
	}

	@Override
	public void exitParenthesisExpression(ParenthesisExpressionContext ctx) {
		Expression expression = this.elementContainer.getExpressions().get(ctx.expr());
		this.elementContainer.getExpressions().put(ctx, new ParenthesisExpression(expression));
	}

	@Override
	public void enterBooleanExpression(BooleanExpressionContext ctx) {
		this.elementContainer.getExpressions().put(ctx, new BooleanExpression(ctx.TRUE() != null));
	}

	@Override
	public void enterNullExpression(NullExpressionContext ctx) {
		this.elementContainer.getExpressions().put(ctx, new NullExpression());
	}

	@Override
	public void exitReturnStatement(ReturnStatementContext ctx) {
		Expression expression = this.elementContainer.getExpressions().get(ctx.expr());
		((FunctionSymbol) this.scopeSymbol).defineStatement(new ReturnStatement(expression));
	}

}
