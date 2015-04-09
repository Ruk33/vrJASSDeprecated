package validator;

import org.antlr.v4.runtime.Token;

import util.Error;
import expression.ABExpression;

public class AndOrExpressionValidator extends ElementValidator {

	protected ABExpression expression;

	public AndOrExpressionValidator(ABExpression expression, Token token) {
		super(token);
		this.expression = expression;
	}

	@Override
	protected boolean validate() {
		boolean aIsBool = this.expression.getExpressionA().getType().equals("boolean");
		boolean bIsBool = this.expression.getExpressionB().getType().equals("boolean");

		if (!aIsBool || !bIsBool) {
			this.errors.add(Error.createFromToken(this.token, "Expressions or/and can only be used with booleans"));
			return false;
		}

		return true;
	}

}
