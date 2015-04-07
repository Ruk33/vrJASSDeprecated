package statement;

import symbol.ArgumentSymbol;
import symbol.FunctionSymbol;
import symbol.Symbol;

public class FunctionStatement implements Statement {

	protected FunctionSymbol function;

	public FunctionStatement(FunctionSymbol function) {
		this.function = function;
	}

	public void asd() {

	}

	@Override
	public String toJASS() {
		String output = "";

		output += "function " + this.function.getFullName() + " takes ";

		if (this.function.getArguments().size() == 0) {
			output += "nothing";
		} else {
			for (Symbol argument : this.function.getArguments()) {
				output += new ArgumentStatement((ArgumentSymbol) argument).toJASS() + ", ";
			}
		}

		output += " returns " + this.function.getJassReturnType();

		for (Statement statement : this.function.getStatements()) {
			output += "\n" + statement.toJASS();
		}

		output += "\n" + "endfunction";

		return output;
	}

}
