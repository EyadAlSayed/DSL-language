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
		CONTROLLER_DEF=1, CONTROLLER_METHOD=2, OPEN_CURLY_BRACKT_ID=3, CLOSE_CURLY_BRACKT_ID=4, 
		SUM_OP_ID=5, MINUS_OP_ID=6, MULT_OP_ID=7, DIV_OP_ID=8, MOD_OP_ID=9, END_STATMENT_ID=10, 
		TEXT_DEF_ID=11, TITLE=12, PAGE=13, EMAIL_AS_PARAMETER=14, PASSWORD_AS_PARAMETER=15, 
		DATE_AS_PARAMETER=16, TEXT_FIELD=17, FOR_ID=18, IF_ID=19, AND_OP_ID=20, 
		OR_OP_ID=21, EQUAL_OP_ID=22, PRINT_ACTION=23, RADIO_GROUP_ID=24, CHECKBOX=25, 
		BUTTON_ID=26, FORM_ID=27, DOT=28, SEND=29, NEWLINE=30, WHITE_SPACE=31, 
		DOUBLE_QUOTE=32, ASSIGN_OP_ID=33, OPEN_SQR_BRACKT_ID=34, CLOSE_SQR_BRACKT_ID=35, 
		COMMA=36, OPEN_PAR_BRACKT_ID=37, CLOSE_PAR_BRACKT_ID=38, RANG=39, VAR_NAME_ID=40, 
		FILE_NAME_ID=41, TEXT=42, TEXTNUM=43;
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
			"TEXT_DEF_ID", "TITLE", "PAGE", "EMAIL_AS_PARAMETER", "PASSWORD_AS_PARAMETER", 
			"DATE_AS_PARAMETER", "TEXT_FIELD", "FOR_ID", "IF_ID", "AND_OP_ID", "OR_OP_ID", 
			"EQUAL_OP_ID", "PRINT_ACTION", "RADIO_GROUP_ID", "CHECKBOX", "BUTTON_ID", 
			"FORM_ID", "DOT", "SEND", "NEWLINE", "WHITE_SPACE", "DOUBLE_QUOTE", "ASSIGN_OP_ID", 
			"OPEN_SQR_BRACKT_ID", "CLOSE_SQR_BRACKT_ID", "COMMA", "OPEN_PAR_BRACKT_ID", 
			"CLOSE_PAR_BRACKT_ID", "RANG", "VAR_NAME_ID", "FILE_NAME_ID", "TEXT", 
			"TEXTNUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Controller'", "'controls'", "'{'", "'}'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "';'", "'Text'", "'Title'", "'Page'", "'Email'", "'Password'", 
			"'Date'", "'TextField'", "'for'", "'if'", "'AND'", "'OR'", "'EQUAL'", 
			"'print'", "'Radiogroup'", "'Checkbox'", "'Button'", "'Form'", "'.'", 
			"'send'", "'\n'", null, "'\"'", "'='", "'['", "']'", "','", "'('", "')'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONTROLLER_DEF", "CONTROLLER_METHOD", "OPEN_CURLY_BRACKT_ID", 
			"CLOSE_CURLY_BRACKT_ID", "SUM_OP_ID", "MINUS_OP_ID", "MULT_OP_ID", "DIV_OP_ID", 
			"MOD_OP_ID", "END_STATMENT_ID", "TEXT_DEF_ID", "TITLE", "PAGE", "EMAIL_AS_PARAMETER", 
			"PASSWORD_AS_PARAMETER", "DATE_AS_PARAMETER", "TEXT_FIELD", "FOR_ID", 
			"IF_ID", "AND_OP_ID", "OR_OP_ID", "EQUAL_OP_ID", "PRINT_ACTION", "RADIO_GROUP_ID", 
			"CHECKBOX", "BUTTON_ID", "FORM_ID", "DOT", "SEND", "NEWLINE", "WHITE_SPACE", 
			"DOUBLE_QUOTE", "ASSIGN_OP_ID", "OPEN_SQR_BRACKT_ID", "CLOSE_SQR_BRACKT_ID", 
			"COMMA", "OPEN_PAR_BRACKT_ID", "CLOSE_PAR_BRACKT_ID", "RANG", "VAR_NAME_ID", 
			"FILE_NAME_ID", "TEXT", "TEXTNUM"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u013f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\6)\u0103\n)\r)\16)\u0104\3)\7)\u0108\n)\f)\16)\u010b\13)\3*\6*\u010e"+
		"\n*\r*\16*\u010f\3*\7*\u0113\n*\f*\16*\u0116\13*\3*\6*\u0119\n*\r*\16"+
		"*\u011a\3*\6*\u011e\n*\r*\16*\u011f\5*\u0122\n*\3+\3+\6+\u0126\n+\r+\16"+
		"+\u0127\3+\6+\u012b\n+\r+\16+\u012c\6+\u012f\n+\r+\16+\u0130\3+\7+\u0134"+
		"\n+\f+\16+\u0137\13+\3+\3+\3,\6,\u013c\n,\r,\16,\u013d\2\2-\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-\3\2\6\5\2\13\13\17\17\"\"\4\2C\\c|\3\2\63;\3\2"+
		"c|\2\u014c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5d\3\2\2\2\7m\3\2\2\2\to\3\2"+
		"\2\2\13q\3\2\2\2\rs\3\2\2\2\17u\3\2\2\2\21w\3\2\2\2\23y\3\2\2\2\25{\3"+
		"\2\2\2\27}\3\2\2\2\31\u0082\3\2\2\2\33\u0088\3\2\2\2\35\u008d\3\2\2\2"+
		"\37\u0093\3\2\2\2!\u009c\3\2\2\2#\u00a1\3\2\2\2%\u00ab\3\2\2\2\'\u00af"+
		"\3\2\2\2)\u00b2\3\2\2\2+\u00b6\3\2\2\2-\u00b9\3\2\2\2/\u00bf\3\2\2\2\61"+
		"\u00c5\3\2\2\2\63\u00d0\3\2\2\2\65\u00d9\3\2\2\2\67\u00e0\3\2\2\29\u00e5"+
		"\3\2\2\2;\u00e7\3\2\2\2=\u00ec\3\2\2\2?\u00ee\3\2\2\2A\u00f0\3\2\2\2C"+
		"\u00f2\3\2\2\2E\u00f4\3\2\2\2G\u00f6\3\2\2\2I\u00f8\3\2\2\2K\u00fa\3\2"+
		"\2\2M\u00fc\3\2\2\2O\u00fe\3\2\2\2Q\u0100\3\2\2\2S\u0121\3\2\2\2U\u0123"+
		"\3\2\2\2W\u013b\3\2\2\2YZ\7E\2\2Z[\7q\2\2[\\\7p\2\2\\]\7v\2\2]^\7t\2\2"+
		"^_\7q\2\2_`\7n\2\2`a\7n\2\2ab\7g\2\2bc\7t\2\2c\4\3\2\2\2de\7e\2\2ef\7"+
		"q\2\2fg\7p\2\2gh\7v\2\2hi\7t\2\2ij\7q\2\2jk\7n\2\2kl\7u\2\2l\6\3\2\2\2"+
		"mn\7}\2\2n\b\3\2\2\2op\7\177\2\2p\n\3\2\2\2qr\7-\2\2r\f\3\2\2\2st\7/\2"+
		"\2t\16\3\2\2\2uv\7,\2\2v\20\3\2\2\2wx\7\61\2\2x\22\3\2\2\2yz\7\'\2\2z"+
		"\24\3\2\2\2{|\7=\2\2|\26\3\2\2\2}~\7V\2\2~\177\7g\2\2\177\u0080\7z\2\2"+
		"\u0080\u0081\7v\2\2\u0081\30\3\2\2\2\u0082\u0083\7V\2\2\u0083\u0084\7"+
		"k\2\2\u0084\u0085\7v\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087\32"+
		"\3\2\2\2\u0088\u0089\7R\2\2\u0089\u008a\7c\2\2\u008a\u008b\7i\2\2\u008b"+
		"\u008c\7g\2\2\u008c\34\3\2\2\2\u008d\u008e\7G\2\2\u008e\u008f\7o\2\2\u008f"+
		"\u0090\7c\2\2\u0090\u0091\7k\2\2\u0091\u0092\7n\2\2\u0092\36\3\2\2\2\u0093"+
		"\u0094\7R\2\2\u0094\u0095\7c\2\2\u0095\u0096\7u\2\2\u0096\u0097\7u\2\2"+
		"\u0097\u0098\7y\2\2\u0098\u0099\7q\2\2\u0099\u009a\7t\2\2\u009a\u009b"+
		"\7f\2\2\u009b \3\2\2\2\u009c\u009d\7F\2\2\u009d\u009e\7c\2\2\u009e\u009f"+
		"\7v\2\2\u009f\u00a0\7g\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\7V\2\2\u00a2\u00a3"+
		"\7g\2\2\u00a3\u00a4\7z\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7H\2\2\u00a6"+
		"\u00a7\7k\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7f\2\2"+
		"\u00aa$\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7t\2"+
		"\2\u00ae&\3\2\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7h\2\2\u00b1(\3\2\2\2"+
		"\u00b2\u00b3\7C\2\2\u00b3\u00b4\7P\2\2\u00b4\u00b5\7F\2\2\u00b5*\3\2\2"+
		"\2\u00b6\u00b7\7Q\2\2\u00b7\u00b8\7T\2\2\u00b8,\3\2\2\2\u00b9\u00ba\7"+
		"G\2\2\u00ba\u00bb\7S\2\2\u00bb\u00bc\7W\2\2\u00bc\u00bd\7C\2\2\u00bd\u00be"+
		"\7N\2\2\u00be.\3\2\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2"+
		"\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7v\2\2\u00c4\60\3\2\2\2\u00c5\u00c6"+
		"\7T\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9\7k\2\2\u00c9"+
		"\u00ca\7q\2\2\u00ca\u00cb\7i\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7q\2\2"+
		"\u00cd\u00ce\7w\2\2\u00ce\u00cf\7r\2\2\u00cf\62\3\2\2\2\u00d0\u00d1\7"+
		"E\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5"+
		"\7m\2\2\u00d5\u00d6\7d\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7z\2\2\u00d8"+
		"\64\3\2\2\2\u00d9\u00da\7D\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7v\2\2\u00dc"+
		"\u00dd\7v\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7p\2\2\u00df\66\3\2\2\2\u00e0"+
		"\u00e1\7H\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7o\2\2"+
		"\u00e48\3\2\2\2\u00e5\u00e6\7\60\2\2\u00e6:\3\2\2\2\u00e7\u00e8\7u\2\2"+
		"\u00e8\u00e9\7g\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7f\2\2\u00eb<\3\2\2"+
		"\2\u00ec\u00ed\7\f\2\2\u00ed>\3\2\2\2\u00ee\u00ef\t\2\2\2\u00ef@\3\2\2"+
		"\2\u00f0\u00f1\7$\2\2\u00f1B\3\2\2\2\u00f2\u00f3\7?\2\2\u00f3D\3\2\2\2"+
		"\u00f4\u00f5\7]\2\2\u00f5F\3\2\2\2\u00f6\u00f7\7_\2\2\u00f7H\3\2\2\2\u00f8"+
		"\u00f9\7.\2\2\u00f9J\3\2\2\2\u00fa\u00fb\7*\2\2\u00fbL\3\2\2\2\u00fc\u00fd"+
		"\7+\2\2\u00fdN\3\2\2\2\u00fe\u00ff\7<\2\2\u00ffP\3\2\2\2\u0100\u0102\7"+
		"a\2\2\u0101\u0103\t\3\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0109\3\2\2\2\u0106\u0108\t\4"+
		"\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010aR\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\t\5\2\2"+
		"\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0114\3\2\2\2\u0111\u0113\t\4\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0122\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0117\u0119\t\5\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2"+
		"\2\2\u011c\u011e\t\4\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u010d\3\2"+
		"\2\2\u0121\u0118\3\2\2\2\u0122T\3\2\2\2\u0123\u0135\5A!\2\u0124\u0126"+
		"\t\3\2\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012f\3\2\2\2\u0129\u012b\t\4\2\2\u012a\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u012a\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0134\5? \2\u0133\u012e\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2"+
		"\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u0139\5A!\2\u0139V\3\2\2\2\u013a\u013c\t\4\2\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"X\3\2\2\2\21\2\u0104\u0109\u010f\u0114\u011a\u011f\u0121\u0127\u012c\u012e"+
		"\u0130\u0133\u0135\u013d\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}