package validator;

import expression.ComparisonBooleanExpression;
import expression.ComparisonBooleanExpression.Operator;

public class ComparisonBooleanExpressionValidator extends Validator {

	protected ComparisonBooleanExpression expression;

	public Validator setExpression(ComparisonBooleanExpression expression) {
		this.expression = expression;
		return this;
	}

	public boolean check() {
		if (this.expression == null) {
			return false;
		}

		Operator operator = this.expression.getOperator();

		if (operator != Operator.EQUAL && operator != Operator.NOT_EQUAL) {
			String aType = this.expression.getExpressionA().getType();
			boolean aIsNumeric = aType.equals("integer") || aType.equals("integer");

			String bType = this.expression.getExpressionB().getType();
			boolean bIsNumeric = bType.equals("integer") || bType.equals("integer");

			if (aIsNumeric == false || bIsNumeric == false) {
				this.errorBag.add("Operator " + operator.toString() + " can only be used with integers or reals");
				return false;
			}
		}

		return true;
	}

}
