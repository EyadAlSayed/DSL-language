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
		DATE_AS_PARAMETER=16, TEXT_FIELD=17, SEND_ID=18, FOR_ID=19, IF_ID=20, 
		AND_OP_ID=21, OR_OP_ID=22, EQUAL_OP_ID=23, PRINT_ACTION=24, RADIO_GROUP_ID=25, 
		BUTTON_ID=26, FORM_ID=27, NEWLINE=28, WHITE_SPACE=29, DOUBLE_QUOTE=30, 
		ASSIGN_OP_ID=31, OPEN_SQR_BRACKT_ID=32, CLOSE_SQR_BRACKT_ID=33, COMMA=34, 
		OPEN_PAR_BRACKT_ID=35, CLOSE_PAR_BRACKT_ID=36, RANG=37, VAR_NAME_ID=38, 
		FILE_NAME_ID=39, TEXT=40, TEXTNUM=41;
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
			"DATE_AS_PARAMETER", "TEXT_FIELD", "SEND_ID", "FOR_ID", "IF_ID", "AND_OP_ID", 
			"OR_OP_ID", "EQUAL_OP_ID", "PRINT_ACTION", "RADIO_GROUP_ID", "BUTTON_ID", 
			"FORM_ID", "NEWLINE", "WHITE_SPACE", "DOUBLE_QUOTE", "ASSIGN_OP_ID", 
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
			"'Date'", "'TextField'", "'send'", "'for'", "'if'", "'AND'", "'OR'", 
			"'EQUAL'", "'print'", "'Radiogroup'", "'Button'", "'Form'", "'\n'", null, 
			"'\"'", "'='", "'['", "']'", "','", "'('", "')'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONTROLLER_DEF", "CONTROLLER_METHOD", "OPEN_CURLY_BRACKT_ID", 
			"CLOSE_CURLY_BRACKT_ID", "SUM_OP_ID", "MINUS_OP_ID", "MULT_OP_ID", "DIV_OP_ID", 
			"MOD_OP_ID", "END_STATMENT_ID", "TEXT_DEF_ID", "TITLE", "PAGE", "EMAIL_AS_PARAMETER", 
			"PASSWORD_AS_PARAMETER", "DATE_AS_PARAMETER", "TEXT_FIELD", "SEND_ID", 
			"FOR_ID", "IF_ID", "AND_OP_ID", "OR_OP_ID", "EQUAL_OP_ID", "PRINT_ACTION", 
			"RADIO_GROUP_ID", "BUTTON_ID", "FORM_ID", "NEWLINE", "WHITE_SPACE", "DOUBLE_QUOTE", 
			"ASSIGN_OP_ID", "OPEN_SQR_BRACKT_ID", "CLOSE_SQR_BRACKT_ID", "COMMA", 
			"OPEN_PAR_BRACKT_ID", "CLOSE_PAR_BRACKT_ID", "RANG", "VAR_NAME_ID", "FILE_NAME_ID", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0130\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\6\'\u00f4\n\'\r\'\16\'\u00f5\3\'\7\'\u00f9\n\'\f\'\16\'\u00fc"+
		"\13\'\3(\6(\u00ff\n(\r(\16(\u0100\3(\7(\u0104\n(\f(\16(\u0107\13(\3(\6"+
		"(\u010a\n(\r(\16(\u010b\3(\6(\u010f\n(\r(\16(\u0110\5(\u0113\n(\3)\3)"+
		"\6)\u0117\n)\r)\16)\u0118\3)\6)\u011c\n)\r)\16)\u011d\6)\u0120\n)\r)\16"+
		")\u0121\3)\7)\u0125\n)\f)\16)\u0128\13)\3)\3)\3*\6*\u012d\n*\r*\16*\u012e"+
		"\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\6\5\2\13\13\17\17\"\"\4\2C\\c|\3\2"+
		"\63;\3\2c|\2\u013d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\3U\3\2\2\2\5`\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13m\3\2\2"+
		"\2\ro\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25w\3\2\2\2\27y\3\2"+
		"\2\2\31~\3\2\2\2\33\u0084\3\2\2\2\35\u0089\3\2\2\2\37\u008f\3\2\2\2!\u0098"+
		"\3\2\2\2#\u009d\3\2\2\2%\u00a7\3\2\2\2\'\u00ac\3\2\2\2)\u00b0\3\2\2\2"+
		"+\u00b3\3\2\2\2-\u00b7\3\2\2\2/\u00ba\3\2\2\2\61\u00c0\3\2\2\2\63\u00c6"+
		"\3\2\2\2\65\u00d1\3\2\2\2\67\u00d8\3\2\2\29\u00dd\3\2\2\2;\u00df\3\2\2"+
		"\2=\u00e1\3\2\2\2?\u00e3\3\2\2\2A\u00e5\3\2\2\2C\u00e7\3\2\2\2E\u00e9"+
		"\3\2\2\2G\u00eb\3\2\2\2I\u00ed\3\2\2\2K\u00ef\3\2\2\2M\u00f1\3\2\2\2O"+
		"\u0112\3\2\2\2Q\u0114\3\2\2\2S\u012c\3\2\2\2UV\7E\2\2VW\7q\2\2WX\7p\2"+
		"\2XY\7v\2\2YZ\7t\2\2Z[\7q\2\2[\\\7n\2\2\\]\7n\2\2]^\7g\2\2^_\7t\2\2_\4"+
		"\3\2\2\2`a\7e\2\2ab\7q\2\2bc\7p\2\2cd\7v\2\2de\7t\2\2ef\7q\2\2fg\7n\2"+
		"\2gh\7u\2\2h\6\3\2\2\2ij\7}\2\2j\b\3\2\2\2kl\7\177\2\2l\n\3\2\2\2mn\7"+
		"-\2\2n\f\3\2\2\2op\7/\2\2p\16\3\2\2\2qr\7,\2\2r\20\3\2\2\2st\7\61\2\2"+
		"t\22\3\2\2\2uv\7\'\2\2v\24\3\2\2\2wx\7=\2\2x\26\3\2\2\2yz\7V\2\2z{\7g"+
		"\2\2{|\7z\2\2|}\7v\2\2}\30\3\2\2\2~\177\7V\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7v\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083\32\3\2\2\2\u0084"+
		"\u0085\7R\2\2\u0085\u0086\7c\2\2\u0086\u0087\7i\2\2\u0087\u0088\7g\2\2"+
		"\u0088\34\3\2\2\2\u0089\u008a\7G\2\2\u008a\u008b\7o\2\2\u008b\u008c\7"+
		"c\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2\u008e\36\3\2\2\2\u008f\u0090"+
		"\7R\2\2\u0090\u0091\7c\2\2\u0091\u0092\7u\2\2\u0092\u0093\7u\2\2\u0093"+
		"\u0094\7y\2\2\u0094\u0095\7q\2\2\u0095\u0096\7t\2\2\u0096\u0097\7f\2\2"+
		"\u0097 \3\2\2\2\u0098\u0099\7F\2\2\u0099\u009a\7c\2\2\u009a\u009b\7v\2"+
		"\2\u009b\u009c\7g\2\2\u009c\"\3\2\2\2\u009d\u009e\7V\2\2\u009e\u009f\7"+
		"g\2\2\u009f\u00a0\7z\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7H\2\2\u00a2\u00a3"+
		"\7k\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7f\2\2\u00a6"+
		"$\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7p\2\2\u00aa"+
		"\u00ab\7f\2\2\u00ab&\3\2\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\7q\2\2\u00ae"+
		"\u00af\7t\2\2\u00af(\3\2\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7h\2\2\u00b2"+
		"*\3\2\2\2\u00b3\u00b4\7C\2\2\u00b4\u00b5\7P\2\2\u00b5\u00b6\7F\2\2\u00b6"+
		",\3\2\2\2\u00b7\u00b8\7Q\2\2\u00b8\u00b9\7T\2\2\u00b9.\3\2\2\2\u00ba\u00bb"+
		"\7G\2\2\u00bb\u00bc\7S\2\2\u00bc\u00bd\7W\2\2\u00bd\u00be\7C\2\2\u00be"+
		"\u00bf\7N\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\7r\2\2\u00c1\u00c2\7t\2\2\u00c2"+
		"\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7v\2\2\u00c5\62\3\2\2\2\u00c6"+
		"\u00c7\7T\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7k\2\2"+
		"\u00ca\u00cb\7q\2\2\u00cb\u00cc\7i\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce"+
		"\7q\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7r\2\2\u00d0\64\3\2\2\2\u00d1\u00d2"+
		"\7D\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7v\2\2\u00d5"+
		"\u00d6\7q\2\2\u00d6\u00d7\7p\2\2\u00d7\66\3\2\2\2\u00d8\u00d9\7H\2\2\u00d9"+
		"\u00da\7q\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7o\2\2\u00dc8\3\2\2\2\u00dd"+
		"\u00de\7\f\2\2\u00de:\3\2\2\2\u00df\u00e0\t\2\2\2\u00e0<\3\2\2\2\u00e1"+
		"\u00e2\7$\2\2\u00e2>\3\2\2\2\u00e3\u00e4\7?\2\2\u00e4@\3\2\2\2\u00e5\u00e6"+
		"\7]\2\2\u00e6B\3\2\2\2\u00e7\u00e8\7_\2\2\u00e8D\3\2\2\2\u00e9\u00ea\7"+
		".\2\2\u00eaF\3\2\2\2\u00eb\u00ec\7*\2\2\u00ecH\3\2\2\2\u00ed\u00ee\7+"+
		"\2\2\u00eeJ\3\2\2\2\u00ef\u00f0\7<\2\2\u00f0L\3\2\2\2\u00f1\u00f3\7a\2"+
		"\2\u00f2\u00f4\t\3\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\t\4\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fbN\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\t\5\2\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0105\3\2\2\2\u0102\u0104\t\4\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0113\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010a\t\5\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010f\t\4\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u00fe\3\2\2\2\u0112"+
		"\u0109\3\2\2\2\u0113P\3\2\2\2\u0114\u0126\5=\37\2\u0115\u0117\t\3\2\2"+
		"\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u0120\3\2\2\2\u011a\u011c\t\4\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2"+
		"\2\2\u011f\u0116\3\2\2\2\u011f\u011b\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0125\5;"+
		"\36\2\u0124\u011f\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0129\u012a\5=\37\2\u012aR\3\2\2\2\u012b\u012d\t\4\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"T\3\2\2\2\21\2\u00f5\u00fa\u0100\u0105\u010b\u0110\u0112\u0118\u011d\u011f"+
		"\u0121\u0124\u0126\u012e\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}