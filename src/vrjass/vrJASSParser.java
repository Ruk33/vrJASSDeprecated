// Generated from vrJASS.g4 by ANTLR 4.5
package vrjass;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class vrJASSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, END=8, PRIVATE=9, 
		PROTECTED=10, PUBLIC=11, READONLY=12, CONSTANT=13, NOT=14, AND=15, OR=16, 
		TAKES=17, RETURNS=18, RETURN=19, CALL=20, SET=21, DEBUG=22, LOCAL=23, 
		USES=24, REQUIRES=25, INITIALIZER=26, THISTYPE=27, THIS=28, SUPER=29, 
		DELEGATE=30, OPERATOR=31, STATIC=32, ARRAY=33, DEFAULTS=34, EXTENDS=35, 
		IMPLEMENT=36, OPTIONAL=37, HOOK=38, STUB=39, LIBRARY=40, ENDLIBRARY=41, 
		SCOPE=42, ENDSCOPE=43, STRUCT=44, ENDSTRUCT=45, INTERFACE=46, ENDINTERFACE=47, 
		MODULE=48, ENDMODULE=49, FUNCTION=50, ENDFUNCTION=51, METHOD=52, ENDMETHOD=53, 
		FOR=54, ENDFOR=55, WHILE=56, ENDWHILE=57, LOOP=58, EXITWHEN=59, BREAK=60, 
		CONTINUE=61, ENDLOOP=62, NOTHING=63, TRUE=64, FALSE=65, NULL=66, IF=67, 
		THEN=68, ELSEIF=69, ELSE=70, ENDIF=71, GLOBAL=72, ENDGLOBAL=73, LINECOMMENT=74, 
		COMMENT=75, PLUS=76, MINUS=77, MULT=78, DIV=79, ASSERTPLUS=80, ASSERTMINUS=81, 
		ASSERTMULT=82, ASSERTDIV=83, DOT=84, STRING=85, REAL=86, RAWCODE=87, HEX=88, 
		INTEGER=89, EQUAL=90, NOT_EQUAL=91, GREATER_THAN=92, GREATER_THAN_OR_EQUAL_THAN=93, 
		LOWER_THAN=94, LOWER_THAN_OR_EQUAL_THAN=95, INT=96, EOL=97, ID=98, WS=99;
	public static final int
		RULE_inits = 0, RULE_init = 1, RULE_nonePublicPrivateVisibility = 2, RULE_publicPrivateProtectedVisiblity = 3, 
		RULE_variableType = 4, RULE_argList = 5, RULE_functionExpression = 6, 
		RULE_methodExpression = 7, RULE_expr = 8, RULE_exprList = 9, RULE_debugStatement = 10, 
		RULE_elseIfStatement = 11, RULE_elseStatement = 12, RULE_ifStatement = 13, 
		RULE_breakStatement = 14, RULE_continueStatement = 15, RULE_exitWhenStatement = 16, 
		RULE_forStatement = 17, RULE_whileStatement = 18, RULE_loopStatement = 19, 
		RULE_returnStatement = 20, RULE_functionCallStatement = 21, RULE_methodCallStatement = 22, 
		RULE_variableStatement = 23, RULE_globalVariableStatement = 24, RULE_localVariableArrayStatement = 25, 
		RULE_localVariableStatement = 26, RULE_setVariableStatement = 27, RULE_propertyVisibility = 28, 
		RULE_propertyStatement = 29, RULE_stat = 30, RULE_globalBlockStatement = 31, 
		RULE_typeArgumentList = 32, RULE_typeArgument = 33, RULE_functionStatement = 34, 
		RULE_methodStatement = 35, RULE_structBlockStatement = 36, RULE_scopeBlockStatement = 37, 
		RULE_requirementList = 38, RULE_libraryBlockStatement = 39;
	public static final String[] ruleNames = {
		"inits", "init", "nonePublicPrivateVisibility", "publicPrivateProtectedVisiblity", 
		"variableType", "argList", "functionExpression", "methodExpression", "expr", 
		"exprList", "debugStatement", "elseIfStatement", "elseStatement", "ifStatement", 
		"breakStatement", "continueStatement", "exitWhenStatement", "forStatement", 
		"whileStatement", "loopStatement", "returnStatement", "functionCallStatement", 
		"methodCallStatement", "variableStatement", "globalVariableStatement", 
		"localVariableArrayStatement", "localVariableStatement", "setVariableStatement", 
		"propertyVisibility", "propertyStatement", "stat", "globalBlockStatement", 
		"typeArgumentList", "typeArgument", "functionStatement", "methodStatement", 
		"structBlockStatement", "scopeBlockStatement", "requirementList", "libraryBlockStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'['", "']'", "','", "';'", "'='", "'end'", "'private'", 
		"'protected'", "'public'", "'readonly'", "'constant'", "'not'", "'and'", 
		"'or'", "'takes'", "'returns'", "'return'", "'call'", "'set'", "'debug'", 
		"'local'", "'uses'", "'requires'", "'initializer'", "'thistype'", "'this'", 
		"'super'", "'delegate'", "'operator'", "'static'", "'array'", "'defaults'", 
		"'extends'", "'implement'", "'optional'", "'hook'", "'stub'", "'library'", 
		"'endlibrary'", "'scope'", "'endscope'", "'struct'", "'endstruct'", "'interface'", 
		"'endinterface'", "'module'", "'endmodule'", "'function'", "'endfunction'", 
		"'method'", "'endmethod'", "'for'", "'endfor'", "'while'", "'endwhile'", 
		"'loop'", "'exitwhen'", "'break'", "'continue'", "'endloop'", "'nothing'", 
		"'true'", "'false'", "'null'", "'if'", "'then'", "'elseif'", "'else'", 
		"'endif'", "'globals'", "'endglobals'", null, null, "'+'", "'-'", "'*'", 
		"'/'", "'+='", "'-='", "'*='", "'/='", "'.'", null, null, null, null, 
		null, "'=='", "'!='", "'>'", "'>='", "'<'", "'<='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "END", "PRIVATE", "PROTECTED", 
		"PUBLIC", "READONLY", "CONSTANT", "NOT", "AND", "OR", "TAKES", "RETURNS", 
		"RETURN", "CALL", "SET", "DEBUG", "LOCAL", "USES", "REQUIRES", "INITIALIZER", 
		"THISTYPE", "THIS", "SUPER", "DELEGATE", "OPERATOR", "STATIC", "ARRAY", 
		"DEFAULTS", "EXTENDS", "IMPLEMENT", "OPTIONAL", "HOOK", "STUB", "LIBRARY", 
		"ENDLIBRARY", "SCOPE", "ENDSCOPE", "STRUCT", "ENDSTRUCT", "INTERFACE", 
		"ENDINTERFACE", "MODULE", "ENDMODULE", "FUNCTION", "ENDFUNCTION", "METHOD", 
		"ENDMETHOD", "FOR", "ENDFOR", "WHILE", "ENDWHILE", "LOOP", "EXITWHEN", 
		"BREAK", "CONTINUE", "ENDLOOP", "NOTHING", "TRUE", "FALSE", "NULL", "IF", 
		"THEN", "ELSEIF", "ELSE", "ENDIF", "GLOBAL", "ENDGLOBAL", "LINECOMMENT", 
		"COMMENT", "PLUS", "MINUS", "MULT", "DIV", "ASSERTPLUS", "ASSERTMINUS", 
		"ASSERTMULT", "ASSERTDIV", "DOT", "STRING", "REAL", "RAWCODE", "HEX", 
		"INTEGER", "EQUAL", "NOT_EQUAL", "GREATER_THAN", "GREATER_THAN_OR_EQUAL_THAN", 
		"LOWER_THAN", "LOWER_THAN_OR_EQUAL_THAN", "INT", "EOL", "ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "vrJASS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public vrJASSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitsContext extends ParserRuleContext {
		public LibraryBlockStatementContext libraryBlockStatement() {
			return getRuleContext(LibraryBlockStatementContext.class,0);
		}
		public ScopeBlockStatementContext scopeBlockStatement() {
			return getRuleContext(ScopeBlockStatementContext.class,0);
		}
		public StructBlockStatementContext structBlockStatement() {
			return getRuleContext(StructBlockStatementContext.class,0);
		}
		public FunctionStatementContext functionStatement() {
			return getRuleContext(FunctionStatementContext.class,0);
		}
		public GlobalBlockStatementContext globalBlockStatement() {
			return getRuleContext(GlobalBlockStatementContext.class,0);
		}
		public InitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterInits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitInits(this);
		}
	}

	public final InitsContext inits() throws RecognitionException {
		InitsContext _localctx = new InitsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inits);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				libraryBlockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				scopeBlockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				structBlockStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				functionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				globalBlockStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitContext extends ParserRuleContext {
		public List<InitsContext> inits() {
			return getRuleContexts(InitsContext.class);
		}
		public InitsContext inits(int i) {
			return getRuleContext(InitsContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(vrJASSParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(vrJASSParser.EOL, i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (PRIVATE - 9)) | (1L << (PUBLIC - 9)) | (1L << (LIBRARY - 9)) | (1L << (SCOPE - 9)) | (1L << (STRUCT - 9)) | (1L << (FUNCTION - 9)) | (1L << (GLOBAL - 9)))) != 0)) {
				{
				setState(87);
				inits();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(88);
					match(EOL);
					setState(89);
					inits();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonePublicPrivateVisibilityContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(vrJASSParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(vrJASSParser.PRIVATE, 0); }
		public NonePublicPrivateVisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonePublicPrivateVisibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterNonePublicPrivateVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitNonePublicPrivateVisibility(this);
		}
	}

	public final NonePublicPrivateVisibilityContext nonePublicPrivateVisibility() throws RecognitionException {
		NonePublicPrivateVisibilityContext _localctx = new NonePublicPrivateVisibilityContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nonePublicPrivateVisibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PUBLIC) {
				{
				setState(97);
				_la = _input.LA(1);
				if ( !(_la==PRIVATE || _la==PUBLIC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PublicPrivateProtectedVisiblityContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(vrJASSParser.PUBLIC, 0); }
		public List<TerminalNode> PRIVATE() { return getTokens(vrJASSParser.PRIVATE); }
		public TerminalNode PRIVATE(int i) {
			return getToken(vrJASSParser.PRIVATE, i);
		}
		public PublicPrivateProtectedVisiblityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicPrivateProtectedVisiblity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterPublicPrivateProtectedVisiblity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitPublicPrivateProtectedVisiblity(this);
		}
	}

	public final PublicPrivateProtectedVisiblityContext publicPrivateProtectedVisiblity() throws RecognitionException {
		PublicPrivateProtectedVisiblityContext _localctx = new PublicPrivateProtectedVisiblityContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_publicPrivateProtectedVisiblity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==PRIVATE || _la==PUBLIC) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableTypeContext extends ParserRuleContext {
		public TerminalNode THISTYPE() { return getToken(vrJASSParser.THISTYPE, 0); }
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitVariableType(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==THISTYPE || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitArgList(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argList);
		try {
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__0);
				setState(105);
				exprList();
				setState(106);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__0);
				setState(109);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitFunctionExpression(this);
		}
	}

	public final FunctionExpressionContext functionExpression() throws RecognitionException {
		FunctionExpressionContext _localctx = new FunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			setState(113);
			argList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodExpressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(vrJASSParser.DOT, 0); }
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public MethodExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitMethodExpression(this);
		}
	}

	public final MethodExpressionContext methodExpression() throws RecognitionException {
		MethodExpressionContext _localctx = new MethodExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(DOT);
			setState(116);
			functionExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesisExpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitParenthesisExpression(this);
		}
	}
	public static class MathExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(vrJASSParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(vrJASSParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(vrJASSParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(vrJASSParser.MINUS, 0); }
		public MathExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitMathExpression(this);
		}
	}
	public static class ComparisonExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(vrJASSParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(vrJASSParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(vrJASSParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL_THAN() { return getToken(vrJASSParser.GREATER_THAN_OR_EQUAL_THAN, 0); }
		public TerminalNode LOWER_THAN() { return getToken(vrJASSParser.LOWER_THAN, 0); }
		public TerminalNode LOWER_THAN_OR_EQUAL_THAN() { return getToken(vrJASSParser.LOWER_THAN_OR_EQUAL_THAN, 0); }
		public ComparisonExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitComparisonExpression(this);
		}
	}
	public static class IgnoreFunctionExpressionContext extends ExprContext {
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public IgnoreFunctionExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterIgnoreFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitIgnoreFunctionExpression(this);
		}
	}
	public static class BooleanExpressionContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(vrJASSParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(vrJASSParser.FALSE, 0); }
		public BooleanExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitBooleanExpression(this);
		}
	}
	public static class IntegerExpressionContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(vrJASSParser.INTEGER, 0); }
		public IntegerExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitIntegerExpression(this);
		}
	}
	public static class VariableExpressionContext extends ExprContext {
		public TerminalNode THIS() { return getToken(vrJASSParser.THIS, 0); }
		public TerminalNode THISTYPE() { return getToken(vrJASSParser.THISTYPE, 0); }
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public VariableExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitVariableExpression(this);
		}
	}
	public static class OrExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(vrJASSParser.OR, 0); }
		public OrExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitOrExpression(this);
		}
	}
	public static class AndExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(vrJASSParser.AND, 0); }
		public AndExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitAndExpression(this);
		}
	}
	public static class StringExpressionContext extends ExprContext {
		public TerminalNode STRING() { return getToken(vrJASSParser.STRING, 0); }
		public StringExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitStringExpression(this);
		}
	}
	public static class IgnoreMethodExpressionContext extends ExprContext {
		public MethodExpressionContext methodExpression() {
			return getRuleContext(MethodExpressionContext.class,0);
		}
		public IgnoreMethodExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterIgnoreMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitIgnoreMethodExpression(this);
		}
	}
	public static class NullExpressionContext extends ExprContext {
		public TerminalNode NULL() { return getToken(vrJASSParser.NULL, 0); }
		public NullExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitNullExpression(this);
		}
	}
	public static class VariableArrayExpressionContext extends ExprContext {
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableArrayExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterVariableArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitVariableArrayExpression(this);
		}
	}
	public static class RealExpressionContext extends ExprContext {
		public TerminalNode REAL() { return getToken(vrJASSParser.REAL, 0); }
		public RealExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterRealExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitRealExpression(this);
		}
	}
	public static class PropertyExpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(vrJASSParser.DOT, 0); }
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public PropertyExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterPropertyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitPropertyExpression(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new IntegerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(119);
				match(INTEGER);
				}
				break;
			case 2:
				{
				_localctx = new RealExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(REAL);
				}
				break;
			case 3:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(NULL);
				}
				break;
			case 5:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 6:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(T__0);
				setState(125);
				expr(0);
				setState(126);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				_la = _input.LA(1);
				if ( !(_la==THISTYPE || _la==THIS || _la==ID) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 8:
				{
				_localctx = new VariableArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(ID);
				setState(130);
				match(T__2);
				setState(131);
				expr(0);
				setState(132);
				match(T__3);
				}
				break;
			case 9:
				{
				_localctx = new IgnoreFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				functionExpression();
				}
				break;
			case 10:
				{
				_localctx = new IgnoreMethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				methodExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MathExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(139);
						_la = _input.LA(1);
						if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (PLUS - 76)) | (1L << (MINUS - 76)) | (1L << (MULT - 76)) | (1L << (DIV - 76)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(140);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(142);
						_la = _input.LA(1);
						if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (EQUAL - 90)) | (1L << (NOT_EQUAL - 90)) | (1L << (GREATER_THAN - 90)) | (1L << (GREATER_THAN_OR_EQUAL_THAN - 90)) | (1L << (LOWER_THAN - 90)) | (1L << (LOWER_THAN_OR_EQUAL_THAN - 90)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(143);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new OrExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(145);
						match(OR);
						setState(146);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new AndExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(148);
						match(AND);
						setState(149);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new PropertyExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(151);
						match(DOT);
						setState(152);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			expr(0);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(159);
				match(T__4);
				setState(160);
				expr(0);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DebugStatementContext extends ParserRuleContext {
		public TerminalNode DEBUG() { return getToken(vrJASSParser.DEBUG, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public DebugStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debugStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterDebugStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitDebugStatement(this);
		}
	}

	public final DebugStatementContext debugStatement() throws RecognitionException {
		DebugStatementContext _localctx = new DebugStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_debugStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(DEBUG);
			setState(167);
			stat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(vrJASSParser.ELSEIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(vrJASSParser.EOL, 0); }
		public TerminalNode THEN() { return getToken(vrJASSParser.THEN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitElseIfStatement(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ELSEIF);
			setState(170);
			match(T__0);
			setState(171);
			expr(0);
			setState(172);
			match(T__1);
			setState(174);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(173);
				match(THEN);
				}
			}

			setState(176);
			match(EOL);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (NULL - 64)) | (1L << (IF - 64)) | (1L << (DOT - 64)) | (1L << (STRING - 64)) | (1L << (REAL - 64)) | (1L << (INTEGER - 64)) | (1L << (EOL - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(177);
				stat();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(vrJASSParser.ELSE, 0); }
		public TerminalNode EOL() { return getToken(vrJASSParser.EOL, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ELSE);
			setState(184);
			match(EOL);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (NULL - 64)) | (1L << (IF - 64)) | (1L << (DOT - 64)) | (1L << (STRING - 64)) | (1L << (REAL - 64)) | (1L << (INTEGER - 64)) | (1L << (EOL - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(185);
				stat();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(vrJASSParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(vrJASSParser.EOL, 0); }
		public TerminalNode ENDIF() { return getToken(vrJASSParser.ENDIF, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public TerminalNode THEN() { return getToken(vrJASSParser.THEN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IF);
			setState(192);
			match(T__0);
			setState(193);
			expr(0);
			setState(194);
			match(T__1);
			setState(196);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(195);
				match(THEN);
				}
			}

			setState(198);
			match(EOL);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (NULL - 64)) | (1L << (IF - 64)) | (1L << (DOT - 64)) | (1L << (STRING - 64)) | (1L << (REAL - 64)) | (1L << (INTEGER - 64)) | (1L << (EOL - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(199);
				stat();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(205);
				elseIfStatement();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(211);
				elseStatement();
				}
			}

			setState(214);
			_la = _input.LA(1);
			if ( !(_la==END || _la==ENDIF) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(vrJASSParser.BREAK, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(vrJASSParser.CONTINUE, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(CONTINUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitWhenStatementContext extends ParserRuleContext {
		public TerminalNode EXITWHEN() { return getToken(vrJASSParser.EXITWHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExitWhenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitWhenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterExitWhenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitExitWhenStatement(this);
		}
	}

	public final ExitWhenStatementContext exitWhenStatement() throws RecognitionException {
		ExitWhenStatementContext _localctx = new ExitWhenStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exitWhenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(EXITWHEN);
			setState(221);
			match(T__0);
			setState(222);
			expr(0);
			setState(223);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(vrJASSParser.FOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EOL() { return getToken(vrJASSParser.EOL, 0); }
		public TerminalNode ENDFOR() { return getToken(vrJASSParser.ENDFOR, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(FOR);
			setState(226);
			match(T__0);
			setState(227);
			expr(0);
			setState(228);
			match(T__5);
			setState(229);
			expr(0);
			setState(230);
			match(T__5);
			setState(231);
			expr(0);
			setState(232);
			match(T__1);
			setState(233);
			match(EOL);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (NULL - 64)) | (1L << (IF - 64)) | (1L << (DOT - 64)) | (1L << (STRING - 64)) | (1L << (REAL - 64)) | (1L << (INTEGER - 64)) | (1L << (EOL - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(234);
				stat();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==END || _la==ENDFOR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(vrJASSParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(vrJASSParser.EOL, 0); }
		public TerminalNode ENDWHILE() { return getToken(vrJASSParser.ENDWHILE, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(WHILE);
			setState(243);
			match(T__0);
			setState(244);
			expr(0);
			setState(245);
			match(T__1);
			setState(246);
			match(EOL);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (NULL - 64)) | (1L << (IF - 64)) | (1L << (DOT - 64)) | (1L << (STRING - 64)) | (1L << (REAL - 64)) | (1L << (INTEGER - 64)) | (1L << (EOL - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(247);
				stat();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==END || _la==ENDWHILE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(vrJASSParser.LOOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(vrJASSParser.EOL, 0); }
		public TerminalNode ENDLOOP() { return getToken(vrJASSParser.ENDLOOP, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitLoopStatement(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(LOOP);
			setState(256);
			match(T__0);
			setState(257);
			expr(0);
			setState(258);
			match(T__1);
			setState(259);
			match(EOL);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (NULL - 64)) | (1L << (IF - 64)) | (1L << (DOT - 64)) | (1L << (STRING - 64)) | (1L << (REAL - 64)) | (1L << (INTEGER - 64)) | (1L << (EOL - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(260);
				stat();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==END || _la==ENDLOOP) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(vrJASSParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(RETURN);
			setState(269);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(vrJASSParser.CALL, 0); }
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitFunctionCallStatement(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(CALL);
			setState(272);
			functionExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallStatementContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(vrJASSParser.CALL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MethodExpressionContext methodExpression() {
			return getRuleContext(MethodExpressionContext.class,0);
		}
		public MethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitMethodCallStatement(this);
		}
	}

	public final MethodCallStatementContext methodCallStatement() throws RecognitionException {
		MethodCallStatementContext _localctx = new MethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(CALL);
			setState(275);
			expr(0);
			setState(276);
			methodExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStatementContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitVariableStatement(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			variableType();
			setState(279);
			match(ID);
			setState(282);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(280);
				match(T__6);
				setState(281);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalVariableStatementContext extends ParserRuleContext {
		public NonePublicPrivateVisibilityContext nonePublicPrivateVisibility() {
			return getRuleContext(NonePublicPrivateVisibilityContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(vrJASSParser.CONSTANT, 0); }
		public GlobalVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterGlobalVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitGlobalVariableStatement(this);
		}
	}

	public final GlobalVariableStatementContext globalVariableStatement() throws RecognitionException {
		GlobalVariableStatementContext _localctx = new GlobalVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_globalVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			nonePublicPrivateVisibility();
			setState(286);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(285);
				match(CONSTANT);
				}
			}

			setState(288);
			variableStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableArrayStatementContext extends ParserRuleContext {
		public TerminalNode LOCAL() { return getToken(vrJASSParser.LOCAL, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(vrJASSParser.ARRAY, 0); }
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public LocalVariableArrayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableArrayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterLocalVariableArrayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitLocalVariableArrayStatement(this);
		}
	}

	public final LocalVariableArrayStatementContext localVariableArrayStatement() throws RecognitionException {
		LocalVariableArrayStatementContext _localctx = new LocalVariableArrayStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_localVariableArrayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(LOCAL);
			setState(291);
			variableType();
			setState(292);
			match(ARRAY);
			setState(293);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableStatementContext extends ParserRuleContext {
		public TerminalNode LOCAL() { return getToken(vrJASSParser.LOCAL, 0); }
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public LocalVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterLocalVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitLocalVariableStatement(this);
		}
	}

	public final LocalVariableStatementContext localVariableStatement() throws RecognitionException {
		LocalVariableStatementContext _localctx = new LocalVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_localVariableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LOCAL);
			setState(296);
			variableStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetVariableStatementContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(vrJASSParser.SET, 0); }
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SetVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterSetVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitSetVariableStatement(this);
		}
	}

	public final SetVariableStatementContext setVariableStatement() throws RecognitionException {
		SetVariableStatementContext _localctx = new SetVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_setVariableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(SET);
			setState(299);
			match(ID);
			setState(300);
			match(T__6);
			setState(301);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyVisibilityContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(vrJASSParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(vrJASSParser.PRIVATE, 0); }
		public TerminalNode READONLY() { return getToken(vrJASSParser.READONLY, 0); }
		public PropertyVisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyVisibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterPropertyVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitPropertyVisibility(this);
		}
	}

	public final PropertyVisibilityContext propertyVisibility() throws RecognitionException {
		PropertyVisibilityContext _localctx = new PropertyVisibilityContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_propertyVisibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << READONLY))) != 0)) {
				{
				setState(303);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << READONLY))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyStatementContext extends ParserRuleContext {
		public PropertyVisibilityContext propertyVisibility() {
			return getRuleContext(PropertyVisibilityContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(vrJASSParser.STATIC, 0); }
		public TerminalNode CONSTANT() { return getToken(vrJASSParser.CONSTANT, 0); }
		public PropertyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterPropertyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitPropertyStatement(this);
		}
	}

	public final PropertyStatementContext propertyStatement() throws RecognitionException {
		PropertyStatementContext _localctx = new PropertyStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_propertyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			propertyVisibility();
			setState(308);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(307);
				match(STATIC);
				}
			}

			setState(311);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(310);
				match(CONSTANT);
				}
			}

			setState(313);
			variableStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(vrJASSParser.EOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public MethodCallStatementContext methodCallStatement() {
			return getRuleContext(MethodCallStatementContext.class,0);
		}
		public LocalVariableArrayStatementContext localVariableArrayStatement() {
			return getRuleContext(LocalVariableArrayStatementContext.class,0);
		}
		public LocalVariableStatementContext localVariableStatement() {
			return getRuleContext(LocalVariableStatementContext.class,0);
		}
		public SetVariableStatementContext setVariableStatement() {
			return getRuleContext(SetVariableStatementContext.class,0);
		}
		public DebugStatementContext debugStatement() {
			return getRuleContext(DebugStatementContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stat);
		try {
			setState(328);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(EOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				loopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(321);
				returnStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(322);
				functionCallStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(323);
				methodCallStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(324);
				localVariableArrayStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(325);
				localVariableStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(326);
				setVariableStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(327);
				debugStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalBlockStatementContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(vrJASSParser.GLOBAL, 0); }
		public List<TerminalNode> EOL() { return getTokens(vrJASSParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(vrJASSParser.EOL, i);
		}
		public TerminalNode ENDGLOBAL() { return getToken(vrJASSParser.ENDGLOBAL, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public List<GlobalVariableStatementContext> globalVariableStatement() {
			return getRuleContexts(GlobalVariableStatementContext.class);
		}
		public GlobalVariableStatementContext globalVariableStatement(int i) {
			return getRuleContext(GlobalVariableStatementContext.class,i);
		}
		public GlobalBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalBlockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterGlobalBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitGlobalBlockStatement(this);
		}
	}

	public final GlobalBlockStatementContext globalBlockStatement() throws RecognitionException {
		GlobalBlockStatementContext _localctx = new GlobalBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_globalBlockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(GLOBAL);
			setState(331);
			match(EOL);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << CONSTANT) | (1L << THISTYPE))) != 0) || _la==EOL || _la==ID) {
				{
				{
				setState(333);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << CONSTANT) | (1L << THISTYPE))) != 0) || _la==ID) {
					{
					setState(332);
					globalVariableStatement();
					}
				}

				setState(335);
				match(EOL);
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			_la = _input.LA(1);
			if ( !(_la==END || _la==ENDGLOBAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public TerminalNode NOTHING() { return getToken(vrJASSParser.NOTHING, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitTypeArgumentList(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typeArgumentList);
		int _la;
		try {
			setState(352);
			switch (_input.LA(1)) {
			case NOTHING:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(NOTHING);
				}
				break;
			case THISTYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				typeArgument();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(345);
					match(T__4);
					setState(346);
					typeArgument();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typeArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			variableType();
			setState(355);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionStatementContext extends ParserRuleContext {
		public NonePublicPrivateVisibilityContext nonePublicPrivateVisibility() {
			return getRuleContext(NonePublicPrivateVisibilityContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(vrJASSParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(vrJASSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(vrJASSParser.ID, i);
		}
		public TerminalNode TAKES() { return getToken(vrJASSParser.TAKES, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(vrJASSParser.RETURNS, 0); }
		public TerminalNode EOL() { return getToken(vrJASSParser.EOL, 0); }
		public TerminalNode NOTHING() { return getToken(vrJASSParser.NOTHING, 0); }
		public TerminalNode ENDFUNCTION() { return getToken(vrJASSParser.ENDFUNCTION, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitFunctionStatement(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			nonePublicPrivateVisibility();
			setState(358);
			match(FUNCTION);
			setState(359);
			match(ID);
			setState(360);
			match(TAKES);
			setState(361);
			typeArgumentList();
			setState(362);
			match(RETURNS);
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==NOTHING || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(364);
			match(EOL);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (NULL - 64)) | (1L << (IF - 64)) | (1L << (DOT - 64)) | (1L << (STRING - 64)) | (1L << (REAL - 64)) | (1L << (INTEGER - 64)) | (1L << (EOL - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(365);
				stat();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
			_la = _input.LA(1);
			if ( !(_la==END || _la==ENDFUNCTION) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodStatementContext extends ParserRuleContext {
		public NonePublicPrivateVisibilityContext nonePublicPrivateVisibility() {
			return getRuleContext(NonePublicPrivateVisibilityContext.class,0);
		}
		public TerminalNode METHOD() { return getToken(vrJASSParser.METHOD, 0); }
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public TerminalNode TAKES() { return getToken(vrJASSParser.TAKES, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(vrJASSParser.RETURNS, 0); }
		public TerminalNode EOL() { return getToken(vrJASSParser.EOL, 0); }
		public TerminalNode ENDMETHOD() { return getToken(vrJASSParser.ENDMETHOD, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode NOTHING() { return getToken(vrJASSParser.NOTHING, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode STATIC() { return getToken(vrJASSParser.STATIC, 0); }
		public TerminalNode STUB() { return getToken(vrJASSParser.STUB, 0); }
		public MethodStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterMethodStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitMethodStatement(this);
		}
	}

	public final MethodStatementContext methodStatement() throws RecognitionException {
		MethodStatementContext _localctx = new MethodStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_methodStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			nonePublicPrivateVisibility();
			setState(375);
			_la = _input.LA(1);
			if (_la==STATIC || _la==STUB) {
				{
				setState(374);
				_la = _input.LA(1);
				if ( !(_la==STATIC || _la==STUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(377);
			match(METHOD);
			setState(378);
			match(ID);
			setState(379);
			match(TAKES);
			setState(380);
			typeArgumentList();
			setState(381);
			match(RETURNS);
			setState(384);
			switch (_input.LA(1)) {
			case THISTYPE:
			case ID:
				{
				setState(382);
				variableType();
				}
				break;
			case NOTHING:
				{
				setState(383);
				match(NOTHING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(386);
			match(EOL);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (NULL - 64)) | (1L << (IF - 64)) | (1L << (DOT - 64)) | (1L << (STRING - 64)) | (1L << (REAL - 64)) | (1L << (INTEGER - 64)) | (1L << (EOL - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(387);
				stat();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
			_la = _input.LA(1);
			if ( !(_la==END || _la==ENDMETHOD) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructBlockStatementContext extends ParserRuleContext {
		public NonePublicPrivateVisibilityContext nonePublicPrivateVisibility() {
			return getRuleContext(NonePublicPrivateVisibilityContext.class,0);
		}
		public TerminalNode STRUCT() { return getToken(vrJASSParser.STRUCT, 0); }
		public List<TerminalNode> ID() { return getTokens(vrJASSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(vrJASSParser.ID, i);
		}
		public List<TerminalNode> EOL() { return getTokens(vrJASSParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(vrJASSParser.EOL, i);
		}
		public TerminalNode ENDSTRUCT() { return getToken(vrJASSParser.ENDSTRUCT, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public TerminalNode EXTENDS() { return getToken(vrJASSParser.EXTENDS, 0); }
		public List<MethodStatementContext> methodStatement() {
			return getRuleContexts(MethodStatementContext.class);
		}
		public MethodStatementContext methodStatement(int i) {
			return getRuleContext(MethodStatementContext.class,i);
		}
		public List<PropertyStatementContext> propertyStatement() {
			return getRuleContexts(PropertyStatementContext.class);
		}
		public PropertyStatementContext propertyStatement(int i) {
			return getRuleContext(PropertyStatementContext.class,i);
		}
		public StructBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBlockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterStructBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitStructBlockStatement(this);
		}
	}

	public final StructBlockStatementContext structBlockStatement() throws RecognitionException {
		StructBlockStatementContext _localctx = new StructBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_structBlockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			nonePublicPrivateVisibility();
			setState(396);
			match(STRUCT);
			setState(397);
			match(ID);
			setState(400);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(398);
				match(EXTENDS);
				setState(399);
				match(ID);
				}
			}

			setState(402);
			match(EOL);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << READONLY) | (1L << CONSTANT) | (1L << THISTYPE) | (1L << STATIC) | (1L << STUB) | (1L << METHOD))) != 0) || _la==EOL || _la==ID) {
				{
				{
				setState(405);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(403);
					methodStatement();
					}
					break;
				case 2:
					{
					setState(404);
					propertyStatement();
					}
					break;
				}
				setState(407);
				match(EOL);
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
			_la = _input.LA(1);
			if ( !(_la==END || _la==ENDSTRUCT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeBlockStatementContext extends ParserRuleContext {
		public TerminalNode SCOPE() { return getToken(vrJASSParser.SCOPE, 0); }
		public List<TerminalNode> ID() { return getTokens(vrJASSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(vrJASSParser.ID, i);
		}
		public List<TerminalNode> EOL() { return getTokens(vrJASSParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(vrJASSParser.EOL, i);
		}
		public TerminalNode ENDSCOPE() { return getToken(vrJASSParser.ENDSCOPE, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public TerminalNode INITIALIZER() { return getToken(vrJASSParser.INITIALIZER, 0); }
		public List<StructBlockStatementContext> structBlockStatement() {
			return getRuleContexts(StructBlockStatementContext.class);
		}
		public StructBlockStatementContext structBlockStatement(int i) {
			return getRuleContext(StructBlockStatementContext.class,i);
		}
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public List<GlobalBlockStatementContext> globalBlockStatement() {
			return getRuleContexts(GlobalBlockStatementContext.class);
		}
		public GlobalBlockStatementContext globalBlockStatement(int i) {
			return getRuleContext(GlobalBlockStatementContext.class,i);
		}
		public ScopeBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeBlockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterScopeBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitScopeBlockStatement(this);
		}
	}

	public final ScopeBlockStatementContext scopeBlockStatement() throws RecognitionException {
		ScopeBlockStatementContext _localctx = new ScopeBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_scopeBlockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(SCOPE);
			setState(416);
			match(ID);
			setState(419);
			_la = _input.LA(1);
			if (_la==INITIALIZER) {
				{
				setState(417);
				match(INITIALIZER);
				setState(418);
				match(ID);
				}
			}

			setState(421);
			match(EOL);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << STRUCT) | (1L << FUNCTION))) != 0) || _la==GLOBAL || _la==EOL) {
				{
				{
				setState(425);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(422);
					structBlockStatement();
					}
					break;
				case 2:
					{
					setState(423);
					functionStatement();
					}
					break;
				case 3:
					{
					setState(424);
					globalBlockStatement();
					}
					break;
				}
				setState(427);
				match(EOL);
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
			_la = _input.LA(1);
			if ( !(_la==END || _la==ENDSCOPE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(vrJASSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(vrJASSParser.ID, i);
		}
		public RequirementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterRequirementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitRequirementList(this);
		}
	}

	public final RequirementListContext requirementList() throws RecognitionException {
		RequirementListContext _localctx = new RequirementListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_requirementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(ID);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(436);
				match(T__4);
				setState(437);
				match(ID);
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibraryBlockStatementContext extends ParserRuleContext {
		public TerminalNode LIBRARY() { return getToken(vrJASSParser.LIBRARY, 0); }
		public List<TerminalNode> ID() { return getTokens(vrJASSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(vrJASSParser.ID, i);
		}
		public List<TerminalNode> EOL() { return getTokens(vrJASSParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(vrJASSParser.EOL, i);
		}
		public TerminalNode ENDLIBRARY() { return getToken(vrJASSParser.ENDLIBRARY, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public TerminalNode INITIALIZER() { return getToken(vrJASSParser.INITIALIZER, 0); }
		public TerminalNode REQUIRES() { return getToken(vrJASSParser.REQUIRES, 0); }
		public RequirementListContext requirementList() {
			return getRuleContext(RequirementListContext.class,0);
		}
		public List<ScopeBlockStatementContext> scopeBlockStatement() {
			return getRuleContexts(ScopeBlockStatementContext.class);
		}
		public ScopeBlockStatementContext scopeBlockStatement(int i) {
			return getRuleContext(ScopeBlockStatementContext.class,i);
		}
		public List<StructBlockStatementContext> structBlockStatement() {
			return getRuleContexts(StructBlockStatementContext.class);
		}
		public StructBlockStatementContext structBlockStatement(int i) {
			return getRuleContext(StructBlockStatementContext.class,i);
		}
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public List<GlobalBlockStatementContext> globalBlockStatement() {
			return getRuleContexts(GlobalBlockStatementContext.class);
		}
		public GlobalBlockStatementContext globalBlockStatement(int i) {
			return getRuleContext(GlobalBlockStatementContext.class,i);
		}
		public LibraryBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryBlockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterLibraryBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitLibraryBlockStatement(this);
		}
	}

	public final LibraryBlockStatementContext libraryBlockStatement() throws RecognitionException {
		LibraryBlockStatementContext _localctx = new LibraryBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_libraryBlockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(LIBRARY);
			setState(444);
			match(ID);
			setState(447);
			_la = _input.LA(1);
			if (_la==INITIALIZER) {
				{
				setState(445);
				match(INITIALIZER);
				setState(446);
				match(ID);
				}
			}

			setState(451);
			_la = _input.LA(1);
			if (_la==REQUIRES) {
				{
				setState(449);
				match(REQUIRES);
				setState(450);
				requirementList();
				}
			}

			setState(453);
			match(EOL);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << SCOPE) | (1L << STRUCT) | (1L << FUNCTION))) != 0) || _la==GLOBAL || _la==EOL) {
				{
				{
				setState(458);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(454);
					scopeBlockStatement();
					}
					break;
				case 2:
					{
					setState(455);
					structBlockStatement();
					}
					break;
				case 3:
					{
					setState(456);
					functionStatement();
					}
					break;
				case 4:
					{
					setState(457);
					globalBlockStatement();
					}
					break;
				}
				setState(460);
				match(EOL);
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			_la = _input.LA(1);
			if ( !(_la==END || _la==ENDLIBRARY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3e\u01d7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\5\2X\n\2\3\3\3\3\3\3\7\3]\n\3\f\3\16\3`\13\3\5\3b\n\3\3\4\5\4e"+
		"\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u008b\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u009c\n\n\f\n\16\n\u009f\13\n\3\13\3\13\3\13\7\13\u00a4"+
		"\n\13\f\13\16\13\u00a7\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u00b1"+
		"\n\r\3\r\3\r\7\r\u00b5\n\r\f\r\16\r\u00b8\13\r\3\16\3\16\3\16\7\16\u00bd"+
		"\n\16\f\16\16\16\u00c0\13\16\3\17\3\17\3\17\3\17\3\17\5\17\u00c7\n\17"+
		"\3\17\3\17\7\17\u00cb\n\17\f\17\16\17\u00ce\13\17\3\17\7\17\u00d1\n\17"+
		"\f\17\16\17\u00d4\13\17\3\17\5\17\u00d7\n\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00ee\n\23\f\23\16\23\u00f1\13\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u00fb\n\24\f\24\16\24\u00fe\13\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0108\n\25\f\25\16\25\u010b\13\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\5\31\u011d\n\31\3\32\3\32\5\32\u0121\n\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\5\36\u0133"+
		"\n\36\3\37\3\37\5\37\u0137\n\37\3\37\5\37\u013a\n\37\3\37\3\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u014b\n \3!\3!\3!\5!\u0150\n!\3!\7"+
		"!\u0153\n!\f!\16!\u0156\13!\3!\3!\3\"\3\"\3\"\3\"\7\"\u015e\n\"\f\"\16"+
		"\"\u0161\13\"\5\"\u0163\n\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0171"+
		"\n$\f$\16$\u0174\13$\3$\3$\3%\3%\5%\u017a\n%\3%\3%\3%\3%\3%\3%\3%\5%\u0183"+
		"\n%\3%\3%\7%\u0187\n%\f%\16%\u018a\13%\3%\3%\3&\3&\3&\3&\3&\5&\u0193\n"+
		"&\3&\3&\3&\5&\u0198\n&\3&\7&\u019b\n&\f&\16&\u019e\13&\3&\3&\3\'\3\'\3"+
		"\'\3\'\5\'\u01a6\n\'\3\'\3\'\3\'\3\'\5\'\u01ac\n\'\3\'\7\'\u01af\n\'\f"+
		"\'\16\'\u01b2\13\'\3\'\3\'\3(\3(\3(\7(\u01b9\n(\f(\16(\u01bc\13(\3)\3"+
		")\3)\3)\5)\u01c2\n)\3)\3)\5)\u01c6\n)\3)\3)\3)\3)\3)\5)\u01cd\n)\3)\7"+
		")\u01d0\n)\f)\16)\u01d3\13)\3)\3)\3)\2\3\22*\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\25\4\2\13\13\r\r\4\2"+
		"\35\35dd\3\2BC\4\2\35\36dd\3\2NQ\3\2\\a\4\2\n\nII\4\2\n\n99\4\2\n\n;;"+
		"\4\2\n\n@@\4\2\13\13\r\16\4\2\n\nKK\4\2AAdd\4\2\n\n\65\65\4\2\"\"))\4"+
		"\2\n\n\67\67\4\2\n\n//\4\2\n\n--\4\2\n\n++\u01f9\2W\3\2\2\2\4a\3\2\2\2"+
		"\6d\3\2\2\2\bf\3\2\2\2\nh\3\2\2\2\fp\3\2\2\2\16r\3\2\2\2\20u\3\2\2\2\22"+
		"\u008a\3\2\2\2\24\u00a0\3\2\2\2\26\u00a8\3\2\2\2\30\u00ab\3\2\2\2\32\u00b9"+
		"\3\2\2\2\34\u00c1\3\2\2\2\36\u00da\3\2\2\2 \u00dc\3\2\2\2\"\u00de\3\2"+
		"\2\2$\u00e3\3\2\2\2&\u00f4\3\2\2\2(\u0101\3\2\2\2*\u010e\3\2\2\2,\u0111"+
		"\3\2\2\2.\u0114\3\2\2\2\60\u0118\3\2\2\2\62\u011e\3\2\2\2\64\u0124\3\2"+
		"\2\2\66\u0129\3\2\2\28\u012c\3\2\2\2:\u0132\3\2\2\2<\u0134\3\2\2\2>\u014a"+
		"\3\2\2\2@\u014c\3\2\2\2B\u0162\3\2\2\2D\u0164\3\2\2\2F\u0167\3\2\2\2H"+
		"\u0177\3\2\2\2J\u018d\3\2\2\2L\u01a1\3\2\2\2N\u01b5\3\2\2\2P\u01bd\3\2"+
		"\2\2RX\5P)\2SX\5L\'\2TX\5J&\2UX\5F$\2VX\5@!\2WR\3\2\2\2WS\3\2\2\2WT\3"+
		"\2\2\2WU\3\2\2\2WV\3\2\2\2X\3\3\2\2\2Y^\5\2\2\2Z[\7c\2\2[]\5\2\2\2\\Z"+
		"\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aY\3\2\2\2"+
		"ab\3\2\2\2b\5\3\2\2\2ce\t\2\2\2dc\3\2\2\2de\3\2\2\2e\7\3\2\2\2fg\t\2\2"+
		"\2g\t\3\2\2\2hi\t\3\2\2i\13\3\2\2\2jk\7\3\2\2kl\5\24\13\2lm\7\4\2\2mq"+
		"\3\2\2\2no\7\3\2\2oq\7\4\2\2pj\3\2\2\2pn\3\2\2\2q\r\3\2\2\2rs\7d\2\2s"+
		"t\5\f\7\2t\17\3\2\2\2uv\7V\2\2vw\5\16\b\2w\21\3\2\2\2xy\b\n\1\2y\u008b"+
		"\7[\2\2z\u008b\7X\2\2{\u008b\7W\2\2|\u008b\7D\2\2}\u008b\t\4\2\2~\177"+
		"\7\3\2\2\177\u0080\5\22\n\2\u0080\u0081\7\4\2\2\u0081\u008b\3\2\2\2\u0082"+
		"\u008b\t\5\2\2\u0083\u0084\7d\2\2\u0084\u0085\7\5\2\2\u0085\u0086\5\22"+
		"\n\2\u0086\u0087\7\6\2\2\u0087\u008b\3\2\2\2\u0088\u008b\5\16\b\2\u0089"+
		"\u008b\5\20\t\2\u008ax\3\2\2\2\u008az\3\2\2\2\u008a{\3\2\2\2\u008a|\3"+
		"\2\2\2\u008a}\3\2\2\2\u008a~\3\2\2\2\u008a\u0082\3\2\2\2\u008a\u0083\3"+
		"\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u009d\3\2\2\2\u008c"+
		"\u008d\f\21\2\2\u008d\u008e\t\6\2\2\u008e\u009c\5\22\n\22\u008f\u0090"+
		"\f\13\2\2\u0090\u0091\t\7\2\2\u0091\u009c\5\22\n\f\u0092\u0093\f\t\2\2"+
		"\u0093\u0094\7\22\2\2\u0094\u009c\5\22\n\n\u0095\u0096\f\b\2\2\u0096\u0097"+
		"\7\21\2\2\u0097\u009c\5\22\n\t\u0098\u0099\f\5\2\2\u0099\u009a\7V\2\2"+
		"\u009a\u009c\7d\2\2\u009b\u008c\3\2\2\2\u009b\u008f\3\2\2\2\u009b\u0092"+
		"\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\23\3\2\2\2\u009f\u009d\3\2\2"+
		"\2\u00a0\u00a5\5\22\n\2\u00a1\u00a2\7\7\2\2\u00a2\u00a4\5\22\n\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\25\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa"+
		"\5> \2\u00aa\27\3\2\2\2\u00ab\u00ac\7G\2\2\u00ac\u00ad\7\3\2\2\u00ad\u00ae"+
		"\5\22\n\2\u00ae\u00b0\7\4\2\2\u00af\u00b1\7F\2\2\u00b0\u00af\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\7c\2\2\u00b3\u00b5\5> "+
		"\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\31\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7H\2\2\u00ba"+
		"\u00be\7c\2\2\u00bb\u00bd\5> \2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2"+
		"\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\33\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c2\7E\2\2\u00c2\u00c3\7\3\2\2\u00c3\u00c4\5\22\n\2\u00c4"+
		"\u00c6\7\4\2\2\u00c5\u00c7\7F\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cc\7c\2\2\u00c9\u00cb\5> \2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00d2\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\5\30\r\2\u00d0\u00cf\3"+
		"\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\5\32\16\2\u00d6\u00d5\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\t\b\2\2\u00d9"+
		"\35\3\2\2\2\u00da\u00db\7>\2\2\u00db\37\3\2\2\2\u00dc\u00dd\7?\2\2\u00dd"+
		"!\3\2\2\2\u00de\u00df\7=\2\2\u00df\u00e0\7\3\2\2\u00e0\u00e1\5\22\n\2"+
		"\u00e1\u00e2\7\4\2\2\u00e2#\3\2\2\2\u00e3\u00e4\78\2\2\u00e4\u00e5\7\3"+
		"\2\2\u00e5\u00e6\5\22\n\2\u00e6\u00e7\7\b\2\2\u00e7\u00e8\5\22\n\2\u00e8"+
		"\u00e9\7\b\2\2\u00e9\u00ea\5\22\n\2\u00ea\u00eb\7\4\2\2\u00eb\u00ef\7"+
		"c\2\2\u00ec\u00ee\5> \2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00f3\t\t\2\2\u00f3%\3\2\2\2\u00f4\u00f5\7:\2\2\u00f5\u00f6"+
		"\7\3\2\2\u00f6\u00f7\5\22\n\2\u00f7\u00f8\7\4\2\2\u00f8\u00fc\7c\2\2\u00f9"+
		"\u00fb\5> \2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2"+
		"\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100"+
		"\t\n\2\2\u0100\'\3\2\2\2\u0101\u0102\7<\2\2\u0102\u0103\7\3\2\2\u0103"+
		"\u0104\5\22\n\2\u0104\u0105\7\4\2\2\u0105\u0109\7c\2\2\u0106\u0108\5>"+
		" \2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\t\13"+
		"\2\2\u010d)\3\2\2\2\u010e\u010f\7\25\2\2\u010f\u0110\5\22\n\2\u0110+\3"+
		"\2\2\2\u0111\u0112\7\26\2\2\u0112\u0113\5\16\b\2\u0113-\3\2\2\2\u0114"+
		"\u0115\7\26\2\2\u0115\u0116\5\22\n\2\u0116\u0117\5\20\t\2\u0117/\3\2\2"+
		"\2\u0118\u0119\5\n\6\2\u0119\u011c\7d\2\2\u011a\u011b\7\t\2\2\u011b\u011d"+
		"\5\22\n\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\61\3\2\2\2\u011e"+
		"\u0120\5\6\4\2\u011f\u0121\7\17\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3"+
		"\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\5\60\31\2\u0123\63\3\2\2\2\u0124"+
		"\u0125\7\31\2\2\u0125\u0126\5\n\6\2\u0126\u0127\7#\2\2\u0127\u0128\7d"+
		"\2\2\u0128\65\3\2\2\2\u0129\u012a\7\31\2\2\u012a\u012b\5\60\31\2\u012b"+
		"\67\3\2\2\2\u012c\u012d\7\27\2\2\u012d\u012e\7d\2\2\u012e\u012f\7\t\2"+
		"\2\u012f\u0130\5\22\n\2\u01309\3\2\2\2\u0131\u0133\t\f\2\2\u0132\u0131"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133;\3\2\2\2\u0134\u0136\5:\36\2\u0135"+
		"\u0137\7\"\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u013a\7\17\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\5\60\31\2\u013c=\3\2\2\2\u013d\u014b\7c\2\2"+
		"\u013e\u014b\5\22\n\2\u013f\u014b\5\34\17\2\u0140\u014b\5&\24\2\u0141"+
		"\u014b\5$\23\2\u0142\u014b\5(\25\2\u0143\u014b\5*\26\2\u0144\u014b\5,"+
		"\27\2\u0145\u014b\5.\30\2\u0146\u014b\5\64\33\2\u0147\u014b\5\66\34\2"+
		"\u0148\u014b\58\35\2\u0149\u014b\5\26\f\2\u014a\u013d\3\2\2\2\u014a\u013e"+
		"\3\2\2\2\u014a\u013f\3\2\2\2\u014a\u0140\3\2\2\2\u014a\u0141\3\2\2\2\u014a"+
		"\u0142\3\2\2\2\u014a\u0143\3\2\2\2\u014a\u0144\3\2\2\2\u014a\u0145\3\2"+
		"\2\2\u014a\u0146\3\2\2\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u0149\3\2\2\2\u014b?\3\2\2\2\u014c\u014d\7J\2\2\u014d\u0154\7c\2\2\u014e"+
		"\u0150\5\62\32\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3"+
		"\2\2\2\u0151\u0153\7c\2\2\u0152\u014f\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0157\u0158\t\r\2\2\u0158A\3\2\2\2\u0159\u0163\7A\2\2\u015a\u015f"+
		"\5D#\2\u015b\u015c\7\7\2\2\u015c\u015e\5D#\2\u015d\u015b\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0163\3\2"+
		"\2\2\u0161\u015f\3\2\2\2\u0162\u0159\3\2\2\2\u0162\u015a\3\2\2\2\u0163"+
		"C\3\2\2\2\u0164\u0165\5\n\6\2\u0165\u0166\7d\2\2\u0166E\3\2\2\2\u0167"+
		"\u0168\5\6\4\2\u0168\u0169\7\64\2\2\u0169\u016a\7d\2\2\u016a\u016b\7\23"+
		"\2\2\u016b\u016c\5B\"\2\u016c\u016d\7\24\2\2\u016d\u016e\t\16\2\2\u016e"+
		"\u0172\7c\2\2\u016f\u0171\5> \2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2"+
		"\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0175\u0176\t\17\2\2\u0176G\3\2\2\2\u0177\u0179\5\6\4\2\u0178"+
		"\u017a\t\20\2\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3"+
		"\2\2\2\u017b\u017c\7\66\2\2\u017c\u017d\7d\2\2\u017d\u017e\7\23\2\2\u017e"+
		"\u017f\5B\"\2\u017f\u0182\7\24\2\2\u0180\u0183\5\n\6\2\u0181\u0183\7A"+
		"\2\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0188\7c\2\2\u0185\u0187\5> \2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2"+
		"\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018b\u018c\t\21\2\2\u018cI\3\2\2\2\u018d\u018e\5\6\4\2\u018e"+
		"\u018f\7.\2\2\u018f\u0192\7d\2\2\u0190\u0191\7%\2\2\u0191\u0193\7d\2\2"+
		"\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u019c"+
		"\7c\2\2\u0195\u0198\5H%\2\u0196\u0198\5<\37\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\7c"+
		"\2\2\u019a\u0197\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\t\22"+
		"\2\2\u01a0K\3\2\2\2\u01a1\u01a2\7,\2\2\u01a2\u01a5\7d\2\2\u01a3\u01a4"+
		"\7\34\2\2\u01a4\u01a6\7d\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01b0\7c\2\2\u01a8\u01ac\5J&\2\u01a9\u01ac\5F$\2"+
		"\u01aa\u01ac\5@!\2\u01ab\u01a8\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\7c\2\2\u01ae"+
		"\u01ab\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\t\23\2\2\u01b4"+
		"M\3\2\2\2\u01b5\u01ba\7d\2\2\u01b6\u01b7\7\7\2\2\u01b7\u01b9\7d\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bbO\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\7*\2\2\u01be\u01c1"+
		"\7d\2\2\u01bf\u01c0\7\34\2\2\u01c0\u01c2\7d\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c4\7\33\2\2\u01c4\u01c6\5"+
		"N(\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01d1\7c\2\2\u01c8\u01cd\5L\'\2\u01c9\u01cd\5J&\2\u01ca\u01cd\5F$\2\u01cb"+
		"\u01cd\5@!\2\u01cc\u01c8\3\2\2\2\u01cc\u01c9\3\2\2\2\u01cc\u01ca\3\2\2"+
		"\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0"+
		"\7c\2\2\u01cf\u01cc\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\t\24"+
		"\2\2\u01d5Q\3\2\2\2.W^adp\u008a\u009b\u009d\u00a5\u00b0\u00b6\u00be\u00c6"+
		"\u00cc\u00d2\u00d6\u00ef\u00fc\u0109\u011c\u0120\u0132\u0136\u0139\u014a"+
		"\u014f\u0154\u015f\u0162\u0172\u0179\u0182\u0188\u0192\u0197\u019c\u01a5"+
		"\u01ab\u01b0\u01ba\u01c1\u01c5\u01cc\u01d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}