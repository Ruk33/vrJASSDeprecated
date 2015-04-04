package statement;

import java.util.LinkedList;

import expression.Expression;

public class IfStatement implements Statement {

	protected Expression expression;
	protected LinkedList<Statement> thenStatements;
	protected LinkedList<Statement> elseStatements;
	
	public IfStatement(Expression expression) {
		this.expression = expression;
		this.thenStatements = new LinkedList<Statement>();
		this.elseStatements = new LinkedList<Statement>();
	}
	
	public Statement addThenStatement(Statement statement) {
		this.thenStatements.add(statement);
		return this;
	}
	
	public Statement addElseStatement(Statement statement) {
		this.elseStatements.add(statement);
		return this;
	}
	
	@Override
	public String toJASS() {
		String output = "if (" + this.expression.toJASS() + ") then";
		
		for (Statement statement : this.thenStatements) {
			output += "\n" + statement.toJASS();
		}
		
		if (this.elseStatements.size() > 0) {
			output += "\n" + "else" ;
			
			for (Statement statement : this.elseStatements) {
				output += "\n" + statement.toJASS();
			}
		}
		
		output += "\n" + "endif";
		
		return output;
	}

}
