package symbol;

public class PropertySymbol extends GlobalVariableSymbol {

	protected boolean _static;
	
	public PropertySymbol(String name, String type, boolean _array, boolean _static, Visibility visibility, Symbol parent) {
		super(name, type, true, visibility, parent);
		this._static = _static;
	}
	
	public boolean isStatic() {
		return this._static;
	}
	
}
