package validator;

import org.antlr.v4.runtime.Token;

import statement.ReturnStatement;
import symbol.FunctionSymbol;
import util.Error;

public class FunctionReturnStatementValidator extends ElementValidator {

	protected ReturnStatement _return;

	public FunctionReturnStatementValidator(ReturnStatement _return, Token token) {
		super(token);
		this._return = _return;
	}

	@Override
	protected boolean validate() {
		String functionReturnType = ((FunctionSymbol) this._return.getSymbol()).getReturnType();
		String expressionType = this._return.getExpression().getType();

		if (!functionReturnType.equals(expressionType)) {
			this.errors.add(Error.createFromToken(this.token, "Function " + this._return.getSymbol().getFullName() + " must return " + functionReturnType + " but it is returning " + expressionType));
			return false;
		}

		return true;
	}

}
