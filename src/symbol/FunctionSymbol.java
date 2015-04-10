package symbol;

import java.util.LinkedList;

import statement.ReturnStatement;
import statement.Statement;
import util.VariableTypeDetector;

public class FunctionSymbol extends ScopeSymbol {

	protected LinkedList<Symbol> arguments;
	protected String returnType;
	protected LinkedList<ReturnStatement> returnStatements;

	public FunctionSymbol(String name, Visibility visibility, Symbol parent) {
		super(name, null, PrimitiveType.FUNCTION, visibility, parent);

		this.arguments = new LinkedList<Symbol>();
		this.returnType = "nothing";
		this.returnStatements = new LinkedList<ReturnStatement>();
	}

	public LinkedList<ReturnStatement> getReturnStatements() {
		return this.returnStatements;
	}

	@Override
	protected boolean canStoreGlobals() {
		return false;
	}

	public Symbol defineStatement(Statement statement) {
		if (statement instanceof ReturnStatement) {
			this.returnStatements.add((ReturnStatement) statement);
		}

		return super.defineStatement(statement);
	}

	public LinkedList<Symbol> getArguments() {
		return this.arguments;
	}

	public Symbol setReturnType(String returnType) {
		this.returnType = returnType;
		return this;
	}

	public String getReturnType() {
		return this.returnType;
	}

	public String getJassReturnType() {
		if (VariableTypeDetector.isUserType(this.getReturnType())) {
			return "integer";
		}

		return this.getReturnType();
	}

}
