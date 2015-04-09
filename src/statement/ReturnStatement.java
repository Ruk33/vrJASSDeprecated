package statement;

import symbol.Symbol;
import expression.EmptyExpression;
import expression.Expression;

public class ReturnStatement implements Statement {

	protected Symbol symbol;
	protected Expression expression;

	public ReturnStatement(Symbol symbol, Expression expression) {
		this.symbol = symbol;
		this.expression = expression;

		if (this.expression == null) {
			this.expression = new EmptyExpression();
		}
	}

	public Expression getExpression() {
		return this.expression;
	}

	@Override
	public String toJASS() {
		return "return " + this.expression.toJASS();
	}

	@Override
	public Symbol getSymbol() {
		return this.symbol;
	}

}
