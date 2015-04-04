package symbol;

import java.util.LinkedList;

public abstract class ScopeSymbol extends BasicSymbol {
	
	protected LinkedList<Symbol> globals;

	public ScopeSymbol(String name, String type, PrimitiveType primitiveType, Visibility visibility, Symbol parent) {
		super(name, type, primitiveType, visibility, parent);
		this.globals = new LinkedList<Symbol>();
	}
	
	protected boolean canStoreGlobals() {
		return true;
	}
	
	public LinkedList<Symbol> getGlobals() {
		return this.globals;
	}
	
	@Override
	public Symbol define(Symbol symbol) {
		if (symbol instanceof GlobalVariableSymbol) {
			if (this.canStoreGlobals()) {
				this.globals.add(symbol);
			}
		}
		return super.define(symbol);
	}
	
	@Override
	public Symbol resolve(String name, PrimitiveType primitiveType) {
		Symbol resolved = super.resolve(name, primitiveType);
		
		if (resolved == null) {
			for (LinkedList<Symbol> childs : this.getChilds().values()) {
				for (Symbol child : childs) {
					resolved = child.resolve(name, primitiveType);
					
					if (resolved != null) {
						break;
					}
				}
			}
		}
		
		return resolved;
	}

}
