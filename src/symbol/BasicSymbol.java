package symbol;

import java.util.HashMap;
import java.util.LinkedList;

import util.VariableTypeDetector;

public abstract class BasicSymbol implements Symbol {

	protected String name;
	protected String type;
	protected PrimitiveType primitiveType;
	protected Visibility visibility;
	protected Symbol parent;
	protected HashMap<String, LinkedList<Symbol>> childs;

	public BasicSymbol(String name, String type, PrimitiveType primitiveType, Visibility visibility, Symbol parent) {
		this.name = name;
		this.type = type;
		this.primitiveType = primitiveType;
		this.visibility = visibility;
		this.parent = parent;
		this.childs = new HashMap<String, LinkedList<Symbol>>();

		if (this.parent != null) {
			this.parent.define(this);
		}
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getFullName() {
		if (this.getParent() != null) {
			String parentName = this.getParent().getFullName();

			if (parentName != null) {
				return parentName + "_" + this.getName();
			}
		}

		return this.getName();
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public String getJassType() {
		if (VariableTypeDetector.isUserType(this.getType())) {
			return "integer";
		}

		return this.getType();
	}

	@Override
	public PrimitiveType getPrimitiveType() {
		return this.primitiveType;
	}

	@Override
	public Visibility getVisibility() {
		return this.visibility;
	}

	@Override
	public Symbol getParent() {
		return this.parent;
	}

	@Override
	public HashMap<String, LinkedList<Symbol>> getChilds() {
		return this.childs;
	}

	@Override
	public Symbol resolve(String name, PrimitiveType primitiveType) {
		LinkedList<Symbol> allResolved = this.getChilds().getOrDefault(name, new LinkedList<Symbol>());
		Symbol resolved = null;

		if (primitiveType == null) {
			resolved = allResolved.get(0);
		} else {
			for (Symbol symbol : allResolved) {
				if (symbol.getPrimitiveType() == primitiveType) {
					resolved = symbol;
					break;
				}
			}
		}

		return resolved;
	}

	@Override
	public Symbol resolveBackwards(String name, PrimitiveType primitiveType) {
		Symbol resolved = this.resolve(name, primitiveType);

		if (resolved == null && this.getParent() != null) {
			return this.getParent().resolveBackwards(name, primitiveType);
		}

		return resolved;
	}

	@Override
	public Symbol define(Symbol symbol) {
		if (symbol != null) {
			if (!this.getChilds().containsKey(symbol.getName())) {
				this.getChilds().put(symbol.getName(), new LinkedList<Symbol>());
			}

			this.getChilds().get(symbol.getName()).add(symbol);
		}

		return this;
	}

	@Override
	public boolean hasAccess(Symbol symbol) {
		if (symbol == null) {
			return false;
		}

		if (!this.equals(symbol.getParent())) {
			if (symbol.getVisibility() == Visibility.PRIVATE) {
				return false;
			}
		}

		return true;
	}

}
