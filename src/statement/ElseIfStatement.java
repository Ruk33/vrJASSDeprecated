package statement;

import java.util.LinkedList;

import symbol.Symbol;
import expression.Expression;

public class ElseIfStatement implements Statement {

	protected Symbol symbol;
	protected Expression expression;
	protected LinkedList<Statement> statements;

	public ElseIfStatement(Symbol symbol, Expression expression) {
		this.symbol = symbol;
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

	@Override
	public Symbol getSymbol() {
		return this.symbol;
	}

	@Override
	public Expression getExpression() {
		return this.expression;
	}

}
