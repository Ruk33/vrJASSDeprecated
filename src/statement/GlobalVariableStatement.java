package statement;

import expression.Expression;
import symbol.GlobalVariableSymbol;
import symbol.Symbol;

public class GlobalVariableStatement implements Statement {

	protected GlobalVariableSymbol variable;
	protected Expression value;

	public GlobalVariableStatement(GlobalVariableSymbol variable, Expression value) {
		this.variable = variable;
		this.value = value;
	}

	@Override
	public String toJASS() {
		String output = this.variable.getJassType() + " " + this.variable.getFullName();

		if (this.value != null) {
			output += " = " + this.value.toJASS();
		}

		return output;
	}

	@Override
	public Symbol getSymbol() {
		return this.variable;
	}

	@Override
	public Expression getExpression() {
		return this.value;
	}

}
