package expression;

public class NullExpression implements Expression {

	@Override
	public String toJASS() {
		return "null";
	}

	@Override
	public String getType() {
		return "nothing";
	}

}
