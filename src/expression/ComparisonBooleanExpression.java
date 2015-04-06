package expression;

public class ComparisonBooleanExpression extends ABExpression {

	// so clean, tab-orgasm
	public enum Operator {
		EQUAL					{ public String toString() { return "=="; } },
		NOT_EQUAL				{ public String toString() { return "!="; } },
		GREATER_THAN			{ public String toString() { return ">" ; } },
		LOWER_THAN				{ public String toString() { return "<" ; } },
		GREATER_OR_EQUAL_THAN	{ public String toString() { return ">="; } },
		LOWER_OR_EQUAL_THAN		{ public String toString() { return "<="; } }
	}

	protected Operator operator;

	public ComparisonBooleanExpression(Operator operator) {
		this.operator = operator;
	}

	public Operator getOperator() {
		return this.operator;
	}

	@Override
	public String toJASS() {
		return this.a.toJASS() + this.operator.toString() + this.b.toJASS();
	}

	@Override
	public String getType() {
		return "boolean";
	}

}
