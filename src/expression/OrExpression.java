package expression;

public class OrExpression extends ABExpression {

	@Override
	public String getType() {
		return "boolean";
	}

	@Override
	public String toJASS() {
		return this.getExpressionA().toJASS() + " or " + this.getExpressionB().toJASS();
	}

}
