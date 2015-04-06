package expression;

public class IntegerExpression implements Expression {

	protected int value;

	public IntegerExpression(int value) {
		this.value = value;
	}

	public IntegerExpression(String text) {
		this.value = Integer.valueOf(text);
	}

	@Override
	public String toJASS() {
		return String.valueOf(this.value);
	}

	@Override
	public String getType() {
		return "integer";
	}

}
