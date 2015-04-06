package expression;

public interface Expression {

	/**
	 *
	 * @return What type does this expression returns/is?
	 */
	public String getType();

	public String toJASS();

}
