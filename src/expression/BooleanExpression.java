package expression;

public class BooleanExpression implements Expression {
	
	// so clean, tab-orgasm
	public enum Operator {
		EQUAL					{ public String toString() { return "=="; } },
		NOT_EQUAL				{ public String toString() { return "!="; } },
		GREATER_THAN			{ public String toString() { return ">" ; } },
		LOWER_THAN				{ public String toString() { return "<" ; } },
		GREATER_OR_EQUAL_THAN	{ public String toString() { return ">="; } },
		LOWER_OR_EQUAL_THAN		{ public String toString() { return "<="; } }
	}
	
	protected Expression a;
	protected Operator operator;
	protected Expression b;
	
	public BooleanExpression(Expression a, Operator operator, Expression b) {
		this.a = a;
		this.operator = operator;
		this.b = b;
	}
	
	@Override
	public String toJASS() {
		return this.a.toJASS() + this.operator.toString() + b.toJASS();
	}

}
