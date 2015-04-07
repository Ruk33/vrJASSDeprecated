package validator;

import org.antlr.v4.runtime.ParserRuleContext;

import statement.Statement;
import util.ErrorBag;

public abstract class Validator {

	protected ParserRuleContext ctx;
	protected Statement statement;
	protected ErrorBag errorBag;

	public Validator(ParserRuleContext ctx, Statement statement) {
		this.ctx = ctx;
		this.statement = statement;
		this.errorBag = new ErrorBag();
	}

	public ErrorBag getErrorBag() {
		return this.errorBag;
	}

	public abstract boolean check();

}
