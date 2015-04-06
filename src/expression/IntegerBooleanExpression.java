package expression;

public class IntegerBooleanExpression extends ComparisonBooleanExpression {

	public IntegerBooleanExpression(Expression a) {
		super(Operator.NOT_EQUAL);

		this.setExpressionA(a);
		this.setExpressionB(new IntegerExpression(0));
	}

}
