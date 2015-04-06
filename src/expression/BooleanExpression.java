package expression;

public class BooleanExpression implements Expression {

	protected boolean value;

	public BooleanExpression(boolean value) {
		this.value = value;
	}

	@Override
	public String getType() {
		return "boolean";
	}

	@Override
	public String toJASS() {
		return (this.value) ? "true" : "false";
	}

}
