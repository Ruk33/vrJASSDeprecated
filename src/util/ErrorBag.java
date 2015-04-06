package util;

import java.util.LinkedList;

public class ErrorBag {

	protected LinkedList<String> messages = new LinkedList<String>();

	public ErrorBag add(String message) {
		this.messages.add(message);
		return this;
	}

	public ErrorBag clear() {
		this.messages.clear();
		return this;
	}

	public ErrorBag add(int line, String message) {
		this.messages.add("Line " + line + ": " + message);
		return this;
	}

	public ErrorBag add(int line, int column, String message) {
		this.messages.add("Line " + line + ", column " + (column+1) + ": " + message);
		return this;
	}

	public LinkedList<String> getMessages() {
		return this.messages;
	}

}
