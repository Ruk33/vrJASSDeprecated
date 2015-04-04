package statement;

import java.util.LinkedList;

import expression.Expression;

public class ElseIfStatement implements Statement {

	protected Expression expression;
	protected LinkedList<Statement> statements;
	
	public ElseIfStatement(Expression expression) {
		this.expression = expression;
		this.statements = new LinkedList<Statement>();
	}

	@Override
	public String toJASS() {
		String output = "elseif (" + this.expression.toJASS() + ") then";
		
		for (Statement statement : this.statements) {
			output += "\n" + statement.toJASS();
		}

		return output;
	}
	
}
