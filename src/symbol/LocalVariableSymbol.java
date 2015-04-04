package symbol;

public class LocalVariableSymbol extends VariableSymbol {

	public LocalVariableSymbol(String name, String type, boolean _array, Symbol parent) {
		super(name, type, _array, Visibility.PRIVATE, parent);
	}

}
