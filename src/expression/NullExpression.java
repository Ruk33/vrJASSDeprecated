package expression;

public class NullExpression implements Expression {

	@Override
	public String toJASS() {
		return "null";
	}
	
}
