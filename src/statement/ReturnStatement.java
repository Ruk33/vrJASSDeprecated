package statement;

import symbol.Symbol;
import expression.Expression;

public class ReturnStatement implements Statement {

	protected Symbol symbol;
	protected Expression expression;

	public ReturnStatement(Symbol symbol, Expression expression) {
		this.symbol = symbol;
		this.expression = expression;
	}

	public Expression getExpression() {
		return this.expression;
	}

	@Override
	public String toJASS() {
		if (this.expression != null) {
			return "return " + this.expression.toJASS();
		}

		return "return";
	}

	@Override
	public Symbol getSymbol() {
		return this.symbol;
	}

}
