package listener;

import org.antlr.v4.runtime.tree.TerminalNode;

import statement.ReturnStatement;
import symbol.LocalVariableSymbol;
import symbol.PrimitiveType;
import symbol.ScopeSymbol;
import symbol.Symbol;
import util.ElementContainer;
import util.ErrorBag;
import vrjass.vrJASSBaseListener;
import vrjass.vrJASSParser.FunctionStatementContext;
import vrjass.vrJASSParser.LibraryBlockStatementContext;
import vrjass.vrJASSParser.LocalVariableStatementContext;
import vrjass.vrJASSParser.RequirementListContext;
import vrjass.vrJASSParser.ReturnStatementContext;

public class RefPhase extends vrJASSBaseListener {

	protected ElementContainer elementContainer;
	protected ErrorBag errorBag;
	protected Symbol symbol;

	public RefPhase(ElementContainer elementContainer, ErrorBag errorBag) {
		this.elementContainer = elementContainer;
		this.errorBag = errorBag;
	}

	@Override
	public void enterLibraryBlockStatement(LibraryBlockStatementContext ctx) {
		this.symbol = (ScopeSymbol) this.elementContainer.getSymbols().get(ctx);
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
	public void exitLibraryBlockStatement(LibraryBlockStatementContext ctx) {
		this.symbol = null;
	}

	@Override
	public void enterFunctionStatement(FunctionStatementContext ctx) {
		this.symbol = this.elementContainer.getSymbols().get(ctx);
	}



	@Override
	public void exitFunctionStatement(FunctionStatementContext ctx) {
		this.symbol = null;
	}

	@Override
	public void enterLocalVariableStatement(LocalVariableStatementContext ctx) {
		this.symbol = (LocalVariableSymbol) this.elementContainer.getSymbols().get(ctx);
	}

	@Override
	public void exitLocalVariableStatement(LocalVariableStatementContext ctx) {
		this.symbol = null;
	}

}
