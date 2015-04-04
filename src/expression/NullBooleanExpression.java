package expression;

public class NullBooleanExpression extends BooleanExpression {

	public NullBooleanExpression(Expression a) {
		super(a, Operator.NOT_EQUAL, new NullExpression());
	}

}
