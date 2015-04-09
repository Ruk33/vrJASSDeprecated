package expression;

public class StringExpression implements Expression {

	String value;

	public StringExpression(String value) {
		this.value = value;
	}

	@Override
	public String toJASS() {
		return this.value;
	}

	@Override
	public String getType() {
		return "string";
	}

}
