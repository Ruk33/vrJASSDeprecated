package listener;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import symbol.ArgumentSymbol;
import symbol.DependencyDefiner;
import symbol.FunctionSymbol;
import symbol.LibrarySymbol;
import symbol.LimboSymbol;
import symbol.LocalVariableSymbol;
import symbol.PrimitiveType;
import symbol.ScopeSymbol;
import symbol.Visibility;
import util.ElementContainer;
import vrjass.vrJASSBaseListener;
import vrjass.vrJASSParser.AndExpressionContext;
import vrjass.vrJASSParser.FunctionStatementContext;
import vrjass.vrJASSParser.IgnoreFunctionExpressionContext;
import vrjass.vrJASSParser.LibraryBlockStatementContext;
import vrjass.vrJASSParser.LocalVariableArrayStatementContext;
import vrjass.vrJASSParser.LocalVariableStatementContext;
import vrjass.vrJASSParser.OrExpressionContext;
import vrjass.vrJASSParser.RequirementListContext;
import vrjass.vrJASSParser.ReturnStatementContext;
import vrjass.vrJASSParser.SetVariableStatementContext;
import vrjass.vrJASSParser.TypeArgumentContext;
import vrjass.vrJASSParser.VariableArrayExpressionContext;
import vrjass.vrJASSParser.VariableExpressionContext;

public class SymbolDefinitionPhase extends vrJASSBaseListener {

	protected ElementContainer elementContainer;
	protected LimboSymbol limboSymbol;
	protected ScopeSymbol scopeSymbol;
	protected DependencyDefiner dependencyDefiner;

	public SymbolDefinitionPhase() {
		this.elementContainer = new ElementContainer();
		this.limboSymbol = new LimboSymbol();
		this.scopeSymbol = this.limboSymbol;
		this.dependencyDefiner = new DependencyDefiner(this.limboSymbol);
	}

	public ElementContainer getElementContainer() {
		return this.elementContainer;
	}

	public SymbolDefinitionPhase defineAllDependencies() {
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

	protected SymbolDefinitionPhase enterScope(ScopeSymbol scopeSymbol) {
		this.scopeSymbol = scopeSymbol;
		return this;
	}

	protected SymbolDefinitionPhase exitScope() {
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
		this.elementContainer.getSymbols().put(ctx, this.scopeSymbol);

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
	public void exitFunctionStatement(FunctionStatementContext ctx) {
		this.exitScope();
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

	public void enterVariableExpression(VariableExpressionContext ctx) {
		this.elementContainer.getSymbols().put(ctx, this.scopeSymbol);
	}

	@Override
	public void exitVariableArrayExpression(VariableArrayExpressionContext ctx) {
		this.elementContainer.getSymbols().put(ctx, this.scopeSymbol);
	}

	@Override
	public void exitIgnoreFunctionExpression(IgnoreFunctionExpressionContext ctx) {
		this.elementContainer.getSymbols().put(ctx, this.scopeSymbol);
	}

	@Override
	public void exitReturnStatement(ReturnStatementContext ctx) {
		this.elementContainer.getSymbols().put(ctx, this.scopeSymbol);
	}

	@Override
	public void exitSetVariableStatement(SetVariableStatementContext ctx) {
		this.elementContainer.getSymbols().put(ctx, this.scopeSymbol);
	}

	@Override
	public void exitOrExpression(OrExpressionContext ctx) {
		this.elementContainer.getSymbols().put(ctx, this.scopeSymbol);
	}

	@Override
	public void exitAndExpression(AndExpressionContext ctx) {
		this.elementContainer.getSymbols().put(ctx, this.scopeSymbol);
	}

}
