package symbol;

public class UndefinedVariableSymbol extends VariableSymbol implements UndefinedSymbol {

	public UndefinedVariableSymbol(String name, boolean _array) {
		super(name, "undefined", _array, Visibility.PRIVATE, null);
	}

}
