package expression;

import symbol.FunctionSymbol;
import symbol.Symbol;

public class FunctionExpression implements Expression {

	protected FunctionSymbol function;
	protected Symbol symbolUsingIt;

	public FunctionExpression(FunctionSymbol function, Symbol symbolUsingIt) {
		this.function = function;
		this.symbolUsingIt = symbolUsingIt;
	}

	public Symbol getSymbol() {
		return this.function;
	}

	public Symbol getSymbolUsingIt() {
		return this.symbolUsingIt;
	}

	@Override
	public String toJASS() {
		return this.function.getFullName();
	}

	@Override
	public String getType() {
		return this.function.getReturnType();
	}

}
