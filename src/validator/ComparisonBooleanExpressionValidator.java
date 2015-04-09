package validator;

import org.antlr.v4.runtime.Token;

import util.Error;
import expression.ComparisonBooleanExpression;
import expression.ComparisonBooleanExpression.Operator;

public class ComparisonBooleanExpressionValidator extends ElementValidator {

	protected ComparisonBooleanExpression element;

	public ComparisonBooleanExpressionValidator(ComparisonBooleanExpression element, Token token) {
		super(token);
		this.element = element;
	}

	public boolean validate() {
		Operator operator = this.element.getOperator();

		if (operator != Operator.EQUAL && operator != Operator.NOT_EQUAL) {
			String aType = this.element.getExpressionA().getType();
			boolean aIsNumeric = aType.equals("integer") || aType.equals("real");

			String bType = this.element.getExpressionB().getType();
			boolean bIsNumeric = bType.equals("integer") || bType.equals("real");

			if (aIsNumeric == false || bIsNumeric == false) {
				this.errors.add(Error.createFromToken(this.token, "Operator " + operator.toString() + " can only be used with integers or reals"));
				return false;
			}
		}

		return true;
	}

}
