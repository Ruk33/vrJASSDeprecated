package expression;

import vrjass.Element;

public interface Expression extends Element {

	/**
	 *
	 * @return What type does this expression returns/is?
	 */
	public String getType();

}
