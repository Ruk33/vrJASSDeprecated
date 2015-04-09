package statement;

import java.util.LinkedList;

import expression.Expression;
import symbol.Symbol;

public class GlobalBlockStatement implements Statement {

	protected LinkedList<Statement> globalDeclarations = new LinkedList<Statement>();

	public Statement addGlobalVariableStatement(GlobalVariableStatement global) {
		this.globalDeclarations.add(global);
		return this;
	}

	@Override
	public String toJASS() {
		String output = "globals";

		for (Statement global : this.globalDeclarations) {
			output += "\n" + global.toJASS();
		}

		output += "endglobals";

		return output;
	}

	@Override
	public Symbol getSymbol() {
		return null;
	}

	@Override
	public Expression getExpression() {
		return null;
	}

}
