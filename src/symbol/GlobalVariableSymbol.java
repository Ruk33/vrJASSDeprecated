package symbol;

public class GlobalVariableSymbol extends VariableSymbol {

	public GlobalVariableSymbol(String name, String type, boolean _array, Visibility visibility, Symbol parent) {
		super(name, type, _array, visibility, parent);
	}

}
