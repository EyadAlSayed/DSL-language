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
		NAME=1, VALUE=2, BODY_DEF_ID=3, BODY_DEF_END_ID=4, TEXT_DEF_ID=5, TEXT_DEF_END_ID=6, 
		PAGE=7, END_PAGE=8, HEADER=9, ENDHEADER=10, TEXT_DEF=11, ACTION=12, METHOD=13, 
		POST_FORM=14, GET_FORM=15, END_FORM=16, SUBMIT_BUTTON=17, END_SUBMIT_BUTTON=18, 
		TEXT_FIELD=19, END_TEXT_FIELD=20, EMAIL_FIELD=21, END_EMAIL_FIELD=22, 
		PASSWORD_FIELD=23, END_PASSWORD_FIELD=24, CHECKBOX_FIELD=25, END_CHECKBOX_FIELD=26, 
		RADIO_FIELD=27, END_RADIO_FIELD=28, CONTROLLER_DEF_ID=29, CONTROLLER_DEF_END_ID=30, 
		RADIO_GROUP=31, END_RADIO_GROUP=32, BUNDLE_ID=33, IF_ID=34, AND_OP_ID=35, 
		OR_OP_ID=36, EQUAL_OP_ID=37, PRINT_ACTION=38, NEWLINE=39, WHITE_SPACE=40, 
		SINGLE_QUOTE=41, ASSIGN=42, OPEN_SQR_BRACKT_ID=43, CLOSE_SQR_BRACKT_ID=44, 
		OPEN_PAR_BRACKT_ID=45, CLOSE_PAR_BRACKT_ID=46, VAR_NAME_ID=47, FILE_NAME_ID=48, 
		TEXT=49, TEXTNUM=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NAME", "VALUE", "BODY_DEF_ID", "BODY_DEF_END_ID", "TEXT_DEF_ID", "TEXT_DEF_END_ID", 
			"PAGE", "END_PAGE", "HEADER", "ENDHEADER", "TEXT_DEF", "ACTION", "METHOD", 
			"POST_FORM", "GET_FORM", "END_FORM", "SUBMIT_BUTTON", "END_SUBMIT_BUTTON", 
			"TEXT_FIELD", "END_TEXT_FIELD", "EMAIL_FIELD", "END_EMAIL_FIELD", "PASSWORD_FIELD", 
			"END_PASSWORD_FIELD", "CHECKBOX_FIELD", "END_CHECKBOX_FIELD", "RADIO_FIELD", 
			"END_RADIO_FIELD", "CONTROLLER_DEF_ID", "CONTROLLER_DEF_END_ID", "RADIO_GROUP", 
			"END_RADIO_GROUP", "BUNDLE_ID", "IF_ID", "AND_OP_ID", "OR_OP_ID", "EQUAL_OP_ID", 
			"PRINT_ACTION", "NEWLINE", "WHITE_SPACE", "SINGLE_QUOTE", "ASSIGN", "OPEN_SQR_BRACKT_ID", 
			"CLOSE_SQR_BRACKT_ID", "OPEN_PAR_BRACKT_ID", "CLOSE_PAR_BRACKT_ID", "VAR_NAME_ID", 
			"FILE_NAME_ID", "TEXT", "TEXTNUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'name'", "'value'", "'Body'", "'endBody'", "'Text'", "'endText'", 
			"'Page'", "'endPage'", "'Head'", "'endHead'", "'text'", "'action'", "'method'", 
			"'PostForm'", "'GetForm'", "'endForm'", "'SubmitButton'", "'endSubmitButton'", 
			"'TextField'", "'endTextField'", "'EmailField'", "'endEmailField'", "'PasswordField'", 
			"'endPasswordField'", "'CheckBoxField'", "'endCheckBoxField'", "'RadioField'", 
			"'endRadioField'", "'Controller'", "'endController'", "'RadioGroup'", 
			"'endRadioGroup'", "'Bundle'", "'if'", "'AND'", "'OR'", "'EQUAL'", "'print'", 
			"'\n'", null, "'''", "'='", "'['", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAME", "VALUE", "BODY_DEF_ID", "BODY_DEF_END_ID", "TEXT_DEF_ID", 
			"TEXT_DEF_END_ID", "PAGE", "END_PAGE", "HEADER", "ENDHEADER", "TEXT_DEF", 
			"ACTION", "METHOD", "POST_FORM", "GET_FORM", "END_FORM", "SUBMIT_BUTTON", 
			"END_SUBMIT_BUTTON", "TEXT_FIELD", "END_TEXT_FIELD", "EMAIL_FIELD", "END_EMAIL_FIELD", 
			"PASSWORD_FIELD", "END_PASSWORD_FIELD", "CHECKBOX_FIELD", "END_CHECKBOX_FIELD", 
			"RADIO_FIELD", "END_RADIO_FIELD", "CONTROLLER_DEF_ID", "CONTROLLER_DEF_END_ID", 
			"RADIO_GROUP", "END_RADIO_GROUP", "BUNDLE_ID", "IF_ID", "AND_OP_ID", 
			"OR_OP_ID", "EQUAL_OP_ID", "PRINT_ACTION", "NEWLINE", "WHITE_SPACE", 
			"SINGLE_QUOTE", "ASSIGN", "OPEN_SQR_BRACKT_ID", "CLOSE_SQR_BRACKT_ID", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0218\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\6\60\u01d8\n\60\r\60\16\60\u01d9\3"+
		"\60\7\60\u01dd\n\60\f\60\16\60\u01e0\13\60\3\61\6\61\u01e3\n\61\r\61\16"+
		"\61\u01e4\3\61\7\61\u01e8\n\61\f\61\16\61\u01eb\13\61\3\61\6\61\u01ee"+
		"\n\61\r\61\16\61\u01ef\3\61\6\61\u01f3\n\61\r\61\16\61\u01f4\5\61\u01f7"+
		"\n\61\3\62\3\62\6\62\u01fb\n\62\r\62\16\62\u01fc\3\62\6\62\u0200\n\62"+
		"\r\62\16\62\u0201\6\62\u0204\n\62\r\62\16\62\u0205\3\62\7\62\u0209\n\62"+
		"\f\62\16\62\u020c\13\62\6\62\u020e\n\62\r\62\16\62\u020f\3\62\3\62\3\63"+
		"\6\63\u0215\n\63\r\63\16\63\u0216\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64\3\2\5\5\2\13\13\17\17\"\"\4\2C\\c|\3\2\63;\2"+
		"\u0225\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5l\3\2\2\2\7r\3\2\2\2\t"+
		"w\3\2\2\2\13\177\3\2\2\2\r\u0084\3\2\2\2\17\u008c\3\2\2\2\21\u0091\3\2"+
		"\2\2\23\u0099\3\2\2\2\25\u009e\3\2\2\2\27\u00a6\3\2\2\2\31\u00ab\3\2\2"+
		"\2\33\u00b2\3\2\2\2\35\u00b9\3\2\2\2\37\u00c2\3\2\2\2!\u00ca\3\2\2\2#"+
		"\u00d2\3\2\2\2%\u00df\3\2\2\2\'\u00ef\3\2\2\2)\u00f9\3\2\2\2+\u0106\3"+
		"\2\2\2-\u0111\3\2\2\2/\u011f\3\2\2\2\61\u012d\3\2\2\2\63\u013e\3\2\2\2"+
		"\65\u014c\3\2\2\2\67\u015d\3\2\2\29\u0168\3\2\2\2;\u0176\3\2\2\2=\u0181"+
		"\3\2\2\2?\u018f\3\2\2\2A\u019a\3\2\2\2C\u01a8\3\2\2\2E\u01af\3\2\2\2G"+
		"\u01b2\3\2\2\2I\u01b6\3\2\2\2K\u01b9\3\2\2\2M\u01bf\3\2\2\2O\u01c5\3\2"+
		"\2\2Q\u01c7\3\2\2\2S\u01c9\3\2\2\2U\u01cb\3\2\2\2W\u01cd\3\2\2\2Y\u01cf"+
		"\3\2\2\2[\u01d1\3\2\2\2]\u01d3\3\2\2\2_\u01d5\3\2\2\2a\u01f6\3\2\2\2c"+
		"\u01f8\3\2\2\2e\u0214\3\2\2\2gh\7p\2\2hi\7c\2\2ij\7o\2\2jk\7g\2\2k\4\3"+
		"\2\2\2lm\7x\2\2mn\7c\2\2no\7n\2\2op\7w\2\2pq\7g\2\2q\6\3\2\2\2rs\7D\2"+
		"\2st\7q\2\2tu\7f\2\2uv\7{\2\2v\b\3\2\2\2wx\7g\2\2xy\7p\2\2yz\7f\2\2z{"+
		"\7D\2\2{|\7q\2\2|}\7f\2\2}~\7{\2\2~\n\3\2\2\2\177\u0080\7V\2\2\u0080\u0081"+
		"\7g\2\2\u0081\u0082\7z\2\2\u0082\u0083\7v\2\2\u0083\f\3\2\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7p\2\2\u0086\u0087\7f\2\2\u0087\u0088\7V\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7z\2\2\u008a\u008b\7v\2\2\u008b\16\3\2\2\2\u008c"+
		"\u008d\7R\2\2\u008d\u008e\7c\2\2\u008e\u008f\7i\2\2\u008f\u0090\7g\2\2"+
		"\u0090\20\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7p\2\2\u0093\u0094\7"+
		"f\2\2\u0094\u0095\7R\2\2\u0095\u0096\7c\2\2\u0096\u0097\7i\2\2\u0097\u0098"+
		"\7g\2\2\u0098\22\3\2\2\2\u0099\u009a\7J\2\2\u009a\u009b\7g\2\2\u009b\u009c"+
		"\7c\2\2\u009c\u009d\7f\2\2\u009d\24\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0"+
		"\7p\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7J\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\u00a5\7f\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7z\2\2\u00a9\u00aa\7v\2\2\u00aa\30\3\2\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7k\2\2"+
		"\u00af\u00b0\7q\2\2\u00b0\u00b1\7p\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\7"+
		"o\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7"+
		"\7q\2\2\u00b7\u00b8\7f\2\2\u00b8\34\3\2\2\2\u00b9\u00ba\7R\2\2\u00ba\u00bb"+
		"\7q\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7H\2\2\u00be"+
		"\u00bf\7q\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7o\2\2\u00c1\36\3\2\2\2\u00c2"+
		"\u00c3\7I\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7H\2\2"+
		"\u00c6\u00c7\7q\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7o\2\2\u00c9 \3\2\2"+
		"\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce"+
		"\7H\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7o\2\2\u00d1"+
		"\"\3\2\2\2\u00d2\u00d3\7U\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7d\2\2\u00d5"+
		"\u00d6\7o\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7D\2\2"+
		"\u00d9\u00da\7w\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd"+
		"\7q\2\2\u00dd\u00de\7p\2\2\u00de$\3\2\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7U\2\2\u00e3\u00e4\7w\2\2\u00e4"+
		"\u00e5\7d\2\2\u00e5\u00e6\7o\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7v\2\2"+
		"\u00e8\u00e9\7D\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec"+
		"\7v\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7p\2\2\u00ee&\3\2\2\2\u00ef\u00f0"+
		"\7V\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7z\2\2\u00f2\u00f3\7v\2\2\u00f3"+
		"\u00f4\7H\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7n\2\2"+
		"\u00f7\u00f8\7f\2\2\u00f8(\3\2\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7p\2"+
		"\2\u00fb\u00fc\7f\2\2\u00fc\u00fd\7V\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff"+
		"\7z\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7H\2\2\u0101\u0102\7k\2\2\u0102"+
		"\u0103\7g\2\2\u0103\u0104\7n\2\2\u0104\u0105\7f\2\2\u0105*\3\2\2\2\u0106"+
		"\u0107\7G\2\2\u0107\u0108\7o\2\2\u0108\u0109\7c\2\2\u0109\u010a\7k\2\2"+
		"\u010a\u010b\7n\2\2\u010b\u010c\7H\2\2\u010c\u010d\7k\2\2\u010d\u010e"+
		"\7g\2\2\u010e\u010f\7n\2\2\u010f\u0110\7f\2\2\u0110,\3\2\2\2\u0111\u0112"+
		"\7g\2\2\u0112\u0113\7p\2\2\u0113\u0114\7f\2\2\u0114\u0115\7G\2\2\u0115"+
		"\u0116\7o\2\2\u0116\u0117\7c\2\2\u0117\u0118\7k\2\2\u0118\u0119\7n\2\2"+
		"\u0119\u011a\7H\2\2\u011a\u011b\7k\2\2\u011b\u011c\7g\2\2\u011c\u011d"+
		"\7n\2\2\u011d\u011e\7f\2\2\u011e.\3\2\2\2\u011f\u0120\7R\2\2\u0120\u0121"+
		"\7c\2\2\u0121\u0122\7u\2\2\u0122\u0123\7u\2\2\u0123\u0124\7y\2\2\u0124"+
		"\u0125\7q\2\2\u0125\u0126\7t\2\2\u0126\u0127\7f\2\2\u0127\u0128\7H\2\2"+
		"\u0128\u0129\7k\2\2\u0129\u012a\7g\2\2\u012a\u012b\7n\2\2\u012b\u012c"+
		"\7f\2\2\u012c\60\3\2\2\2\u012d\u012e\7g\2\2\u012e\u012f\7p\2\2\u012f\u0130"+
		"\7f\2\2\u0130\u0131\7R\2\2\u0131\u0132\7c\2\2\u0132\u0133\7u\2\2\u0133"+
		"\u0134\7u\2\2\u0134\u0135\7y\2\2\u0135\u0136\7q\2\2\u0136\u0137\7t\2\2"+
		"\u0137\u0138\7f\2\2\u0138\u0139\7H\2\2\u0139\u013a\7k\2\2\u013a\u013b"+
		"\7g\2\2\u013b\u013c\7n\2\2\u013c\u013d\7f\2\2\u013d\62\3\2\2\2\u013e\u013f"+
		"\7E\2\2\u013f\u0140\7j\2\2\u0140\u0141\7g\2\2\u0141\u0142\7e\2\2\u0142"+
		"\u0143\7m\2\2\u0143\u0144\7D\2\2\u0144\u0145\7q\2\2\u0145\u0146\7z\2\2"+
		"\u0146\u0147\7H\2\2\u0147\u0148\7k\2\2\u0148\u0149\7g\2\2\u0149\u014a"+
		"\7n\2\2\u014a\u014b\7f\2\2\u014b\64\3\2\2\2\u014c\u014d\7g\2\2\u014d\u014e"+
		"\7p\2\2\u014e\u014f\7f\2\2\u014f\u0150\7E\2\2\u0150\u0151\7j\2\2\u0151"+
		"\u0152\7g\2\2\u0152\u0153\7e\2\2\u0153\u0154\7m\2\2\u0154\u0155\7D\2\2"+
		"\u0155\u0156\7q\2\2\u0156\u0157\7z\2\2\u0157\u0158\7H\2\2\u0158\u0159"+
		"\7k\2\2\u0159\u015a\7g\2\2\u015a\u015b\7n\2\2\u015b\u015c\7f\2\2\u015c"+
		"\66\3\2\2\2\u015d\u015e\7T\2\2\u015e\u015f\7c\2\2\u015f\u0160\7f\2\2\u0160"+
		"\u0161\7k\2\2\u0161\u0162\7q\2\2\u0162\u0163\7H\2\2\u0163\u0164\7k\2\2"+
		"\u0164\u0165\7g\2\2\u0165\u0166\7n\2\2\u0166\u0167\7f\2\2\u01678\3\2\2"+
		"\2\u0168\u0169\7g\2\2\u0169\u016a\7p\2\2\u016a\u016b\7f\2\2\u016b\u016c"+
		"\7T\2\2\u016c\u016d\7c\2\2\u016d\u016e\7f\2\2\u016e\u016f\7k\2\2\u016f"+
		"\u0170\7q\2\2\u0170\u0171\7H\2\2\u0171\u0172\7k\2\2\u0172\u0173\7g\2\2"+
		"\u0173\u0174\7n\2\2\u0174\u0175\7f\2\2\u0175:\3\2\2\2\u0176\u0177\7E\2"+
		"\2\u0177\u0178\7q\2\2\u0178\u0179\7p\2\2\u0179\u017a\7v\2\2\u017a\u017b"+
		"\7t\2\2\u017b\u017c\7q\2\2\u017c\u017d\7n\2\2\u017d\u017e\7n\2\2\u017e"+
		"\u017f\7g\2\2\u017f\u0180\7t\2\2\u0180<\3\2\2\2\u0181\u0182\7g\2\2\u0182"+
		"\u0183\7p\2\2\u0183\u0184\7f\2\2\u0184\u0185\7E\2\2\u0185\u0186\7q\2\2"+
		"\u0186\u0187\7p\2\2\u0187\u0188\7v\2\2\u0188\u0189\7t\2\2\u0189\u018a"+
		"\7q\2\2\u018a\u018b\7n\2\2\u018b\u018c\7n\2\2\u018c\u018d\7g\2\2\u018d"+
		"\u018e\7t\2\2\u018e>\3\2\2\2\u018f\u0190\7T\2\2\u0190\u0191\7c\2\2\u0191"+
		"\u0192\7f\2\2\u0192\u0193\7k\2\2\u0193\u0194\7q\2\2\u0194\u0195\7I\2\2"+
		"\u0195\u0196\7t\2\2\u0196\u0197\7q\2\2\u0197\u0198\7w\2\2\u0198\u0199"+
		"\7r\2\2\u0199@\3\2\2\2\u019a\u019b\7g\2\2\u019b\u019c\7p\2\2\u019c\u019d"+
		"\7f\2\2\u019d\u019e\7T\2\2\u019e\u019f\7c\2\2\u019f\u01a0\7f\2\2\u01a0"+
		"\u01a1\7k\2\2\u01a1\u01a2\7q\2\2\u01a2\u01a3\7I\2\2\u01a3\u01a4\7t\2\2"+
		"\u01a4\u01a5\7q\2\2\u01a5\u01a6\7w\2\2\u01a6\u01a7\7r\2\2\u01a7B\3\2\2"+
		"\2\u01a8\u01a9\7D\2\2\u01a9\u01aa\7w\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac"+
		"\7f\2\2\u01ac\u01ad\7n\2\2\u01ad\u01ae\7g\2\2\u01aeD\3\2\2\2\u01af\u01b0"+
		"\7k\2\2\u01b0\u01b1\7h\2\2\u01b1F\3\2\2\2\u01b2\u01b3\7C\2\2\u01b3\u01b4"+
		"\7P\2\2\u01b4\u01b5\7F\2\2\u01b5H\3\2\2\2\u01b6\u01b7\7Q\2\2\u01b7\u01b8"+
		"\7T\2\2\u01b8J\3\2\2\2\u01b9\u01ba\7G\2\2\u01ba\u01bb\7S\2\2\u01bb\u01bc"+
		"\7W\2\2\u01bc\u01bd\7C\2\2\u01bd\u01be\7N\2\2\u01beL\3\2\2\2\u01bf\u01c0"+
		"\7r\2\2\u01c0\u01c1\7t\2\2\u01c1\u01c2\7k\2\2\u01c2\u01c3\7p\2\2\u01c3"+
		"\u01c4\7v\2\2\u01c4N\3\2\2\2\u01c5\u01c6\7\f\2\2\u01c6P\3\2\2\2\u01c7"+
		"\u01c8\t\2\2\2\u01c8R\3\2\2\2\u01c9\u01ca\7)\2\2\u01caT\3\2\2\2\u01cb"+
		"\u01cc\7?\2\2\u01ccV\3\2\2\2\u01cd\u01ce\7]\2\2\u01ceX\3\2\2\2\u01cf\u01d0"+
		"\7_\2\2\u01d0Z\3\2\2\2\u01d1\u01d2\7*\2\2\u01d2\\\3\2\2\2\u01d3\u01d4"+
		"\7+\2\2\u01d4^\3\2\2\2\u01d5\u01d7\7a\2\2\u01d6\u01d8\t\3\2\2\u01d7\u01d6"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01de\3\2\2\2\u01db\u01dd\t\4\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2"+
		"\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df`\3\2\2\2\u01e0\u01de"+
		"\3\2\2\2\u01e1\u01e3\t\3\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e9\3\2\2\2\u01e6\u01e8\t\4"+
		"\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01f7\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ee\t\3"+
		"\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01f3\t\4\2\2\u01f2\u01f1\3\2"+
		"\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f7\3\2\2\2\u01f6\u01e2\3\2\2\2\u01f6\u01ed\3\2\2\2\u01f7b\3\2\2\2"+
		"\u01f8\u020d\5S*\2\u01f9\u01fb\t\3\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0204\3\2\2\2\u01fe"+
		"\u0200\t\4\2\2\u01ff\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u01ff\3\2"+
		"\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u01fa\3\2\2\2\u0203"+
		"\u01ff\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\u020a\3\2\2\2\u0207\u0209\5Q)\2\u0208\u0207\3\2\2\2\u0209\u020c"+
		"\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020e\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020d\u0203\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u020d\3\2"+
		"\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\5S*\2\u0212d"+
		"\3\2\2\2\u0213\u0215\t\4\2\2\u0214\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217f\3\2\2\2\21\2\u01d9\u01de\u01e4"+
		"\u01e9\u01ef\u01f4\u01f6\u01fc\u0201\u0203\u0205\u020a\u020f\u0216\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}