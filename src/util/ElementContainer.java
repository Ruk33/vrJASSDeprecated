package util;

import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;

import expression.Expression;
import statement.Statement;
import symbol.Symbol;

public class ElementContainer {

	protected HashMap<ParserRuleContext, Symbol> symbols;
	protected HashMap<ParserRuleContext, Statement> statements;
	protected HashMap<ParserRuleContext, Expression> expressions;

	public ElementContainer() {
		this.symbols = new HashMap<ParserRuleContext, Symbol>();
		this.statements = new HashMap<ParserRuleContext, Statement>();
		this.expressions = new HashMap<ParserRuleContext, Expression>();
	}

	public HashMap<ParserRuleContext, Symbol> getSymbols() {
		return this.symbols;
	}

	public HashMap<ParserRuleContext, Statement> getStatements() {
		return this.statements;
	}

	public HashMap<ParserRuleContext, Expression> getExpressions() {
		return this.expressions;
	}

}
