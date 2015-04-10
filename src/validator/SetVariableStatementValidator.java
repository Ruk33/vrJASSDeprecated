package validator;

import org.antlr.v4.runtime.Token;

import statement.SetVariableStatement;
import util.Error;

public class SetVariableStatementValidator extends ElementValidator {

	protected SetVariableStatement statement;

	public SetVariableStatementValidator(SetVariableStatement statement, Token token) {
		super(token);
		this.statement = statement;
	}

	@Override
	protected boolean validate() {
		String variableType = this.statement.getVariableExpression().getType();
		String assignedValueType = this.statement.getExpression().getType();

		if (!variableType.equals(assignedValueType)) {
			this.errors.add(Error.createFromToken(this.token, "srly dude?"));
			return false;
		}

		return true;
	}

}
