package statement;

import symbol.Symbol;
import expression.Expression;
import expression.VariableExpression;

public class SetVariableStatement implements Statement {

	protected Symbol symbol;
	protected VariableExpression variable;
	protected Expression value;

	public SetVariableStatement(Symbol symbol, VariableExpression variable, Expression value) {
		this.symbol = symbol;
		this.variable = variable;
		this.value = value;
	}

	@Override
	public String toJASS() {
		return "set " + this.variable.toJASS() + " = " + this.value.toJASS();
	}

	@Override
	public Symbol getSymbol() {
		return this.symbol;
	}

	@Override
	public Expression getExpression() {
		return this.value;
	}

}
