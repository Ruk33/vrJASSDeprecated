package symbol;

public class UndefinedFunctionSymbol extends FunctionSymbol implements UndefinedSymbol {

	public UndefinedFunctionSymbol(String name) {
		super(name, Visibility.PRIVATE, null);
	}

}
