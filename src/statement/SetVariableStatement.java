package statement;

import expression.Expression;
import expression.VariableExpression;

public class SetVariableStatement implements Statement {
	
	protected VariableExpression variable;
	protected Expression value;
	
	public SetVariableStatement(VariableExpression variable, Expression value) {
		this.variable = variable;
		this.value = value;
	}

	@Override
	public String toJASS() {
		return "set " + this.variable.toJASS() + " = " + this.value.toJASS();
	}

}
