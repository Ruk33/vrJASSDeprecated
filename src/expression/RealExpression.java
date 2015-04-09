package expression;

public class RealExpression implements Expression {

	protected float value;

	public RealExpression(float value) {
		this.value = value;
	}

	public RealExpression(String value) {
		this.value = Float.valueOf(value);
	}

	@Override
	public String toJASS() {
		return String.valueOf(this.value);
	}

	@Override
	public String getType() {
		return "real";
	}

}
