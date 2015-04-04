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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, END=17, 
		PRIVATE=18, PROTECTED=19, PUBLIC=20, READONLY=21, CONSTANT=22, NOT=23, 
		AND=24, OR=25, TAKES=26, RETURNS=27, RETURN=28, CALL=29, SET=30, DEBUG=31, 
		LOCAL=32, USES=33, REQUIRES=34, INITIALIZER=35, THISTYPE=36, THIS=37, 
		SUPER=38, DELEGATE=39, OPERATOR=40, STATIC=41, ARRAY=42, DEFAULTS=43, 
		EXTENDS=44, IMPLEMENT=45, OPTIONAL=46, HOOK=47, STUB=48, LIBRARY=49, ENDLIBRARY=50, 
		SCOPE=51, ENDSCOPE=52, STRUCT=53, ENDSTRUCT=54, INTERFACE=55, ENDINTERFACE=56, 
		MODULE=57, ENDMODULE=58, FUNCTION=59, ENDFUNCTION=60, METHOD=61, ENDMETHOD=62, 
		FOR=63, ENDFOR=64, WHILE=65, ENDWHILE=66, LOOP=67, EXITWHEN=68, BREAK=69, 
		CONTINUE=70, ENDLOOP=71, NOTHING=72, TRUE=73, FALSE=74, NULL=75, IF=76, 
		THEN=77, ELSEIF=78, ELSE=79, ENDIF=80, GLOBAL=81, ENDGLOBAL=82, LINECOMMENT=83, 
		COMMENT=84, ASSERTPLUS=85, ASSERTMINUS=86, ASSERTMULT=87, ASSERTDIV=88, 
		DOT=89, STRING=90, REAL=91, RAWCODE=92, HEX=93, INTEGER=94, INT=95, EOL=96, 
		ID=97, WS=98;
	public static final int
		RULE_inits = 0, RULE_init = 1, RULE_variableName = 2, RULE_variableType = 3, 
		RULE_arrayVariableDef = 4, RULE_variableDef = 5, RULE_localArrayVariableDefStat = 6, 
		RULE_localVariableDefStat = 7, RULE_variableAssignment = 8, RULE_variableAssignmentStat = 9, 
		RULE_propertyAssignment = 10, RULE_propertyAssignmentStat = 11, RULE_intExpr = 12, 
		RULE_expr = 13, RULE_exprList = 14, RULE_stat = 15, RULE_statBlock = 16, 
		RULE_loopBlock = 17, RULE_forStat = 18, RULE_whileStat = 19, RULE_loopStat = 20, 
		RULE_ifStat = 21, RULE_returnStat = 22, RULE_typeArgumentList = 23, RULE_typeArgument = 24, 
		RULE_argList = 25, RULE_function = 26, RULE_method = 27, RULE_methodCall = 28, 
		RULE_functionCall = 29, RULE_globalVariableDefStat = 30, RULE_globalDef = 31, 
		RULE_functionDef = 32, RULE_methodDef = 33, RULE_propertyDef = 34, RULE_structDef = 35, 
		RULE_scopeDef = 36, RULE_requirementList = 37, RULE_libraryDef = 38;
	public static final String[] ruleNames = {
		"inits", "init", "variableName", "variableType", "arrayVariableDef", "variableDef", 
		"localArrayVariableDefStat", "localVariableDefStat", "variableAssignment", 
		"variableAssignmentStat", "propertyAssignment", "propertyAssignmentStat", 
		"intExpr", "expr", "exprList", "stat", "statBlock", "loopBlock", "forStat", 
		"whileStat", "loopStat", "ifStat", "returnStat", "typeArgumentList", "typeArgument", 
		"argList", "function", "method", "methodCall", "functionCall", "globalVariableDefStat", 
		"globalDef", "functionDef", "methodDef", "propertyDef", "structDef", "scopeDef", 
		"requirementList", "libraryDef"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'['", "']'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'!='", 
		"'=='", "'<='", "'>='", "'<'", "'>'", "','", "'end'", "'private'", "'protected'", 
		"'public'", "'readonly'", "'constant'", "'not'", "'and'", "'or'", "'takes'", 
		"'returns'", "'return'", "'call'", "'set'", "'debug'", "'local'", "'uses'", 
		"'requires'", "'initializer'", "'thistype'", "'this'", "'super'", "'delegate'", 
		"'operator'", "'static'", "'array'", "'defaults'", "'extends'", "'implement'", 
		"'optional'", "'hook'", "'stub'", "'library'", "'endlibrary'", "'scope'", 
		"'endscope'", "'struct'", "'endstruct'", "'interface'", "'endinterface'", 
		"'module'", "'endmodule'", "'function'", "'endfunction'", "'method'", 
		"'endmethod'", "'for'", "'endfor'", "'while'", "'endwhile'", "'loop'", 
		"'exitwhen'", "'break'", "'continue'", "'endloop'", "'nothing'", "'true'", 
		"'false'", "'null'", "'if'", "'then'", "'elseif'", "'else'", "'endif'", 
		"'globals'", "'endglobals'", null, null, "'+='", "'-='", "'*='", "'/='", 
		"'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "END", "PRIVATE", "PROTECTED", "PUBLIC", 
		"READONLY", "CONSTANT", "NOT", "AND", "OR", "TAKES", "RETURNS", "RETURN", 
		"CALL", "SET", "DEBUG", "LOCAL", "USES", "REQUIRES", "INITIALIZER", "THISTYPE", 
		"THIS", "SUPER", "DELEGATE", "OPERATOR", "STATIC", "ARRAY", "DEFAULTS", 
		"EXTENDS", "IMPLEMENT", "OPTIONAL", "HOOK", "STUB", "LIBRARY", "ENDLIBRARY", 
		"SCOPE", "ENDSCOPE", "STRUCT", "ENDSTRUCT", "INTERFACE", "ENDINTERFACE", 
		"MODULE", "ENDMODULE", "FUNCTION", "ENDFUNCTION", "METHOD", "ENDMETHOD", 
		"FOR", "ENDFOR", "WHILE", "ENDWHILE", "LOOP", "EXITWHEN", "BREAK", "CONTINUE", 
		"ENDLOOP", "NOTHING", "TRUE", "FALSE", "NULL", "IF", "THEN", "ELSEIF", 
		"ELSE", "ENDIF", "GLOBAL", "ENDGLOBAL", "LINECOMMENT", "COMMENT", "ASSERTPLUS", 
		"ASSERTMINUS", "ASSERTMULT", "ASSERTDIV", "DOT", "STRING", "REAL", "RAWCODE", 
		"HEX", "INTEGER", "INT", "EOL", "ID", "WS"
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
		public LibraryDefContext libraryDef() {
			return getRuleContext(LibraryDefContext.class,0);
		}
		public ScopeDefContext scopeDef() {
			return getRuleContext(ScopeDefContext.class,0);
		}
		public StructDefContext structDef() {
			return getRuleContext(StructDefContext.class,0);
		}
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public GlobalDefContext globalDef() {
			return getRuleContext(GlobalDefContext.class,0);
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
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				libraryDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				scopeDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				structDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				functionDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				globalDef();
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
			setState(93);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (PRIVATE - 18)) | (1L << (PUBLIC - 18)) | (1L << (LIBRARY - 18)) | (1L << (SCOPE - 18)) | (1L << (STRUCT - 18)) | (1L << (FUNCTION - 18)) | (1L << (GLOBAL - 18)))) != 0)) {
				{
				setState(85);
				inits();
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(86);
					match(EOL);
					setState(87);
					inits();
					}
					}
					setState(92);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(vrJASSParser.THIS, 0); }
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==THIS || _la==ID) ) {
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
		enterRule(_localctx, 6, RULE_variableType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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

	public static class ArrayVariableDefContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(vrJASSParser.ARRAY, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ArrayVariableDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariableDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterArrayVariableDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitArrayVariableDef(this);
		}
	}

	public final ArrayVariableDefContext arrayVariableDef() throws RecognitionException {
		ArrayVariableDefContext _localctx = new ArrayVariableDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayVariableDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			variableType();
			setState(100);
			match(ARRAY);
			setState(101);
			variableName();
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

	public static class VariableDefContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterVariableDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitVariableDef(this);
		}
	}

	public final VariableDefContext variableDef() throws RecognitionException {
		VariableDefContext _localctx = new VariableDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			variableType();
			setState(104);
			variableName();
			setState(107);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(105);
				match(T__0);
				setState(106);
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

	public static class LocalArrayVariableDefStatContext extends ParserRuleContext {
		public TerminalNode LOCAL() { return getToken(vrJASSParser.LOCAL, 0); }
		public ArrayVariableDefContext arrayVariableDef() {
			return getRuleContext(ArrayVariableDefContext.class,0);
		}
		public LocalArrayVariableDefStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localArrayVariableDefStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterLocalArrayVariableDefStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitLocalArrayVariableDefStat(this);
		}
	}

	public final LocalArrayVariableDefStatContext localArrayVariableDefStat() throws RecognitionException {
		LocalArrayVariableDefStatContext _localctx = new LocalArrayVariableDefStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_localArrayVariableDefStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LOCAL);
			setState(110);
			arrayVariableDef();
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

	public static class LocalVariableDefStatContext extends ParserRuleContext {
		public TerminalNode LOCAL() { return getToken(vrJASSParser.LOCAL, 0); }
		public VariableDefContext variableDef() {
			return getRuleContext(VariableDefContext.class,0);
		}
		public LocalVariableDefStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDefStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterLocalVariableDefStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitLocalVariableDefStat(this);
		}
	}

	public final LocalVariableDefStatContext localVariableDefStat() throws RecognitionException {
		LocalVariableDefStatContext _localctx = new LocalVariableDefStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_localVariableDefStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(LOCAL);
			setState(113);
			variableDef();
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSERTDIV() { return getToken(vrJASSParser.ASSERTDIV, 0); }
		public TerminalNode ASSERTMINUS() { return getToken(vrJASSParser.ASSERTMINUS, 0); }
		public TerminalNode ASSERTMULT() { return getToken(vrJASSParser.ASSERTMULT, 0); }
		public TerminalNode ASSERTPLUS() { return getToken(vrJASSParser.ASSERTPLUS, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitVariableAssignment(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			variableName();
			setState(120);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(116);
				match(T__1);
				setState(117);
				intExpr(0);
				setState(118);
				match(T__2);
				}
			}

			setState(122);
			_la = _input.LA(1);
			if ( !(_la==T__0 || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (ASSERTPLUS - 85)) | (1L << (ASSERTMINUS - 85)) | (1L << (ASSERTMULT - 85)) | (1L << (ASSERTDIV - 85)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(123);
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

	public static class VariableAssignmentStatContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(vrJASSParser.SET, 0); }
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public VariableAssignmentStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignmentStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterVariableAssignmentStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitVariableAssignmentStat(this);
		}
	}

	public final VariableAssignmentStatContext variableAssignmentStat() throws RecognitionException {
		VariableAssignmentStatContext _localctx = new VariableAssignmentStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableAssignmentStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(SET);
			setState(126);
			variableAssignment();
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

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(vrJASSParser.DOT, 0); }
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitPropertyAssignment(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(128);
			variableName();
			setState(129);
			match(DOT);
			}
			setState(131);
			variableAssignment();
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

	public static class PropertyAssignmentStatContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(vrJASSParser.SET, 0); }
		public PropertyAssignmentContext propertyAssignment() {
			return getRuleContext(PropertyAssignmentContext.class,0);
		}
		public PropertyAssignmentStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignmentStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterPropertyAssignmentStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitPropertyAssignmentStat(this);
		}
	}

	public final PropertyAssignmentStatContext propertyAssignmentStat() throws RecognitionException {
		PropertyAssignmentStatContext _localctx = new PropertyAssignmentStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_propertyAssignmentStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(SET);
			setState(134);
			propertyAssignment();
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

	public static class IntExprContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(vrJASSParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public TerminalNode THIS() { return getToken(vrJASSParser.THIS, 0); }
		public TerminalNode THISTYPE() { return getToken(vrJASSParser.THISTYPE, 0); }
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(vrJASSParser.INTEGER, 0); }
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public IntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitIntExpr(this);
		}
	}

	public final IntExprContext intExpr() throws RecognitionException {
		return intExpr(0);
	}

	private IntExprContext intExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntExprContext _localctx = new IntExprContext(_ctx, _parentState);
		IntExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_intExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(141);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(137);
					method();
					}
					break;
				case 2:
					{
					setState(138);
					match(THIS);
					}
					break;
				case 3:
					{
					setState(139);
					match(THISTYPE);
					}
					break;
				case 4:
					{
					setState(140);
					match(ID);
					}
					break;
				}
				setState(143);
				match(DOT);
				setState(144);
				expr(0);
				}
				break;
			case 2:
				{
				setState(145);
				variableAssignment();
				}
				break;
			case 3:
				{
				setState(146);
				method();
				}
				break;
			case 4:
				{
				setState(147);
				function();
				}
				break;
			case 5:
				{
				setState(148);
				match(INTEGER);
				}
				break;
			case 6:
				{
				setState(149);
				match(THIS);
				}
				break;
			case 7:
				{
				setState(150);
				match(T__7);
				setState(151);
				intExpr(0);
				setState(152);
				match(T__8);
				}
				break;
			case 8:
				{
				setState(154);
				match(ID);
				setState(155);
				match(T__1);
				setState(156);
				intExpr(0);
				setState(157);
				match(T__2);
				}
				break;
			case 9:
				{
				setState(159);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(162);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(163);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(164);
						intExpr(12);
						}
						break;
					case 2:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(165);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(166);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(167);
						intExpr(11);
						}
						break;
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(vrJASSParser.DOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public TerminalNode THIS() { return getToken(vrJASSParser.THIS, 0); }
		public TerminalNode THISTYPE() { return getToken(vrJASSParser.THISTYPE, 0); }
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public TerminalNode NOT() { return getToken(vrJASSParser.NOT, 0); }
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(vrJASSParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(vrJASSParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(vrJASSParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(vrJASSParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(vrJASSParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(vrJASSParser.NULL, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public TerminalNode OR() { return getToken(vrJASSParser.OR, 0); }
		public TerminalNode AND() { return getToken(vrJASSParser.AND, 0); }
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(178);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(174);
					method();
					}
					break;
				case 2:
					{
					setState(175);
					match(THIS);
					}
					break;
				case 3:
					{
					setState(176);
					match(THISTYPE);
					}
					break;
				case 4:
					{
					setState(177);
					match(ID);
					}
					break;
				}
				setState(180);
				match(DOT);
				setState(181);
				expr(24);
				}
				break;
			case 2:
				{
				setState(182);
				match(NOT);
				setState(183);
				expr(4);
				}
				break;
			case 3:
				{
				setState(184);
				variableAssignment();
				}
				break;
			case 4:
				{
				setState(185);
				method();
				}
				break;
			case 5:
				{
				setState(186);
				function();
				}
				break;
			case 6:
				{
				setState(187);
				match(INTEGER);
				}
				break;
			case 7:
				{
				setState(188);
				match(REAL);
				}
				break;
			case 8:
				{
				setState(189);
				match(STRING);
				}
				break;
			case 9:
				{
				setState(190);
				match(THIS);
				}
				break;
			case 10:
				{
				setState(191);
				match(THISTYPE);
				}
				break;
			case 11:
				{
				setState(192);
				match(TRUE);
				}
				break;
			case 12:
				{
				setState(193);
				match(FALSE);
				}
				break;
			case 13:
				{
				setState(194);
				match(NULL);
				}
				break;
			case 14:
				{
				setState(195);
				match(T__7);
				setState(196);
				expr(0);
				setState(197);
				match(T__8);
				}
				break;
			case 15:
				{
				setState(199);
				match(ID);
				setState(200);
				match(T__1);
				setState(201);
				intExpr(0);
				setState(202);
				match(T__2);
				}
				break;
			case 16:
				{
				setState(204);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(208);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(209);
						expr(27);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(211);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(212);
						expr(26);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(214);
						match(T__9);
						setState(215);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(217);
						match(T__10);
						setState(218);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(220);
						match(T__11);
						setState(221);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(223);
						match(T__12);
						setState(224);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(226);
						match(T__13);
						setState(227);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(229);
						match(T__14);
						setState(230);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(232);
						match(OR);
						setState(233);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(235);
						match(AND);
						setState(236);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 28, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			expr(0);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(243);
				match(T__15);
				setState(244);
				expr(0);
				}
				}
				setState(249);
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

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public LoopStatContext loopStat() {
			return getRuleContext(LoopStatContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LocalArrayVariableDefStatContext localArrayVariableDefStat() {
			return getRuleContext(LocalArrayVariableDefStatContext.class,0);
		}
		public LocalVariableDefStatContext localVariableDefStat() {
			return getRuleContext(LocalVariableDefStatContext.class,0);
		}
		public VariableAssignmentStatContext variableAssignmentStat() {
			return getRuleContext(VariableAssignmentStatContext.class,0);
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
		enterRule(_localctx, 30, RULE_stat);
		try {
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				ifStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				whileStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				forStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				loopStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				returnStat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(256);
				methodCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(257);
				functionCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(258);
				localArrayVariableDefStat();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(259);
				localVariableDefStat();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(260);
				variableAssignmentStat();
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

	public static class StatBlockContext extends ParserRuleContext {
		public List<TerminalNode> EOL() { return getTokens(vrJASSParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(vrJASSParser.EOL, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> DEBUG() { return getTokens(vrJASSParser.DEBUG); }
		public TerminalNode DEBUG(int i) {
			return getToken(vrJASSParser.DEBUG, i);
		}
		public StatBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterStatBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitStatBlock(this);
		}
	}

	public final StatBlockContext statBlock() throws RecognitionException {
		StatBlockContext _localctx = new StatBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << NOT) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (WHILE - 65)) | (1L << (LOOP - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (NULL - 65)) | (1L << (IF - 65)) | (1L << (STRING - 65)) | (1L << (REAL - 65)) | (1L << (INTEGER - 65)) | (1L << (EOL - 65)) | (1L << (ID - 65)))) != 0)) {
				{
				{
				setState(267);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << NOT) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (WHILE - 65)) | (1L << (LOOP - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (NULL - 65)) | (1L << (IF - 65)) | (1L << (STRING - 65)) | (1L << (REAL - 65)) | (1L << (INTEGER - 65)) | (1L << (ID - 65)))) != 0)) {
					{
					setState(264);
					_la = _input.LA(1);
					if (_la==DEBUG) {
						{
						setState(263);
						match(DEBUG);
						}
					}

					setState(266);
					stat();
					}
				}

				setState(269);
				match(EOL);
				}
				}
				setState(274);
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

	public static class LoopBlockContext extends ParserRuleContext {
		public List<TerminalNode> EOL() { return getTokens(vrJASSParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(vrJASSParser.EOL, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(vrJASSParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(vrJASSParser.BREAK, i);
		}
		public List<TerminalNode> CONTINUE() { return getTokens(vrJASSParser.CONTINUE); }
		public TerminalNode CONTINUE(int i) {
			return getToken(vrJASSParser.CONTINUE, i);
		}
		public List<TerminalNode> EXITWHEN() { return getTokens(vrJASSParser.EXITWHEN); }
		public TerminalNode EXITWHEN(int i) {
			return getToken(vrJASSParser.EXITWHEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> DEBUG() { return getTokens(vrJASSParser.DEBUG); }
		public TerminalNode DEBUG(int i) {
			return getToken(vrJASSParser.DEBUG, i);
		}
		public LoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitLoopBlock(this);
		}
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << NOT) | (1L << RETURN) | (1L << CALL) | (1L << SET) | (1L << DEBUG) | (1L << LOCAL) | (1L << THISTYPE) | (1L << THIS) | (1L << FOR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (WHILE - 65)) | (1L << (LOOP - 65)) | (1L << (EXITWHEN - 65)) | (1L << (BREAK - 65)) | (1L << (CONTINUE - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (NULL - 65)) | (1L << (IF - 65)) | (1L << (STRING - 65)) | (1L << (REAL - 65)) | (1L << (INTEGER - 65)) | (1L << (EOL - 65)) | (1L << (ID - 65)))) != 0)) {
				{
				{
				setState(289);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(276);
					_la = _input.LA(1);
					if (_la==DEBUG) {
						{
						setState(275);
						match(DEBUG);
						}
					}

					setState(278);
					stat();
					}
					break;
				case 2:
					{
					setState(279);
					match(BREAK);
					}
					break;
				case 3:
					{
					setState(280);
					match(CONTINUE);
					}
					break;
				case 4:
					{
					setState(282);
					_la = _input.LA(1);
					if (_la==DEBUG) {
						{
						setState(281);
						match(DEBUG);
						}
					}

					setState(284);
					match(EXITWHEN);
					setState(285);
					match(T__7);
					setState(286);
					expr(0);
					setState(287);
					match(T__8);
					}
					break;
				}
				setState(291);
				match(EOL);
				}
				}
				setState(296);
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

	public static class ForStatContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(vrJASSParser.FOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(vrJASSParser.EOL, 0); }
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(vrJASSParser.ENDFOR, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterForStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitForStat(this);
		}
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(FOR);
			setState(298);
			match(T__7);
			setState(299);
			expr(0);
			setState(300);
			match(T__8);
			setState(301);
			match(EOL);
			setState(302);
			loopBlock();
			setState(303);
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

	public static class WhileStatContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(vrJASSParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(vrJASSParser.EOL, 0); }
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(vrJASSParser.ENDWHILE, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitWhileStat(this);
		}
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(WHILE);
			setState(306);
			match(T__7);
			setState(307);
			expr(0);
			setState(308);
			match(T__8);
			setState(309);
			match(EOL);
			setState(310);
			loopBlock();
			setState(311);
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

	public static class LoopStatContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(vrJASSParser.LOOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(vrJASSParser.EOL, 0); }
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public TerminalNode ENDLOOP() { return getToken(vrJASSParser.ENDLOOP, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public LoopStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterLoopStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitLoopStat(this);
		}
	}

	public final LoopStatContext loopStat() throws RecognitionException {
		LoopStatContext _localctx = new LoopStatContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_loopStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(LOOP);
			setState(314);
			match(T__7);
			setState(315);
			expr(0);
			setState(316);
			match(T__8);
			setState(317);
			match(EOL);
			setState(318);
			loopBlock();
			setState(319);
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

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(vrJASSParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(vrJASSParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(vrJASSParser.EOL, i);
		}
		public List<StatBlockContext> statBlock() {
			return getRuleContexts(StatBlockContext.class);
		}
		public StatBlockContext statBlock(int i) {
			return getRuleContext(StatBlockContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(vrJASSParser.ENDIF, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public List<TerminalNode> THEN() { return getTokens(vrJASSParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(vrJASSParser.THEN, i);
		}
		public TerminalNode ELSEIF() { return getToken(vrJASSParser.ELSEIF, 0); }
		public TerminalNode ELSE() { return getToken(vrJASSParser.ELSE, 0); }
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitIfStat(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(IF);
			setState(322);
			match(T__7);
			setState(323);
			expr(0);
			setState(324);
			match(T__8);
			setState(326);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(325);
				match(THEN);
				}
			}

			setState(328);
			match(EOL);
			setState(329);
			statBlock();
			setState(340);
			_la = _input.LA(1);
			if (_la==ELSEIF) {
				{
				setState(330);
				match(ELSEIF);
				setState(331);
				match(T__7);
				setState(332);
				expr(0);
				setState(333);
				match(T__8);
				setState(335);
				_la = _input.LA(1);
				if (_la==THEN) {
					{
					setState(334);
					match(THEN);
					}
				}

				setState(337);
				match(EOL);
				setState(338);
				statBlock();
				}
			}

			setState(345);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(342);
				match(ELSE);
				setState(343);
				match(EOL);
				setState(344);
				statBlock();
				}
			}

			setState(347);
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

	public static class ReturnStatContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(vrJASSParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitReturnStat(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(RETURN);
			setState(350);
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
		enterRule(_localctx, 46, RULE_typeArgumentList);
		int _la;
		try {
			setState(361);
			switch (_input.LA(1)) {
			case NOTHING:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(NOTHING);
				}
				break;
			case THISTYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				typeArgument();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(354);
					match(T__15);
					setState(355);
					typeArgument();
					}
					}
					setState(360);
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
		enterRule(_localctx, 48, RULE_typeArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			variableType();
			setState(364);
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
		enterRule(_localctx, 50, RULE_argList);
		try {
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(T__7);
				setState(367);
				exprList();
				setState(368);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(T__7);
				setState(371);
				match(T__8);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(ID);
			setState(375);
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(vrJASSParser.DOT, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode THISTYPE() { return getToken(vrJASSParser.THISTYPE, 0); }
		public TerminalNode THIS() { return getToken(vrJASSParser.THIS, 0); }
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (THISTYPE - 36)) | (1L << (THIS - 36)) | (1L << (ID - 36)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(378);
			match(DOT);
			setState(379);
			function();
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(vrJASSParser.CALL, 0); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(CALL);
			setState(382);
			method();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(vrJASSParser.CALL, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(CALL);
			setState(385);
			function();
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

	public static class GlobalVariableDefStatContext extends ParserRuleContext {
		public VariableDefContext variableDef() {
			return getRuleContext(VariableDefContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(vrJASSParser.CONSTANT, 0); }
		public TerminalNode PUBLIC() { return getToken(vrJASSParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(vrJASSParser.PRIVATE, 0); }
		public GlobalVariableDefStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVariableDefStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterGlobalVariableDefStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitGlobalVariableDefStat(this);
		}
	}

	public final GlobalVariableDefStatContext globalVariableDefStat() throws RecognitionException {
		GlobalVariableDefStatContext _localctx = new GlobalVariableDefStatContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_globalVariableDefStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PUBLIC) {
				{
				setState(387);
				_la = _input.LA(1);
				if ( !(_la==PRIVATE || _la==PUBLIC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(391);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(390);
				match(CONSTANT);
				}
			}

			setState(393);
			variableDef();
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

	public static class GlobalDefContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(vrJASSParser.GLOBAL, 0); }
		public List<TerminalNode> EOL() { return getTokens(vrJASSParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(vrJASSParser.EOL, i);
		}
		public TerminalNode ENDGLOBAL() { return getToken(vrJASSParser.ENDGLOBAL, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public List<GlobalVariableDefStatContext> globalVariableDefStat() {
			return getRuleContexts(GlobalVariableDefStatContext.class);
		}
		public GlobalVariableDefStatContext globalVariableDefStat(int i) {
			return getRuleContext(GlobalVariableDefStatContext.class,i);
		}
		public GlobalDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterGlobalDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitGlobalDef(this);
		}
	}

	public final GlobalDefContext globalDef() throws RecognitionException {
		GlobalDefContext _localctx = new GlobalDefContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_globalDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(GLOBAL);
			setState(396);
			match(EOL);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << CONSTANT) | (1L << THISTYPE))) != 0) || _la==EOL || _la==ID) {
				{
				{
				setState(398);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << CONSTANT) | (1L << THISTYPE))) != 0) || _la==ID) {
					{
					setState(397);
					globalVariableDefStat();
					}
				}

				setState(400);
				match(EOL);
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
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

	public static class FunctionDefContext extends ParserRuleContext {
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
		public StatBlockContext statBlock() {
			return getRuleContext(StatBlockContext.class,0);
		}
		public TerminalNode NOTHING() { return getToken(vrJASSParser.NOTHING, 0); }
		public TerminalNode ENDFUNCTION() { return getToken(vrJASSParser.ENDFUNCTION, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public TerminalNode PUBLIC() { return getToken(vrJASSParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(vrJASSParser.PRIVATE, 0); }
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitFunctionDef(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PUBLIC) {
				{
				setState(408);
				_la = _input.LA(1);
				if ( !(_la==PRIVATE || _la==PUBLIC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(411);
			match(FUNCTION);
			setState(412);
			match(ID);
			setState(413);
			match(TAKES);
			setState(414);
			typeArgumentList();
			setState(415);
			match(RETURNS);
			setState(416);
			_la = _input.LA(1);
			if ( !(_la==NOTHING || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(417);
			match(EOL);
			setState(418);
			statBlock();
			setState(419);
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

	public static class MethodDefContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(vrJASSParser.METHOD, 0); }
		public TerminalNode ID() { return getToken(vrJASSParser.ID, 0); }
		public TerminalNode TAKES() { return getToken(vrJASSParser.TAKES, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(vrJASSParser.RETURNS, 0); }
		public TerminalNode EOL() { return getToken(vrJASSParser.EOL, 0); }
		public StatBlockContext statBlock() {
			return getRuleContext(StatBlockContext.class,0);
		}
		public TerminalNode ENDMETHOD() { return getToken(vrJASSParser.ENDMETHOD, 0); }
		public TerminalNode END() { return getToken(vrJASSParser.END, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode NOTHING() { return getToken(vrJASSParser.NOTHING, 0); }
		public TerminalNode PUBLIC() { return getToken(vrJASSParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(vrJASSParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(vrJASSParser.STATIC, 0); }
		public TerminalNode STUB() { return getToken(vrJASSParser.STUB, 0); }
		public MethodDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterMethodDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitMethodDef(this);
		}
	}

	public final MethodDefContext methodDef() throws RecognitionException {
		MethodDefContext _localctx = new MethodDefContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_methodDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PUBLIC) {
				{
				setState(421);
				_la = _input.LA(1);
				if ( !(_la==PRIVATE || _la==PUBLIC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(425);
			_la = _input.LA(1);
			if (_la==STATIC || _la==STUB) {
				{
				setState(424);
				_la = _input.LA(1);
				if ( !(_la==STATIC || _la==STUB) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(427);
			match(METHOD);
			setState(428);
			match(ID);
			setState(429);
			match(TAKES);
			setState(430);
			typeArgumentList();
			setState(431);
			match(RETURNS);
			setState(434);
			switch (_input.LA(1)) {
			case THISTYPE:
			case ID:
				{
				setState(432);
				variableType();
				}
				break;
			case NOTHING:
				{
				setState(433);
				match(NOTHING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(436);
			match(EOL);
			setState(437);
			statBlock();
			setState(438);
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

	public static class PropertyDefContext extends ParserRuleContext {
		public VariableDefContext variableDef() {
			return getRuleContext(VariableDefContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(vrJASSParser.STATIC, 0); }
		public TerminalNode CONSTANT() { return getToken(vrJASSParser.CONSTANT, 0); }
		public TerminalNode PUBLIC() { return getToken(vrJASSParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(vrJASSParser.PRIVATE, 0); }
		public TerminalNode READONLY() { return getToken(vrJASSParser.READONLY, 0); }
		public PropertyDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterPropertyDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitPropertyDef(this);
		}
	}

	public final PropertyDefContext propertyDef() throws RecognitionException {
		PropertyDefContext _localctx = new PropertyDefContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_propertyDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << READONLY))) != 0)) {
				{
				setState(440);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << READONLY))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(444);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(443);
				match(STATIC);
				}
			}

			setState(447);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(446);
				match(CONSTANT);
				}
			}

			setState(449);
			variableDef();
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

	public static class StructDefContext extends ParserRuleContext {
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
		public TerminalNode PUBLIC() { return getToken(vrJASSParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(vrJASSParser.PRIVATE, 0); }
		public List<MethodDefContext> methodDef() {
			return getRuleContexts(MethodDefContext.class);
		}
		public MethodDefContext methodDef(int i) {
			return getRuleContext(MethodDefContext.class,i);
		}
		public List<PropertyDefContext> propertyDef() {
			return getRuleContexts(PropertyDefContext.class);
		}
		public PropertyDefContext propertyDef(int i) {
			return getRuleContext(PropertyDefContext.class,i);
		}
		public StructDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterStructDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitStructDef(this);
		}
	}

	public final StructDefContext structDef() throws RecognitionException {
		StructDefContext _localctx = new StructDefContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_structDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PUBLIC) {
				{
				setState(451);
				_la = _input.LA(1);
				if ( !(_la==PRIVATE || _la==PUBLIC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(454);
			match(STRUCT);
			setState(455);
			match(ID);
			setState(458);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(456);
				match(EXTENDS);
				setState(457);
				match(ID);
				}
			}

			setState(460);
			match(EOL);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << READONLY) | (1L << CONSTANT) | (1L << THISTYPE) | (1L << STATIC) | (1L << STUB) | (1L << METHOD))) != 0) || _la==EOL || _la==ID) {
				{
				{
				setState(463);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(461);
					methodDef();
					}
					break;
				case 2:
					{
					setState(462);
					propertyDef();
					}
					break;
				}
				setState(465);
				match(EOL);
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
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

	public static class ScopeDefContext extends ParserRuleContext {
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
		public List<StructDefContext> structDef() {
			return getRuleContexts(StructDefContext.class);
		}
		public StructDefContext structDef(int i) {
			return getRuleContext(StructDefContext.class,i);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public List<GlobalDefContext> globalDef() {
			return getRuleContexts(GlobalDefContext.class);
		}
		public GlobalDefContext globalDef(int i) {
			return getRuleContext(GlobalDefContext.class,i);
		}
		public ScopeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterScopeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitScopeDef(this);
		}
	}

	public final ScopeDefContext scopeDef() throws RecognitionException {
		ScopeDefContext _localctx = new ScopeDefContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_scopeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(SCOPE);
			setState(474);
			match(ID);
			setState(477);
			_la = _input.LA(1);
			if (_la==INITIALIZER) {
				{
				setState(475);
				match(INITIALIZER);
				setState(476);
				match(ID);
				}
			}

			setState(479);
			match(EOL);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << STRUCT) | (1L << FUNCTION))) != 0) || _la==GLOBAL || _la==EOL) {
				{
				{
				setState(483);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(480);
					structDef();
					}
					break;
				case 2:
					{
					setState(481);
					functionDef();
					}
					break;
				case 3:
					{
					setState(482);
					globalDef();
					}
					break;
				}
				setState(485);
				match(EOL);
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
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
		enterRule(_localctx, 74, RULE_requirementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(ID);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(494);
				match(T__15);
				setState(495);
				match(ID);
				}
				}
				setState(500);
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

	public static class LibraryDefContext extends ParserRuleContext {
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
		public List<ScopeDefContext> scopeDef() {
			return getRuleContexts(ScopeDefContext.class);
		}
		public ScopeDefContext scopeDef(int i) {
			return getRuleContext(ScopeDefContext.class,i);
		}
		public List<StructDefContext> structDef() {
			return getRuleContexts(StructDefContext.class);
		}
		public StructDefContext structDef(int i) {
			return getRuleContext(StructDefContext.class,i);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public List<GlobalDefContext> globalDef() {
			return getRuleContexts(GlobalDefContext.class);
		}
		public GlobalDefContext globalDef(int i) {
			return getRuleContext(GlobalDefContext.class,i);
		}
		public LibraryDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).enterLibraryDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vrJASSListener ) ((vrJASSListener)listener).exitLibraryDef(this);
		}
	}

	public final LibraryDefContext libraryDef() throws RecognitionException {
		LibraryDefContext _localctx = new LibraryDefContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_libraryDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(LIBRARY);
			setState(502);
			match(ID);
			setState(505);
			_la = _input.LA(1);
			if (_la==INITIALIZER) {
				{
				setState(503);
				match(INITIALIZER);
				setState(504);
				match(ID);
				}
			}

			setState(509);
			_la = _input.LA(1);
			if (_la==REQUIRES) {
				{
				setState(507);
				match(REQUIRES);
				setState(508);
				requirementList();
				}
			}

			setState(511);
			match(EOL);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << SCOPE) | (1L << STRUCT) | (1L << FUNCTION))) != 0) || _la==GLOBAL || _la==EOL) {
				{
				{
				setState(516);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(512);
					scopeDef();
					}
					break;
				case 2:
					{
					setState(513);
					structDef();
					}
					break;
				case 3:
					{
					setState(514);
					functionDef();
					}
					break;
				case 4:
					{
					setState(515);
					globalDef();
					}
					break;
				}
				setState(518);
				match(EOL);
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524);
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
		case 12:
			return intExpr_sempred((IntExprContext)_localctx, predIndex);
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean intExpr_sempred(IntExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 26);
		case 3:
			return precpred(_ctx, 25);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3d\u0211\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\5\2V\n\2\3\3\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\5\3`\n\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\5\n{\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0090\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00a3\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ab\n\16\f\16\16"+
		"\16\u00ae\13\16\3\17\3\17\3\17\3\17\3\17\5\17\u00b5\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d0\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00f0\n\17\f\17\16\17\u00f3\13\17\3\20\3\20\3\20\7\20\u00f8\n\20\f\20"+
		"\16\20\u00fb\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u0108\n\21\3\22\5\22\u010b\n\22\3\22\5\22\u010e\n\22\3\22\7\22"+
		"\u0111\n\22\f\22\16\22\u0114\13\22\3\23\5\23\u0117\n\23\3\23\3\23\3\23"+
		"\3\23\5\23\u011d\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u0124\n\23\3\23\7"+
		"\23\u0127\n\23\f\23\16\23\u012a\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u0149\n\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u0152\n\27\3\27\3\27\3\27\5\27\u0157\n"+
		"\27\3\27\3\27\3\27\5\27\u015c\n\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\7\31\u0167\n\31\f\31\16\31\u016a\13\31\5\31\u016c\n\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0177\n\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \5 \u0187\n \3 \5"+
		" \u018a\n \3 \3 \3!\3!\3!\5!\u0191\n!\3!\7!\u0194\n!\f!\16!\u0197\13!"+
		"\3!\3!\3\"\5\"\u019c\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\5"+
		"#\u01a9\n#\3#\5#\u01ac\n#\3#\3#\3#\3#\3#\3#\3#\5#\u01b5\n#\3#\3#\3#\3"+
		"#\3$\5$\u01bc\n$\3$\5$\u01bf\n$\3$\5$\u01c2\n$\3$\3$\3%\5%\u01c7\n%\3"+
		"%\3%\3%\3%\5%\u01cd\n%\3%\3%\3%\5%\u01d2\n%\3%\7%\u01d5\n%\f%\16%\u01d8"+
		"\13%\3%\3%\3&\3&\3&\3&\5&\u01e0\n&\3&\3&\3&\3&\5&\u01e6\n&\3&\7&\u01e9"+
		"\n&\f&\16&\u01ec\13&\3&\3&\3\'\3\'\3\'\7\'\u01f3\n\'\f\'\16\'\u01f6\13"+
		"\'\3(\3(\3(\3(\5(\u01fc\n(\3(\3(\5(\u0200\n(\3(\3(\3(\3(\3(\5(\u0207\n"+
		"(\3(\7(\u020a\n(\f(\16(\u020d\13(\3(\3(\3(\2\4\32\34)\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\26\4\2\'\'cc"+
		"\4\2&&cc\4\2\3\3WZ\3\2\6\7\3\2\b\t\4\2\23\23BB\4\2\23\23DD\4\2\23\23I"+
		"I\4\2\23\23RR\4\2&\'cc\4\2\24\24\26\26\4\2\23\23TT\4\2JJcc\4\2\23\23>"+
		">\4\2++\62\62\4\2\23\23@@\4\2\24\24\26\27\4\2\23\2388\4\2\23\23\66\66"+
		"\4\2\23\23\64\64\u0253\2U\3\2\2\2\4_\3\2\2\2\6a\3\2\2\2\bc\3\2\2\2\ne"+
		"\3\2\2\2\fi\3\2\2\2\16o\3\2\2\2\20r\3\2\2\2\22u\3\2\2\2\24\177\3\2\2\2"+
		"\26\u0082\3\2\2\2\30\u0087\3\2\2\2\32\u00a2\3\2\2\2\34\u00cf\3\2\2\2\36"+
		"\u00f4\3\2\2\2 \u0107\3\2\2\2\"\u0112\3\2\2\2$\u0128\3\2\2\2&\u012b\3"+
		"\2\2\2(\u0133\3\2\2\2*\u013b\3\2\2\2,\u0143\3\2\2\2.\u015f\3\2\2\2\60"+
		"\u016b\3\2\2\2\62\u016d\3\2\2\2\64\u0176\3\2\2\2\66\u0178\3\2\2\28\u017b"+
		"\3\2\2\2:\u017f\3\2\2\2<\u0182\3\2\2\2>\u0186\3\2\2\2@\u018d\3\2\2\2B"+
		"\u019b\3\2\2\2D\u01a8\3\2\2\2F\u01bb\3\2\2\2H\u01c6\3\2\2\2J\u01db\3\2"+
		"\2\2L\u01ef\3\2\2\2N\u01f7\3\2\2\2PV\5N(\2QV\5J&\2RV\5H%\2SV\5B\"\2TV"+
		"\5@!\2UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\3\3\2\2\2W\\"+
		"\5\2\2\2XY\7b\2\2Y[\5\2\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2"+
		"]`\3\2\2\2^\\\3\2\2\2_W\3\2\2\2_`\3\2\2\2`\5\3\2\2\2ab\t\2\2\2b\7\3\2"+
		"\2\2cd\t\3\2\2d\t\3\2\2\2ef\5\b\5\2fg\7,\2\2gh\5\6\4\2h\13\3\2\2\2ij\5"+
		"\b\5\2jm\5\6\4\2kl\7\3\2\2ln\5\34\17\2mk\3\2\2\2mn\3\2\2\2n\r\3\2\2\2"+
		"op\7\"\2\2pq\5\n\6\2q\17\3\2\2\2rs\7\"\2\2st\5\f\7\2t\21\3\2\2\2uz\5\6"+
		"\4\2vw\7\4\2\2wx\5\32\16\2xy\7\5\2\2y{\3\2\2\2zv\3\2\2\2z{\3\2\2\2{|\3"+
		"\2\2\2|}\t\4\2\2}~\5\34\17\2~\23\3\2\2\2\177\u0080\7 \2\2\u0080\u0081"+
		"\5\22\n\2\u0081\25\3\2\2\2\u0082\u0083\5\6\4\2\u0083\u0084\7[\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\5\22\n\2\u0086\27\3\2\2\2\u0087\u0088\7 \2"+
		"\2\u0088\u0089\5\26\f\2\u0089\31\3\2\2\2\u008a\u008f\b\16\1\2\u008b\u0090"+
		"\58\35\2\u008c\u0090\7\'\2\2\u008d\u0090\7&\2\2\u008e\u0090\7c\2\2\u008f"+
		"\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7[\2\2\u0092\u00a3\5\34\17\2\u0093"+
		"\u00a3\5\22\n\2\u0094\u00a3\58\35\2\u0095\u00a3\5\66\34\2\u0096\u00a3"+
		"\7`\2\2\u0097\u00a3\7\'\2\2\u0098\u0099\7\n\2\2\u0099\u009a\5\32\16\2"+
		"\u009a\u009b\7\13\2\2\u009b\u00a3\3\2\2\2\u009c\u009d\7c\2\2\u009d\u009e"+
		"\7\4\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\7\5\2\2\u00a0\u00a3\3\2\2\2"+
		"\u00a1\u00a3\7c\2\2\u00a2\u008a\3\2\2\2\u00a2\u0093\3\2\2\2\u00a2\u0094"+
		"\3\2\2\2\u00a2\u0095\3\2\2\2\u00a2\u0096\3\2\2\2\u00a2\u0097\3\2\2\2\u00a2"+
		"\u0098\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00ac\3\2"+
		"\2\2\u00a4\u00a5\f\r\2\2\u00a5\u00a6\t\5\2\2\u00a6\u00ab\5\32\16\16\u00a7"+
		"\u00a8\f\f\2\2\u00a8\u00a9\t\6\2\2\u00a9\u00ab\5\32\16\r\u00aa\u00a4\3"+
		"\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\33\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b4\b\17\1"+
		"\2\u00b0\u00b5\58\35\2\u00b1\u00b5\7\'\2\2\u00b2\u00b5\7&\2\2\u00b3\u00b5"+
		"\7c\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7[\2\2\u00b7\u00d0\5\34"+
		"\17\32\u00b8\u00b9\7\31\2\2\u00b9\u00d0\5\34\17\6\u00ba\u00d0\5\22\n\2"+
		"\u00bb\u00d0\58\35\2\u00bc\u00d0\5\66\34\2\u00bd\u00d0\7`\2\2\u00be\u00d0"+
		"\7]\2\2\u00bf\u00d0\7\\\2\2\u00c0\u00d0\7\'\2\2\u00c1\u00d0\7&\2\2\u00c2"+
		"\u00d0\7K\2\2\u00c3\u00d0\7L\2\2\u00c4\u00d0\7M\2\2\u00c5\u00c6\7\n\2"+
		"\2\u00c6\u00c7\5\34\17\2\u00c7\u00c8\7\13\2\2\u00c8\u00d0\3\2\2\2\u00c9"+
		"\u00ca\7c\2\2\u00ca\u00cb\7\4\2\2\u00cb\u00cc\5\32\16\2\u00cc\u00cd\7"+
		"\5\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00d0\7c\2\2\u00cf\u00af\3\2\2\2\u00cf"+
		"\u00b8\3\2\2\2\u00cf\u00ba\3\2\2\2\u00cf\u00bb\3\2\2\2\u00cf\u00bc\3\2"+
		"\2\2\u00cf\u00bd\3\2\2\2\u00cf\u00be\3\2\2\2\u00cf\u00bf\3\2\2\2\u00cf"+
		"\u00c0\3\2\2\2\u00cf\u00c1\3\2\2\2\u00cf\u00c2\3\2\2\2\u00cf\u00c3\3\2"+
		"\2\2\u00cf\u00c4\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00f1\3\2\2\2\u00d1\u00d2\f\34\2\2\u00d2\u00d3\t"+
		"\5\2\2\u00d3\u00f0\5\34\17\35\u00d4\u00d5\f\33\2\2\u00d5\u00d6\t\6\2\2"+
		"\u00d6\u00f0\5\34\17\34\u00d7\u00d8\f\16\2\2\u00d8\u00d9\7\f\2\2\u00d9"+
		"\u00f0\5\34\17\17\u00da\u00db\f\r\2\2\u00db\u00dc\7\r\2\2\u00dc\u00f0"+
		"\5\34\17\16\u00dd\u00de\f\f\2\2\u00de\u00df\7\16\2\2\u00df\u00f0\5\34"+
		"\17\r\u00e0\u00e1\f\13\2\2\u00e1\u00e2\7\17\2\2\u00e2\u00f0\5\34\17\f"+
		"\u00e3\u00e4\f\n\2\2\u00e4\u00e5\7\20\2\2\u00e5\u00f0\5\34\17\13\u00e6"+
		"\u00e7\f\t\2\2\u00e7\u00e8\7\21\2\2\u00e8\u00f0\5\34\17\n\u00e9\u00ea"+
		"\f\b\2\2\u00ea\u00eb\7\33\2\2\u00eb\u00f0\5\34\17\t\u00ec\u00ed\f\7\2"+
		"\2\u00ed\u00ee\7\32\2\2\u00ee\u00f0\5\34\17\b\u00ef\u00d1\3\2\2\2\u00ef"+
		"\u00d4\3\2\2\2\u00ef\u00d7\3\2\2\2\u00ef\u00da\3\2\2\2\u00ef\u00dd\3\2"+
		"\2\2\u00ef\u00e0\3\2\2\2\u00ef\u00e3\3\2\2\2\u00ef\u00e6\3\2\2\2\u00ef"+
		"\u00e9\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\35\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f9"+
		"\5\34\17\2\u00f5\u00f6\7\22\2\2\u00f6\u00f8\5\34\17\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\37\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0108\5\34\17\2\u00fd\u0108\5,\27"+
		"\2\u00fe\u0108\5(\25\2\u00ff\u0108\5&\24\2\u0100\u0108\5*\26\2\u0101\u0108"+
		"\5.\30\2\u0102\u0108\5:\36\2\u0103\u0108\5<\37\2\u0104\u0108\5\16\b\2"+
		"\u0105\u0108\5\20\t\2\u0106\u0108\5\24\13\2\u0107\u00fc\3\2\2\2\u0107"+
		"\u00fd\3\2\2\2\u0107\u00fe\3\2\2\2\u0107\u00ff\3\2\2\2\u0107\u0100\3\2"+
		"\2\2\u0107\u0101\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0103\3\2\2\2\u0107"+
		"\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108!\3\2\2\2"+
		"\u0109\u010b\7!\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010e\5 \21\2\u010d\u010a\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\7b\2\2\u0110\u010d\3\2\2\2\u0111\u0114\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113#\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0115\u0117\7!\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0124\5 \21\2\u0119\u0124\7G\2\2\u011a\u0124\7H\2"+
		"\2\u011b\u011d\7!\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011f\7F\2\2\u011f\u0120\7\n\2\2\u0120\u0121\5\34\17\2"+
		"\u0121\u0122\7\13\2\2\u0122\u0124\3\2\2\2\u0123\u0116\3\2\2\2\u0123\u0119"+
		"\3\2\2\2\u0123\u011a\3\2\2\2\u0123\u011c\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0127\7b\2\2\u0126\u0123\3\2\2\2\u0127\u012a\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129%\3\2\2\2\u012a\u0128"+
		"\3\2\2\2\u012b\u012c\7A\2\2\u012c\u012d\7\n\2\2\u012d\u012e\5\34\17\2"+
		"\u012e\u012f\7\13\2\2\u012f\u0130\7b\2\2\u0130\u0131\5$\23\2\u0131\u0132"+
		"\t\7\2\2\u0132\'\3\2\2\2\u0133\u0134\7C\2\2\u0134\u0135\7\n\2\2\u0135"+
		"\u0136\5\34\17\2\u0136\u0137\7\13\2\2\u0137\u0138\7b\2\2\u0138\u0139\5"+
		"$\23\2\u0139\u013a\t\b\2\2\u013a)\3\2\2\2\u013b\u013c\7E\2\2\u013c\u013d"+
		"\7\n\2\2\u013d\u013e\5\34\17\2\u013e\u013f\7\13\2\2\u013f\u0140\7b\2\2"+
		"\u0140\u0141\5$\23\2\u0141\u0142\t\t\2\2\u0142+\3\2\2\2\u0143\u0144\7"+
		"N\2\2\u0144\u0145\7\n\2\2\u0145\u0146\5\34\17\2\u0146\u0148\7\13\2\2\u0147"+
		"\u0149\7O\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014b\7b\2\2\u014b\u0156\5\"\22\2\u014c\u014d\7P\2\2\u014d"+
		"\u014e\7\n\2\2\u014e\u014f\5\34\17\2\u014f\u0151\7\13\2\2\u0150\u0152"+
		"\7O\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\7b\2\2\u0154\u0155\5\"\22\2\u0155\u0157\3\2\2\2\u0156\u014c\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157\u015b\3\2\2\2\u0158\u0159\7Q\2\2\u0159"+
		"\u015a\7b\2\2\u015a\u015c\5\"\22\2\u015b\u0158\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015d\u015e\t\n\2\2\u015e-\3\2\2\2\u015f\u0160"+
		"\7\36\2\2\u0160\u0161\5\34\17\2\u0161/\3\2\2\2\u0162\u016c\7J\2\2\u0163"+
		"\u0168\5\62\32\2\u0164\u0165\7\22\2\2\u0165\u0167\5\62\32\2\u0166\u0164"+
		"\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u0162\3\2\2\2\u016b\u0163\3\2"+
		"\2\2\u016c\61\3\2\2\2\u016d\u016e\5\b\5\2\u016e\u016f\7c\2\2\u016f\63"+
		"\3\2\2\2\u0170\u0171\7\n\2\2\u0171\u0172\5\36\20\2\u0172\u0173\7\13\2"+
		"\2\u0173\u0177\3\2\2\2\u0174\u0175\7\n\2\2\u0175\u0177\7\13\2\2\u0176"+
		"\u0170\3\2\2\2\u0176\u0174\3\2\2\2\u0177\65\3\2\2\2\u0178\u0179\7c\2\2"+
		"\u0179\u017a\5\64\33\2\u017a\67\3\2\2\2\u017b\u017c\t\13\2\2\u017c\u017d"+
		"\7[\2\2\u017d\u017e\5\66\34\2\u017e9\3\2\2\2\u017f\u0180\7\37\2\2\u0180"+
		"\u0181\58\35\2\u0181;\3\2\2\2\u0182\u0183\7\37\2\2\u0183\u0184\5\66\34"+
		"\2\u0184=\3\2\2\2\u0185\u0187\t\f\2\2\u0186\u0185\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u018a\7\30\2\2\u0189\u0188\3\2\2\2"+
		"\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\5\f\7\2\u018c?\3"+
		"\2\2\2\u018d\u018e\7S\2\2\u018e\u0195\7b\2\2\u018f\u0191\5> \2\u0190\u018f"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\7b\2\2\u0193"+
		"\u0190\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\t\r\2\2\u0199"+
		"A\3\2\2\2\u019a\u019c\t\f\2\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2"+
		"\u019c\u019d\3\2\2\2\u019d\u019e\7=\2\2\u019e\u019f\7c\2\2\u019f\u01a0"+
		"\7\34\2\2\u01a0\u01a1\5\60\31\2\u01a1\u01a2\7\35\2\2\u01a2\u01a3\t\16"+
		"\2\2\u01a3\u01a4\7b\2\2\u01a4\u01a5\5\"\22\2\u01a5\u01a6\t\17\2\2\u01a6"+
		"C\3\2\2\2\u01a7\u01a9\t\f\2\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2"+
		"\u01a9\u01ab\3\2\2\2\u01aa\u01ac\t\20\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7?\2\2\u01ae\u01af\7c\2\2\u01af"+
		"\u01b0\7\34\2\2\u01b0\u01b1\5\60\31\2\u01b1\u01b4\7\35\2\2\u01b2\u01b5"+
		"\5\b\5\2\u01b3\u01b5\7J\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b7\7b\2\2\u01b7\u01b8\5\"\22\2\u01b8\u01b9\t\21"+
		"\2\2\u01b9E\3\2\2\2\u01ba\u01bc\t\22\2\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bf\7+\2\2\u01be\u01bd\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01c2\7\30\2\2\u01c1\u01c0\3"+
		"\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\5\f\7\2\u01c4"+
		"G\3\2\2\2\u01c5\u01c7\t\f\2\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2"+
		"\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7\67\2\2\u01c9\u01cc\7c\2\2\u01ca\u01cb"+
		"\7.\2\2\u01cb\u01cd\7c\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01d6\7b\2\2\u01cf\u01d2\5D#\2\u01d0\u01d2\5F$\2"+
		"\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d5\7b\2\2\u01d4\u01d1\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2"+
		"\2\2\u01d9\u01da\t\23\2\2\u01daI\3\2\2\2\u01db\u01dc\7\65\2\2\u01dc\u01df"+
		"\7c\2\2\u01dd\u01de\7%\2\2\u01de\u01e0\7c\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01ea\7b\2\2\u01e2\u01e6\5H%"+
		"\2\u01e3\u01e6\5B\"\2\u01e4\u01e6\5@!\2\u01e5\u01e2\3\2\2\2\u01e5\u01e3"+
		"\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01e9\7b\2\2\u01e8\u01e5\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed"+
		"\u01ee\t\24\2\2\u01eeK\3\2\2\2\u01ef\u01f4\7c\2\2\u01f0\u01f1\7\22\2\2"+
		"\u01f1\u01f3\7c\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5M\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7"+
		"\u01f8\7\63\2\2\u01f8\u01fb\7c\2\2\u01f9\u01fa\7%\2\2\u01fa\u01fc\7c\2"+
		"\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fe"+
		"\7$\2\2\u01fe\u0200\5L\'\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u020b\7b\2\2\u0202\u0207\5J&\2\u0203\u0207\5H%\2"+
		"\u0204\u0207\5B\"\2\u0205\u0207\5@!\2\u0206\u0202\3\2\2\2\u0206\u0203"+
		"\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208\u020a\7b\2\2\u0209\u0206\3\2\2\2\u020a\u020d\3\2"+
		"\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d"+
		"\u020b\3\2\2\2\u020e\u020f\t\25\2\2\u020fO\3\2\2\2\66U\\_mz\u008f\u00a2"+
		"\u00aa\u00ac\u00b4\u00cf\u00ef\u00f1\u00f9\u0107\u010a\u010d\u0112\u0116"+
		"\u011c\u0123\u0128\u0148\u0151\u0156\u015b\u0168\u016b\u0176\u0186\u0189"+
		"\u0190\u0195\u019b\u01a8\u01ab\u01b4\u01bb\u01be\u01c1\u01c6\u01cc\u01d1"+
		"\u01d6\u01df\u01e5\u01ea\u01f4\u01fb\u01ff\u0206\u020b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}