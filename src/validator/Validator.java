package validator;

import java.util.LinkedList;

import util.Error;

public class Validator {

	protected LinkedList<ElementValidator> elements = new LinkedList<ElementValidator>();
	protected LinkedList<Error> errors = new LinkedList<Error>();

	public Validator add(ElementValidator element) {
		this.elements.add(element);
		return this;
	}

	public LinkedList<Error> getErrors() {
		return this.errors;
	}

	public boolean validateAll() {
		boolean result = true;

		this.errors.clear();

		for (ElementValidator element : this.elements) {
			if (!element.isValid()) {
				this.errors.addAll(element.getErrors());
				result = false;
			}
		}

		return result;
	}

}
