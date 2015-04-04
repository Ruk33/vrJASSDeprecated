package statement;

import expression.Expression;

public class ReturnStatement implements Statement {

	protected Expression expression;

	public ReturnStatement(Expression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toJASS() {
		return "return " + this.expression.toJASS();
	}
	
}
