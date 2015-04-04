package listener;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import expression.Expression;
import statement.LocalVariableStatement;
import symbol.FunctionSymbol;
import symbol.LocalVariableSymbol;
import symbol.PrimitiveType;
import symbol.ScopeSymbol;
import symbol.Symbol;
import util.ErrorBag;
import vrjass.vrJASSBaseListener;
import vrjass.vrJASSParser.FunctionDefContext;
import vrjass.vrJASSParser.LibraryDefContext;
import vrjass.vrJASSParser.LocalVariableDefStatContext;
import vrjass.vrJASSParser.RequirementListContext;

public class RefPhase extends vrJASSBaseListener {

	protected ParseTreeProperty<Symbol> parseTree;
	protected ErrorBag errorBag;
	protected Symbol symbol;
	
	public RefPhase(ParseTreeProperty<Symbol> parseTree, ErrorBag errorBag) {
		this.parseTree = parseTree;
		this.errorBag = errorBag;
	}
	
	@Override
	public void enterLibraryDef(LibraryDefContext ctx) {
		this.symbol = (ScopeSymbol) this.parseTree.get(ctx);
	}
	
	@Override
	public void enterRequirementList(RequirementListContext ctx) {
		int line;
		int chline;
		
		for (TerminalNode requirement : ctx.ID()) {
			if (this.symbol.resolve(requirement.getText(), PrimitiveType.LIBRARY) == null) {
				line = requirement.getSymbol().getLine();
				chline = requirement.getSymbol().getCharPositionInLine();
				
				this.errorBag.add(line, chline, "Library " + requirement.getText() + " not found, u mad?");
			}
		}
	}
	
	@Override
	public void exitLibraryDef(LibraryDefContext ctx) {
		this.symbol = null;
	}
	
	@Override
	public void enterFunctionDef(FunctionDefContext ctx) {
		this.symbol = (ScopeSymbol) this.parseTree.get(ctx);
	}
	
	@Override
	public void exitFunctionDef(FunctionDefContext ctx) {
		this.symbol = null;
	}
	
	@Override
	public void enterLocalVariableDefStat(LocalVariableDefStatContext ctx) {
		this.symbol = (LocalVariableSymbol) this.parseTree.get(ctx);
	}
	
	@Override
	public void exitLocalVariableDefStat(LocalVariableDefStatContext ctx) {
		this.symbol = null;
	}
	
	
	
}
