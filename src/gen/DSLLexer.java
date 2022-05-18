// Generated from D:/DSL-language/src\DSLLexer.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONTROLLER_DEF=1, CONTROLLER_METHOD=2, OPEN_CURLY_BRACKT_ID=3, CLOSE_CURLY_BRACKT_ID=4, 
		SUM_OP_ID=5, MINUS_OP_ID=6, MULT_OP_ID=7, DIV_OP_ID=8, MOD_OP_ID=9, END_STATMENT_ID=10, 
		PAGE=11, IF_ID=12, AND_OP_ID=13, OR_OP_ID=14, EQUAL_OP_ID=15, PRINT_ACTION=16, 
		NEWLINE=17, WHITE_SPACE=18, SINGLE_QUOTE=19, DOUBLE_QUOTE=20, ASSIGN_OP_ID=21, 
		OPEN_SQR_BRACKT_ID=22, CLOSE_SQR_BRACKT_ID=23, OPEN_PAR_BRACKT_ID=24, 
		CLOSE_PAR_BRACKT_ID=25, VAR_NAME_ID=26, FILE_NAME_ID=27, TEXT=28, TEXTNUM=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONTROLLER_DEF", "CONTROLLER_METHOD", "OPEN_CURLY_BRACKT_ID", "CLOSE_CURLY_BRACKT_ID", 
			"SUM_OP_ID", "MINUS_OP_ID", "MULT_OP_ID", "DIV_OP_ID", "MOD_OP_ID", "END_STATMENT_ID", 
			"PAGE", "IF_ID", "AND_OP_ID", "OR_OP_ID", "EQUAL_OP_ID", "PRINT_ACTION", 
			"NEWLINE", "WHITE_SPACE", "SINGLE_QUOTE", "DOUBLE_QUOTE", "ASSIGN_OP_ID", 
			"OPEN_SQR_BRACKT_ID", "CLOSE_SQR_BRACKT_ID", "OPEN_PAR_BRACKT_ID", "CLOSE_PAR_BRACKT_ID", 
			"VAR_NAME_ID", "FILE_NAME_ID", "TEXT", "TEXTNUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Controller'", "'controls'", "'{'", "'}'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "';'", "'Page'", "'if'", "'AND'", "'OR'", "'EQUAL'", "'print'", 
			"'\n'", null, "'''", "'\"'", "'='", "'['", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONTROLLER_DEF", "CONTROLLER_METHOD", "OPEN_CURLY_BRACKT_ID", 
			"CLOSE_CURLY_BRACKT_ID", "SUM_OP_ID", "MINUS_OP_ID", "MULT_OP_ID", "DIV_OP_ID", 
			"MOD_OP_ID", "END_STATMENT_ID", "PAGE", "IF_ID", "AND_OP_ID", "OR_OP_ID", 
			"EQUAL_OP_ID", "PRINT_ACTION", "NEWLINE", "WHITE_SPACE", "SINGLE_QUOTE", 
			"DOUBLE_QUOTE", "ASSIGN_OP_ID", "OPEN_SQR_BRACKT_ID", "CLOSE_SQR_BRACKT_ID", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00d6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\6\33\u0091\n\33\r\33\16\33\u0092\3\33\7\33\u0096\n\33\f\33"+
		"\16\33\u0099\13\33\3\34\6\34\u009c\n\34\r\34\16\34\u009d\3\34\7\34\u00a1"+
		"\n\34\f\34\16\34\u00a4\13\34\3\34\6\34\u00a7\n\34\r\34\16\34\u00a8\3\34"+
		"\6\34\u00ac\n\34\r\34\16\34\u00ad\5\34\u00b0\n\34\3\35\3\35\5\35\u00b4"+
		"\n\35\3\35\6\35\u00b7\n\35\r\35\16\35\u00b8\3\35\6\35\u00bc\n\35\r\35"+
		"\16\35\u00bd\6\35\u00c0\n\35\r\35\16\35\u00c1\3\35\7\35\u00c5\n\35\f\35"+
		"\16\35\u00c8\13\35\6\35\u00ca\n\35\r\35\16\35\u00cb\3\35\3\35\5\35\u00d0"+
		"\n\35\3\36\6\36\u00d3\n\36\r\36\16\36\u00d4\2\2\37\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\5\5\2\13\13\17"+
		"\17\"\"\4\2C\\c|\3\2\63;\2\u00e5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5H\3\2\2\2\7Q\3\2\2\2"+
		"\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23]\3\2\2\2"+
		"\25_\3\2\2\2\27a\3\2\2\2\31f\3\2\2\2\33i\3\2\2\2\35m\3\2\2\2\37p\3\2\2"+
		"\2!v\3\2\2\2#|\3\2\2\2%~\3\2\2\2\'\u0080\3\2\2\2)\u0082\3\2\2\2+\u0084"+
		"\3\2\2\2-\u0086\3\2\2\2/\u0088\3\2\2\2\61\u008a\3\2\2\2\63\u008c\3\2\2"+
		"\2\65\u008e\3\2\2\2\67\u00af\3\2\2\29\u00b3\3\2\2\2;\u00d2\3\2\2\2=>\7"+
		"E\2\2>?\7q\2\2?@\7p\2\2@A\7v\2\2AB\7t\2\2BC\7q\2\2CD\7n\2\2DE\7n\2\2E"+
		"F\7g\2\2FG\7t\2\2G\4\3\2\2\2HI\7e\2\2IJ\7q\2\2JK\7p\2\2KL\7v\2\2LM\7t"+
		"\2\2MN\7q\2\2NO\7n\2\2OP\7u\2\2P\6\3\2\2\2QR\7}\2\2R\b\3\2\2\2ST\7\177"+
		"\2\2T\n\3\2\2\2UV\7-\2\2V\f\3\2\2\2WX\7/\2\2X\16\3\2\2\2YZ\7,\2\2Z\20"+
		"\3\2\2\2[\\\7\61\2\2\\\22\3\2\2\2]^\7\'\2\2^\24\3\2\2\2_`\7=\2\2`\26\3"+
		"\2\2\2ab\7R\2\2bc\7c\2\2cd\7i\2\2de\7g\2\2e\30\3\2\2\2fg\7k\2\2gh\7h\2"+
		"\2h\32\3\2\2\2ij\7C\2\2jk\7P\2\2kl\7F\2\2l\34\3\2\2\2mn\7Q\2\2no\7T\2"+
		"\2o\36\3\2\2\2pq\7G\2\2qr\7S\2\2rs\7W\2\2st\7C\2\2tu\7N\2\2u \3\2\2\2"+
		"vw\7r\2\2wx\7t\2\2xy\7k\2\2yz\7p\2\2z{\7v\2\2{\"\3\2\2\2|}\7\f\2\2}$\3"+
		"\2\2\2~\177\t\2\2\2\177&\3\2\2\2\u0080\u0081\7)\2\2\u0081(\3\2\2\2\u0082"+
		"\u0083\7$\2\2\u0083*\3\2\2\2\u0084\u0085\7?\2\2\u0085,\3\2\2\2\u0086\u0087"+
		"\7]\2\2\u0087.\3\2\2\2\u0088\u0089\7_\2\2\u0089\60\3\2\2\2\u008a\u008b"+
		"\7*\2\2\u008b\62\3\2\2\2\u008c\u008d\7+\2\2\u008d\64\3\2\2\2\u008e\u0090"+
		"\7a\2\2\u008f\u0091\t\3\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0097\3\2\2\2\u0094\u0096\t\4"+
		"\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\66\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\t\3\2"+
		"\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u00a2\3\2\2\2\u009f\u00a1\t\4\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00b0\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00ac\t\4\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u009b\3\2"+
		"\2\2\u00af\u00a6\3\2\2\2\u00b08\3\2\2\2\u00b1\u00b4\5\'\24\2\u00b2\u00b4"+
		"\5)\25\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00c9\3\2\2\2\u00b5"+
		"\u00b7\t\3\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c0\3\2\2\2\u00ba\u00bc\t\4\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c6\3\2"+
		"\2\2\u00c3\u00c5\5%\23\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00bf\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00d0\5\'\24\2\u00ce\u00d0\5"+
		")\25\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0:\3\2\2\2\u00d1\u00d3"+
		"\t\4\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5<\3\2\2\2\23\2\u0092\u0097\u009d\u00a2\u00a8\u00ad"+
		"\u00af\u00b3\u00b8\u00bd\u00bf\u00c1\u00c6\u00cb\u00cf\u00d4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}