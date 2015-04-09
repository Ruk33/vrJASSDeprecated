package expression;

import symbol.LocalVariableSymbol;
import symbol.Symbol;
import symbol.VariableSymbol;

public class VariableExpression implements Expression {

	protected VariableSymbol symbol;
	protected Expression index;
	protected Symbol symbolUsingIt;

	public VariableExpression(VariableSymbol symbol, Expression index, Symbol symbolUsingIt) {
		this.symbol = symbol;
		this.index = index;
		this.symbolUsingIt = symbolUsingIt;

		if (this.index == null) {
			this.index = new IntegerExpression(0);
		}
	}

	public Symbol getSymbol() {
		return this.symbol;
	}

	public Symbol getSymbolUsingIt() {
		return this.symbolUsingIt;
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
