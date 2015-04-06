package expression;

/*
 * Real MVP, respect
 */
public class EmptyExpression implements Expression {

	@Override
	public String getType() {
		return "";
	}

	@Override
	public String toJASS() {
		return "";
	}

}
