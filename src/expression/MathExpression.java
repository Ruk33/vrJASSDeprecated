package expression;

public class MathExpression implements Expression {
	
	public enum Operation {
		PLUS	{ public String toString() { return "+"; } },
		MINUS	{ public String toString() { return "-"; } },
		MULT	{ public String toString() { return "*"; } },
		DIV		{ public String toString() { return "/"; } }
	}
	
	protected Expression a;
	protected Operation operation;
	protected Expression b;
	
	public MathExpression(Expression a, Operation operation, Expression b) {
		this.a = a;
		this.operation = operation;
		this.b = b;
	}
	
	@Override
	public String toJASS() {
		return this.a.toJASS() + this.operation.toString() + this.b.toJASS();
	}
		
}
