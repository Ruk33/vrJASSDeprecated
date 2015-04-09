package symbol;

import java.util.HashMap;

public interface Symbol {

	/**
	 *
	 * @return
	 */
	public String getName();

	/**
	 *
	 * @return The name including its parent (separated by _)
	 */
	public String getFullName();

	/**
	 *
	 * @return
	 */
	public String getType();

	/**
	 *
	 * @return vrJASS has custom types that we need to convert to JASS (usually to integer)
	 */
	public String getJassType();

	/**
	 *
	 * @return
	 */
	public PrimitiveType getPrimitiveType();

	/**
	 *
	 * @return
	 */
	public Visibility getVisibility();

	/**
	 *
	 * @return
	 */
	public Symbol getParent();

	/**
	 *
	 * @return Symbols can have childs (other symbols), for example a method
	 * is a symbol and its childs could be arguments
	 */
	public HashMap<String, Symbol> getChilds();

	/**
	 *
	 * @param name
	 * @param primitiveType
	 * @return
	 */
	public Symbol resolve(String name, PrimitiveType primitiveType);

	/**
	 * Resolve even from parent
	 * @param name
	 * @param primitiveType
	 * @return
	 */
	public Symbol resolveBackwards(String name, PrimitiveType primitiveType);

	/**
	 *
	 * @param symbol
	 * @return Itself
	 */
	public Symbol define(Symbol symbol);

	/**
	 *
	 * @param symbol
	 * @return
	 */
	public boolean hasAccess(Symbol symbol);

}
