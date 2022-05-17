// Generated from D:/Documents/GitHub/DSL-language2/src\DSLLexer.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PAGE=1, IF_ID=2, AND_OP_ID=3, OR_OP_ID=4, PRINT_ACTION=5, NEWLINE=6, WHITE_SPACE=7, 
		SINGLE_QUOTE=8, ASSIGN=9, OPEN_SQR_BRACKT_ID=10, CLOSE_SQR_BRACKT_ID=11, 
		OPEN_PAR_BRACKT_ID=12, CLOSE_PAR_BRACKT_ID=13, VAR_NAME_ID=14, FILE_NAME_ID=15, 
		TEXT=16, TEXTNUM=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PAGE", "IF_ID", "AND_OP_ID", "OR_OP_ID", "PRINT_ACTION", "NEWLINE", 
			"WHITE_SPACE", "SINGLE_QUOTE", "ASSIGN", "OPEN_SQR_BRACKT_ID", "CLOSE_SQR_BRACKT_ID", 
			"OPEN_PAR_BRACKT_ID", "CLOSE_PAR_BRACKT_ID", "VAR_NAME_ID", "FILE_NAME_ID", 
			"TEXT", "TEXTNUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Page'", "'if'", "'AND'", "'OR'", "'print'", "'\n'", null, "'''", 
			"'='", "'['", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAGE", "IF_ID", "AND_OP_ID", "OR_OP_ID", "PRINT_ACTION", "NEWLINE", 
			"WHITE_SPACE", "SINGLE_QUOTE", "ASSIGN", "OPEN_SQR_BRACKT_ID", "CLOSE_SQR_BRACKT_ID", 
			"OPEN_PAR_BRACKT_ID", "CLOSE_PAR_BRACKT_ID", "VAR_NAME_ID", "FILE_NAME_ID", 
			"TEXT", "TEXTNUM"
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


	public DSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DSLLexer.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\6\17M\n\17\r\17\16\17N\3\17\7\17R\n\17\f"+
		"\17\16\17U\13\17\3\20\6\20X\n\20\r\20\16\20Y\3\20\7\20]\n\20\f\20\16\20"+
		"`\13\20\3\20\6\20c\n\20\r\20\16\20d\3\20\6\20h\n\20\r\20\16\20i\5\20l"+
		"\n\20\3\21\3\21\6\21p\n\21\r\21\16\21q\3\21\6\21u\n\21\r\21\16\21v\6\21"+
		"y\n\21\r\21\16\21z\3\21\7\21~\n\21\f\21\16\21\u0081\13\21\6\21\u0083\n"+
		"\21\r\21\16\21\u0084\3\21\3\21\3\22\6\22\u008a\n\22\r\22\16\22\u008b\2"+
		"\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23\3\2\5\5\2\13\13\17\17\"\"\4\2C\\c|\3\2\63;\2\u009a\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\3%\3\2\2\2\5*\3\2\2\2\7-\3\2\2\2\t\61\3\2\2\2\13\64\3\2\2\2\r:\3\2"+
		"\2\2\17<\3\2\2\2\21>\3\2\2\2\23@\3\2\2\2\25B\3\2\2\2\27D\3\2\2\2\31F\3"+
		"\2\2\2\33H\3\2\2\2\35J\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#\u0089\3\2\2\2%&"+
		"\7R\2\2&\'\7c\2\2\'(\7i\2\2()\7g\2\2)\4\3\2\2\2*+\7k\2\2+,\7h\2\2,\6\3"+
		"\2\2\2-.\7C\2\2./\7P\2\2/\60\7F\2\2\60\b\3\2\2\2\61\62\7Q\2\2\62\63\7"+
		"T\2\2\63\n\3\2\2\2\64\65\7r\2\2\65\66\7t\2\2\66\67\7k\2\2\678\7p\2\28"+
		"9\7v\2\29\f\3\2\2\2:;\7\f\2\2;\16\3\2\2\2<=\t\2\2\2=\20\3\2\2\2>?\7)\2"+
		"\2?\22\3\2\2\2@A\7?\2\2A\24\3\2\2\2BC\7]\2\2C\26\3\2\2\2DE\7_\2\2E\30"+
		"\3\2\2\2FG\7*\2\2G\32\3\2\2\2HI\7+\2\2I\34\3\2\2\2JL\7a\2\2KM\t\3\2\2"+
		"LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OS\3\2\2\2PR\t\4\2\2QP\3\2\2\2"+
		"RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\36\3\2\2\2US\3\2\2\2VX\t\3\2\2WV\3\2\2"+
		"\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z^\3\2\2\2[]\t\4\2\2\\[\3\2\2\2]`\3\2"+
		"\2\2^\\\3\2\2\2^_\3\2\2\2_l\3\2\2\2`^\3\2\2\2ac\t\3\2\2ba\3\2\2\2cd\3"+
		"\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\t\4\2\2gf\3\2\2\2hi\3\2\2\2ig\3"+
		"\2\2\2ij\3\2\2\2jl\3\2\2\2kW\3\2\2\2kb\3\2\2\2l \3\2\2\2m\u0082\5\21\t"+
		"\2np\t\3\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2ry\3\2\2\2su\t\4\2"+
		"\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xo\3\2\2\2xt\3\2\2"+
		"\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\177\3\2\2\2|~\5\17\b\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082x\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\5\21\t\2\u0087\"\3\2\2"+
		"\2\u0088\u008a\t\4\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c$\3\2\2\2\21\2NSY^dikqvxz\177\u0084"+
		"\u008b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}