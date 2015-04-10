package statement;

import expression.Expression;
import symbol.Symbol;
import symbol.VariableSymbol;

public class LocalVariableStatement implements Statement {

	protected VariableSymbol variable;
	protected Expression value;

	public LocalVariableStatement(VariableSymbol variable, Expression value) {
		this.variable = variable;
		this.value = value;
	}

	@Override
	public String toJASS() {
		String output = "local " + this.variable.getJassType() + " " + this.variable.getName();

		if (this.value != null) {
			output += " = " + this.value.toJASS();
		}

		return output;
	}

	@Override
	public Symbol getSymbol() {
		return this.variable;
	}

	public Expression getExpression() {
		return this.value;
	}

}
