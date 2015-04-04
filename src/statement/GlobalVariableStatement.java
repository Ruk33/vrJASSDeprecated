package statement;

import expression.Expression;
import symbol.GlobalVariableSymbol;

public class GlobalVariableStatement implements Statement {

	protected GlobalVariableSymbol variable;
	protected Expression value;
	
	public GlobalVariableStatement(GlobalVariableSymbol variable, Expression value) {
		this.variable = variable;
		this.value = value;
	}
	
	@Override
	public String toJASS() {
		String output = this.variable.getJassType() + " " + this.variable.getFullName();
		
		if (this.value != null) {
			output += " = " + this.value.toJASS();
		}
		
		return output;
	}
	
}
