package symbol;

import java.util.LinkedList;

public class LibrarySymbol extends ScopeSymbol {

	protected LinkedList<Symbol> classes;

	public LibrarySymbol(String name, Symbol parent) {
		super(name, null, PrimitiveType.LIBRARY, Visibility.PUBLIC, parent);
		this.classes = new LinkedList<Symbol>();
	}

	public LinkedList<Symbol> getClasses() {
		return this.classes;
	}

	@Override
	public LinkedList<Symbol> getGlobals() {
		LinkedList<Symbol> allGlobals = new LinkedList<Symbol>();

		allGlobals.addAll(super.getGlobals());

		for (Symbol _class : this.getClasses()) {
			allGlobals.addAll(((ClassSymbol) _class).getGlobals());
		}

		return allGlobals;
	}

	@Override
	public Symbol define(Symbol symbol) {
		if (symbol instanceof ClassSymbol) {
			this.classes.add(symbol);
		}

		return super.define(symbol);
	}

}
