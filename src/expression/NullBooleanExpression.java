package expression;

public class NullBooleanExpression extends ComparisonBooleanExpression {

	public NullBooleanExpression(Expression a) {
		super(Operator.NOT_EQUAL);

		this.setExpressionA(a);
		this.setExpressionB(new NullExpression());
	}

}
