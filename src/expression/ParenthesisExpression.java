package expression;

public class ParenthesisExpression implements Expression {

	protected Expression expression;
	
	public ParenthesisExpression(Expression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toJASS() {
		return "(" + this.expression + ")";
	}

}
