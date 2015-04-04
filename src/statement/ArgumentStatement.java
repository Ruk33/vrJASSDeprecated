package statement;

import symbol.ArgumentSymbol;

public class ArgumentStatement implements Statement {

	protected ArgumentSymbol argument;
	
	public ArgumentStatement(ArgumentSymbol argument) {
		this.argument = argument;
	}
	
	@Override
	public String toJASS() {
		return this.argument.getJassType() + " " + this.argument.getName();
	}

}
