package util;

import org.antlr.v4.runtime.Token;

public class Error {

	protected int line;
	protected int charPosition;
	protected String message;

	public static Error createFromToken(Token token, String message) {
		return new Error(token.getLine(), token.getCharPositionInLine(), message);
	}

	public Error(int line, int charPosition, String message) {
		this.line = line;
		this.charPosition = charPosition;
		this.message = message;
	}

	public int getLine() {
		return this.line;
	}

	public int getCharPosition() {
		return this.charPosition;
	}

	public String getMessage() {
		return this.message;
	}

	public String toString() {
		return "[" + this.line + ":" + this.charPosition + "]" + this.message;
	}

}
