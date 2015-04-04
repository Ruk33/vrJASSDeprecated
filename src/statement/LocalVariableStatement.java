package statement;

import expression.Expression;
import symbol.LocalVariableSymbol;

public class LocalVariableStatement implements Statement {

	protected LocalVariableSymbol variable;
	protected Expression value;
	
	public LocalVariableStatement(LocalVariableSymbol variable, Expression value) {
		this.variable = variable;
		this.value = value;
	}

	@Override
	public String toJASS() {
		String output = "local " + this.variable.getJassType() + " " + this.variable.getName();
		
		if (this.value != null) {
			output += " = " + this.value.toJASS();
		}
		
		return output;
	}
	
}
