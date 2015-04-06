package listener;

import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
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
import symbol.Symbol;
import symbol.VariableSymbol;
import symbol.Visibility;
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

	protected ParseTreeProperty<Symbol> parseTree;

	protected LimboSymbol limboSymbol;
	protected ScopeSymbol scopeSymbol;

	protected DependencyDefiner dependencyDefiner;

	protected HashMap<ParserRuleContext, Expression> expressionMap;
	protected Expression expression;

	public DefPhase() {
		this.parseTree = new ParseTreeProperty<Symbol>();

		this.limboSymbol = new LimboSymbol();
		this.scopeSymbol = this.limboSymbol;

		this.dependencyDefiner = new DependencyDefiner(new LimboSymbol());

		this.expressionMap = new HashMap<ParserRuleContext, Expression>();
	}

	public ParseTreeProperty<Symbol> getParserTree() {
		return this.parseTree;
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

	protected DefPhase registerSymbol(ParserRuleContext ctx, Symbol symbol) {
		this.parseTree.put(ctx, symbol);
		return this;
	}

	protected DefPhase registerExpression(ParserRuleContext ctx, Expression expression) {
		this.expressionMap.put(ctx, expression);
		return this;
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
		this.registerSymbol(ctx, library);
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
		this.registerSymbol(ctx, function);
	}

	@Override
	public void enterTypeArgument(TypeArgumentContext ctx) {
		this.registerSymbol(ctx, new ArgumentSymbol(ctx.getText(), ctx.variableType().getText(), this.scopeSymbol));
	}

	@Override
	public void enterLocalVariableStatement(LocalVariableStatementContext ctx) {
		String name = ctx.variableStatement().getText();
		String type = ctx.variableStatement().variableType().getText();

		this.registerSymbol(ctx, new LocalVariableSymbol(name, type, false, this.scopeSymbol));
	}

	@Override
	public void enterLocalVariableArrayStatement(LocalVariableArrayStatementContext ctx) {
		String name = ctx.ID().getText();
		String type = ctx.variableType().getText();

		this.registerSymbol(ctx, new LocalVariableSymbol(name, type, true, this.scopeSymbol));
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

		Expression a = this.expressionMap.get(ctx.expr(0));
		Expression b = this.expressionMap.get(ctx.expr(1));

		ABExpression expression = new MathExpression(operation);
		expression.setExpressionA(a);
		expression.setExpressionB(b);

		this.registerExpression(ctx, expression);
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

		Expression a = this.expressionMap.get(ctx.expr(0));
		Expression b = this.expressionMap.get(ctx.expr(1));

		ABExpression expression = new ComparisonBooleanExpression(operator);
		expression.setExpressionA(a);
		expression.setExpressionB(b);

		this.registerExpression(ctx, expression);
	}

	@Override
	public void enterIntegerExpression(IntegerExpressionContext ctx) {
		this.registerExpression(ctx, new IntegerExpression(ctx.INTEGER().getText()));
	}

	@Override
	public void enterVariableExpression(VariableExpressionContext ctx) {
		VariableSymbol variableSymbol = (VariableSymbol) this.scopeSymbol.resolveBackwards(ctx.ID().getText(), PrimitiveType.VARIABLE);
		this.registerExpression(ctx, new VariableExpression(variableSymbol, null));
	}

	@Override
	public void enterVariableArrayExpression(VariableArrayExpressionContext ctx) {
		//VariableSymbol variableSymbol = (VariableSymbol) this.scopeSymbol.resolveBackwards(ctx.ID().getText(), PrimitiveType.VARIABLE);
		//this.registerExpression(ctx, new VariableExpression(variableSymbol, this.expressionBuilder.getResult()));
	}

	@Override
	public void exitParenthesisExpression(ParenthesisExpressionContext ctx) {
		Expression expression = this.expressionMap.get(ctx.expr());
		this.registerExpression(ctx, new ParenthesisExpression(expression));
	}

	@Override
	public void enterBooleanExpression(BooleanExpressionContext ctx) {
		this.registerExpression(ctx, new BooleanExpression(ctx.TRUE() != null));
	}

	@Override
	public void enterNullExpression(NullExpressionContext ctx) {
		this.registerExpression(ctx, new NullExpression());
	}

	@Override
	public void exitReturnStatement(ReturnStatementContext ctx) {
		Expression expression = this.expressionMap.get(ctx.expr());
		((FunctionSymbol) this.scopeSymbol).defineStatement(new ReturnStatement(expression));
	}

}
