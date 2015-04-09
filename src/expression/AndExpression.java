package expression;

public class AndExpression extends ABExpression {

	@Override
	public String getType() {
		return "boolean";
	}

	@Override
	public String toJASS() {
		return this.getExpressionA().toJASS() + " and " + this.getExpressionB().toJASS();
	}

}
