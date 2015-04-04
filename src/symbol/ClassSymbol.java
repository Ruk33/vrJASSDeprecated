package symbol;

import java.util.LinkedList;

public class ClassSymbol extends ScopeSymbol implements ExtendableSymbol {

	protected LinkedList<Symbol> extendedSymbols;
	protected LinkedList<Symbol> properties;
	protected LinkedList<Symbol> methods;
	protected LinkedList<Symbol> modules;
	
	public ClassSymbol(String name, Visibility visibility, Symbol parent) {
		super(name, name, PrimitiveType.CLASS, visibility, parent);
		
		this.extendedSymbols = new LinkedList<Symbol>();
		this.properties = new LinkedList<Symbol>();
		this.methods = new LinkedList<Symbol>();
		this.modules = new LinkedList<Symbol>();
	}
	
	@Override
	public Symbol define(Symbol symbol) {
		if (symbol instanceof ExtendableSymbol) {
			this.extendedSymbols.add(symbol);
		} else if (symbol instanceof PropertySymbol) {
			this.properties.add(symbol);
		} else if (symbol instanceof MethodSymbol) {
			this.methods.add(symbol);
		} else if (symbol instanceof ModuleSymbol) {
			this.modules.add(symbol);
		}
		
		return super.define(symbol);
	}
	
	public LinkedList<Symbol> getExtendedSymbols() {
		return this.extendedSymbols;
	}
	
	public LinkedList<Symbol> getProperties() {
		return this.properties;
	}
	
	public LinkedList<Symbol> getMethods() {
		return this.methods;
	}
	
	public LinkedList<Symbol> getModules() {
		return this.modules;
	}

}
