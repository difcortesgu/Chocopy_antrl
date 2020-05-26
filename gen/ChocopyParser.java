// Generated from C:/Users/diego/Documents/Lenguajes/Chocopy_antrl/grammar\Chocopy.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChocopyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOT=1, AND=2, OR=3, IF=4, ELIF=5, ELSE=6, INPUT=7, PAR_IZQ=8, PAR_DER=9, 
		LEN=10, COMMA=11, COR_IZQ=12, COR_DER=13, PUNTO=14, MENOS=15, CLASS=16, 
		DOS_PUNTOS=17, PASS=18, DEF=19, EJECUTA=20, GLOBAL=21, NONLOCAL=22, DOBLE_IGUAL=23, 
		IGUAL=24, WHILE=25, FOR=26, IN=27, RETURN=28, PRINT=29, MAS=30, MULTIPLICA=31, 
		DIV_ENTERA=32, MODULO=33, DIFERENTE=34, MENOR_IGUAL=35, MAYOR_IGUAL=36, 
		MENOR=37, MAYOR=38, IS=39, NONE=40, TRUE=41, FALSE=42, INTEGER=43, ID=44, 
		IDSTRING=45, STRING=46, LINE_COMMENT=47, SKIP_=48, NEWLINE=49, INDENT=50, 
		DEDENT=51;
	public static final int
		RULE_program = 0, RULE_class_def = 1, RULE_class_body = 2, RULE_class_body_def = 3, 
		RULE_func_def = 4, RULE_func_body = 5, RULE_typed_var = 6, RULE_type = 7, 
		RULE_global_decl = 8, RULE_nonlocal_decl = 9, RULE_var_def = 10, RULE_stmt = 11, 
		RULE_simple_stmt = 12, RULE_block = 13, RULE_literal = 14, RULE_expr = 15, 
		RULE_expr_or = 16, RULE_expr_and = 17, RULE_simple_expr = 18, RULE_cexpr = 19, 
		RULE_cexpr_sum = 20, RULE_cexpr_mul = 21, RULE_simple_value = 22, RULE_cmp = 23, 
		RULE_op_suma = 24, RULE_op_mul = 25, RULE_target = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_def", "class_body", "class_body_def", "func_def", "func_body", 
			"typed_var", "type", "global_decl", "nonlocal_decl", "var_def", "stmt", 
			"simple_stmt", "block", "literal", "expr", "expr_or", "expr_and", "simple_expr", 
			"cexpr", "cexpr_sum", "cexpr_mul", "simple_value", "cmp", "op_suma", 
			"op_mul", "target"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'not'", "'and'", "'or'", "'if'", "'elif'", "'else'", "'input'", 
			"'('", "')'", "'len'", "','", "'['", "']'", "'.'", "'-'", "'class'", 
			"':'", "'pass'", "'def'", "'->'", "'global'", "'nonlocal'", "'=='", "'='", 
			"'while'", "'for'", "'in'", "'return'", "'print'", "'+'", "'*'", "'//'", 
			"'%'", "'!='", "'<='", "'>='", "'<'", "'>'", "'is'", "'None'", "'True'", 
			"'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NOT", "AND", "OR", "IF", "ELIF", "ELSE", "INPUT", "PAR_IZQ", "PAR_DER", 
			"LEN", "COMMA", "COR_IZQ", "COR_DER", "PUNTO", "MENOS", "CLASS", "DOS_PUNTOS", 
			"PASS", "DEF", "EJECUTA", "GLOBAL", "NONLOCAL", "DOBLE_IGUAL", "IGUAL", 
			"WHILE", "FOR", "IN", "RETURN", "PRINT", "MAS", "MULTIPLICA", "DIV_ENTERA", 
			"MODULO", "DIFERENTE", "MENOR_IGUAL", "MAYOR_IGUAL", "MENOR", "MAYOR", 
			"IS", "NONE", "TRUE", "FALSE", "INTEGER", "ID", "IDSTRING", "STRING", 
			"LINE_COMMENT", "SKIP_", "NEWLINE", "INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Chocopy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChocopyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				var_def();
				setState(55);
				program();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				func_def();
				setState(58);
				program();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				class_def();
				setState(61);
				program();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(63);
						stmt();
						}
						} 
					}
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ChocopyParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(ChocopyParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ChocopyParser.ID, i);
		}
		public TerminalNode PAR_IZQ() { return getToken(ChocopyParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(ChocopyParser.PAR_DER, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(ChocopyParser.DOS_PUNTOS, 0); }
		public TerminalNode NEWLINE() { return getToken(ChocopyParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(ChocopyParser.INDENT, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(ChocopyParser.DEDENT, 0); }
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(CLASS);
			setState(72);
			match(ID);
			setState(73);
			match(PAR_IZQ);
			setState(74);
			match(ID);
			setState(75);
			match(PAR_DER);
			setState(76);
			match(DOS_PUNTOS);
			setState(77);
			match(NEWLINE);
			setState(78);
			match(INDENT);
			setState(79);
			class_body();
			setState(80);
			match(DEDENT);
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

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(ChocopyParser.PASS, 0); }
		public TerminalNode NEWLINE() { return getToken(ChocopyParser.NEWLINE, 0); }
		public Class_body_defContext class_body_def() {
			return getRuleContext(Class_body_defContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_body);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(PASS);
				setState(83);
				match(NEWLINE);
				}
				break;
			case DEF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				class_body_def();
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

	public static class Class_body_defContext extends ParserRuleContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public Class_body_defContext class_body_def() {
			return getRuleContext(Class_body_defContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public Class_body_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterClass_body_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitClass_body_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitClass_body_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_body_defContext class_body_def() throws RecognitionException {
		Class_body_defContext _localctx = new Class_body_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_body_def);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				var_def();
				setState(88);
				class_body_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				func_def();
				setState(91);
				class_body_def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				var_def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				func_def();
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

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(ChocopyParser.DEF, 0); }
		public TerminalNode ID() { return getToken(ChocopyParser.ID, 0); }
		public TerminalNode PAR_IZQ() { return getToken(ChocopyParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(ChocopyParser.PAR_DER, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(ChocopyParser.DOS_PUNTOS, 0); }
		public TerminalNode NEWLINE() { return getToken(ChocopyParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(ChocopyParser.INDENT, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(ChocopyParser.DEDENT, 0); }
		public List<Typed_varContext> typed_var() {
			return getRuleContexts(Typed_varContext.class);
		}
		public Typed_varContext typed_var(int i) {
			return getRuleContext(Typed_varContext.class,i);
		}
		public TerminalNode EJECUTA() { return getToken(ChocopyParser.EJECUTA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ChocopyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ChocopyParser.COMMA, i);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(DEF);
			setState(98);
			match(ID);
			setState(99);
			match(PAR_IZQ);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(100);
				typed_var();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(101);
					match(COMMA);
					setState(102);
					typed_var();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(110);
			match(PAR_DER);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EJECUTA) {
				{
				setState(111);
				match(EJECUTA);
				setState(112);
				type();
				}
			}

			setState(115);
			match(DOS_PUNTOS);
			setState(116);
			match(NEWLINE);
			setState(117);
			match(INDENT);
			setState(118);
			func_body();
			setState(119);
			match(DEDENT);
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

	public static class Func_bodyContext extends ParserRuleContext {
		public Global_declContext global_decl() {
			return getRuleContext(Global_declContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Nonlocal_declContext nonlocal_decl() {
			return getRuleContext(Nonlocal_declContext.class,0);
		}
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitFunc_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitFunc_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_body);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				global_decl();
				setState(122);
				func_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				nonlocal_decl();
				setState(125);
				func_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				var_def();
				setState(128);
				func_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				func_def();
				setState(131);
				func_body();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(133);
					stmt();
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << INPUT) | (1L << PAR_IZQ) | (1L << LEN) | (1L << COR_IZQ) | (1L << MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << ID) | (1L << IDSTRING) | (1L << STRING))) != 0) );
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

	public static class Typed_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ChocopyParser.ID, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(ChocopyParser.DOS_PUNTOS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typed_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterTyped_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitTyped_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitTyped_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typed_varContext typed_var() throws RecognitionException {
		Typed_varContext _localctx = new Typed_varContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typed_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(141);
			match(DOS_PUNTOS);
			setState(142);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ChocopyParser.ID, 0); }
		public TerminalNode IDSTRING() { return getToken(ChocopyParser.IDSTRING, 0); }
		public TerminalNode COR_IZQ() { return getToken(ChocopyParser.COR_IZQ, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COR_DER() { return getToken(ChocopyParser.COR_DER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(ID);
				}
				break;
			case IDSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(IDSTRING);
				}
				break;
			case COR_IZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(COR_IZQ);
				setState(147);
				type();
				setState(148);
				match(COR_DER);
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

	public static class Global_declContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(ChocopyParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(ChocopyParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(ChocopyParser.NEWLINE, 0); }
		public Global_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterGlobal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitGlobal_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitGlobal_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_declContext global_decl() throws RecognitionException {
		Global_declContext _localctx = new Global_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_global_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(GLOBAL);
			setState(153);
			match(ID);
			setState(154);
			match(NEWLINE);
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

	public static class Nonlocal_declContext extends ParserRuleContext {
		public TerminalNode NONLOCAL() { return getToken(ChocopyParser.NONLOCAL, 0); }
		public TerminalNode ID() { return getToken(ChocopyParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(ChocopyParser.NEWLINE, 0); }
		public Nonlocal_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonlocal_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterNonlocal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitNonlocal_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitNonlocal_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonlocal_declContext nonlocal_decl() throws RecognitionException {
		Nonlocal_declContext _localctx = new Nonlocal_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nonlocal_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(NONLOCAL);
			setState(157);
			match(ID);
			setState(158);
			match(NEWLINE);
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

	public static class Var_defContext extends ParserRuleContext {
		public Typed_varContext typed_var() {
			return getRuleContext(Typed_varContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(ChocopyParser.IGUAL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ChocopyParser.NEWLINE, 0); }
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			typed_var();
			setState(161);
			match(IGUAL);
			setState(162);
			literal();
			setState(163);
			match(NEWLINE);
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

	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ChocopyParser.NEWLINE, 0); }
		public TerminalNode IF() { return getToken(ChocopyParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> DOS_PUNTOS() { return getTokens(ChocopyParser.DOS_PUNTOS); }
		public TerminalNode DOS_PUNTOS(int i) {
			return getToken(ChocopyParser.DOS_PUNTOS, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(ChocopyParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(ChocopyParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(ChocopyParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(ChocopyParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(ChocopyParser.FOR, 0); }
		public TerminalNode ID() { return getToken(ChocopyParser.ID, 0); }
		public TerminalNode IN() { return getToken(ChocopyParser.IN, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case INPUT:
			case PAR_IZQ:
			case LEN:
			case COR_IZQ:
			case MENOS:
			case PASS:
			case RETURN:
			case PRINT:
			case NONE:
			case TRUE:
			case FALSE:
			case INTEGER:
			case ID:
			case IDSTRING:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				simple_stmt();
				setState(166);
				match(NEWLINE);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(IF);
				setState(169);
				expr();
				setState(170);
				match(DOS_PUNTOS);
				setState(171);
				block();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELIF) {
					{
					{
					setState(172);
					match(ELIF);
					setState(173);
					expr();
					setState(174);
					match(DOS_PUNTOS);
					setState(175);
					block();
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(182);
					match(ELSE);
					setState(183);
					match(DOS_PUNTOS);
					setState(184);
					block();
					}
				}

				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(WHILE);
				setState(188);
				expr();
				setState(189);
				match(DOS_PUNTOS);
				setState(190);
				block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(FOR);
				setState(193);
				match(ID);
				setState(194);
				match(IN);
				setState(195);
				expr();
				setState(196);
				match(DOS_PUNTOS);
				setState(197);
				block();
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

	public static class Simple_stmtContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(ChocopyParser.PASS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(ChocopyParser.RETURN, 0); }
		public List<TargetContext> target() {
			return getRuleContexts(TargetContext.class);
		}
		public TargetContext target(int i) {
			return getRuleContext(TargetContext.class,i);
		}
		public List<TerminalNode> IGUAL() { return getTokens(ChocopyParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(ChocopyParser.IGUAL, i);
		}
		public TerminalNode PRINT() { return getToken(ChocopyParser.PRINT, 0); }
		public TerminalNode PAR_IZQ() { return getToken(ChocopyParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(ChocopyParser.PAR_DER, 0); }
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(PASS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(RETURN);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << INPUT) | (1L << PAR_IZQ) | (1L << LEN) | (1L << COR_IZQ) | (1L << MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << ID) | (1L << IDSTRING) | (1L << STRING))) != 0)) {
					{
					setState(204);
					expr();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(207);
						target();
						setState(208);
						match(IGUAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(212); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(214);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(PRINT);
				setState(217);
				match(PAR_IZQ);
				setState(218);
				expr();
				setState(219);
				match(PAR_DER);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ChocopyParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(ChocopyParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(ChocopyParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(NEWLINE);
			setState(224);
			match(INDENT);
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				stmt();
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << INPUT) | (1L << PAR_IZQ) | (1L << LEN) | (1L << COR_IZQ) | (1L << MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << ID) | (1L << IDSTRING) | (1L << STRING))) != 0) );
			setState(230);
			match(DEDENT);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(ChocopyParser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(ChocopyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ChocopyParser.FALSE, 0); }
		public TerminalNode INTEGER() { return getToken(ChocopyParser.INTEGER, 0); }
		public TerminalNode IDSTRING() { return getToken(ChocopyParser.IDSTRING, 0); }
		public TerminalNode STRING() { return getToken(ChocopyParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << IDSTRING) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ExprContext extends ParserRuleContext {
		public List<Expr_orContext> expr_or() {
			return getRuleContexts(Expr_orContext.class);
		}
		public Expr_orContext expr_or(int i) {
			return getRuleContext(Expr_orContext.class,i);
		}
		public TerminalNode IF() { return getToken(ChocopyParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(ChocopyParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				expr_or(0);
				setState(235);
				match(IF);
				setState(236);
				expr_or(0);
				setState(237);
				match(ELSE);
				setState(238);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				expr_or(0);
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

	public static class Expr_orContext extends ParserRuleContext {
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public TerminalNode OR() { return getToken(ChocopyParser.OR, 0); }
		public Expr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterExpr_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitExpr_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitExpr_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		return expr_or(0);
	}

	private Expr_orContext expr_or(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_orContext _localctx = new Expr_orContext(_ctx, _parentState);
		Expr_orContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(244);
			expr_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_orContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_or);
					setState(246);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(247);
					match(OR);
					setState(248);
					expr_and(0);
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class Expr_andContext extends ParserRuleContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public TerminalNode AND() { return getToken(ChocopyParser.AND, 0); }
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterExpr_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitExpr_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitExpr_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		return expr_and(0);
	}

	private Expr_andContext expr_and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_andContext _localctx = new Expr_andContext(_ctx, _parentState);
		Expr_andContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(255);
			simple_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_andContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_and);
					setState(257);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(258);
					match(AND);
					setState(259);
					simple_expr();
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Simple_exprContext extends ParserRuleContext {
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ChocopyParser.NOT, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterSimple_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitSimple_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitSimple_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simple_expr);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
			case PAR_IZQ:
			case LEN:
			case COR_IZQ:
			case MENOS:
			case NONE:
			case TRUE:
			case FALSE:
			case INTEGER:
			case ID:
			case IDSTRING:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				cexpr(0);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(NOT);
				setState(267);
				simple_expr();
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

	public static class CexprContext extends ParserRuleContext {
		public Cexpr_sumContext cexpr_sum() {
			return getRuleContext(Cexpr_sumContext.class,0);
		}
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public CexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterCexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitCexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitCexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CexprContext cexpr() throws RecognitionException {
		return cexpr(0);
	}

	private CexprContext cexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CexprContext _localctx = new CexprContext(_ctx, _parentState);
		CexprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_cexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(271);
			cexpr_sum(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
					setState(273);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(274);
					cmp();
					setState(275);
					cexpr_sum(0);
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Cexpr_sumContext extends ParserRuleContext {
		public Cexpr_mulContext cexpr_mul() {
			return getRuleContext(Cexpr_mulContext.class,0);
		}
		public Cexpr_sumContext cexpr_sum() {
			return getRuleContext(Cexpr_sumContext.class,0);
		}
		public Op_sumaContext op_suma() {
			return getRuleContext(Op_sumaContext.class,0);
		}
		public Cexpr_sumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterCexpr_sum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitCexpr_sum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitCexpr_sum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cexpr_sumContext cexpr_sum() throws RecognitionException {
		return cexpr_sum(0);
	}

	private Cexpr_sumContext cexpr_sum(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Cexpr_sumContext _localctx = new Cexpr_sumContext(_ctx, _parentState);
		Cexpr_sumContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_cexpr_sum, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(283);
			cexpr_mul(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Cexpr_sumContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cexpr_sum);
					setState(285);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(286);
					op_suma();
					setState(287);
					cexpr_mul(0);
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Cexpr_mulContext extends ParserRuleContext {
		public Simple_valueContext simple_value() {
			return getRuleContext(Simple_valueContext.class,0);
		}
		public Cexpr_mulContext cexpr_mul() {
			return getRuleContext(Cexpr_mulContext.class,0);
		}
		public Op_mulContext op_mul() {
			return getRuleContext(Op_mulContext.class,0);
		}
		public Cexpr_mulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterCexpr_mul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitCexpr_mul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitCexpr_mul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cexpr_mulContext cexpr_mul() throws RecognitionException {
		return cexpr_mul(0);
	}

	private Cexpr_mulContext cexpr_mul(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Cexpr_mulContext _localctx = new Cexpr_mulContext(_ctx, _parentState);
		Cexpr_mulContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_cexpr_mul, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(295);
			simple_value(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Cexpr_mulContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cexpr_mul);
					setState(297);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(298);
					op_mul();
					setState(299);
					simple_value(0);
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Simple_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ChocopyParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LEN() { return getToken(ChocopyParser.LEN, 0); }
		public TerminalNode PAR_IZQ() { return getToken(ChocopyParser.PAR_IZQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(ChocopyParser.PAR_DER, 0); }
		public TerminalNode INPUT() { return getToken(ChocopyParser.INPUT, 0); }
		public TerminalNode MENOS() { return getToken(ChocopyParser.MENOS, 0); }
		public Simple_valueContext simple_value() {
			return getRuleContext(Simple_valueContext.class,0);
		}
		public TerminalNode COR_IZQ() { return getToken(ChocopyParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(ChocopyParser.COR_DER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ChocopyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ChocopyParser.COMMA, i);
		}
		public TerminalNode PUNTO() { return getToken(ChocopyParser.PUNTO, 0); }
		public Simple_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterSimple_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitSimple_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitSimple_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_valueContext simple_value() throws RecognitionException {
		return simple_value(0);
	}

	private Simple_valueContext simple_value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Simple_valueContext _localctx = new Simple_valueContext(_ctx, _parentState);
		Simple_valueContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_simple_value, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(307);
				match(ID);
				}
				break;
			case 2:
				{
				setState(308);
				literal();
				}
				break;
			case 3:
				{
				setState(309);
				match(LEN);
				setState(310);
				match(PAR_IZQ);
				setState(311);
				expr();
				setState(312);
				match(PAR_DER);
				}
				break;
			case 4:
				{
				setState(314);
				match(INPUT);
				setState(315);
				match(PAR_IZQ);
				setState(316);
				match(PAR_DER);
				}
				break;
			case 5:
				{
				setState(317);
				match(MENOS);
				setState(318);
				simple_value(4);
				}
				break;
			case 6:
				{
				setState(319);
				match(COR_IZQ);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << INPUT) | (1L << PAR_IZQ) | (1L << LEN) | (1L << COR_IZQ) | (1L << MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << ID) | (1L << IDSTRING) | (1L << STRING))) != 0)) {
					{
					setState(320);
					expr();
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(321);
						match(COMMA);
						setState(322);
						expr();
						}
						}
						setState(327);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(330);
				match(COR_DER);
				}
				break;
			case 7:
				{
				setState(331);
				match(PAR_IZQ);
				setState(332);
				expr();
				setState(333);
				match(PAR_DER);
				}
				break;
			case 8:
				{
				setState(335);
				match(ID);
				setState(336);
				match(PAR_IZQ);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << INPUT) | (1L << PAR_IZQ) | (1L << LEN) | (1L << COR_IZQ) | (1L << MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << ID) | (1L << IDSTRING) | (1L << STRING))) != 0)) {
					{
					setState(337);
					expr();
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(338);
						match(COMMA);
						setState(339);
						expr();
						}
						}
						setState(344);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(347);
				match(PAR_DER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(373);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new Simple_valueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simple_value);
						setState(350);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(351);
						match(PUNTO);
						setState(352);
						match(ID);
						}
						break;
					case 2:
						{
						_localctx = new Simple_valueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simple_value);
						setState(353);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(354);
						match(PUNTO);
						setState(355);
						match(ID);
						setState(356);
						match(PAR_IZQ);
						setState(365);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << INPUT) | (1L << PAR_IZQ) | (1L << LEN) | (1L << COR_IZQ) | (1L << MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << ID) | (1L << IDSTRING) | (1L << STRING))) != 0)) {
							{
							setState(357);
							expr();
							setState(362);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(358);
								match(COMMA);
								setState(359);
								expr();
								}
								}
								setState(364);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(367);
						match(PAR_DER);
						}
						break;
					case 3:
						{
						_localctx = new Simple_valueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simple_value);
						setState(368);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(369);
						match(COR_IZQ);
						setState(370);
						expr();
						setState(371);
						match(COR_DER);
						}
						break;
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class CmpContext extends ParserRuleContext {
		public TerminalNode DOBLE_IGUAL() { return getToken(ChocopyParser.DOBLE_IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(ChocopyParser.DIFERENTE, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(ChocopyParser.MENOR_IGUAL, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(ChocopyParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(ChocopyParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(ChocopyParser.MAYOR, 0); }
		public TerminalNode IS() { return getToken(ChocopyParser.IS, 0); }
		public CmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitCmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOBLE_IGUAL) | (1L << DIFERENTE) | (1L << MENOR_IGUAL) | (1L << MAYOR_IGUAL) | (1L << MENOR) | (1L << MAYOR) | (1L << IS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Op_sumaContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(ChocopyParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(ChocopyParser.MENOS, 0); }
		public Op_sumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterOp_suma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitOp_suma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitOp_suma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_sumaContext op_suma() throws RecognitionException {
		Op_sumaContext _localctx = new Op_sumaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_op_suma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( !(_la==MENOS || _la==MAS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Op_mulContext extends ParserRuleContext {
		public TerminalNode MULTIPLICA() { return getToken(ChocopyParser.MULTIPLICA, 0); }
		public TerminalNode DIV_ENTERA() { return getToken(ChocopyParser.DIV_ENTERA, 0); }
		public TerminalNode MODULO() { return getToken(ChocopyParser.MODULO, 0); }
		public Op_mulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterOp_mul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitOp_mul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitOp_mul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_mulContext op_mul() throws RecognitionException {
		Op_mulContext _localctx = new Op_mulContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op_mul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICA) | (1L << DIV_ENTERA) | (1L << MODULO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class TargetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ChocopyParser.ID, 0); }
		public Simple_valueContext simple_value() {
			return getRuleContext(Simple_valueContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(ChocopyParser.PUNTO, 0); }
		public TerminalNode COR_IZQ() { return getToken(ChocopyParser.COR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COR_DER() { return getToken(ChocopyParser.COR_DER, 0); }
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_target);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				simple_value(0);
				setState(386);
				match(PUNTO);
				setState(387);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				simple_value(0);
				setState(390);
				match(COR_IZQ);
				setState(391);
				expr();
				setState(392);
				match(COR_DER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_or_sempred((Expr_orContext)_localctx, predIndex);
		case 17:
			return expr_and_sempred((Expr_andContext)_localctx, predIndex);
		case 19:
			return cexpr_sempred((CexprContext)_localctx, predIndex);
		case 20:
			return cexpr_sum_sempred((Cexpr_sumContext)_localctx, predIndex);
		case 21:
			return cexpr_mul_sempred((Cexpr_mulContext)_localctx, predIndex);
		case 22:
			return simple_value_sempred((Simple_valueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_or_sempred(Expr_orContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_and_sempred(Expr_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cexpr_sempred(CexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cexpr_sum_sempred(Cexpr_sumContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cexpr_mul_sempred(Cexpr_mulContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simple_value_sempred(Simple_valueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u018f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\7\2C\n\2\f\2\16\2F\13\2\5\2H\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5b\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\5\6o\n\6\3\6\3\6\3\6"+
		"\5\6t\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\6\7\u0089\n\7\r\7\16\7\u008a\5\7\u008d\n\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0099\n\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u00b4\n\r\f\r\16\r\u00b7\13\r\3\r\3\r\3\r\5\r\u00bc\n\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ca\n\r\3\16\3\16"+
		"\3\16\3\16\5\16\u00d0\n\16\3\16\3\16\3\16\6\16\u00d5\n\16\r\16\16\16\u00d6"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e0\n\16\3\17\3\17\3\17\6\17"+
		"\u00e5\n\17\r\17\16\17\u00e6\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u00f4\n\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00fc"+
		"\n\22\f\22\16\22\u00ff\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0107"+
		"\n\23\f\23\16\23\u010a\13\23\3\24\3\24\3\24\5\24\u010f\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u0118\n\25\f\25\16\25\u011b\13\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0124\n\26\f\26\16\26\u0127\13\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0130\n\27\f\27\16\27\u0133\13"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\7\30\u0146\n\30\f\30\16\30\u0149\13\30\5\30\u014b\n"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0157\n\30"+
		"\f\30\16\30\u015a\13\30\5\30\u015c\n\30\3\30\5\30\u015f\n\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u016b\n\30\f\30\16\30\u016e"+
		"\13\30\5\30\u0170\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0178\n\30\f"+
		"\30\16\30\u017b\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u018d\n\34\3\34\2\b\"$(*,.\35\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\6\4\2*-/\60"+
		"\4\2\31\31$)\4\2\21\21  \3\2!#\2\u01aa\2G\3\2\2\2\4I\3\2\2\2\6W\3\2\2"+
		"\2\ba\3\2\2\2\nc\3\2\2\2\f\u008c\3\2\2\2\16\u008e\3\2\2\2\20\u0098\3\2"+
		"\2\2\22\u009a\3\2\2\2\24\u009e\3\2\2\2\26\u00a2\3\2\2\2\30\u00c9\3\2\2"+
		"\2\32\u00df\3\2\2\2\34\u00e1\3\2\2\2\36\u00ea\3\2\2\2 \u00f3\3\2\2\2\""+
		"\u00f5\3\2\2\2$\u0100\3\2\2\2&\u010e\3\2\2\2(\u0110\3\2\2\2*\u011c\3\2"+
		"\2\2,\u0128\3\2\2\2.\u015e\3\2\2\2\60\u017c\3\2\2\2\62\u017e\3\2\2\2\64"+
		"\u0180\3\2\2\2\66\u018c\3\2\2\289\5\26\f\29:\5\2\2\2:H\3\2\2\2;<\5\n\6"+
		"\2<=\5\2\2\2=H\3\2\2\2>?\5\4\3\2?@\5\2\2\2@H\3\2\2\2AC\5\30\r\2BA\3\2"+
		"\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2G8\3\2\2\2G;\3\2"+
		"\2\2G>\3\2\2\2GD\3\2\2\2H\3\3\2\2\2IJ\7\22\2\2JK\7.\2\2KL\7\n\2\2LM\7"+
		".\2\2MN\7\13\2\2NO\7\23\2\2OP\7\63\2\2PQ\7\64\2\2QR\5\6\4\2RS\7\65\2\2"+
		"S\5\3\2\2\2TU\7\24\2\2UX\7\63\2\2VX\5\b\5\2WT\3\2\2\2WV\3\2\2\2X\7\3\2"+
		"\2\2YZ\5\26\f\2Z[\5\b\5\2[b\3\2\2\2\\]\5\n\6\2]^\5\b\5\2^b\3\2\2\2_b\5"+
		"\26\f\2`b\5\n\6\2aY\3\2\2\2a\\\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\t\3\2\2\2"+
		"cd\7\25\2\2de\7.\2\2en\7\n\2\2fk\5\16\b\2gh\7\r\2\2hj\5\16\b\2ig\3\2\2"+
		"\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2nf\3\2\2\2no\3\2\2"+
		"\2op\3\2\2\2ps\7\13\2\2qr\7\26\2\2rt\5\20\t\2sq\3\2\2\2st\3\2\2\2tu\3"+
		"\2\2\2uv\7\23\2\2vw\7\63\2\2wx\7\64\2\2xy\5\f\7\2yz\7\65\2\2z\13\3\2\2"+
		"\2{|\5\22\n\2|}\5\f\7\2}\u008d\3\2\2\2~\177\5\24\13\2\177\u0080\5\f\7"+
		"\2\u0080\u008d\3\2\2\2\u0081\u0082\5\26\f\2\u0082\u0083\5\f\7\2\u0083"+
		"\u008d\3\2\2\2\u0084\u0085\5\n\6\2\u0085\u0086\5\f\7\2\u0086\u008d\3\2"+
		"\2\2\u0087\u0089\5\30\r\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c{\3\2\2\2"+
		"\u008c~\3\2\2\2\u008c\u0081\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0088\3"+
		"\2\2\2\u008d\r\3\2\2\2\u008e\u008f\7.\2\2\u008f\u0090\7\23\2\2\u0090\u0091"+
		"\5\20\t\2\u0091\17\3\2\2\2\u0092\u0099\7.\2\2\u0093\u0099\7/\2\2\u0094"+
		"\u0095\7\16\2\2\u0095\u0096\5\20\t\2\u0096\u0097\7\17\2\2\u0097\u0099"+
		"\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0099"+
		"\21\3\2\2\2\u009a\u009b\7\27\2\2\u009b\u009c\7.\2\2\u009c\u009d\7\63\2"+
		"\2\u009d\23\3\2\2\2\u009e\u009f\7\30\2\2\u009f\u00a0\7.\2\2\u00a0\u00a1"+
		"\7\63\2\2\u00a1\25\3\2\2\2\u00a2\u00a3\5\16\b\2\u00a3\u00a4\7\32\2\2\u00a4"+
		"\u00a5\5\36\20\2\u00a5\u00a6\7\63\2\2\u00a6\27\3\2\2\2\u00a7\u00a8\5\32"+
		"\16\2\u00a8\u00a9\7\63\2\2\u00a9\u00ca\3\2\2\2\u00aa\u00ab\7\6\2\2\u00ab"+
		"\u00ac\5 \21\2\u00ac\u00ad\7\23\2\2\u00ad\u00b5\5\34\17\2\u00ae\u00af"+
		"\7\7\2\2\u00af\u00b0\5 \21\2\u00b0\u00b1\7\23\2\2\u00b1\u00b2\5\34\17"+
		"\2\u00b2\u00b4\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00bb\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00b9\7\b\2\2\u00b9\u00ba\7\23\2\2\u00ba\u00bc\5\34\17\2\u00bb\u00b8"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ca\3\2\2\2\u00bd\u00be\7\33\2\2"+
		"\u00be\u00bf\5 \21\2\u00bf\u00c0\7\23\2\2\u00c0\u00c1\5\34\17\2\u00c1"+
		"\u00ca\3\2\2\2\u00c2\u00c3\7\34\2\2\u00c3\u00c4\7.\2\2\u00c4\u00c5\7\35"+
		"\2\2\u00c5\u00c6\5 \21\2\u00c6\u00c7\7\23\2\2\u00c7\u00c8\5\34\17\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00a7\3\2\2\2\u00c9\u00aa\3\2\2\2\u00c9\u00bd\3\2"+
		"\2\2\u00c9\u00c2\3\2\2\2\u00ca\31\3\2\2\2\u00cb\u00e0\7\24\2\2\u00cc\u00e0"+
		"\5 \21\2\u00cd\u00cf\7\36\2\2\u00ce\u00d0\5 \21\2\u00cf\u00ce\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\u00e0\3\2\2\2\u00d1\u00d2\5\66\34\2\u00d2\u00d3"+
		"\7\32\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d6\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9"+
		"\5 \21\2\u00d9\u00e0\3\2\2\2\u00da\u00db\7\37\2\2\u00db\u00dc\7\n\2\2"+
		"\u00dc\u00dd\5 \21\2\u00dd\u00de\7\13\2\2\u00de\u00e0\3\2\2\2\u00df\u00cb"+
		"\3\2\2\2\u00df\u00cc\3\2\2\2\u00df\u00cd\3\2\2\2\u00df\u00d4\3\2\2\2\u00df"+
		"\u00da\3\2\2\2\u00e0\33\3\2\2\2\u00e1\u00e2\7\63\2\2\u00e2\u00e4\7\64"+
		"\2\2\u00e3\u00e5\5\30\r\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\65"+
		"\2\2\u00e9\35\3\2\2\2\u00ea\u00eb\t\2\2\2\u00eb\37\3\2\2\2\u00ec\u00ed"+
		"\5\"\22\2\u00ed\u00ee\7\6\2\2\u00ee\u00ef\5\"\22\2\u00ef\u00f0\7\b\2\2"+
		"\u00f0\u00f1\5 \21\2\u00f1\u00f4\3\2\2\2\u00f2\u00f4\5\"\22\2\u00f3\u00ec"+
		"\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4!\3\2\2\2\u00f5\u00f6\b\22\1\2\u00f6"+
		"\u00f7\5$\23\2\u00f7\u00fd\3\2\2\2\u00f8\u00f9\f\4\2\2\u00f9\u00fa\7\5"+
		"\2\2\u00fa\u00fc\5$\23\2\u00fb\u00f8\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe#\3\2\2\2\u00ff\u00fd\3\2\2\2"+
		"\u0100\u0101\b\23\1\2\u0101\u0102\5&\24\2\u0102\u0108\3\2\2\2\u0103\u0104"+
		"\f\4\2\2\u0104\u0105\7\4\2\2\u0105\u0107\5&\24\2\u0106\u0103\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109%\3\2\2\2"+
		"\u010a\u0108\3\2\2\2\u010b\u010f\5(\25\2\u010c\u010d\7\3\2\2\u010d\u010f"+
		"\5&\24\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010f\'\3\2\2\2\u0110"+
		"\u0111\b\25\1\2\u0111\u0112\5*\26\2\u0112\u0119\3\2\2\2\u0113\u0114\f"+
		"\4\2\2\u0114\u0115\5\60\31\2\u0115\u0116\5*\26\2\u0116\u0118\3\2\2\2\u0117"+
		"\u0113\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a)\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\b\26\1\2\u011d\u011e"+
		"\5,\27\2\u011e\u0125\3\2\2\2\u011f\u0120\f\4\2\2\u0120\u0121\5\62\32\2"+
		"\u0121\u0122\5,\27\2\u0122\u0124\3\2\2\2\u0123\u011f\3\2\2\2\u0124\u0127"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126+\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128\u0129\b\27\1\2\u0129\u012a\5.\30\2\u012a\u0131\3"+
		"\2\2\2\u012b\u012c\f\4\2\2\u012c\u012d\5\64\33\2\u012d\u012e\5.\30\2\u012e"+
		"\u0130\3\2\2\2\u012f\u012b\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132-\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135"+
		"\b\30\1\2\u0135\u015f\7.\2\2\u0136\u015f\5\36\20\2\u0137\u0138\7\f\2\2"+
		"\u0138\u0139\7\n\2\2\u0139\u013a\5 \21\2\u013a\u013b\7\13\2\2\u013b\u015f"+
		"\3\2\2\2\u013c\u013d\7\t\2\2\u013d\u013e\7\n\2\2\u013e\u015f\7\13\2\2"+
		"\u013f\u0140\7\21\2\2\u0140\u015f\5.\30\6\u0141\u014a\7\16\2\2\u0142\u0147"+
		"\5 \21\2\u0143\u0144\7\r\2\2\u0144\u0146\5 \21\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u014a\u0142\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u015f\7\17\2\2\u014d\u014e\7\n\2\2\u014e\u014f\5"+
		" \21\2\u014f\u0150\7\13\2\2\u0150\u015f\3\2\2\2\u0151\u0152\7.\2\2\u0152"+
		"\u015b\7\n\2\2\u0153\u0158\5 \21\2\u0154\u0155\7\r\2\2\u0155\u0157\5 "+
		"\21\2\u0156\u0154\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u0153\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\7\13\2\2\u015e"+
		"\u0134\3\2\2\2\u015e\u0136\3\2\2\2\u015e\u0137\3\2\2\2\u015e\u013c\3\2"+
		"\2\2\u015e\u013f\3\2\2\2\u015e\u0141\3\2\2\2\u015e\u014d\3\2\2\2\u015e"+
		"\u0151\3\2\2\2\u015f\u0179\3\2\2\2\u0160\u0161\f\t\2\2\u0161\u0162\7\20"+
		"\2\2\u0162\u0178\7.\2\2\u0163\u0164\f\b\2\2\u0164\u0165\7\20\2\2\u0165"+
		"\u0166\7.\2\2\u0166\u016f\7\n\2\2\u0167\u016c\5 \21\2\u0168\u0169\7\r"+
		"\2\2\u0169\u016b\5 \21\2\u016a\u0168\3\2\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016f\u0167\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0178\7\13\2\2\u0172\u0173\f\7\2\2\u0173\u0174\7\16\2\2\u0174\u0175\5"+
		" \21\2\u0175\u0176\7\17\2\2\u0176\u0178\3\2\2\2\u0177\u0160\3\2\2\2\u0177"+
		"\u0163\3\2\2\2\u0177\u0172\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017a/\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d"+
		"\t\3\2\2\u017d\61\3\2\2\2\u017e\u017f\t\4\2\2\u017f\63\3\2\2\2\u0180\u0181"+
		"\t\5\2\2\u0181\65\3\2\2\2\u0182\u018d\7.\2\2\u0183\u0184\5.\30\2\u0184"+
		"\u0185\7\20\2\2\u0185\u0186\7.\2\2\u0186\u018d\3\2\2\2\u0187\u0188\5."+
		"\30\2\u0188\u0189\7\16\2\2\u0189\u018a\5 \21\2\u018a\u018b\7\17\2\2\u018b"+
		"\u018d\3\2\2\2\u018c\u0182\3\2\2\2\u018c\u0183\3\2\2\2\u018c\u0187\3\2"+
		"\2\2\u018d\67\3\2\2\2$DGWakns\u008a\u008c\u0098\u00b5\u00bb\u00c9\u00cf"+
		"\u00d6\u00df\u00e6\u00f3\u00fd\u0108\u010e\u0119\u0125\u0131\u0147\u014a"+
		"\u0158\u015b\u015e\u016c\u016f\u0177\u0179\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}