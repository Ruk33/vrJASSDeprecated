package listener;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import symbol.ArgumentSymbol;
import symbol.DependencyDefiner;
import symbol.FunctionSymbol;
import symbol.LibrarySymbol;
import symbol.LimboSymbol;
import symbol.LocalVariableSymbol;
import symbol.PrimitiveType;
import symbol.ScopeSymbol;
import symbol.Symbol;
import symbol.Visibility;
import vrjass.vrJASSBaseListener;
import vrjass.vrJASSParser.FunctionStatementContext;
import vrjass.vrJASSParser.LibraryBlockStatementContext;
import vrjass.vrJASSParser.LocalVariableArrayStatementContext;
import vrjass.vrJASSParser.LocalVariableStatementContext;
import vrjass.vrJASSParser.RequirementListContext;
import vrjass.vrJASSParser.TypeArgumentContext;

public class DefPhase extends vrJASSBaseListener {

	protected ParseTreeProperty<Symbol> parseTree;
	protected LimboSymbol limboSymbol;
	protected ScopeSymbol scopeSymbol;
	protected DependencyDefiner dependencyDefiner;	
	
	public DefPhase() {
		this.parseTree = new ParseTreeProperty<Symbol>();
		this.limboSymbol = new LimboSymbol();
		this.scopeSymbol = this.limboSymbol;
		this.dependencyDefiner = new DependencyDefiner(this.limboSymbol);
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
		this.registerSymbol(ctx, new ArgumentSymbol(ctx.variableExpression().getText(), ctx.variableType().getText(), this.scopeSymbol));
	}
	
	@Override
	public void enterLocalVariableStatement(LocalVariableStatementContext ctx) {
		String name = ctx.variableStatement().variableExpression().getText();
		String type = ctx.variableStatement().variableType().getText();
		
		this.registerSymbol(ctx, new LocalVariableSymbol(name, type, false, this.scopeSymbol));
	}
	
	@Override
	public void enterLocalVariableArrayStatement(LocalVariableArrayStatementContext ctx) {
		String name = ctx.variableArrayExpression().getText();
		String type = ctx.variableType().getText();
		
		this.registerSymbol(ctx, new LocalVariableSymbol(name, type, true, this.scopeSymbol));
	}
	
}
