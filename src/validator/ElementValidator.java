package validator;

import java.util.LinkedList;

import org.antlr.v4.runtime.Token;

import vrjass.Element;
import util.Error;

public abstract class ElementValidator {

	protected LinkedList<Error> errors = new LinkedList<Error>();

	protected Element element;
	protected Token token;

	public LinkedList<Error> getErrors() {
		return this.errors;
	}

	/**
	 *
	 * @param element Statement or expression
	 * @return Itself
	 */
	public ElementValidator setElement(Element element) {
		this.element = element;
		return this;
	}

	/**
	 *
	 * @param token
	 * @return Itself
	 */
	public ElementValidator setToken(Token token) {
		this.token = token;
		return this;
	}

	protected abstract boolean validate();

	public boolean isValid() {
		this.errors.clear();
		return this.validate();
	}

}
