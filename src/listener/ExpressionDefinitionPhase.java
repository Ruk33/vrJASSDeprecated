package listener;

import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;

import expression.ABExpression;
import expression.BooleanExpression;
import expression.ComparisonBooleanExpression;
import expression.Expression;
import expression.FunctionExpression;
import expression.IntegerExpression;
import expression.MathExpression;
import expression.NullExpression;
import expression.ParenthesisExpression;
import expression.StringExpression;
import expression.VariableExpression;
import expression.ComparisonBooleanExpression.Operator;
import expression.MathExpression.Operation;
import statement.ReturnStatement;
import statement.Statement;
import symbol.FunctionSymbol;
import symbol.PrimitiveType;
import symbol.ScopeSymbol;
import symbol.Symbol;
import symbol.VariableSymbol;
import util.UndefinedSymbolResolver;
import vrjass.vrJASSBaseListener;
import vrjass.vrJASSParser.BooleanExpressionContext;
import vrjass.vrJASSParser.ComparisonExpressionContext;
import vrjass.vrJASSParser.IgnoreFunctionExpressionContext;
import vrjass.vrJASSParser.IntegerExpressionContext;
import vrjass.vrJASSParser.MathExpressionContext;
import vrjass.vrJASSParser.NullExpressionContext;
import vrjass.vrJASSParser.ParenthesisExpressionContext;
import vrjass.vrJASSParser.RealExpressionContext;
import vrjass.vrJASSParser.ReturnStatementContext;
import vrjass.vrJASSParser.StringExpressionContext;
import vrjass.vrJASSParser.VariableArrayExpressionContext;
import vrjass.vrJASSParser.VariableExpressionContext;

public class ExpressionDefinitionPhase extends vrJASSBaseListener {

	protected SymbolDefinitionPhase symbolDefPhase;
	protected UndefinedSymbolResolver undefinedSymbolResolver;

	public ExpressionDefinitionPhase(SymbolDefinitionPhase symbolDefPhase) {
		this.symbolDefPhase = symbolDefPhase;
		this.undefinedSymbolResolver = new UndefinedSymbolResolver();

		this.symbolDefPhase.defineAllDependencies();
	}

	protected ScopeSymbol getScopeSymbol(ParserRuleContext ctx) {
		return (ScopeSymbol) this.symbolDefPhase.getElementContainer().getSymbols().get(ctx);
	}

	protected HashMap<ParserRuleContext, Symbol> getSymbols() {
		return this.symbolDefPhase.getElementContainer().getSymbols();
	}

	protected HashMap<ParserRuleContext, Statement> getStatements() {
		return this.symbolDefPhase.getElementContainer().getStatements();
	}

	protected HashMap<ParserRuleContext, Expression> getExpressions() {
		return this.symbolDefPhase.getElementContainer().getExpressions();
	}

	protected Symbol resolveBackwardsOrUndefined(ParserRuleContext ctx, String name, PrimitiveType primitiveType) {
		ScopeSymbol scopeSymbol = this.getScopeSymbol(ctx);
		return this.undefinedSymbolResolver.resolveBackwards(scopeSymbol, name, primitiveType);
	}

	protected Symbol resolveOrUndefined(ParserRuleContext ctx, String name, PrimitiveType primitiveType) {
		ScopeSymbol scopeSymbol = this.getScopeSymbol(ctx);
		return this.undefinedSymbolResolver.resolve(scopeSymbol, name, primitiveType);
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

		Expression a = this.getExpressions().get(ctx.expr(0));
		Expression b = this.getExpressions().get(ctx.expr(1));

		ABExpression expression = new ComparisonBooleanExpression(operator);
		expression.setExpressionA(a);
		expression.setExpressionB(b);

		this.getExpressions().put(ctx, expression);
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

		Expression a = this.getExpressions().get(ctx.expr(0));
		Expression b = this.getExpressions().get(ctx.expr(1));

		MathExpression expression = new MathExpression(operation);
		expression.setExpressionA(a);
		expression.setExpressionB(b);

		this.getExpressions().put(ctx, expression);
	}

	@Override
	public void enterVariableExpression(VariableExpressionContext ctx) {
		String name = ctx.ID().getText();
		Symbol symbol = this.resolveBackwardsOrUndefined(ctx, name, PrimitiveType.VARIABLE);
		VariableExpression expression = new VariableExpression((VariableSymbol) symbol, null, this.getScopeSymbol(ctx));

		this.getExpressions().put(ctx, expression);
	}

	@Override
	public void exitVariableArrayExpression(VariableArrayExpressionContext ctx) {
		String name = ctx.ID().getText();
		Symbol symbol = this.resolveBackwardsOrUndefined(ctx, name, PrimitiveType.VARIABLE);
		Expression index = this.getExpressions().get(ctx.expr());
		VariableExpression expression = new VariableExpression((VariableSymbol) symbol, index, this.getScopeSymbol(ctx));

		this.getExpressions().put(ctx, expression);
	}

	@Override
	public void exitIgnoreFunctionExpression(IgnoreFunctionExpressionContext ctx) {
		String name = ctx.functionExpression().ID().getText();
		Symbol symbol = this.resolveBackwardsOrUndefined(ctx, name, PrimitiveType.FUNCTION);
		FunctionExpression expression = new FunctionExpression((FunctionSymbol) symbol, this.getScopeSymbol(ctx));

		this.getExpressions().put(ctx, expression);
	}

	@Override
	public void exitReturnStatement(ReturnStatementContext ctx) {
		ScopeSymbol scopeSymbol = this.getScopeSymbol(ctx);
		Expression expression = this.getExpressions().get(ctx.expr());
		Statement statement = new ReturnStatement(scopeSymbol, expression);

		this.getStatements().put(ctx, statement);
		((FunctionSymbol) scopeSymbol).defineStatement(statement);
	}

	@Override
	public void exitParenthesisExpression(ParenthesisExpressionContext ctx) {
		Expression expression = this.getExpressions().get(ctx.expr());
		this.getExpressions().put(ctx, new ParenthesisExpression(expression));
	}

	@Override
	public void enterIntegerExpression(IntegerExpressionContext ctx) {
		this.getExpressions().put(ctx, new IntegerExpression(ctx.INTEGER().getText()));
	}

	@Override
	public void enterRealExpression(RealExpressionContext ctx) {
		this.getExpressions().put(ctx, new IntegerExpression(ctx.REAL().getText()));
	}

	@Override
	public void enterBooleanExpression(BooleanExpressionContext ctx) {
		this.getExpressions().put(ctx, new BooleanExpression(ctx.TRUE() != null));
	}

	@Override
	public void enterStringExpression(StringExpressionContext ctx) {
		this.getExpressions().put(ctx, new StringExpression(ctx.STRING().getText()));
	}

	@Override
	public void enterNullExpression(NullExpressionContext ctx) {
		this.getExpressions().put(ctx, new NullExpression());
	}

}
