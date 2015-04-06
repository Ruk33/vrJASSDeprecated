package expression;

public abstract class ABExpression implements Expression {

	protected Expression a;
	protected Expression b;

	public Expression getExpressionA() {
		return this.a;
	}

	public Expression getExpressionB() {
		return this.b;
	}

	public Expression setExpressionA(Expression a) {
		this.a = a;
		return this;
	}

	public Expression setExpressionB(Expression b) {
		this.b = b;
		return this;
	}

}
