package validator;

import org.antlr.v4.runtime.ParserRuleContext;

import statement.FunctionStatement;

public class FunctionValidator extends Validator {

	protected FunctionStatement statement;

	public FunctionValidator(ParserRuleContext ctx, FunctionStatement statement) {
		super(ctx, statement);
	}

	@Override
	public boolean check() {

		return false;
	}

}
