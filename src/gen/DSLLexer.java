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
		TEXT_DEF_ID=11, TITLE=12, PAGE=13, EMAIL_AS_PARAMETER=14, PASSWORD_AS_PARAMETER=15, 
		DATE_AS_PARAMETER=16, TEXT_FIELD=17, FOR_ID=18, IF_ID=19, AND_OP_ID=20, 
		OR_OP_ID=21, EQUAL_OP_ID=22, PRINT_ACTION=23, RADIO_GROUP_ID=24, BUTTON_ID=25, 
		FORM_ID=26, NEWLINE=27, WHITE_SPACE=28, DOUBLE_QUOTE=29, ASSIGN_OP_ID=30, 
		OPEN_SQR_BRACKT_ID=31, CLOSE_SQR_BRACKT_ID=32, COMMA=33, OPEN_PAR_BRACKT_ID=34, 
		CLOSE_PAR_BRACKT_ID=35, RANG=36, VAR_NAME_ID=37, FILE_NAME_ID=38, TEXT=39, 
		TEXTNUM=40;
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
			"EQUAL_OP_ID", "PRINT_ACTION", "RADIO_GROUP_ID", "BUTTON_ID", "FORM_ID", 
			"NEWLINE", "WHITE_SPACE", "DOUBLE_QUOTE", "ASSIGN_OP_ID", "OPEN_SQR_BRACKT_ID", 
			"CLOSE_SQR_BRACKT_ID", "COMMA", "OPEN_PAR_BRACKT_ID", "CLOSE_PAR_BRACKT_ID", 
			"RANG", "VAR_NAME_ID", "FILE_NAME_ID", "TEXT", "TEXTNUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Controller'", "'controls'", "'{'", "'}'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "';'", "'Text'", "'Title'", "'Page'", "'Email'", "'Password'", 
			"'Date'", "'TextField'", "'for'", "'if'", "'AND'", "'OR'", "'EQUAL'", 
			"'print'", "'Radiogroup'", "'Button'", "'Form'", "'\n'", null, "'\"'", 
			"'='", "'['", "']'", "','", "'('", "')'", "':'"
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
			"BUTTON_ID", "FORM_ID", "NEWLINE", "WHITE_SPACE", "DOUBLE_QUOTE", "ASSIGN_OP_ID", 
			"OPEN_SQR_BRACKT_ID", "CLOSE_SQR_BRACKT_ID", "COMMA", "OPEN_PAR_BRACKT_ID", 
			"CLOSE_PAR_BRACKT_ID", "RANG", "VAR_NAME_ID", "FILE_NAME_ID", "TEXT", 
			"TEXTNUM"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0129\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\6&\u00ed\n&\r&\16&\u00ee"+
		"\3&\7&\u00f2\n&\f&\16&\u00f5\13&\3\'\6\'\u00f8\n\'\r\'\16\'\u00f9\3\'"+
		"\7\'\u00fd\n\'\f\'\16\'\u0100\13\'\3\'\6\'\u0103\n\'\r\'\16\'\u0104\3"+
		"\'\6\'\u0108\n\'\r\'\16\'\u0109\5\'\u010c\n\'\3(\3(\6(\u0110\n(\r(\16"+
		"(\u0111\3(\6(\u0115\n(\r(\16(\u0116\6(\u0119\n(\r(\16(\u011a\3(\7(\u011e"+
		"\n(\f(\16(\u0121\13(\3(\3(\3)\6)\u0126\n)\r)\16)\u0127\2\2*\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*\3\2\6\5\2\13\13\17\17\"\"\4\2C\\c|\3\2\63;\3\2c|\2\u0136"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5"+
		"^\3\2\2\2\7g\3\2\2\2\ti\3\2\2\2\13k\3\2\2\2\rm\3\2\2\2\17o\3\2\2\2\21"+
		"q\3\2\2\2\23s\3\2\2\2\25u\3\2\2\2\27w\3\2\2\2\31|\3\2\2\2\33\u0082\3\2"+
		"\2\2\35\u0087\3\2\2\2\37\u008d\3\2\2\2!\u0096\3\2\2\2#\u009b\3\2\2\2%"+
		"\u00a5\3\2\2\2\'\u00a9\3\2\2\2)\u00ac\3\2\2\2+\u00b0\3\2\2\2-\u00b3\3"+
		"\2\2\2/\u00b9\3\2\2\2\61\u00bf\3\2\2\2\63\u00ca\3\2\2\2\65\u00d1\3\2\2"+
		"\2\67\u00d6\3\2\2\29\u00d8\3\2\2\2;\u00da\3\2\2\2=\u00dc\3\2\2\2?\u00de"+
		"\3\2\2\2A\u00e0\3\2\2\2C\u00e2\3\2\2\2E\u00e4\3\2\2\2G\u00e6\3\2\2\2I"+
		"\u00e8\3\2\2\2K\u00ea\3\2\2\2M\u010b\3\2\2\2O\u010d\3\2\2\2Q\u0125\3\2"+
		"\2\2ST\7E\2\2TU\7q\2\2UV\7p\2\2VW\7v\2\2WX\7t\2\2XY\7q\2\2YZ\7n\2\2Z["+
		"\7n\2\2[\\\7g\2\2\\]\7t\2\2]\4\3\2\2\2^_\7e\2\2_`\7q\2\2`a\7p\2\2ab\7"+
		"v\2\2bc\7t\2\2cd\7q\2\2de\7n\2\2ef\7u\2\2f\6\3\2\2\2gh\7}\2\2h\b\3\2\2"+
		"\2ij\7\177\2\2j\n\3\2\2\2kl\7-\2\2l\f\3\2\2\2mn\7/\2\2n\16\3\2\2\2op\7"+
		",\2\2p\20\3\2\2\2qr\7\61\2\2r\22\3\2\2\2st\7\'\2\2t\24\3\2\2\2uv\7=\2"+
		"\2v\26\3\2\2\2wx\7V\2\2xy\7g\2\2yz\7z\2\2z{\7v\2\2{\30\3\2\2\2|}\7V\2"+
		"\2}~\7k\2\2~\177\7v\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081\32\3"+
		"\2\2\2\u0082\u0083\7R\2\2\u0083\u0084\7c\2\2\u0084\u0085\7i\2\2\u0085"+
		"\u0086\7g\2\2\u0086\34\3\2\2\2\u0087\u0088\7G\2\2\u0088\u0089\7o\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7k\2\2\u008b\u008c\7n\2\2\u008c\36\3\2\2\2\u008d"+
		"\u008e\7R\2\2\u008e\u008f\7c\2\2\u008f\u0090\7u\2\2\u0090\u0091\7u\2\2"+
		"\u0091\u0092\7y\2\2\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094\u0095"+
		"\7f\2\2\u0095 \3\2\2\2\u0096\u0097\7F\2\2\u0097\u0098\7c\2\2\u0098\u0099"+
		"\7v\2\2\u0099\u009a\7g\2\2\u009a\"\3\2\2\2\u009b\u009c\7V\2\2\u009c\u009d"+
		"\7g\2\2\u009d\u009e\7z\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7H\2\2\u00a0"+
		"\u00a1\7k\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7f\2\2"+
		"\u00a4$\3\2\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7t\2"+
		"\2\u00a8&\3\2\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7h\2\2\u00ab(\3\2\2\2"+
		"\u00ac\u00ad\7C\2\2\u00ad\u00ae\7P\2\2\u00ae\u00af\7F\2\2\u00af*\3\2\2"+
		"\2\u00b0\u00b1\7Q\2\2\u00b1\u00b2\7T\2\2\u00b2,\3\2\2\2\u00b3\u00b4\7"+
		"G\2\2\u00b4\u00b5\7S\2\2\u00b5\u00b6\7W\2\2\u00b6\u00b7\7C\2\2\u00b7\u00b8"+
		"\7N\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc"+
		"\7k\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7v\2\2\u00be\60\3\2\2\2\u00bf\u00c0"+
		"\7T\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7q\2\2\u00c4\u00c5\7i\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7q\2\2"+
		"\u00c7\u00c8\7w\2\2\u00c8\u00c9\7r\2\2\u00c9\62\3\2\2\2\u00ca\u00cb\7"+
		"D\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf"+
		"\7q\2\2\u00cf\u00d0\7p\2\2\u00d0\64\3\2\2\2\u00d1\u00d2\7H\2\2\u00d2\u00d3"+
		"\7q\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7o\2\2\u00d5\66\3\2\2\2\u00d6\u00d7"+
		"\7\f\2\2\u00d78\3\2\2\2\u00d8\u00d9\t\2\2\2\u00d9:\3\2\2\2\u00da\u00db"+
		"\7$\2\2\u00db<\3\2\2\2\u00dc\u00dd\7?\2\2\u00dd>\3\2\2\2\u00de\u00df\7"+
		"]\2\2\u00df@\3\2\2\2\u00e0\u00e1\7_\2\2\u00e1B\3\2\2\2\u00e2\u00e3\7."+
		"\2\2\u00e3D\3\2\2\2\u00e4\u00e5\7*\2\2\u00e5F\3\2\2\2\u00e6\u00e7\7+\2"+
		"\2\u00e7H\3\2\2\2\u00e8\u00e9\7<\2\2\u00e9J\3\2\2\2\u00ea\u00ec\7a\2\2"+
		"\u00eb\u00ed\t\3\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f2\t\4\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4L\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\t\5\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fe\3\2\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u010c\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0103\t\5\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0108\t\4\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u00f7\3\2\2\2\u010b"+
		"\u0102\3\2\2\2\u010cN\3\2\2\2\u010d\u011f\5;\36\2\u010e\u0110\t\3\2\2"+
		"\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0119\3\2\2\2\u0113\u0115\t\4\2\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2"+
		"\2\2\u0118\u010f\3\2\2\2\u0118\u0114\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011e\59"+
		"\35\2\u011d\u0118\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0123\5;\36\2\u0123P\3\2\2\2\u0124\u0126\t\4\2\2\u0125\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"R\3\2\2\2\21\2\u00ee\u00f3\u00f9\u00fe\u0104\u0109\u010b\u0111\u0116\u0118"+
		"\u011a\u011d\u011f\u0127\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}