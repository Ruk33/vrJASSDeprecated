package expression;

public class IntegerExpression implements Expression {

	protected int value;
	
	public IntegerExpression(int value) {
		this.value = value;
	}
	
	@Override
	public String toJASS() {
		return String.valueOf(this.value);
	}
	
}
