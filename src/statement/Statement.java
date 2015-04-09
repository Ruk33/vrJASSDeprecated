package statement;

import expression.Expression;
import symbol.Symbol;
import vrjass.Element;

public interface Statement extends Element {

	/**
	 *
	 * @return Get symbol where it belongs to
	 */
	public Symbol getSymbol();

	/**
	 *
	 * @return
	 */
	public Expression getExpression();

}
