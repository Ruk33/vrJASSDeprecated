package expression;

public class IntegerBooleanExpression extends BooleanExpression {

	public IntegerBooleanExpression(Expression a) {
		super(a, Operator.NOT_EQUAL, new IntegerExpression(0));
	}

}
