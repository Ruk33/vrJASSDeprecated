package listener;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import symbol.FunctionSymbol;
import symbol.LocalVariableSymbol;
import symbol.PrimitiveType;
import symbol.ScopeSymbol;
import symbol.Symbol;
import util.ErrorBag;
import validator.FunctionValidator;
import vrjass.vrJASSBaseListener;
import vrjass.vrJASSParser.FunctionStatementContext;
import vrjass.vrJASSParser.LibraryBlockStatementContext;
import vrjass.vrJASSParser.LocalVariableStatementContext;
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
	public void enterLibraryBlockStatement(LibraryBlockStatementContext ctx) {
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
	public void exitLibraryBlockStatement(LibraryBlockStatementContext ctx) {
		this.symbol = null;
	}

	@Override
	public void enterFunctionStatement(FunctionStatementContext ctx) {
		this.symbol = this.parseTree.get(ctx);

		FunctionValidator validator = new FunctionValidator((FunctionSymbol) this.symbol);
		validator.checkReturnType();

		System.out.println(validator.getErrorBag().getMessages());
	}

	@Override
	public void exitFunctionStatement(FunctionStatementContext ctx) {
		this.symbol = null;
	}

	@Override
	public void enterLocalVariableStatement(LocalVariableStatementContext ctx) {
		this.symbol = (LocalVariableSymbol) this.parseTree.get(ctx);
	}

	@Override
	public void exitLocalVariableStatement(LocalVariableStatementContext ctx) {
		this.symbol = null;
	}

}
