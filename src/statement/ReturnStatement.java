package statement;

import expression.Expression;

public class ReturnStatement implements Statement {

	protected Expression expression;

	public ReturnStatement(Expression expression) {
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

}
