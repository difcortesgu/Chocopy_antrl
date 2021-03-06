// Generated from C:/Users/diego/Documents/Lenguajes/Chocopy_antrl/grammar\Chocopy.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChocopyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, NOT=29, AND=30, OR=31, IF=32, 
		ELSE=33, INPUT=34, PAR_IZQ=35, PAR_DER=36, LEN=37, COMMA=38, COR_IZQ=39, 
		COR_DER=40, PUNTO=41, MENOS=42, INTEGER=43, ID=44, IDSTRING=45, STRING=46, 
		LINE_COMMENT=47, SKIP_=48, NEWLINE=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "NOT", "AND", "OR", "IF", "ELSE", "INPUT", 
			"PAR_IZQ", "PAR_DER", "LEN", "COMMA", "COR_IZQ", "COR_DER", "PUNTO", 
			"MENOS", "INTEGER", "ID", "IDSTRING", "STRING", "LINE_COMMENT", "SPACES", 
			"COMMENT", "LINE_JOINING", "SKIP_", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "':'", "'pass'", "'def'", "'->'", "'global'", "'nonlocal'", 
			"'='", "'elif'", "'while'", "'for'", "'in'", "'return'", "'print'", "'None'", 
			"'True'", "'False'", "'+'", "'*'", "'//'", "'%'", "'=='", "'!='", "'<='", 
			"'>='", "'<'", "'>'", "'is'", "'not'", "'and'", "'or'", "'if'", "'else'", 
			"'input'", "'('", "')'", "'len'", "','", "'['", "']'", "'.'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "NOT", "AND", "OR", "IF", "ELSE", "INPUT", 
			"PAR_IZQ", "PAR_DER", "LEN", "COMMA", "COR_IZQ", "COR_DER", "PUNTO", 
			"MENOS", "INTEGER", "ID", "IDSTRING", "STRING", "LINE_COMMENT", "SKIP_", 
			"NEWLINE"
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


	  // A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
	  private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	  // The stack that keeps track of the indentation level.
	  private java.util.Stack<Integer> indents = new java.util.Stack<>();
	  // The amount of opened braces, brackets and parenthesis.
	  private int opened = 0;
	  // The most recently produced token.
	  private Token lastToken = null;
	  @Override
	  public void emit(Token t) {
	    super.setToken(t);
	    tokens.offer(t);
	  }

	  @Override
	  public Token nextToken() {
	    // Check if the end-of-file is ahead and there are still some DEDENTS expected.
	    if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
	      // Remove any trailing EOF tokens from our buffer.
	      for (int i = tokens.size() - 1; i >= 0; i--) {
	        if (tokens.get(i).getType() == EOF) {
	          tokens.remove(i);
	        }
	      }

	      // First emit an extra line break that serves as the end of the statement.
	      this.emit(commonToken(ChocopyParser.NEWLINE, "\n"));

	      // Now emit as much DEDENT tokens as needed.
	      while (!indents.isEmpty()) {
	        this.emit(createDedent());
	        indents.pop();
	      }

	      // Put the EOF back on the token stream.
	      this.emit(commonToken(ChocopyParser.EOF, "<EOF>"));
	    }

	    Token next = super.nextToken();

	    if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	      // Keep track of the last token on the default channel.
	      this.lastToken = next;
	    }
	    return tokens.isEmpty() ? next : tokens.poll();
	  }

	  private Token createDedent() {
	    CommonToken dedent = commonToken(ChocopyParser.DEDENT, "");
	    dedent.setLine(this.lastToken.getLine());
	    return dedent;
	  }

	  private CommonToken commonToken(int type, String text) {
	    int stop = this.getCharIndex() - 1;
	    int start = text.isEmpty() ? stop : stop - text.length() + 1;
	    return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	  }

	  // Calculates the indentation of the provided spaces, taking the
	  // following rules into account:
	  //
	  // "Tabs are replaced (from left to right) by one to eight spaces
	  //  such that the total number of characters up to and including
	  //  the replacement is a multiple of eight [...]"
	  //
	  //  -- https://docs.python.org/3.1/reference/lexical_analysis.html#indentation
	  static int getIndentationCount(String spaces) {
	    int count = 0;
	    for (char ch : spaces.toCharArray()) {
	      switch (ch) {
	        case '\t':
	          count += 8 - (count % 8);
	          break;
	        default:
	          // A normal space char.
	          count++;
	      }
	    }

	    return count;
	  }

	  boolean atStartOfInput() {
	    return super.getCharPositionInLine() == 0 && super.getLine() == 1;
	  }


	public ChocopyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Chocopy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 51:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			     String newLine = getText().replaceAll("[^\r\n\f]+", "");
			     String spaces = getText().replaceAll("[\r\n\f]+", "");

			     // Strip newlines inside open clauses except if we are near EOF. We keep NEWLINEs near EOF to
			     // satisfy the final newline needed by the single_put rule used by the REPL.
			     int next = _input.LA(1);
			     int nextnext = _input.LA(2);
			     if (opened > 0 || (nextnext != -1 && (next == '\r' || next == '\n' || next == '\f' || next == '#'))) {
			       // If we're inside a list or on a blank line, ignore all indents,
			       // dedents and line breaks.
			       skip();
			     }
			     else {
			       emit(commonToken(NEWLINE, newLine));
			       int indent = getIndentationCount(spaces);
			       int previous = indents.isEmpty() ? 0 : indents.peek();
			       if (indent == previous) {
			         // skip indents of the same size as the present indent-size
			         skip();
			       }
			       else if (indent > previous) {
			         indents.push(indent);
			         emit(commonToken(ChocopyParser.INDENT, spaces));
			       }
			       else {
			         // Possibly emit more than 1 DEDENT token.
			         while(!indents.isEmpty() && indents.peek() > indent) {
			           this.emit(createDedent());
			           indents.pop();
			         }
			       }
			     }
			   
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 51:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0162\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\7,\u010a\n"+
		",\f,\16,\u010d\13,\3,\5,\u0110\n,\3-\3-\7-\u0114\n-\f-\16-\u0117\13-\3"+
		".\3.\3.\7.\u011c\n.\f.\16.\u011f\13.\3.\3.\3/\3/\7/\u0125\n/\f/\16/\u0128"+
		"\13/\3/\3/\3\60\3\60\7\60\u012e\n\60\f\60\16\60\u0131\13\60\3\60\3\60"+
		"\3\61\6\61\u0136\n\61\r\61\16\61\u0137\3\62\3\62\7\62\u013c\n\62\f\62"+
		"\16\62\u013f\13\62\3\63\3\63\5\63\u0143\n\63\3\63\5\63\u0146\n\63\3\63"+
		"\3\63\5\63\u014a\n\63\3\64\3\64\3\64\5\64\u014f\n\64\3\64\3\64\3\65\3"+
		"\65\3\65\5\65\u0156\n\65\3\65\3\65\5\65\u015a\n\65\3\65\5\65\u015d\n\65"+
		"\5\65\u015f\n\65\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\2c\2e\2g\62i\63\3\2\t\3\2\63;\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\4"+
		"\2\f\f\17\17\4\2\13\13\"\"\4\2\f\f\16\17\2\u016f\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3"+
		"\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tx\3\2\2\2\13|\3\2\2\2\r\177\3\2\2\2\17\u0086"+
		"\3\2\2\2\21\u008f\3\2\2\2\23\u0091\3\2\2\2\25\u0096\3\2\2\2\27\u009c\3"+
		"\2\2\2\31\u00a0\3\2\2\2\33\u00a3\3\2\2\2\35\u00aa\3\2\2\2\37\u00b0\3\2"+
		"\2\2!\u00b5\3\2\2\2#\u00ba\3\2\2\2%\u00c0\3\2\2\2\'\u00c2\3\2\2\2)\u00c4"+
		"\3\2\2\2+\u00c7\3\2\2\2-\u00c9\3\2\2\2/\u00cc\3\2\2\2\61\u00cf\3\2\2\2"+
		"\63\u00d2\3\2\2\2\65\u00d5\3\2\2\2\67\u00d7\3\2\2\29\u00d9\3\2\2\2;\u00dc"+
		"\3\2\2\2=\u00e0\3\2\2\2?\u00e4\3\2\2\2A\u00e7\3\2\2\2C\u00ea\3\2\2\2E"+
		"\u00ef\3\2\2\2G\u00f5\3\2\2\2I\u00f7\3\2\2\2K\u00f9\3\2\2\2M\u00fd\3\2"+
		"\2\2O\u00ff\3\2\2\2Q\u0101\3\2\2\2S\u0103\3\2\2\2U\u0105\3\2\2\2W\u010f"+
		"\3\2\2\2Y\u0111\3\2\2\2[\u0118\3\2\2\2]\u0122\3\2\2\2_\u012b\3\2\2\2a"+
		"\u0135\3\2\2\2c\u0139\3\2\2\2e\u0140\3\2\2\2g\u014e\3\2\2\2i\u015e\3\2"+
		"\2\2kl\7e\2\2lm\7n\2\2mn\7c\2\2no\7u\2\2op\7u\2\2p\4\3\2\2\2qr\7<\2\2"+
		"r\6\3\2\2\2st\7r\2\2tu\7c\2\2uv\7u\2\2vw\7u\2\2w\b\3\2\2\2xy\7f\2\2yz"+
		"\7g\2\2z{\7h\2\2{\n\3\2\2\2|}\7/\2\2}~\7@\2\2~\f\3\2\2\2\177\u0080\7i"+
		"\2\2\u0080\u0081\7n\2\2\u0081\u0082\7q\2\2\u0082\u0083\7d\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7n\2\2\u0085\16\3\2\2\2\u0086\u0087\7p\2\2\u0087\u0088"+
		"\7q\2\2\u0088\u0089\7p\2\2\u0089\u008a\7n\2\2\u008a\u008b\7q\2\2\u008b"+
		"\u008c\7e\2\2\u008c\u008d\7c\2\2\u008d\u008e\7n\2\2\u008e\20\3\2\2\2\u008f"+
		"\u0090\7?\2\2\u0090\22\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7n\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7h\2\2\u0095\24\3\2\2\2\u0096\u0097\7y\2\2\u0097"+
		"\u0098\7j\2\2\u0098\u0099\7k\2\2\u0099\u009a\7n\2\2\u009a\u009b\7g\2\2"+
		"\u009b\26\3\2\2\2\u009c\u009d\7h\2\2\u009d\u009e\7q\2\2\u009e\u009f\7"+
		"t\2\2\u009f\30\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\32"+
		"\3\2\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"\u00a7\7w\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7p\2\2\u00a9\34\3\2\2\2\u00aa"+
		"\u00ab\7r\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\u00af\7v\2\2\u00af\36\3\2\2\2\u00b0\u00b1\7P\2\2\u00b1\u00b2\7"+
		"q\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7g\2\2\u00b4 \3\2\2\2\u00b5\u00b6"+
		"\7V\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		"\"\3\2\2\2\u00ba\u00bb\7H\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7n\2\2\u00bd"+
		"\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf$\3\2\2\2\u00c0\u00c1\7-\2\2\u00c1"+
		"&\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3(\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5"+
		"\u00c6\7\61\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7\'\2\2\u00c8,\3\2\2\2\u00c9"+
		"\u00ca\7?\2\2\u00ca\u00cb\7?\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7#\2\2\u00cd"+
		"\u00ce\7?\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7>\2\2\u00d0\u00d1\7?\2\2\u00d1"+
		"\62\3\2\2\2\u00d2\u00d3\7@\2\2\u00d3\u00d4\7?\2\2\u00d4\64\3\2\2\2\u00d5"+
		"\u00d6\7>\2\2\u00d6\66\3\2\2\2\u00d7\u00d8\7@\2\2\u00d88\3\2\2\2\u00d9"+
		"\u00da\7k\2\2\u00da\u00db\7u\2\2\u00db:\3\2\2\2\u00dc\u00dd\7p\2\2\u00dd"+
		"\u00de\7q\2\2\u00de\u00df\7v\2\2\u00df<\3\2\2\2\u00e0\u00e1\7c\2\2\u00e1"+
		"\u00e2\7p\2\2\u00e2\u00e3\7f\2\2\u00e3>\3\2\2\2\u00e4\u00e5\7q\2\2\u00e5"+
		"\u00e6\7t\2\2\u00e6@\3\2\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7h\2\2\u00e9"+
		"B\3\2\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7u\2\2\u00ed"+
		"\u00ee\7g\2\2\u00eeD\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7p\2\2\u00f1"+
		"\u00f2\7r\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7v\2\2\u00f4F\3\2\2\2\u00f5"+
		"\u00f6\7*\2\2\u00f6H\3\2\2\2\u00f7\u00f8\7+\2\2\u00f8J\3\2\2\2\u00f9\u00fa"+
		"\7n\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7p\2\2\u00fcL\3\2\2\2\u00fd\u00fe"+
		"\7.\2\2\u00feN\3\2\2\2\u00ff\u0100\7]\2\2\u0100P\3\2\2\2\u0101\u0102\7"+
		"_\2\2\u0102R\3\2\2\2\u0103\u0104\7\60\2\2\u0104T\3\2\2\2\u0105\u0106\7"+
		"/\2\2\u0106V\3\2\2\2\u0107\u010b\t\2\2\2\u0108\u010a\t\3\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u0110\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\7\62\2\2\u010f\u0107\3"+
		"\2\2\2\u010f\u010e\3\2\2\2\u0110X\3\2\2\2\u0111\u0115\t\4\2\2\u0112\u0114"+
		"\t\5\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116Z\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7$\2\2\u0119"+
		"\u011d\t\4\2\2\u011a\u011c\t\5\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0121\7$\2\2\u0121\\\3\2\2\2\u0122\u0126\7$\2\2\u0123"+
		"\u0125\t\5\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012a\7$\2\2\u012a^\3\2\2\2\u012b\u012f\7%\2\2\u012c\u012e\n\6\2\2\u012d"+
		"\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\b\60\2\2\u0133"+
		"`\3\2\2\2\u0134\u0136\t\7\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2"+
		"\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138b\3\2\2\2\u0139\u013d\7"+
		"%\2\2\u013a\u013c\n\b\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013ed\3\2\2\2\u013f\u013d\3\2\2\2"+
		"\u0140\u0142\7^\2\2\u0141\u0143\5a\61\2\u0142\u0141\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0149\3\2\2\2\u0144\u0146\7\17\2\2\u0145\u0144\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\7\f\2\2\u0148\u014a"+
		"\4\16\17\2\u0149\u0145\3\2\2\2\u0149\u0148\3\2\2\2\u014af\3\2\2\2\u014b"+
		"\u014f\5a\61\2\u014c\u014f\5c\62\2\u014d\u014f\5e\63\2\u014e\u014b\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\b\64\2\2\u0151h\3\2\2\2\u0152\u0153\6\65\2\2\u0153\u015f\5a\61"+
		"\2\u0154\u0156\7\17\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u015a\7\f\2\2\u0158\u015a\4\16\17\2\u0159\u0155\3"+
		"\2\2\2\u0159\u0158\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u015d\5a\61\2\u015c"+
		"\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u0152\3\2"+
		"\2\2\u015e\u0159\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\b\65\3\2\u0161"+
		"j\3\2\2\2\23\2\u010b\u010f\u0115\u011d\u0126\u012f\u0137\u013d\u0142\u0145"+
		"\u0149\u014e\u0155\u0159\u015c\u015e\4\b\2\2\3\65\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}