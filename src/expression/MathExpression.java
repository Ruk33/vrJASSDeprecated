package expression;

public class MathExpression extends ABExpression {

	public enum Operation {
		PLUS	{ public String toString() { return "+"; } },
		MINUS	{ public String toString() { return "-"; } },
		MULT	{ public String toString() { return "*"; } },
		DIV		{ public String toString() { return "/"; } }
	}

	protected Operation operation;

	public MathExpression(Operation operation) {
		this.operation = operation;
	}

	public Operation getOperation() {
		return this.operation;
	}

	@Override
	public String toJASS() {
		return this.a.toJASS() + this.operation.toString() + this.b.toJASS();
	}

	@Override
	public String getType() {
		return "integer";
	}

}
