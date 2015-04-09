package validator;

import java.util.LinkedList;

import org.antlr.v4.runtime.Token;

import util.Error;

public abstract class ElementValidator {

	protected LinkedList<Error> errors = new LinkedList<Error>();

	protected Token token;

	public ElementValidator(Token token) {
		this.token = token;
	}

	public LinkedList<Error> getErrors() {
		return this.errors;
	}

	protected abstract boolean validate();

	public boolean isValid() {
		this.errors.clear();
		return this.validate();
	}

}
