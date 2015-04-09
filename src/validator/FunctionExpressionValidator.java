package validator;

import org.antlr.v4.runtime.Token;

import expression.FunctionExpression;
import symbol.Symbol;
import symbol.UndefinedSymbol;
import util.Error;

public class FunctionExpressionValidator extends ElementValidator {

	protected FunctionExpression element;

	public FunctionExpressionValidator(FunctionExpression element, Token token) {
		super(token);
		this.element = element;
	}

	@Override
	protected boolean validate() {
		Symbol functionSymbol = this.element.getSymbol();
		Symbol symbolUsingVariableSymbol = this.element.getSymbolUsingIt();

		if (functionSymbol instanceof UndefinedSymbol) {
			this.errors.add(Error.createFromToken(this.token, "Function " + this.element.getSymbol().getName() + " is not defined."));
			return false;
		}

		if (!symbolUsingVariableSymbol.hasAccess(functionSymbol)) {
			this.errors.add(Error.createFromToken(this.token, "Statement " + symbolUsingVariableSymbol.getName() + " does not have access to " + functionSymbol.getName()));
			return false;
		}

		return true;
	}

}
