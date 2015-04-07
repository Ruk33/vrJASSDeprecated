package validator;

import util.Error;
import expression.MathExpression;

public class MathExpressionValidator extends ElementValidator {

	protected MathExpression element;

	@Override
	protected boolean validate() {
		String aType = this.element.getExpressionA().getType();
		boolean aIsNumeric = aType.equals("integer") || aType.equals("real");

		String bType = this.element.getExpressionB().getType();
		boolean bIsNumeric = bType.equals("integer") || bType.equals("real");

		if (!aIsNumeric || !bIsNumeric) {
			this.errors.add(Error.createFromToken(this.token, "Only numbers (integer or real) are accepted on mathematical operations"));
			return false;
		}

		return true;
	}

}
