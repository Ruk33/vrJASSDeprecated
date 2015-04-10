package listener;

import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;

import expression.ABExpression;
import expression.AndExpression;
import expression.BooleanExpression;
import expression.ComparisonBooleanExpression;
import expression.Expression;
import expression.IntegerExpression;
import expression.MathExpression;
import expression.NullExpression;
import expression.OrExpression;
import expression.ParenthesisExpression;
import expression.StringExpression;
import expression.ComparisonBooleanExpression.Operator;
import expression.MathExpression.Operation;
import expression.VariableExpression;
import statement.LocalVariableStatement;
import statement.ReturnStatement;
import statement.SetVariableStatement;
import statement.Statement;
import symbol.FunctionSymbol;
import symbol.PrimitiveType;
import symbol.ScopeSymbol;
import symbol.Symbol;
import symbol.VariableSymbol;
import util.UndefinedSymbolResolver;
import vrjass.vrJASSBaseListener;
import vrjass.vrJASSParser.AndExpressionContext;
import vrjass.vrJASSParser.BooleanExpressionContext;
import vrjass.vrJASSParser.ComparisonExpressionContext;
import vrjass.vrJASSParser.IntegerExpressionContext;
import vrjass.vrJASSParser.LocalVariableStatementContext;
import vrjass.vrJASSParser.MathExpressionContext;
import vrjass.vrJASSParser.NameContext;
import vrjass.vrJASSParser.NullExpressionContext;
import vrjass.vrJASSParser.OrExpressionContext;
import vrjass.vrJASSParser.ParenthesisExpressionContext;
import vrjass.vrJASSParser.RealExpressionContext;
import vrjass.vrJASSParser.ReturnStatementContext;
import vrjass.vrJASSParser.SetVariableStatementContext;
import vrjass.vrJASSParser.StringExpressionContext;

public class StatementExpressionDefinitionPhase extends vrJASSBaseListener {

	protected SymbolDefinitionPhase symbolDefPhase;
	protected UndefinedSymbolResolver undefinedSymbolResolver;

	public StatementExpressionDefinitionPhase(SymbolDefinitionPhase symbolDefPhase) {
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
	public void exitReturnStatement(ReturnStatementContext ctx) {
		ScopeSymbol scopeSymbol = this.getScopeSymbol(ctx);
		Expression expression = this.getExpressions().get(ctx.expr());
		Statement statement = new ReturnStatement(scopeSymbol, expression);

		this.getStatements().put(ctx, statement);
		((FunctionSymbol) scopeSymbol).defineStatement(statement);
	}

	@Override
	public void exitOrExpression(OrExpressionContext ctx) {
		Expression a = this.getExpressions().get(ctx.expr(0));
		Expression b = this.getExpressions().get(ctx.expr(1));

		OrExpression expression = new OrExpression();
		expression.setExpressionA(a);
		expression.setExpressionB(b);

		this.getExpressions().put(ctx, expression);
	}

	@Override
	public void exitAndExpression(AndExpressionContext ctx) {
		Expression a = this.getExpressions().get(ctx.expr(0));
		Expression b = this.getExpressions().get(ctx.expr(1));

		AndExpression expression = new AndExpression();
		expression.setExpressionA(a);
		expression.setExpressionB(b);

		this.getExpressions().put(ctx, expression);
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

	@Override
	public void enterName(NameContext ctx) {
		ScopeSymbol symbol = this.getScopeSymbol(ctx);
		VariableSymbol variable = (VariableSymbol) this.undefinedSymbolResolver.resolveBackwards(symbol, ctx.ID().getText(), PrimitiveType.VARIABLE);
		VariableExpression expression = new VariableExpression(variable, null, symbol);

		this.getExpressions().put(ctx, expression);
	}

	@Override
	public void exitLocalVariableStatement(LocalVariableStatementContext ctx) {
		ScopeSymbol symbol = this.getScopeSymbol(ctx);
		String name = ctx.variableStatement().ID().getText();
		VariableSymbol variableSymbol = (VariableSymbol) this.undefinedSymbolResolver.resolve(symbol, name, PrimitiveType.VARIABLE);
		Expression expression = this.getExpressions().get(ctx.variableStatement().expr());
		LocalVariableStatement statement = new LocalVariableStatement(variableSymbol, expression);

		symbol.defineStatement(statement);
		this.getStatements().put(ctx, statement);
	}

	@Override
	public void exitSetVariableStatement(SetVariableStatementContext ctx) {
		ScopeSymbol symbol = this.getScopeSymbol(ctx);
		VariableExpression variable = (VariableExpression) this.getExpressions().get(ctx.expr(0));
		Expression expression = this.getExpressions().get(ctx.expr(1));
		SetVariableStatement statement = new SetVariableStatement(symbol, variable, expression);

		symbol.defineStatement(statement);
		this.getStatements().put(ctx, statement);
	}

}
