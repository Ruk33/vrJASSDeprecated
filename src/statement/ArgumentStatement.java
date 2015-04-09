package statement;

import expression.Expression;
import symbol.ArgumentSymbol;
import symbol.Symbol;

public class ArgumentStatement implements Statement {

	protected ArgumentSymbol argument;

	public ArgumentStatement(ArgumentSymbol argument) {
		this.argument = argument;
	}

	@Override
	public String toJASS() {
		return this.argument.getJassType() + " " + this.argument.getName();
	}

	@Override
	public Symbol getSymbol() {
		return this.argument;
	}

	@Override
	public Expression getExpression() {
		return null;
	}

}
