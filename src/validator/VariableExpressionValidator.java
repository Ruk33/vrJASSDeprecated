package validator;

import org.antlr.v4.runtime.Token;

import symbol.Symbol;
import symbol.UndefinedSymbol;
import util.Error;
import expression.VariableExpression;

public class VariableExpressionValidator extends ElementValidator {

	protected VariableExpression element;

	public VariableExpressionValidator(VariableExpression element, Token token) {
		super(token);
		this.element = element;
	}

	@Override
	protected boolean validate() {
		Symbol variableSymbol = this.element.getSymbol();
		Symbol symbolUsingVariableSymbol = this.element.getSymbolUsingIt();

		if (variableSymbol instanceof UndefinedSymbol) {
			this.errors.add(Error.createFromToken(this.token, "Variable " + this.element.getSymbol().getName() + " is not defined"));
			return false;
		}

		if (!symbolUsingVariableSymbol.hasAccess(variableSymbol)) {
			this.errors.add(Error.createFromToken(this.token, "Statement " + symbolUsingVariableSymbol.getName() + " does not have access to " + variableSymbol.getName()));
			return false;
		}

		return true;
	}

}
