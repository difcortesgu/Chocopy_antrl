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
		RULE_program = 0, RULE_class_def = 1, RULE_class_body = 2, RULE_func_def = 3, 
		RULE_func_body = 4, RULE_typed_var = 5, RULE_type = 6, RULE_global_decl = 7, 
		RULE_nonlocal_decl = 8, RULE_var_def = 9, RULE_stmt = 10, RULE_simple_stmt = 11, 
		RULE_block = 12, RULE_literal = 13, RULE_expr = 14, RULE_cexpr = 15, RULE_bin_op = 16, 
		RULE_target = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_def", "class_body", "func_def", "func_body", "typed_var", 
			"type", "global_decl", "nonlocal_decl", "var_def", "stmt", "simple_stmt", 
			"block", "literal", "expr", "cexpr", "bin_op", "target"
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
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(39);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(36);
						var_def();
						}
						break;
					case DEF:
						{
						setState(37);
						func_def();
						}
						break;
					case CLASS:
						{
						setState(38);
						class_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << INPUT) | (1L << PAR_IZQ) | (1L << LEN) | (1L << COR_IZQ) | (1L << MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << ID) | (1L << IDSTRING) | (1L << STRING))) != 0)) {
				{
				{
				setState(44);
				stmt();
				}
				}
				setState(49);
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
			setState(50);
			match(CLASS);
			setState(51);
			match(ID);
			setState(52);
			match(PAR_IZQ);
			setState(53);
			match(ID);
			setState(54);
			match(PAR_DER);
			setState(55);
			match(DOS_PUNTOS);
			setState(56);
			match(NEWLINE);
			setState(57);
			match(INDENT);
			setState(58);
			class_body();
			setState(59);
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
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
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
		int _la;
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(PASS);
				setState(62);
				match(NEWLINE);
				}
				break;
			case DEF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(65);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(63);
						var_def();
						}
						break;
					case DEF:
						{
						setState(64);
						func_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(67); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DEF || _la==ID );
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
		enterRule(_localctx, 6, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(DEF);
			setState(72);
			match(ID);
			setState(73);
			match(PAR_IZQ);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(74);
				typed_var();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(75);
					match(COMMA);
					setState(76);
					typed_var();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(84);
			match(PAR_DER);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EJECUTA) {
				{
				setState(85);
				match(EJECUTA);
				setState(86);
				type();
				}
			}

			setState(89);
			match(DOS_PUNTOS);
			setState(90);
			match(NEWLINE);
			setState(91);
			match(INDENT);
			setState(92);
			func_body();
			setState(93);
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
		public List<Global_declContext> global_decl() {
			return getRuleContexts(Global_declContext.class);
		}
		public Global_declContext global_decl(int i) {
			return getRuleContext(Global_declContext.class,i);
		}
		public List<Nonlocal_declContext> nonlocal_decl() {
			return getRuleContexts(Nonlocal_declContext.class);
		}
		public Nonlocal_declContext nonlocal_decl(int i) {
			return getRuleContext(Nonlocal_declContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
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
		enterRule(_localctx, 8, RULE_func_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(99);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case GLOBAL:
						{
						setState(95);
						global_decl();
						}
						break;
					case NONLOCAL:
						{
						setState(96);
						nonlocal_decl();
						}
						break;
					case ID:
						{
						setState(97);
						var_def();
						}
						break;
					case DEF:
						{
						setState(98);
						func_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				stmt();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << INPUT) | (1L << PAR_IZQ) | (1L << LEN) | (1L << COR_IZQ) | (1L << MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << ID) | (1L << IDSTRING) | (1L << STRING))) != 0) );
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
		enterRule(_localctx, 10, RULE_typed_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ID);
			setState(110);
			match(DOS_PUNTOS);
			setState(111);
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
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(ID);
				}
				break;
			case IDSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(IDSTRING);
				}
				break;
			case COR_IZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(COR_IZQ);
				setState(116);
				type();
				setState(117);
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
		enterRule(_localctx, 14, RULE_global_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(GLOBAL);
			setState(122);
			match(ID);
			setState(123);
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
		enterRule(_localctx, 16, RULE_nonlocal_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(NONLOCAL);
			setState(126);
			match(ID);
			setState(127);
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
		enterRule(_localctx, 18, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			typed_var();
			setState(130);
			match(IGUAL);
			setState(131);
			literal();
			setState(132);
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
		enterRule(_localctx, 20, RULE_stmt);
		int _la;
		try {
			setState(168);
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
				setState(134);
				simple_stmt();
				setState(135);
				match(NEWLINE);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(IF);
				setState(138);
				expr(0);
				setState(139);
				match(DOS_PUNTOS);
				setState(140);
				block();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELIF) {
					{
					{
					setState(141);
					match(ELIF);
					setState(142);
					expr(0);
					setState(143);
					match(DOS_PUNTOS);
					setState(144);
					block();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(151);
					match(ELSE);
					setState(152);
					match(DOS_PUNTOS);
					setState(153);
					block();
					}
				}

				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(WHILE);
				setState(157);
				expr(0);
				setState(158);
				match(DOS_PUNTOS);
				setState(159);
				block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(FOR);
				setState(162);
				match(ID);
				setState(163);
				match(IN);
				setState(164);
				expr(0);
				setState(165);
				match(DOS_PUNTOS);
				setState(166);
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
		enterRule(_localctx, 22, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(PASS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(RETURN);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << INPUT) | (1L << PAR_IZQ) | (1L << LEN) | (1L << COR_IZQ) | (1L << MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << ID) | (1L << IDSTRING) | (1L << STRING))) != 0)) {
					{
					setState(173);
					expr(0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(176);
						target();
						setState(177);
						match(IGUAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(181); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(183);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(PRINT);
				setState(186);
				match(PAR_IZQ);
				setState(187);
				expr(0);
				setState(188);
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
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(NEWLINE);
			setState(193);
			match(INDENT);
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				stmt();
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << INPUT) | (1L << PAR_IZQ) | (1L << LEN) | (1L << COR_IZQ) | (1L << MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << ID) | (1L << IDSTRING) | (1L << STRING))) != 0) );
			setState(199);
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
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ChocopyParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LEN() { return getToken(ChocopyParser.LEN, 0); }
		public TerminalNode PAR_IZQ() { return getToken(ChocopyParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(ChocopyParser.PAR_DER, 0); }
		public TerminalNode INPUT() { return getToken(ChocopyParser.INPUT, 0); }
		public TerminalNode AND() { return getToken(ChocopyParser.AND, 0); }
		public TerminalNode OR() { return getToken(ChocopyParser.OR, 0); }
		public TerminalNode IF() { return getToken(ChocopyParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(ChocopyParser.ELSE, 0); }
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_IZQ:
			case COR_IZQ:
			case MENOS:
			case NONE:
			case TRUE:
			case FALSE:
			case INTEGER:
			case ID:
			case IDSTRING:
			case STRING:
				{
				setState(204);
				cexpr(0);
				}
				break;
			case NOT:
				{
				setState(205);
				match(NOT);
				setState(206);
				expr(5);
				}
				break;
			case LEN:
				{
				setState(207);
				match(LEN);
				setState(208);
				match(PAR_IZQ);
				setState(209);
				expr(0);
				setState(210);
				match(PAR_DER);
				}
				break;
			case INPUT:
				{
				setState(212);
				match(INPUT);
				setState(213);
				match(PAR_IZQ);
				setState(214);
				match(PAR_DER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(226);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(218);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(219);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(221);
						match(IF);
						setState(222);
						expr(0);
						setState(223);
						match(ELSE);
						setState(224);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(230);
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

	public static class CexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ChocopyParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode COR_IZQ() { return getToken(ChocopyParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(ChocopyParser.COR_DER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ChocopyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ChocopyParser.COMMA, i);
		}
		public TerminalNode PAR_IZQ() { return getToken(ChocopyParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(ChocopyParser.PAR_DER, 0); }
		public TerminalNode MENOS() { return getToken(ChocopyParser.MENOS, 0); }
		public List<CexprContext> cexpr() {
			return getRuleContexts(CexprContext.class);
		}
		public CexprContext cexpr(int i) {
			return getRuleContext(CexprContext.class,i);
		}
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(ChocopyParser.PUNTO, 0); }
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_cexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(232);
				match(ID);
				}
				break;
			case 2:
				{
				setState(233);
				literal();
				}
				break;
			case 3:
				{
				setState(234);
				match(COR_IZQ);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << INPUT) | (1L << PAR_IZQ) | (1L << LEN) | (1L << COR_IZQ) | (1L << MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << ID) | (1L << IDSTRING) | (1L << STRING))) != 0)) {
					{
					setState(235);
					expr(0);
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(236);
						match(COMMA);
						setState(237);
						expr(0);
						}
						}
						setState(242);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(245);
				match(COR_DER);
				}
				break;
			case 4:
				{
				setState(246);
				match(PAR_IZQ);
				setState(247);
				expr(0);
				setState(248);
				match(PAR_DER);
				}
				break;
			case 5:
				{
				setState(250);
				match(ID);
				setState(251);
				match(PAR_IZQ);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << INPUT) | (1L << PAR_IZQ) | (1L << LEN) | (1L << COR_IZQ) | (1L << MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << ID) | (1L << IDSTRING) | (1L << STRING))) != 0)) {
					{
					setState(252);
					expr(0);
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(253);
						match(COMMA);
						setState(254);
						expr(0);
						}
						}
						setState(259);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(262);
				match(PAR_DER);
				}
				break;
			case 6:
				{
				setState(263);
				match(MENOS);
				setState(264);
				cexpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(267);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(268);
						bin_op();
						setState(269);
						cexpr(3);
						}
						break;
					case 2:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(271);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(272);
						match(PUNTO);
						setState(273);
						match(ID);
						}
						break;
					case 3:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(274);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(275);
						match(PUNTO);
						setState(276);
						match(ID);
						setState(277);
						match(PAR_IZQ);
						setState(286);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << INPUT) | (1L << PAR_IZQ) | (1L << LEN) | (1L << COR_IZQ) | (1L << MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << ID) | (1L << IDSTRING) | (1L << STRING))) != 0)) {
							{
							setState(278);
							expr(0);
							setState(283);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(279);
								match(COMMA);
								setState(280);
								expr(0);
								}
								}
								setState(285);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(288);
						match(PAR_DER);
						}
						break;
					case 4:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(289);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(290);
						match(COR_IZQ);
						setState(291);
						expr(0);
						setState(292);
						match(COR_DER);
						}
						break;
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Bin_opContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(ChocopyParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(ChocopyParser.MENOS, 0); }
		public TerminalNode MULTIPLICA() { return getToken(ChocopyParser.MULTIPLICA, 0); }
		public TerminalNode DIV_ENTERA() { return getToken(ChocopyParser.DIV_ENTERA, 0); }
		public TerminalNode MODULO() { return getToken(ChocopyParser.MODULO, 0); }
		public TerminalNode DOBLE_IGUAL() { return getToken(ChocopyParser.DOBLE_IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(ChocopyParser.DIFERENTE, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(ChocopyParser.MENOR_IGUAL, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(ChocopyParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(ChocopyParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(ChocopyParser.MAYOR, 0); }
		public TerminalNode IS() { return getToken(ChocopyParser.IS, 0); }
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocopyListener ) ((ChocopyListener)listener).exitBin_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocopyVisitor ) return ((ChocopyVisitor<? extends T>)visitor).visitBin_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bin_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << DOBLE_IGUAL) | (1L << MAS) | (1L << MULTIPLICA) | (1L << DIV_ENTERA) | (1L << MODULO) | (1L << DIFERENTE) | (1L << MENOR_IGUAL) | (1L << MAYOR_IGUAL) | (1L << MENOR) | (1L << MAYOR) | (1L << IS))) != 0)) ) {
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
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
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
		enterRule(_localctx, 34, RULE_target);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				cexpr(0);
				setState(303);
				match(PUNTO);
				setState(304);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				cexpr(0);
				setState(307);
				match(COR_IZQ);
				setState(308);
				expr(0);
				setState(309);
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
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 15:
			return cexpr_sempred((CexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean cexpr_sempred(CexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u013c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6"+
		"\4D\n\4\r\4\16\4E\5\4H\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5P\n\5\f\5\16\5S"+
		"\13\5\5\5U\n\5\3\5\3\5\3\5\5\5Z\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\7\6f\n\6\f\6\16\6i\13\6\3\6\6\6l\n\6\r\6\16\6m\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bz\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u0095\n\f\f\f\16\f\u0098\13\f\3\f\3\f\3\f\5\f\u009d\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ab\n\f\3\r\3\r\3\r\3\r\5\r"+
		"\u00b1\n\r\3\r\3\r\3\r\6\r\u00b6\n\r\r\r\16\r\u00b7\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00c1\n\r\3\16\3\16\3\16\6\16\u00c6\n\16\r\16\16\16\u00c7"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00da\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00e5\n\20\f\20\16\20\u00e8\13\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u00f1\n\21\f\21\16\21\u00f4\13\21\5\21\u00f6\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0102\n\21\f\21\16\21\u0105"+
		"\13\21\5\21\u0107\n\21\3\21\3\21\3\21\5\21\u010c\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u011c\n\21"+
		"\f\21\16\21\u011f\13\21\5\21\u0121\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u0129\n\21\f\21\16\21\u012c\13\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u013a\n\23\3\23\2\4\36 \24\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\4\2*-/\60\3\2\4\5\5\2\21\21\31"+
		"\31 )\2\u015c\2+\3\2\2\2\4\64\3\2\2\2\6G\3\2\2\2\bI\3\2\2\2\ng\3\2\2\2"+
		"\fo\3\2\2\2\16y\3\2\2\2\20{\3\2\2\2\22\177\3\2\2\2\24\u0083\3\2\2\2\26"+
		"\u00aa\3\2\2\2\30\u00c0\3\2\2\2\32\u00c2\3\2\2\2\34\u00cb\3\2\2\2\36\u00d9"+
		"\3\2\2\2 \u010b\3\2\2\2\"\u012d\3\2\2\2$\u0139\3\2\2\2&*\5\24\13\2\'*"+
		"\5\b\5\2(*\5\4\3\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2"+
		"+,\3\2\2\2,\61\3\2\2\2-+\3\2\2\2.\60\5\26\f\2/.\3\2\2\2\60\63\3\2\2\2"+
		"\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\64\65\7\22\2\2\65"+
		"\66\7.\2\2\66\67\7\n\2\2\678\7.\2\289\7\13\2\29:\7\23\2\2:;\7\63\2\2;"+
		"<\7\64\2\2<=\5\6\4\2=>\7\65\2\2>\5\3\2\2\2?@\7\24\2\2@H\7\63\2\2AD\5\24"+
		"\13\2BD\5\b\5\2CA\3\2\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3"+
		"\2\2\2G?\3\2\2\2GC\3\2\2\2H\7\3\2\2\2IJ\7\25\2\2JK\7.\2\2KT\7\n\2\2LQ"+
		"\5\f\7\2MN\7\r\2\2NP\5\f\7\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R"+
		"U\3\2\2\2SQ\3\2\2\2TL\3\2\2\2TU\3\2\2\2UV\3\2\2\2VY\7\13\2\2WX\7\26\2"+
		"\2XZ\5\16\b\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\23\2\2\\]\7\63\2\2]^"+
		"\7\64\2\2^_\5\n\6\2_`\7\65\2\2`\t\3\2\2\2af\5\20\t\2bf\5\22\n\2cf\5\24"+
		"\13\2df\5\b\5\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2fi\3\2\2\2ge\3"+
		"\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jl\5\26\f\2kj\3\2\2\2lm\3\2\2\2mk"+
		"\3\2\2\2mn\3\2\2\2n\13\3\2\2\2op\7.\2\2pq\7\23\2\2qr\5\16\b\2r\r\3\2\2"+
		"\2sz\7.\2\2tz\7/\2\2uv\7\16\2\2vw\5\16\b\2wx\7\17\2\2xz\3\2\2\2ys\3\2"+
		"\2\2yt\3\2\2\2yu\3\2\2\2z\17\3\2\2\2{|\7\27\2\2|}\7.\2\2}~\7\63\2\2~\21"+
		"\3\2\2\2\177\u0080\7\30\2\2\u0080\u0081\7.\2\2\u0081\u0082\7\63\2\2\u0082"+
		"\23\3\2\2\2\u0083\u0084\5\f\7\2\u0084\u0085\7\32\2\2\u0085\u0086\5\34"+
		"\17\2\u0086\u0087\7\63\2\2\u0087\25\3\2\2\2\u0088\u0089\5\30\r\2\u0089"+
		"\u008a\7\63\2\2\u008a\u00ab\3\2\2\2\u008b\u008c\7\6\2\2\u008c\u008d\5"+
		"\36\20\2\u008d\u008e\7\23\2\2\u008e\u0096\5\32\16\2\u008f\u0090\7\7\2"+
		"\2\u0090\u0091\5\36\20\2\u0091\u0092\7\23\2\2\u0092\u0093\5\32\16\2\u0093"+
		"\u0095\3\2\2\2\u0094\u008f\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u009c\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\7\b\2\2\u009a\u009b\7\23\2\2\u009b\u009d\5\32\16\2\u009c\u0099"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00ab\3\2\2\2\u009e\u009f\7\33\2\2"+
		"\u009f\u00a0\5\36\20\2\u00a0\u00a1\7\23\2\2\u00a1\u00a2\5\32\16\2\u00a2"+
		"\u00ab\3\2\2\2\u00a3\u00a4\7\34\2\2\u00a4\u00a5\7.\2\2\u00a5\u00a6\7\35"+
		"\2\2\u00a6\u00a7\5\36\20\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9\5\32\16\2"+
		"\u00a9\u00ab\3\2\2\2\u00aa\u0088\3\2\2\2\u00aa\u008b\3\2\2\2\u00aa\u009e"+
		"\3\2\2\2\u00aa\u00a3\3\2\2\2\u00ab\27\3\2\2\2\u00ac\u00c1\7\24\2\2\u00ad"+
		"\u00c1\5\36\20\2\u00ae\u00b0\7\36\2\2\u00af\u00b1\5\36\20\2\u00b0\u00af"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00c1\3\2\2\2\u00b2\u00b3\5$\23\2\u00b3"+
		"\u00b4\7\32\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6\u00b7\3"+
		"\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\5\36\20\2\u00ba\u00c1\3\2\2\2\u00bb\u00bc\7\37\2\2\u00bc\u00bd"+
		"\7\n\2\2\u00bd\u00be\5\36\20\2\u00be\u00bf\7\13\2\2\u00bf\u00c1\3\2\2"+
		"\2\u00c0\u00ac\3\2\2\2\u00c0\u00ad\3\2\2\2\u00c0\u00ae\3\2\2\2\u00c0\u00b5"+
		"\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c1\31\3\2\2\2\u00c2\u00c3\7\63\2\2\u00c3"+
		"\u00c5\7\64\2\2\u00c4\u00c6\5\26\f\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\7\65\2\2\u00ca\33\3\2\2\2\u00cb\u00cc\t\2\2\2\u00cc\35\3\2\2\2"+
		"\u00cd\u00ce\b\20\1\2\u00ce\u00da\5 \21\2\u00cf\u00d0\7\3\2\2\u00d0\u00da"+
		"\5\36\20\7\u00d1\u00d2\7\f\2\2\u00d2\u00d3\7\n\2\2\u00d3\u00d4\5\36\20"+
		"\2\u00d4\u00d5\7\13\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d7\7\t\2\2\u00d7"+
		"\u00d8\7\n\2\2\u00d8\u00da\7\13\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00cf\3"+
		"\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\u00e6\3\2\2\2\u00db"+
		"\u00dc\f\6\2\2\u00dc\u00dd\t\3\2\2\u00dd\u00e5\5\36\20\7\u00de\u00df\f"+
		"\5\2\2\u00df\u00e0\7\6\2\2\u00e0\u00e1\5\36\20\2\u00e1\u00e2\7\b\2\2\u00e2"+
		"\u00e3\5\36\20\6\u00e3\u00e5\3\2\2\2\u00e4\u00db\3\2\2\2\u00e4\u00de\3"+
		"\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\37\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\b\21\1\2\u00ea\u010c\7.\2"+
		"\2\u00eb\u010c\5\34\17\2\u00ec\u00f5\7\16\2\2\u00ed\u00f2\5\36\20\2\u00ee"+
		"\u00ef\7\r\2\2\u00ef\u00f1\5\36\20\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3"+
		"\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u010c\7\17\2\2\u00f8\u00f9\7\n\2\2\u00f9\u00fa\5\36\20\2\u00fa"+
		"\u00fb\7\13\2\2\u00fb\u010c\3\2\2\2\u00fc\u00fd\7.\2\2\u00fd\u0106\7\n"+
		"\2\2\u00fe\u0103\5\36\20\2\u00ff\u0100\7\r\2\2\u0100\u0102\5\36\20\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u00fe\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010c\7\13\2\2\u0109\u010a\7"+
		"\21\2\2\u010a\u010c\5 \21\3\u010b\u00e9\3\2\2\2\u010b\u00eb\3\2\2\2\u010b"+
		"\u00ec\3\2\2\2\u010b\u00f8\3\2\2\2\u010b\u00fc\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u012a\3\2\2\2\u010d\u010e\f\4\2\2\u010e\u010f\5\"\22\2\u010f"+
		"\u0110\5 \21\5\u0110\u0129\3\2\2\2\u0111\u0112\f\b\2\2\u0112\u0113\7\20"+
		"\2\2\u0113\u0129\7.\2\2\u0114\u0115\f\7\2\2\u0115\u0116\7\20\2\2\u0116"+
		"\u0117\7.\2\2\u0117\u0120\7\n\2\2\u0118\u011d\5\36\20\2\u0119\u011a\7"+
		"\r\2\2\u011a\u011c\5\36\20\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u0120\u0118\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0129\7\13\2\2\u0123\u0124\f\6\2\2\u0124\u0125\7\16\2\2\u0125\u0126\5"+
		"\36\20\2\u0126\u0127\7\17\2\2\u0127\u0129\3\2\2\2\u0128\u010d\3\2\2\2"+
		"\u0128\u0111\3\2\2\2\u0128\u0114\3\2\2\2\u0128\u0123\3\2\2\2\u0129\u012c"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b!\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012d\u012e\t\4\2\2\u012e#\3\2\2\2\u012f\u013a\7.\2\2\u0130"+
		"\u0131\5 \21\2\u0131\u0132\7\20\2\2\u0132\u0133\7.\2\2\u0133\u013a\3\2"+
		"\2\2\u0134\u0135\5 \21\2\u0135\u0136\7\16\2\2\u0136\u0137\5\36\20\2\u0137"+
		"\u0138\7\17\2\2\u0138\u013a\3\2\2\2\u0139\u012f\3\2\2\2\u0139\u0130\3"+
		"\2\2\2\u0139\u0134\3\2\2\2\u013a%\3\2\2\2#)+\61CEGQTYegmy\u0096\u009c"+
		"\u00aa\u00b0\u00b7\u00c0\u00c7\u00d9\u00e4\u00e6\u00f2\u00f5\u0103\u0106"+
		"\u010b\u011d\u0120\u0128\u012a\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}