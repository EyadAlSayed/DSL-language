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
		PAGE=1, IF_ID=2, AND_OP_ID=3, OR_OP_ID=4, PRINT_ACTION=5, RADIO_GROUP_ID=6, 
		BUTTON_ID=7, FORM_ID=8, NEWLINE=9, WHITE_SPACE=10, SINGLE_QUOTE=11, ASSIGN=12, 
		OPEN_SQR_BRACKT_ID=13, CLOSE_SQR_BRACKT_ID=14, OPEN_PAR_BRACKT_ID=15, 
		CLOSE_PAR_BRACKT_ID=16, COMMA=17, VAR_NAME_ID=18, FILE_NAME_ID=19, TEXT=20, 
		TEXTNUM=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PAGE", "IF_ID", "AND_OP_ID", "OR_OP_ID", "PRINT_ACTION", "RADIO_GROUP_ID", 
			"BUTTON_ID", "FORM_ID", "NEWLINE", "WHITE_SPACE", "SINGLE_QUOTE", "ASSIGN", 
			"OPEN_SQR_BRACKT_ID", "CLOSE_SQR_BRACKT_ID", "OPEN_PAR_BRACKT_ID", "CLOSE_PAR_BRACKT_ID", 
			"COMMA", "VAR_NAME_ID", "FILE_NAME_ID", "TEXT", "TEXTNUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Page'", "'if'", "'AND'", "'OR'", "'print'", "'Radiogroup'", "'Button'", 
			"'Form'", "'\n'", null, "'''", "'='", "'['", "']'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAGE", "IF_ID", "AND_OP_ID", "OR_OP_ID", "PRINT_ACTION", "RADIO_GROUP_ID", 
			"BUTTON_ID", "FORM_ID", "NEWLINE", "WHITE_SPACE", "SINGLE_QUOTE", "ASSIGN", 
			"OPEN_SQR_BRACKT_ID", "CLOSE_SQR_BRACKT_ID", "OPEN_PAR_BRACKT_ID", "CLOSE_PAR_BRACKT_ID", 
			"COMMA", "VAR_NAME_ID", "FILE_NAME_ID", "TEXT", "TEXTNUM"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\6\23n\n\23\r\23\16\23o\3\23\7\23s"+
		"\n\23\f\23\16\23v\13\23\3\24\6\24y\n\24\r\24\16\24z\3\24\7\24~\n\24\f"+
		"\24\16\24\u0081\13\24\3\24\6\24\u0084\n\24\r\24\16\24\u0085\3\24\6\24"+
		"\u0089\n\24\r\24\16\24\u008a\5\24\u008d\n\24\3\25\3\25\6\25\u0091\n\25"+
		"\r\25\16\25\u0092\3\25\6\25\u0096\n\25\r\25\16\25\u0097\6\25\u009a\n\25"+
		"\r\25\16\25\u009b\3\25\7\25\u009f\n\25\f\25\16\25\u00a2\13\25\6\25\u00a4"+
		"\n\25\r\25\16\25\u00a5\3\25\3\25\3\26\6\26\u00ab\n\26\r\26\16\26\u00ac"+
		"\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\5\5\2\13\13\17\17\"\"\4\2C\\"+
		"c|\3\2\63;\2\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3"+
		"\2\2\2\5\62\3\2\2\2\7\65\3\2\2\2\t9\3\2\2\2\13<\3\2\2\2\rB\3\2\2\2\17"+
		"M\3\2\2\2\21T\3\2\2\2\23Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2"+
		"\33a\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#i\3\2\2\2%k\3\2\2\2\'\u008c"+
		"\3\2\2\2)\u008e\3\2\2\2+\u00aa\3\2\2\2-.\7R\2\2./\7c\2\2/\60\7i\2\2\60"+
		"\61\7g\2\2\61\4\3\2\2\2\62\63\7k\2\2\63\64\7h\2\2\64\6\3\2\2\2\65\66\7"+
		"C\2\2\66\67\7P\2\2\678\7F\2\28\b\3\2\2\29:\7Q\2\2:;\7T\2\2;\n\3\2\2\2"+
		"<=\7r\2\2=>\7t\2\2>?\7k\2\2?@\7p\2\2@A\7v\2\2A\f\3\2\2\2BC\7T\2\2CD\7"+
		"c\2\2DE\7f\2\2EF\7k\2\2FG\7q\2\2GH\7i\2\2HI\7t\2\2IJ\7q\2\2JK\7w\2\2K"+
		"L\7r\2\2L\16\3\2\2\2MN\7D\2\2NO\7w\2\2OP\7v\2\2PQ\7v\2\2QR\7q\2\2RS\7"+
		"p\2\2S\20\3\2\2\2TU\7H\2\2UV\7q\2\2VW\7t\2\2WX\7o\2\2X\22\3\2\2\2YZ\7"+
		"\f\2\2Z\24\3\2\2\2[\\\t\2\2\2\\\26\3\2\2\2]^\7)\2\2^\30\3\2\2\2_`\7?\2"+
		"\2`\32\3\2\2\2ab\7]\2\2b\34\3\2\2\2cd\7_\2\2d\36\3\2\2\2ef\7*\2\2f \3"+
		"\2\2\2gh\7+\2\2h\"\3\2\2\2ij\7.\2\2j$\3\2\2\2km\7a\2\2ln\t\3\2\2ml\3\2"+
		"\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pt\3\2\2\2qs\t\4\2\2rq\3\2\2\2sv\3\2"+
		"\2\2tr\3\2\2\2tu\3\2\2\2u&\3\2\2\2vt\3\2\2\2wy\t\3\2\2xw\3\2\2\2yz\3\2"+
		"\2\2zx\3\2\2\2z{\3\2\2\2{\177\3\2\2\2|~\t\4\2\2}|\3\2\2\2~\u0081\3\2\2"+
		"\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u008d\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082\u0084\t\3\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\t\4\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008cx\3\2\2\2\u008c\u0083\3\2\2\2\u008d(\3\2"+
		"\2\2\u008e\u00a3\5\27\f\2\u008f\u0091\t\3\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u009a\3\2"+
		"\2\2\u0094\u0096\t\4\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0090\3\2"+
		"\2\2\u0099\u0095\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u00a0\3\2\2\2\u009d\u009f\5\25\13\2\u009e\u009d\3"+
		"\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u0099\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\5\27\f\2\u00a8*\3\2\2\2\u00a9\u00ab\t\4\2\2\u00aa\u00a9\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad,\3"+
		"\2\2\2\21\2otz\177\u0085\u008a\u008c\u0092\u0097\u0099\u009b\u00a0\u00a5"+
		"\u00ac\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}