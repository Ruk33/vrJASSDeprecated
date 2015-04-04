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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, END=12, PRIVATE=13, PROTECTED=14, PUBLIC=15, READONLY=16, 
		CONSTANT=17, NOT=18, AND=19, OR=20, TAKES=21, RETURNS=22, RETURN=23, CALL=24, 
		SET=25, DEBUG=26, LOCAL=27, USES=28, REQUIRES=29, INITIALIZER=30, THISTYPE=31, 
		THIS=32, SUPER=33, DELEGATE=34, OPERATOR=35, STATIC=36, ARRAY=37, DEFAULTS=38, 
		EXTENDS=39, IMPLEMENT=40, OPTIONAL=41, HOOK=42, STUB=43, LIBRARY=44, ENDLIBRARY=45, 
		SCOPE=46, ENDSCOPE=47, STRUCT=48, ENDSTRUCT=49, INTERFACE=50, ENDINTERFACE=51, 
		MODULE=52, ENDMODULE=53, FUNCTION=54, ENDFUNCTION=55, METHOD=56, ENDMETHOD=57, 
		FOR=58, ENDFOR=59, WHILE=60, ENDWHILE=61, LOOP=62, EXITWHEN=63, BREAK=64, 
		CONTINUE=65, ENDLOOP=66, NOTHING=67, TRUE=68, FALSE=69, NULL=70, IF=71, 
		THEN=72, ELSEIF=73, ELSE=74, ENDIF=75, GLOBAL=76, ENDGLOBAL=77, LINECOMMENT=78, 
		COMMENT=79, ASSERTPLUS=80, ASSERTMINUS=81, ASSERTMULT=82, ASSERTDIV=83, 
		DOT=84, STRING=85, REAL=86, RAWCODE=87, HEX=88, INTEGER=89, EQUAL=90, 
		NOT_EQUAL=91, GREATER_THAN=92, GREATER_THAN_OR_EQUAL_THAN=93, LOWER_THAN=94, 
		LOWER_THAN_OR_EQUAL_THAN=95, INT=96, EOL=97, ID=98, WS=99;
	public static final int
		RULE_inits = 0, RULE_init = 1, RULE_nonePublicPrivateVisibility = 2, RULE_publicPrivateProtectedVisiblity = 3, 
		RULE_variableType = 4, RULE_argList = 5, RULE_mathExpression = 6, RULE_functionExpression = 7, 
		RULE_methodExpression = 8, RULE_variableArrayExpression = 9, RULE_variableExpression = 10, 
		RULE_propertyExpression = 11, RULE_integerExpression = 12, RULE_realExpression = 13, 
		RULE_stringExpression = 14, RULE_booleanExpression = 15, RULE_comparisonExpression = 16, 
		RULE_orExpression = 17, RULE_andExpression = 18, RULE_notExpression = 19, 
		RULE_parenthesisExpression = 20, RULE_nullExpression = 21, RULE_expr = 22, 
		RULE_exprList = 23, RULE_debugStatement = 24, RULE_elseIfStatement = 25, 
		RULE_elseStatement = 26, RULE_ifStatement = 27, RULE_breakStatement = 28, 
		RULE_continueStatement = 29, RULE_exitWhenStatement = 30, RULE_forStatement = 31, 
		RULE_whileStatement = 32, RULE_loopStatement = 33, RULE_returnStatement = 34, 
		RULE_functionCallStatement = 35, RULE_methodCallStatement = 36, RULE_variableStatement = 37, 
		RULE_globalVariableStatement = 38, RULE_localVariableArrayStatement = 39, 
		RULE_localVariableStatement = 40, RULE_setVariableStatement = 41, RULE_propertyVisibility = 42, 
		RULE_propertyStatement = 43, RULE_stat = 44, RULE_globalBlockStatement = 45, 
		RULE_typeArgumentList = 46, RULE_typeArgument = 47, RULE_functionStatement = 48, 
		RULE_methodStatement = 49, RULE_structBlockStatement = 50, RULE_scopeBlockStatement = 51, 
		RULE_requirementList = 52, RULE_libraryBlockStatement = 53;
	public static final String[] ruleNames = {
		"inits", "init", "nonePublicPrivateVisibility", "publicPrivateProtectedVisiblity", 
		"variableType", "argList", "mathExpression", "functionExpression", "methodExpression", 
		"variableArrayExpression", "variableExpression", "propertyExpression", 
		"integerExpression", "realExpression", "stringExpression", "booleanExpression", 
		"comparisonExpression", "orExpression", "andExpression", "notExpression", 
		"parenthesisExpression", "nullExpression", "expr", "exprList", "debugStatement", 
		"elseIfStatement", "elseStatement", "ifStatement", "breakStatement", "continueStatement", 
		"exitWhenStatement", "forStatement", "whileStatement", "loopStatement", 
		"returnStatement", "functionCallStatement", "methodCallStatement", "variableStatement", 
		"globalVariableStatement", "localVariableArrayStatement", "localVariableStatement", 
		"setVariableStatement", "propertyVisibility", "propertyStatement", "stat", 
		"globalBlockStatement", "typeArgumentList", "typeArgument", "functionStatement", 
		"methodStatement", "structBlockStatement", "scopeBlockStatement", "requirementList", 
		"libraryBlockStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'*'", "'/'", "'-'", "'+'", "'['", "']'", "','", "';'", 
		"'='", "'end'", "'private'", "'protected'", "'public'", "'readonly'", 
		"'constant'", "'not'", "'and'", "'or'", "'takes'", "'returns'", "'return'", 
		"'call'", "'set'", "'debug'", "'local'", "'uses'", "'requires'", "'initializer'", 
		"'thistype'", "'this'", "'super'", "'delegate'", "'operator'", "'static'", 
		"'array'", "'defaults'", "'extends'", "'implement'", "'optional'", "'hook'", 
		"'stub'", "'library'", "'endlibrary'", "'scope'", "'endscope'", "'struct'", 
		"'endstruct'", "'interface'", "'endinterface'", "'module'", "'endmodule'", 
		"'function'", "'endfunction'", "'method'", "'endmethod'", "'for'", "'endfor'", 
		"'while'", "'endwhile'", "'loop'", "'exitwhen'", "'break'", "'continue'", 
		"'endloop'", "'nothing'", "'true'", "'false'", "'null'", "'if'", "'then'", 
		"'elseif'", "'else'", "'endif'", "'globals'", "'endglobals'", null, null, 
		"'+='", "'-='", "'*='", "'/='", "'.'", null, null, null, null, null, "'=='", 
		"'!='", "'>'", "'>='", "'<'", "'<='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"END", "PRIVATE", "PROTECTED", "PUBLIC", "READONLY", "CONSTANT", "NOT", 
		"AND", "OR", "TAKES", "RETURNS", "RETURN", "CALL", "SET", "DEBUG", "LOCAL", 
		"USES", "REQUIRES", "INITIALIZER", "THISTYPE", "THIS", "SUPER", "DELEGATE", 
		"OPERATOR", "STATIC", "ARRAY", "DEFAULTS", "EXTENDS", "IMPLEMENT", "OPTIONAL", 
		"HOOK", "STUB", "LIBRARY", "ENDLIBRARY", "SCOPE", "ENDSCOPE", "STRUCT", 
		"ENDSTRUCT", "INTERFACE", "ENDINTERFACE", "MODULE", "ENDMODULE", "FUNCTION", 
		"ENDFUNCTION", "METHOD", "ENDMETHOD", "FOR", "ENDFOR", "WHILE", "ENDWHILE", 
		"LOOP", "EXITWHEN", "BREAK", "CONTINUE", "ENDLOOP", "NOTHING", "TRUE", 
		"FALSE", "NULL", "IF", "THEN", "ELSEIF", "ELSE", "ENDIF", "GLOBAL", "ENDGLOBAL", 
		"LINECOMMENT", "COMMENT", "ASSERTPLUS", "ASSERTMINUS", "ASSERTMULT", "ASSERTDIV", 
		"DOT", "STRING", "REAL", "RAWCODE", "HEX", "INTEGER", "EQUAL", "NOT_EQUAL", 
		"GREATER_THAN", "GREATER_THAN_OR_EQUAL_THAN", "LOWER_THAN", "LOWER_THAN_OR_EQUAL_THAN", 
		"INT", "EOL", "ID", "WS"
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
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				libraryBlockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				scopeBlockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				structBlockStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				functionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
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
			setState(123);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (PRIVATE - 13)) | (1L << (PUBLIC - 13)) | (1L << (LIBRARY - 13)) | (1L << (SCOPE - 13)) | (1L << (STRUCT - 13)) | (1L << (FUNCTION - 13)) | (1L << (GLOBAL - 13)))) != 0)) {
				{
				setState(115);
				inits();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(116);
					match(EOL);
					setState(117);
					inits();
					}
					}
					setState(122);
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
			setState(126);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PUBLIC) {
				{
				setState(125);
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
			setState(128);
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
			setState(130);
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
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__0);
				setState(133);
				exprList();
				setState(134);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(T__0);
				setState(137);
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

	public static class MathExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitMathExpression(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mathExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(141);
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
		enterRule(_localctx, 14, RULE_functionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(ID);
			setState(144);
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
		enterRule(_localctx, 16, RULE_methodExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(DOT);
			setState(147);
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

	public static class VariableArrayExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableArrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterVariableArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitVariableArrayExpression(this);
		}
	}

	public final VariableArrayExpressionContext variableArrayExpression() throws RecognitionException {
		VariableArrayExpressionContext _localctx = new VariableArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableArrayExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ID);
			setState(150);
			match(T__6);
			setState(151);
			expr(0);
			setState(152);
			match(T__7);
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

	public static class VariableExpressionContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(vrJASSParser.THIS, 0); }
		public TerminalNode THISTYPE() { return getToken(vrJASSParser.THISTYPE, 0); }
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public VariableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitVariableExpression(this);
		}
	}

	public final VariableExpressionContext variableExpression() throws RecognitionException {
		VariableExpressionContext _localctx = new VariableExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==THISTYPE || _la==THIS || _la==ID) ) {
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

	public static class PropertyExpressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(vrJASSParser.DOT, 0); }
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public PropertyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterPropertyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitPropertyExpression(this);
		}
	}

	public final PropertyExpressionContext propertyExpression() throws RecognitionException {
		PropertyExpressionContext _localctx = new PropertyExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_propertyExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(DOT);
			setState(157);
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

	public static class IntegerExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(vrJASSParser.INTEGER, 0); }
		public IntegerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitIntegerExpression(this);
		}
	}

	public final IntegerExpressionContext integerExpression() throws RecognitionException {
		IntegerExpressionContext _localctx = new IntegerExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_integerExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(INTEGER);
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

	public static class RealExpressionContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(vrJASSParser.REAL, 0); }
		public RealExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterRealExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitRealExpression(this);
		}
	}

	public final RealExpressionContext realExpression() throws RecognitionException {
		RealExpressionContext _localctx = new RealExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_realExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(REAL);
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

	public static class StringExpressionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(vrJASSParser.STRING, 0); }
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitStringExpression(this);
		}
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(STRING);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(vrJASSParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(vrJASSParser.FALSE, 0); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitBooleanExpression(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_booleanExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(vrJASSParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(vrJASSParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(vrJASSParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL_THAN() { return getToken(vrJASSParser.GREATER_THAN_OR_EQUAL_THAN, 0); }
		public TerminalNode LOWER_THAN() { return getToken(vrJASSParser.LOWER_THAN, 0); }
		public TerminalNode LOWER_THAN_OR_EQUAL_THAN() { return getToken(vrJASSParser.LOWER_THAN_OR_EQUAL_THAN, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitComparisonExpression(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (EQUAL - 90)) | (1L << (NOT_EQUAL - 90)) | (1L << (GREATER_THAN - 90)) | (1L << (GREATER_THAN_OR_EQUAL_THAN - 90)) | (1L << (LOWER_THAN - 90)) | (1L << (LOWER_THAN_OR_EQUAL_THAN - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(168);
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

	public static class OrExpressionContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(vrJASSParser.OR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitOrExpression(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_orExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(OR);
			setState(171);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(vrJASSParser.AND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_andExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(AND);
			setState(174);
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

	public static class NotExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(vrJASSParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitNotExpression(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(NOT);
			setState(177);
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

	public static class ParenthesisExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitParenthesisExpression(this);
		}
	}

	public final ParenthesisExpressionContext parenthesisExpression() throws RecognitionException {
		ParenthesisExpressionContext _localctx = new ParenthesisExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parenthesisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__0);
			setState(180);
			expr(0);
			setState(181);
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

	public static class NullExpressionContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(vrJASSParser.NULL, 0); }
		public NullExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitNullExpression(this);
		}
	}

	public final NullExpressionContext nullExpression() throws RecognitionException {
		NullExpressionContext _localctx = new NullExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nullExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(NULL);
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
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public IntegerExpressionContext integerExpression() {
			return getRuleContext(IntegerExpressionContext.class,0);
		}
		public RealExpressionContext realExpression() {
			return getRuleContext(RealExpressionContext.class,0);
		}
		public StringExpressionContext stringExpression() {
			return getRuleContext(StringExpressionContext.class,0);
		}
		public NullExpressionContext nullExpression() {
			return getRuleContext(NullExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public ParenthesisExpressionContext parenthesisExpression() {
			return getRuleContext(ParenthesisExpressionContext.class,0);
		}
		public VariableArrayExpressionContext variableArrayExpression() {
			return getRuleContext(VariableArrayExpressionContext.class,0);
		}
		public VariableExpressionContext variableExpression() {
			return getRuleContext(VariableExpressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MethodExpressionContext methodExpression() {
			return getRuleContext(MethodExpressionContext.class,0);
		}
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitExpr(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(186);
				mathExpression();
				}
				break;
			case 2:
				{
				setState(187);
				functionExpression();
				}
				break;
			case 3:
				{
				setState(188);
				integerExpression();
				}
				break;
			case 4:
				{
				setState(189);
				realExpression();
				}
				break;
			case 5:
				{
				setState(190);
				stringExpression();
				}
				break;
			case 6:
				{
				setState(191);
				nullExpression();
				}
				break;
			case 7:
				{
				setState(192);
				booleanExpression();
				}
				break;
			case 8:
				{
				setState(193);
				notExpression();
				}
				break;
			case 9:
				{
				setState(194);
				parenthesisExpression();
				}
				break;
			case 10:
				{
				setState(195);
				variableArrayExpression();
				}
				break;
			case 11:
				{
				setState(196);
				variableExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(200);
						methodExpression();
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(202);
						comparisonExpression();
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(204);
						orExpression();
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(206);
						andExpression();
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208);
						propertyExpression();
						}
						break;
					}
					} 
				}
				setState(213);
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
		enterRule(_localctx, 46, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			expr(0);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(215);
				match(T__8);
				setState(216);
				expr(0);
				}
				}
				setState(221);
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
		enterRule(_localctx, 48, RULE_debugStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(DEBUG);
			setState(223);
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
		enterRule(_localctx, 50, RULE_elseIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ELSEIF);
			setState(226);
			match(T__0);
			setState(227);
			expr(0);
			setState(228);
			match(T__1);
			setState(230);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(229);
				match(THEN);
				}
			}

			setState(232);
			match(EOL);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << NOT) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (NULL - 68)) | (1L << (IF - 68)) | (1L << (DOT - 68)) | (1L << (STRING - 68)) | (1L << (REAL - 68)) | (1L << (INTEGER - 68)) | (1L << (EOL - 68)) | (1L << (ID - 68)))) != 0)) {
				{
				{
				setState(233);
				stat();
				}
				}
				setState(238);
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
		enterRule(_localctx, 52, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ELSE);
			setState(240);
			match(EOL);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << NOT) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (NULL - 68)) | (1L << (IF - 68)) | (1L << (DOT - 68)) | (1L << (STRING - 68)) | (1L << (REAL - 68)) | (1L << (INTEGER - 68)) | (1L << (EOL - 68)) | (1L << (ID - 68)))) != 0)) {
				{
				{
				setState(241);
				stat();
				}
				}
				setState(246);
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
		enterRule(_localctx, 54, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(IF);
			setState(248);
			match(T__0);
			setState(249);
			expr(0);
			setState(250);
			match(T__1);
			setState(252);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(251);
				match(THEN);
				}
			}

			setState(254);
			match(EOL);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << NOT) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (NULL - 68)) | (1L << (IF - 68)) | (1L << (DOT - 68)) | (1L << (STRING - 68)) | (1L << (REAL - 68)) | (1L << (INTEGER - 68)) | (1L << (EOL - 68)) | (1L << (ID - 68)))) != 0)) {
				{
				{
				setState(255);
				stat();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(261);
				elseIfStatement();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(267);
				elseStatement();
				}
			}

			setState(270);
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
		enterRule(_localctx, 56, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
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
		enterRule(_localctx, 58, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		enterRule(_localctx, 60, RULE_exitWhenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(EXITWHEN);
			setState(277);
			match(T__0);
			setState(278);
			expr(0);
			setState(279);
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
		enterRule(_localctx, 62, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(FOR);
			setState(282);
			match(T__0);
			setState(283);
			expr(0);
			setState(284);
			match(T__9);
			setState(285);
			expr(0);
			setState(286);
			match(T__9);
			setState(287);
			expr(0);
			setState(288);
			match(T__1);
			setState(289);
			match(EOL);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << NOT) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (NULL - 68)) | (1L << (IF - 68)) | (1L << (DOT - 68)) | (1L << (STRING - 68)) | (1L << (REAL - 68)) | (1L << (INTEGER - 68)) | (1L << (EOL - 68)) | (1L << (ID - 68)))) != 0)) {
				{
				{
				setState(290);
				stat();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
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
		enterRule(_localctx, 64, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(WHILE);
			setState(299);
			match(T__0);
			setState(300);
			expr(0);
			setState(301);
			match(T__1);
			setState(302);
			match(EOL);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << NOT) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (NULL - 68)) | (1L << (IF - 68)) | (1L << (DOT - 68)) | (1L << (STRING - 68)) | (1L << (REAL - 68)) | (1L << (INTEGER - 68)) | (1L << (EOL - 68)) | (1L << (ID - 68)))) != 0)) {
				{
				{
				setState(303);
				stat();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
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
		enterRule(_localctx, 66, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(LOOP);
			setState(312);
			match(T__0);
			setState(313);
			expr(0);
			setState(314);
			match(T__1);
			setState(315);
			match(EOL);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << NOT) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (NULL - 68)) | (1L << (IF - 68)) | (1L << (DOT - 68)) | (1L << (STRING - 68)) | (1L << (REAL - 68)) | (1L << (INTEGER - 68)) | (1L << (EOL - 68)) | (1L << (ID - 68)))) != 0)) {
				{
				{
				setState(316);
				stat();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
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
		enterRule(_localctx, 68, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(RETURN);
			setState(325);
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
		enterRule(_localctx, 70, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(CALL);
			setState(328);
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
		enterRule(_localctx, 72, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(CALL);
			setState(331);
			expr(0);
			setState(332);
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
		public VariableExpressionContext variableExpression() {
			return getRuleContext(VariableExpressionContext.class,0);
		}
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
		enterRule(_localctx, 74, RULE_variableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			variableType();
			setState(335);
			variableExpression();
			setState(338);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(336);
				match(T__10);
				setState(337);
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
		enterRule(_localctx, 76, RULE_globalVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			nonePublicPrivateVisibility();
			setState(342);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(341);
				match(CONSTANT);
				}
			}

			setState(344);
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
		public VariableArrayExpressionContext variableArrayExpression() {
			return getRuleContext(VariableArrayExpressionContext.class,0);
		}
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
		enterRule(_localctx, 78, RULE_localVariableArrayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(LOCAL);
			setState(347);
			variableType();
			setState(348);
			variableArrayExpression();
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
		enterRule(_localctx, 80, RULE_localVariableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(LOCAL);
			setState(351);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VariableArrayExpressionContext variableArrayExpression() {
			return getRuleContext(VariableArrayExpressionContext.class,0);
		}
		public VariableExpressionContext variableExpression() {
			return getRuleContext(VariableExpressionContext.class,0);
		}
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
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
		enterRule(_localctx, 82, RULE_setVariableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(SET);
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				{
				setState(354);
				expr(0);
				setState(355);
				propertyExpression();
				}
				}
				break;
			case 2:
				{
				setState(357);
				variableArrayExpression();
				}
				break;
			case 3:
				{
				setState(358);
				variableExpression();
				}
				break;
			}
			setState(361);
			match(T__10);
			setState(362);
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
		enterRule(_localctx, 84, RULE_propertyVisibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << READONLY))) != 0)) {
				{
				setState(364);
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
		enterRule(_localctx, 86, RULE_propertyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			propertyVisibility();
			setState(369);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(368);
				match(STATIC);
				}
			}

			setState(372);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(371);
				match(CONSTANT);
				}
			}

			setState(374);
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
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
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
		enterRule(_localctx, 88, RULE_stat);
		try {
			setState(390);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(EOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(381);
				loopStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(382);
				returnStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(383);
				functionCallStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(384);
				methodCallStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(385);
				localVariableArrayStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(386);
				localVariableStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(387);
				propertyExpression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(388);
				setVariableStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(389);
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
		enterRule(_localctx, 90, RULE_globalBlockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(GLOBAL);
			setState(393);
			match(EOL);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << CONSTANT) | (1L << THISTYPE))) != 0) || _la==EOL || _la==ID) {
				{
				{
				setState(395);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << CONSTANT) | (1L << THISTYPE))) != 0) || _la==ID) {
					{
					setState(394);
					globalVariableStatement();
					}
				}

				setState(397);
				match(EOL);
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403);
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
		enterRule(_localctx, 92, RULE_typeArgumentList);
		int _la;
		try {
			setState(414);
			switch (_input.LA(1)) {
			case NOTHING:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(NOTHING);
				}
				break;
			case THISTYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				typeArgument();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(407);
					match(T__8);
					setState(408);
					typeArgument();
					}
					}
					setState(413);
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
		public VariableExpressionContext variableExpression() {
			return getRuleContext(VariableExpressionContext.class,0);
		}
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
		enterRule(_localctx, 94, RULE_typeArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			variableType();
			setState(417);
			variableExpression();
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
		enterRule(_localctx, 96, RULE_functionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			nonePublicPrivateVisibility();
			setState(420);
			match(FUNCTION);
			setState(421);
			match(ID);
			setState(422);
			match(TAKES);
			setState(423);
			typeArgumentList();
			setState(424);
			match(RETURNS);
			setState(425);
			_la = _input.LA(1);
			if ( !(_la==NOTHING || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(426);
			match(EOL);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << NOT) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (NULL - 68)) | (1L << (IF - 68)) | (1L << (DOT - 68)) | (1L << (STRING - 68)) | (1L << (REAL - 68)) | (1L << (INTEGER - 68)) | (1L << (EOL - 68)) | (1L << (ID - 68)))) != 0)) {
				{
				{
				setState(427);
				stat();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
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
		enterRule(_localctx, 98, RULE_methodStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			nonePublicPrivateVisibility();
			setState(437);
			_la = _input.LA(1);
			if (_la==STATIC || _la==STUB) {
				{
				setState(436);
				_la = _input.LA(1);
				if ( !(_la==STATIC || _la==STUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(439);
			match(METHOD);
			setState(440);
			match(ID);
			setState(441);
			match(TAKES);
			setState(442);
			typeArgumentList();
			setState(443);
			match(RETURNS);
			setState(446);
			switch (_input.LA(1)) {
			case THISTYPE:
			case ID:
				{
				setState(444);
				variableType();
				}
				break;
			case NOTHING:
				{
				setState(445);
				match(NOTHING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(448);
			match(EOL);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << NOT) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << LOOP))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (TRUE - 68)) | (1L << (FALSE - 68)) | (1L << (NULL - 68)) | (1L << (IF - 68)) | (1L << (DOT - 68)) | (1L << (STRING - 68)) | (1L << (REAL - 68)) | (1L << (INTEGER - 68)) | (1L << (EOL - 68)) | (1L << (ID - 68)))) != 0)) {
				{
				{
				setState(449);
				stat();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
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
		enterRule(_localctx, 100, RULE_structBlockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			nonePublicPrivateVisibility();
			setState(458);
			match(STRUCT);
			setState(459);
			match(ID);
			setState(462);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(460);
				match(EXTENDS);
				setState(461);
				match(ID);
				}
			}

			setState(464);
			match(EOL);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << READONLY) | (1L << CONSTANT) | (1L << THISTYPE) | (1L << STATIC) | (1L << STUB) | (1L << METHOD))) != 0) || _la==EOL || _la==ID) {
				{
				{
				setState(467);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(465);
					methodStatement();
					}
					break;
				case 2:
					{
					setState(466);
					propertyStatement();
					}
					break;
				}
				setState(469);
				match(EOL);
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
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
		enterRule(_localctx, 102, RULE_scopeBlockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(SCOPE);
			setState(478);
			match(ID);
			setState(481);
			_la = _input.LA(1);
			if (_la==INITIALIZER) {
				{
				setState(479);
				match(INITIALIZER);
				setState(480);
				match(ID);
				}
			}

			setState(483);
			match(EOL);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << STRUCT) | (1L << FUNCTION))) != 0) || _la==GLOBAL || _la==EOL) {
				{
				{
				setState(487);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(484);
					structBlockStatement();
					}
					break;
				case 2:
					{
					setState(485);
					functionStatement();
					}
					break;
				case 3:
					{
					setState(486);
					globalBlockStatement();
					}
					break;
				}
				setState(489);
				match(EOL);
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
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
		enterRule(_localctx, 104, RULE_requirementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(ID);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(498);
				match(T__8);
				setState(499);
				match(ID);
				}
				}
				setState(504);
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
		enterRule(_localctx, 106, RULE_libraryBlockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(LIBRARY);
			setState(506);
			match(ID);
			setState(509);
			_la = _input.LA(1);
			if (_la==INITIALIZER) {
				{
				setState(507);
				match(INITIALIZER);
				setState(508);
				match(ID);
				}
			}

			setState(513);
			_la = _input.LA(1);
			if (_la==REQUIRES) {
				{
				setState(511);
				match(REQUIRES);
				setState(512);
				requirementList();
				}
			}

			setState(515);
			match(EOL);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << SCOPE) | (1L << STRUCT) | (1L << FUNCTION))) != 0) || _la==GLOBAL || _la==EOL) {
				{
				{
				setState(520);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(516);
					scopeBlockStatement();
					}
					break;
				case 2:
					{
					setState(517);
					structBlockStatement();
					}
					break;
				case 3:
					{
					setState(518);
					functionStatement();
					}
					break;
				case 4:
					{
					setState(519);
					globalBlockStatement();
					}
					break;
				}
				setState(522);
				match(EOL);
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(528);
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
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 8);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3e\u0215\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\5\2t\n\2\3\3\3\3"+
		"\3\3\7\3y\n\3\f\3\16\3|\13\3\5\3~\n\3\3\4\5\4\u0081\n\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008d\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00c8\n\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u00d4\n\30\f\30\16\30\u00d7\13\30\3\31"+
		"\3\31\3\31\7\31\u00dc\n\31\f\31\16\31\u00df\13\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u00e9\n\33\3\33\3\33\7\33\u00ed\n\33\f\33\16"+
		"\33\u00f0\13\33\3\34\3\34\3\34\7\34\u00f5\n\34\f\34\16\34\u00f8\13\34"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u00ff\n\35\3\35\3\35\7\35\u0103\n\35\f"+
		"\35\16\35\u0106\13\35\3\35\7\35\u0109\n\35\f\35\16\35\u010c\13\35\3\35"+
		"\5\35\u010f\n\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\7!\u0126\n!\f!\16!\u0129\13!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\7\"\u0133\n\"\f\"\16\"\u0136\13\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\7#\u0140\n#\f#\16#\u0143\13#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\5\'\u0155\n\'\3(\3(\5(\u0159\n(\3(\3(\3)\3)\3)\3)\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\5+\u016a\n+\3+\3+\3+\3,\5,\u0170\n,\3-\3-\5-\u0174"+
		"\n-\3-\5-\u0177\n-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5."+
		"\u0189\n.\3/\3/\3/\5/\u018e\n/\3/\7/\u0191\n/\f/\16/\u0194\13/\3/\3/\3"+
		"\60\3\60\3\60\3\60\7\60\u019c\n\60\f\60\16\60\u019f\13\60\5\60\u01a1\n"+
		"\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u01af"+
		"\n\62\f\62\16\62\u01b2\13\62\3\62\3\62\3\63\3\63\5\63\u01b8\n\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01c1\n\63\3\63\3\63\7\63\u01c5\n"+
		"\63\f\63\16\63\u01c8\13\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\5\64\u01d1"+
		"\n\64\3\64\3\64\3\64\5\64\u01d6\n\64\3\64\7\64\u01d9\n\64\f\64\16\64\u01dc"+
		"\13\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u01e4\n\65\3\65\3\65\3\65\3"+
		"\65\5\65\u01ea\n\65\3\65\7\65\u01ed\n\65\f\65\16\65\u01f0\13\65\3\65\3"+
		"\65\3\66\3\66\3\66\7\66\u01f7\n\66\f\66\16\66\u01fa\13\66\3\67\3\67\3"+
		"\67\3\67\5\67\u0200\n\67\3\67\3\67\5\67\u0204\n\67\3\67\3\67\3\67\3\67"+
		"\3\67\5\67\u020b\n\67\3\67\7\67\u020e\n\67\f\67\16\67\u0211\13\67\3\67"+
		"\3\67\3\67\2\3.8\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\25\4\2\17\17\21\21\4\2!!dd\3\2\5"+
		"\b\4\2!\"dd\3\2FG\3\2\\a\4\2\16\16MM\4\2\16\16==\4\2\16\16??\4\2\16\16"+
		"DD\4\2\17\17\21\22\4\2\16\16OO\4\2EEdd\4\2\16\1699\4\2&&--\4\2\16\16;"+
		";\4\2\16\16\63\63\4\2\16\16\61\61\4\2\16\16//\u022d\2s\3\2\2\2\4}\3\2"+
		"\2\2\6\u0080\3\2\2\2\b\u0082\3\2\2\2\n\u0084\3\2\2\2\f\u008c\3\2\2\2\16"+
		"\u008e\3\2\2\2\20\u0091\3\2\2\2\22\u0094\3\2\2\2\24\u0097\3\2\2\2\26\u009c"+
		"\3\2\2\2\30\u009e\3\2\2\2\32\u00a1\3\2\2\2\34\u00a3\3\2\2\2\36\u00a5\3"+
		"\2\2\2 \u00a7\3\2\2\2\"\u00a9\3\2\2\2$\u00ac\3\2\2\2&\u00af\3\2\2\2(\u00b2"+
		"\3\2\2\2*\u00b5\3\2\2\2,\u00b9\3\2\2\2.\u00c7\3\2\2\2\60\u00d8\3\2\2\2"+
		"\62\u00e0\3\2\2\2\64\u00e3\3\2\2\2\66\u00f1\3\2\2\28\u00f9\3\2\2\2:\u0112"+
		"\3\2\2\2<\u0114\3\2\2\2>\u0116\3\2\2\2@\u011b\3\2\2\2B\u012c\3\2\2\2D"+
		"\u0139\3\2\2\2F\u0146\3\2\2\2H\u0149\3\2\2\2J\u014c\3\2\2\2L\u0150\3\2"+
		"\2\2N\u0156\3\2\2\2P\u015c\3\2\2\2R\u0160\3\2\2\2T\u0163\3\2\2\2V\u016f"+
		"\3\2\2\2X\u0171\3\2\2\2Z\u0188\3\2\2\2\\\u018a\3\2\2\2^\u01a0\3\2\2\2"+
		"`\u01a2\3\2\2\2b\u01a5\3\2\2\2d\u01b5\3\2\2\2f\u01cb\3\2\2\2h\u01df\3"+
		"\2\2\2j\u01f3\3\2\2\2l\u01fb\3\2\2\2nt\5l\67\2ot\5h\65\2pt\5f\64\2qt\5"+
		"b\62\2rt\5\\/\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\3\3"+
		"\2\2\2uz\5\2\2\2vw\7c\2\2wy\5\2\2\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{~\3\2\2\2|z\3\2\2\2}u\3\2\2\2}~\3\2\2\2~\5\3\2\2\2\177\u0081\t"+
		"\2\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\7\3\2\2\2\u0082\u0083"+
		"\t\2\2\2\u0083\t\3\2\2\2\u0084\u0085\t\3\2\2\u0085\13\3\2\2\2\u0086\u0087"+
		"\7\3\2\2\u0087\u0088\5\60\31\2\u0088\u0089\7\4\2\2\u0089\u008d\3\2\2\2"+
		"\u008a\u008b\7\3\2\2\u008b\u008d\7\4\2\2\u008c\u0086\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008d\r\3\2\2\2\u008e\u008f\t\4\2\2\u008f\u0090\5.\30\2\u0090"+
		"\17\3\2\2\2\u0091\u0092\7d\2\2\u0092\u0093\5\f\7\2\u0093\21\3\2\2\2\u0094"+
		"\u0095\7V\2\2\u0095\u0096\5\20\t\2\u0096\23\3\2\2\2\u0097\u0098\7d\2\2"+
		"\u0098\u0099\7\t\2\2\u0099\u009a\5.\30\2\u009a\u009b\7\n\2\2\u009b\25"+
		"\3\2\2\2\u009c\u009d\t\5\2\2\u009d\27\3\2\2\2\u009e\u009f\7V\2\2\u009f"+
		"\u00a0\7d\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\7[\2\2\u00a2\33\3\2\2\2\u00a3"+
		"\u00a4\7X\2\2\u00a4\35\3\2\2\2\u00a5\u00a6\7W\2\2\u00a6\37\3\2\2\2\u00a7"+
		"\u00a8\t\6\2\2\u00a8!\3\2\2\2\u00a9\u00aa\t\7\2\2\u00aa\u00ab\5.\30\2"+
		"\u00ab#\3\2\2\2\u00ac\u00ad\7\26\2\2\u00ad\u00ae\5.\30\2\u00ae%\3\2\2"+
		"\2\u00af\u00b0\7\25\2\2\u00b0\u00b1\5.\30\2\u00b1\'\3\2\2\2\u00b2\u00b3"+
		"\7\24\2\2\u00b3\u00b4\5.\30\2\u00b4)\3\2\2\2\u00b5\u00b6\7\3\2\2\u00b6"+
		"\u00b7\5.\30\2\u00b7\u00b8\7\4\2\2\u00b8+\3\2\2\2\u00b9\u00ba\7H\2\2\u00ba"+
		"-\3\2\2\2\u00bb\u00bc\b\30\1\2\u00bc\u00c8\5\16\b\2\u00bd\u00c8\5\20\t"+
		"\2\u00be\u00c8\5\32\16\2\u00bf\u00c8\5\34\17\2\u00c0\u00c8\5\36\20\2\u00c1"+
		"\u00c8\5,\27\2\u00c2\u00c8\5 \21\2\u00c3\u00c8\5(\25\2\u00c4\u00c8\5*"+
		"\26\2\u00c5\u00c8\5\24\13\2\u00c6\u00c8\5\26\f\2\u00c7\u00bb\3\2\2\2\u00c7"+
		"\u00bd\3\2\2\2\u00c7\u00be\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c0\3\2"+
		"\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00d5\3\2"+
		"\2\2\u00c9\u00ca\f\20\2\2\u00ca\u00d4\5\22\n\2\u00cb\u00cc\f\n\2\2\u00cc"+
		"\u00d4\5\"\22\2\u00cd\u00ce\f\t\2\2\u00ce\u00d4\5$\23\2\u00cf\u00d0\f"+
		"\b\2\2\u00d0\u00d4\5&\24\2\u00d1\u00d2\f\5\2\2\u00d2\u00d4\5\30\r\2\u00d3"+
		"\u00c9\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00cf\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6/\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00dd\5.\30\2"+
		"\u00d9\u00da\7\13\2\2\u00da\u00dc\5.\30\2\u00db\u00d9\3\2\2\2\u00dc\u00df"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\61\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e1\7\34\2\2\u00e1\u00e2\5Z.\2\u00e2\63\3\2\2\2"+
		"\u00e3\u00e4\7K\2\2\u00e4\u00e5\7\3\2\2\u00e5\u00e6\5.\30\2\u00e6\u00e8"+
		"\7\4\2\2\u00e7\u00e9\7J\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ee\7c\2\2\u00eb\u00ed\5Z.\2\u00ec\u00eb\3\2\2"+
		"\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\65"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7L\2\2\u00f2\u00f6\7c\2\2\u00f3"+
		"\u00f5\5Z.\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2"+
		"\2\u00f6\u00f7\3\2\2\2\u00f7\67\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa"+
		"\7I\2\2\u00fa\u00fb\7\3\2\2\u00fb\u00fc\5.\30\2\u00fc\u00fe\7\4\2\2\u00fd"+
		"\u00ff\7J\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0104\7c\2\2\u0101\u0103\5Z.\2\u0102\u0101\3\2\2\2\u0103\u0106"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010a\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0109\5\64\33\2\u0108\u0107\3\2\2\2\u0109\u010c\3"+
		"\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u010f\5\66\34\2\u010e\u010d\3\2\2\2\u010e\u010f\3"+
		"\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\t\b\2\2\u01119\3\2\2\2\u0112\u0113"+
		"\7B\2\2\u0113;\3\2\2\2\u0114\u0115\7C\2\2\u0115=\3\2\2\2\u0116\u0117\7"+
		"A\2\2\u0117\u0118\7\3\2\2\u0118\u0119\5.\30\2\u0119\u011a\7\4\2\2\u011a"+
		"?\3\2\2\2\u011b\u011c\7<\2\2\u011c\u011d\7\3\2\2\u011d\u011e\5.\30\2\u011e"+
		"\u011f\7\f\2\2\u011f\u0120\5.\30\2\u0120\u0121\7\f\2\2\u0121\u0122\5."+
		"\30\2\u0122\u0123\7\4\2\2\u0123\u0127\7c\2\2\u0124\u0126\5Z.\2\u0125\u0124"+
		"\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\t\t\2\2\u012bA\3\2\2\2"+
		"\u012c\u012d\7>\2\2\u012d\u012e\7\3\2\2\u012e\u012f\5.\30\2\u012f\u0130"+
		"\7\4\2\2\u0130\u0134\7c\2\2\u0131\u0133\5Z.\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0137\u0138\t\n\2\2\u0138C\3\2\2\2\u0139\u013a"+
		"\7@\2\2\u013a\u013b\7\3\2\2\u013b\u013c\5.\30\2\u013c\u013d\7\4\2\2\u013d"+
		"\u0141\7c\2\2\u013e\u0140\5Z.\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2"+
		"\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0144\u0145\t\13\2\2\u0145E\3\2\2\2\u0146\u0147\7\31\2\2\u0147"+
		"\u0148\5.\30\2\u0148G\3\2\2\2\u0149\u014a\7\32\2\2\u014a\u014b\5\20\t"+
		"\2\u014bI\3\2\2\2\u014c\u014d\7\32\2\2\u014d\u014e\5.\30\2\u014e\u014f"+
		"\5\22\n\2\u014fK\3\2\2\2\u0150\u0151\5\n\6\2\u0151\u0154\5\26\f\2\u0152"+
		"\u0153\7\r\2\2\u0153\u0155\5.\30\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155M\3\2\2\2\u0156\u0158\5\6\4\2\u0157\u0159\7\23\2\2\u0158\u0157"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\5L\'\2\u015b"+
		"O\3\2\2\2\u015c\u015d\7\35\2\2\u015d\u015e\5\n\6\2\u015e\u015f\5\24\13"+
		"\2\u015fQ\3\2\2\2\u0160\u0161\7\35\2\2\u0161\u0162\5L\'\2\u0162S\3\2\2"+
		"\2\u0163\u0169\7\33\2\2\u0164\u0165\5.\30\2\u0165\u0166\5\30\r\2\u0166"+
		"\u016a\3\2\2\2\u0167\u016a\5\24\13\2\u0168\u016a\5\26\f\2\u0169\u0164"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\7\r\2\2\u016c\u016d\5.\30\2\u016dU\3\2\2\2\u016e\u0170\t\f\2\2"+
		"\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170W\3\2\2\2\u0171\u0173\5"+
		"V,\2\u0172\u0174\7&\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0176\3\2\2\2\u0175\u0177\7\23\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3"+
		"\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\5L\'\2\u0179Y\3\2\2\2\u017a\u0189"+
		"\7c\2\2\u017b\u0189\5.\30\2\u017c\u0189\58\35\2\u017d\u0189\5B\"\2\u017e"+
		"\u0189\5@!\2\u017f\u0189\5D#\2\u0180\u0189\5F$\2\u0181\u0189\5H%\2\u0182"+
		"\u0189\5J&\2\u0183\u0189\5P)\2\u0184\u0189\5R*\2\u0185\u0189\5\30\r\2"+
		"\u0186\u0189\5T+\2\u0187\u0189\5\62\32\2\u0188\u017a\3\2\2\2\u0188\u017b"+
		"\3\2\2\2\u0188\u017c\3\2\2\2\u0188\u017d\3\2\2\2\u0188\u017e\3\2\2\2\u0188"+
		"\u017f\3\2\2\2\u0188\u0180\3\2\2\2\u0188\u0181\3\2\2\2\u0188\u0182\3\2"+
		"\2\2\u0188\u0183\3\2\2\2\u0188\u0184\3\2\2\2\u0188\u0185\3\2\2\2\u0188"+
		"\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189[\3\2\2\2\u018a\u018b\7N\2\2\u018b"+
		"\u0192\7c\2\2\u018c\u018e\5N(\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2"+
		"\2\u018e\u018f\3\2\2\2\u018f\u0191\7c\2\2\u0190\u018d\3\2\2\2\u0191\u0194"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0196\t\r\2\2\u0196]\3\2\2\2\u0197\u01a1\7E\2\2\u0198"+
		"\u019d\5`\61\2\u0199\u019a\7\13\2\2\u019a\u019c\5`\61\2\u019b\u0199\3"+
		"\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u0197\3\2\2\2\u01a0\u0198\3\2"+
		"\2\2\u01a1_\3\2\2\2\u01a2\u01a3\5\n\6\2\u01a3\u01a4\5\26\f\2\u01a4a\3"+
		"\2\2\2\u01a5\u01a6\5\6\4\2\u01a6\u01a7\78\2\2\u01a7\u01a8\7d\2\2\u01a8"+
		"\u01a9\7\27\2\2\u01a9\u01aa\5^\60\2\u01aa\u01ab\7\30\2\2\u01ab\u01ac\t"+
		"\16\2\2\u01ac\u01b0\7c\2\2\u01ad\u01af\5Z.\2\u01ae\u01ad\3\2\2\2\u01af"+
		"\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2"+
		"\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\t\17\2\2\u01b4c\3\2\2\2\u01b5\u01b7"+
		"\5\6\4\2\u01b6\u01b8\t\20\2\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2"+
		"\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7:\2\2\u01ba\u01bb\7d\2\2\u01bb\u01bc"+
		"\7\27\2\2\u01bc\u01bd\5^\60\2\u01bd\u01c0\7\30\2\2\u01be\u01c1\5\n\6\2"+
		"\u01bf\u01c1\7E\2\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c6\7c\2\2\u01c3\u01c5\5Z.\2\u01c4\u01c3\3\2\2\2\u01c5"+
		"\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2"+
		"\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\t\21\2\2\u01cae\3\2\2\2\u01cb\u01cc"+
		"\5\6\4\2\u01cc\u01cd\7\62\2\2\u01cd\u01d0\7d\2\2\u01ce\u01cf\7)\2\2\u01cf"+
		"\u01d1\7d\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2\u01da\7c\2\2\u01d3\u01d6\5d\63\2\u01d4\u01d6\5X-\2\u01d5\u01d3"+
		"\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d9\7c\2\2\u01d8\u01d5\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2"+
		"\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd"+
		"\u01de\t\22\2\2\u01deg\3\2\2\2\u01df\u01e0\7\60\2\2\u01e0\u01e3\7d\2\2"+
		"\u01e1\u01e2\7 \2\2\u01e2\u01e4\7d\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01ee\7c\2\2\u01e6\u01ea\5f\64\2\u01e7"+
		"\u01ea\5b\62\2\u01e8\u01ea\5\\/\2\u01e9\u01e6\3\2\2\2\u01e9\u01e7\3\2"+
		"\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ed\7c\2\2\u01ec\u01e9\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1"+
		"\u01f2\t\23\2\2\u01f2i\3\2\2\2\u01f3\u01f8\7d\2\2\u01f4\u01f5\7\13\2\2"+
		"\u01f5\u01f7\7d\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6"+
		"\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9k\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01fc\7.\2\2\u01fc\u01ff\7d\2\2\u01fd\u01fe\7 \2\2\u01fe\u0200\7d\2\2"+
		"\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u0202"+
		"\7\37\2\2\u0202\u0204\5j\66\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2"+
		"\u0204\u0205\3\2\2\2\u0205\u020f\7c\2\2\u0206\u020b\5h\65\2\u0207\u020b"+
		"\5f\64\2\u0208\u020b\5b\62\2\u0209\u020b\5\\/\2\u020a\u0206\3\2\2\2\u020a"+
		"\u0207\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u020e\7c\2\2\u020d\u020a\3\2\2\2\u020e"+
		"\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2"+
		"\2\2\u0211\u020f\3\2\2\2\u0212\u0213\t\24\2\2\u0213m\3\2\2\2/sz}\u0080"+
		"\u008c\u00c7\u00d3\u00d5\u00dd\u00e8\u00ee\u00f6\u00fe\u0104\u010a\u010e"+
		"\u0127\u0134\u0141\u0154\u0158\u0169\u016f\u0173\u0176\u0188\u018d\u0192"+
		"\u019d\u01a0\u01b0\u01b7\u01c0\u01c6\u01d0\u01d5\u01da\u01e3\u01e9\u01ee"+
		"\u01f8\u01ff\u0203\u020a\u020f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}