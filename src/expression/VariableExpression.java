package expression;

import symbol.LocalVariableSymbol;
import symbol.VariableSymbol;

public class VariableExpression implements Expression {

	protected VariableSymbol symbol;
	protected Expression index;

	public VariableExpression(VariableSymbol symbol, Expression index) {
		this.symbol = symbol;
		this.index = index;

		if (this.index == null) {
			this.index = new IntegerExpression(0);
		}
	}

	@Override
	public String toJASS() {
		String output;

		if (this.symbol instanceof LocalVariableSymbol) {
			output = this.symbol.getName();
		} else {
			output = this.symbol.getFullName();
		}

		if (this.symbol.isArray()) {
			output += "[" + this.index.toJASS() + "]";
		}

		return output;
	}

	@Override
	public String getType() {
		return this.symbol.getType();
	}

}
