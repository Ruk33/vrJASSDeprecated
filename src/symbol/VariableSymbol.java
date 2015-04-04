package symbol;

public abstract class VariableSymbol extends BasicSymbol {

	protected boolean _array;
	
	public VariableSymbol(String name, String type, boolean _array, Visibility visibility, Symbol parent) {
		super(name, type, PrimitiveType.VARIABLE, visibility, parent);
		this._array = _array;
	}
	
	public boolean isArray() {
		return this._array;
	}
	
	@Override
	public Symbol define(Symbol symbol) {
		if (this.isArray()) {
			return super.define(symbol);
		} else {
			if (this.getChilds().size() == 0) {
				return super.define(symbol);
			}
		}
		
		return this;
	}
	
}
