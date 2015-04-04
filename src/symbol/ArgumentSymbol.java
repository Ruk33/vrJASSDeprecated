package symbol;

public class ArgumentSymbol extends VariableSymbol {

	public ArgumentSymbol(String name, String type, Symbol parent) {
		super(name, type, false, Visibility.PRIVATE, parent);
		this.primitiveType = PrimitiveType.ARGUMENT;
	}

}
