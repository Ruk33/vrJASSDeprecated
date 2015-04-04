package symbol;

public class InterfaceSymbol extends ScopeSymbol implements ExtendableSymbol {

	public InterfaceSymbol(String name, Visibility visibility, Symbol parent) {
		super(name, name, PrimitiveType.INTERFACE, visibility, parent);
	}

}
