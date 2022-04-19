// Generated from D:/DSL-language/out/production/DSL_language\DSLLexer.g4 by ANTLR 4.9.2
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
		TEXT=49;
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
			"FILE_NAME_ID", "TEXT"
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
			"TEXT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0211\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\6\60\u01d6\n\60\r\60\16\60\u01d7\3\60\7\60"+
		"\u01db\n\60\f\60\16\60\u01de\13\60\3\61\6\61\u01e1\n\61\r\61\16\61\u01e2"+
		"\3\61\7\61\u01e6\n\61\f\61\16\61\u01e9\13\61\3\61\6\61\u01ec\n\61\r\61"+
		"\16\61\u01ed\3\61\6\61\u01f1\n\61\r\61\16\61\u01f2\5\61\u01f5\n\61\3\62"+
		"\3\62\6\62\u01f9\n\62\r\62\16\62\u01fa\3\62\6\62\u01fe\n\62\r\62\16\62"+
		"\u01ff\6\62\u0202\n\62\r\62\16\62\u0203\3\62\7\62\u0207\n\62\f\62\16\62"+
		"\u020a\13\62\6\62\u020c\n\62\r\62\16\62\u020d\3\62\3\62\2\2\63\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\5\5\2\13\13\17\17\"\"\4"+
		"\2C\\c|\3\2\63;\2\u021d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5j\3\2\2\2\7p\3\2\2"+
		"\2\tu\3\2\2\2\13}\3\2\2\2\r\u0082\3\2\2\2\17\u008a\3\2\2\2\21\u008f\3"+
		"\2\2\2\23\u0097\3\2\2\2\25\u009c\3\2\2\2\27\u00a4\3\2\2\2\31\u00a9\3\2"+
		"\2\2\33\u00b0\3\2\2\2\35\u00b7\3\2\2\2\37\u00c0\3\2\2\2!\u00c8\3\2\2\2"+
		"#\u00d0\3\2\2\2%\u00dd\3\2\2\2\'\u00ed\3\2\2\2)\u00f7\3\2\2\2+\u0104\3"+
		"\2\2\2-\u010f\3\2\2\2/\u011d\3\2\2\2\61\u012b\3\2\2\2\63\u013c\3\2\2\2"+
		"\65\u014a\3\2\2\2\67\u015b\3\2\2\29\u0166\3\2\2\2;\u0174\3\2\2\2=\u017f"+
		"\3\2\2\2?\u018d\3\2\2\2A\u0198\3\2\2\2C\u01a6\3\2\2\2E\u01ad\3\2\2\2G"+
		"\u01b0\3\2\2\2I\u01b4\3\2\2\2K\u01b7\3\2\2\2M\u01bd\3\2\2\2O\u01c3\3\2"+
		"\2\2Q\u01c5\3\2\2\2S\u01c7\3\2\2\2U\u01c9\3\2\2\2W\u01cb\3\2\2\2Y\u01cd"+
		"\3\2\2\2[\u01cf\3\2\2\2]\u01d1\3\2\2\2_\u01d3\3\2\2\2a\u01f4\3\2\2\2c"+
		"\u01f6\3\2\2\2ef\7p\2\2fg\7c\2\2gh\7o\2\2hi\7g\2\2i\4\3\2\2\2jk\7x\2\2"+
		"kl\7c\2\2lm\7n\2\2mn\7w\2\2no\7g\2\2o\6\3\2\2\2pq\7D\2\2qr\7q\2\2rs\7"+
		"f\2\2st\7{\2\2t\b\3\2\2\2uv\7g\2\2vw\7p\2\2wx\7f\2\2xy\7D\2\2yz\7q\2\2"+
		"z{\7f\2\2{|\7{\2\2|\n\3\2\2\2}~\7V\2\2~\177\7g\2\2\177\u0080\7z\2\2\u0080"+
		"\u0081\7v\2\2\u0081\f\3\2\2\2\u0082\u0083\7g\2\2\u0083\u0084\7p\2\2\u0084"+
		"\u0085\7f\2\2\u0085\u0086\7V\2\2\u0086\u0087\7g\2\2\u0087\u0088\7z\2\2"+
		"\u0088\u0089\7v\2\2\u0089\16\3\2\2\2\u008a\u008b\7R\2\2\u008b\u008c\7"+
		"c\2\2\u008c\u008d\7i\2\2\u008d\u008e\7g\2\2\u008e\20\3\2\2\2\u008f\u0090"+
		"\7g\2\2\u0090\u0091\7p\2\2\u0091\u0092\7f\2\2\u0092\u0093\7R\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u0095\7i\2\2\u0095\u0096\7g\2\2\u0096\22\3\2\2\2\u0097"+
		"\u0098\7J\2\2\u0098\u0099\7g\2\2\u0099\u009a\7c\2\2\u009a\u009b\7f\2\2"+
		"\u009b\24\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7p\2\2\u009e\u009f\7"+
		"f\2\2\u009f\u00a0\7J\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3"+
		"\7f\2\2\u00a3\26\3\2\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7"+
		"\7z\2\2\u00a7\u00a8\7v\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab"+
		"\7e\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7q\2\2\u00ae"+
		"\u00af\7p\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7v\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7f\2\2"+
		"\u00b6\34\3\2\2\2\u00b7\u00b8\7R\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7"+
		"u\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7H\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be"+
		"\7t\2\2\u00be\u00bf\7o\2\2\u00bf\36\3\2\2\2\u00c0\u00c1\7I\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7H\2\2\u00c4\u00c5\7q\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7o\2\2\u00c7 \3\2\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7p\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7H\2\2\u00cc\u00cd\7q\2\2"+
		"\u00cd\u00ce\7t\2\2\u00ce\u00cf\7o\2\2\u00cf\"\3\2\2\2\u00d0\u00d1\7U"+
		"\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7d\2\2\u00d3\u00d4\7o\2\2\u00d4\u00d5"+
		"\7k\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7D\2\2\u00d7\u00d8\7w\2\2\u00d8"+
		"\u00d9\7v\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7p\2\2"+
		"\u00dc$\3\2\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7f\2"+
		"\2\u00e0\u00e1\7U\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7d\2\2\u00e3\u00e4"+
		"\7o\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7D\2\2\u00e7"+
		"\u00e8\7w\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7q\2\2"+
		"\u00eb\u00ec\7p\2\2\u00ec&\3\2\2\2\u00ed\u00ee\7V\2\2\u00ee\u00ef\7g\2"+
		"\2\u00ef\u00f0\7z\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7H\2\2\u00f2\u00f3"+
		"\7k\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7f\2\2\u00f6"+
		"(\3\2\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7f\2\2\u00fa"+
		"\u00fb\7V\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7z\2\2\u00fd\u00fe\7v\2\2"+
		"\u00fe\u00ff\7H\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7g\2\2\u0101\u0102"+
		"\7n\2\2\u0102\u0103\7f\2\2\u0103*\3\2\2\2\u0104\u0105\7G\2\2\u0105\u0106"+
		"\7o\2\2\u0106\u0107\7c\2\2\u0107\u0108\7k\2\2\u0108\u0109\7n\2\2\u0109"+
		"\u010a\7H\2\2\u010a\u010b\7k\2\2\u010b\u010c\7g\2\2\u010c\u010d\7n\2\2"+
		"\u010d\u010e\7f\2\2\u010e,\3\2\2\2\u010f\u0110\7g\2\2\u0110\u0111\7p\2"+
		"\2\u0111\u0112\7f\2\2\u0112\u0113\7G\2\2\u0113\u0114\7o\2\2\u0114\u0115"+
		"\7c\2\2\u0115\u0116\7k\2\2\u0116\u0117\7n\2\2\u0117\u0118\7H\2\2\u0118"+
		"\u0119\7k\2\2\u0119\u011a\7g\2\2\u011a\u011b\7n\2\2\u011b\u011c\7f\2\2"+
		"\u011c.\3\2\2\2\u011d\u011e\7R\2\2\u011e\u011f\7c\2\2\u011f\u0120\7u\2"+
		"\2\u0120\u0121\7u\2\2\u0121\u0122\7y\2\2\u0122\u0123\7q\2\2\u0123\u0124"+
		"\7t\2\2\u0124\u0125\7f\2\2\u0125\u0126\7H\2\2\u0126\u0127\7k\2\2\u0127"+
		"\u0128\7g\2\2\u0128\u0129\7n\2\2\u0129\u012a\7f\2\2\u012a\60\3\2\2\2\u012b"+
		"\u012c\7g\2\2\u012c\u012d\7p\2\2\u012d\u012e\7f\2\2\u012e\u012f\7R\2\2"+
		"\u012f\u0130\7c\2\2\u0130\u0131\7u\2\2\u0131\u0132\7u\2\2\u0132\u0133"+
		"\7y\2\2\u0133\u0134\7q\2\2\u0134\u0135\7t\2\2\u0135\u0136\7f\2\2\u0136"+
		"\u0137\7H\2\2\u0137\u0138\7k\2\2\u0138\u0139\7g\2\2\u0139\u013a\7n\2\2"+
		"\u013a\u013b\7f\2\2\u013b\62\3\2\2\2\u013c\u013d\7E\2\2\u013d\u013e\7"+
		"j\2\2\u013e\u013f\7g\2\2\u013f\u0140\7e\2\2\u0140\u0141\7m\2\2\u0141\u0142"+
		"\7D\2\2\u0142\u0143\7q\2\2\u0143\u0144\7z\2\2\u0144\u0145\7H\2\2\u0145"+
		"\u0146\7k\2\2\u0146\u0147\7g\2\2\u0147\u0148\7n\2\2\u0148\u0149\7f\2\2"+
		"\u0149\64\3\2\2\2\u014a\u014b\7g\2\2\u014b\u014c\7p\2\2\u014c\u014d\7"+
		"f\2\2\u014d\u014e\7E\2\2\u014e\u014f\7j\2\2\u014f\u0150\7g\2\2\u0150\u0151"+
		"\7e\2\2\u0151\u0152\7m\2\2\u0152\u0153\7D\2\2\u0153\u0154\7q\2\2\u0154"+
		"\u0155\7z\2\2\u0155\u0156\7H\2\2\u0156\u0157\7k\2\2\u0157\u0158\7g\2\2"+
		"\u0158\u0159\7n\2\2\u0159\u015a\7f\2\2\u015a\66\3\2\2\2\u015b\u015c\7"+
		"T\2\2\u015c\u015d\7c\2\2\u015d\u015e\7f\2\2\u015e\u015f\7k\2\2\u015f\u0160"+
		"\7q\2\2\u0160\u0161\7H\2\2\u0161\u0162\7k\2\2\u0162\u0163\7g\2\2\u0163"+
		"\u0164\7n\2\2\u0164\u0165\7f\2\2\u01658\3\2\2\2\u0166\u0167\7g\2\2\u0167"+
		"\u0168\7p\2\2\u0168\u0169\7f\2\2\u0169\u016a\7T\2\2\u016a\u016b\7c\2\2"+
		"\u016b\u016c\7f\2\2\u016c\u016d\7k\2\2\u016d\u016e\7q\2\2\u016e\u016f"+
		"\7H\2\2\u016f\u0170\7k\2\2\u0170\u0171\7g\2\2\u0171\u0172\7n\2\2\u0172"+
		"\u0173\7f\2\2\u0173:\3\2\2\2\u0174\u0175\7E\2\2\u0175\u0176\7q\2\2\u0176"+
		"\u0177\7p\2\2\u0177\u0178\7v\2\2\u0178\u0179\7t\2\2\u0179\u017a\7q\2\2"+
		"\u017a\u017b\7n\2\2\u017b\u017c\7n\2\2\u017c\u017d\7g\2\2\u017d\u017e"+
		"\7t\2\2\u017e<\3\2\2\2\u017f\u0180\7g\2\2\u0180\u0181\7p\2\2\u0181\u0182"+
		"\7f\2\2\u0182\u0183\7E\2\2\u0183\u0184\7q\2\2\u0184\u0185\7p\2\2\u0185"+
		"\u0186\7v\2\2\u0186\u0187\7t\2\2\u0187\u0188\7q\2\2\u0188\u0189\7n\2\2"+
		"\u0189\u018a\7n\2\2\u018a\u018b\7g\2\2\u018b\u018c\7t\2\2\u018c>\3\2\2"+
		"\2\u018d\u018e\7T\2\2\u018e\u018f\7c\2\2\u018f\u0190\7f\2\2\u0190\u0191"+
		"\7k\2\2\u0191\u0192\7q\2\2\u0192\u0193\7I\2\2\u0193\u0194\7t\2\2\u0194"+
		"\u0195\7q\2\2\u0195\u0196\7w\2\2\u0196\u0197\7r\2\2\u0197@\3\2\2\2\u0198"+
		"\u0199\7g\2\2\u0199\u019a\7p\2\2\u019a\u019b\7f\2\2\u019b\u019c\7T\2\2"+
		"\u019c\u019d\7c\2\2\u019d\u019e\7f\2\2\u019e\u019f\7k\2\2\u019f\u01a0"+
		"\7q\2\2\u01a0\u01a1\7I\2\2\u01a1\u01a2\7t\2\2\u01a2\u01a3\7q\2\2\u01a3"+
		"\u01a4\7w\2\2\u01a4\u01a5\7r\2\2\u01a5B\3\2\2\2\u01a6\u01a7\7D\2\2\u01a7"+
		"\u01a8\7w\2\2\u01a8\u01a9\7p\2\2\u01a9\u01aa\7f\2\2\u01aa\u01ab\7n\2\2"+
		"\u01ab\u01ac\7g\2\2\u01acD\3\2\2\2\u01ad\u01ae\7k\2\2\u01ae\u01af\7h\2"+
		"\2\u01afF\3\2\2\2\u01b0\u01b1\7C\2\2\u01b1\u01b2\7P\2\2\u01b2\u01b3\7"+
		"F\2\2\u01b3H\3\2\2\2\u01b4\u01b5\7Q\2\2\u01b5\u01b6\7T\2\2\u01b6J\3\2"+
		"\2\2\u01b7\u01b8\7G\2\2\u01b8\u01b9\7S\2\2\u01b9\u01ba\7W\2\2\u01ba\u01bb"+
		"\7C\2\2\u01bb\u01bc\7N\2\2\u01bcL\3\2\2\2\u01bd\u01be\7r\2\2\u01be\u01bf"+
		"\7t\2\2\u01bf\u01c0\7k\2\2\u01c0\u01c1\7p\2\2\u01c1\u01c2\7v\2\2\u01c2"+
		"N\3\2\2\2\u01c3\u01c4\7\f\2\2\u01c4P\3\2\2\2\u01c5\u01c6\t\2\2\2\u01c6"+
		"R\3\2\2\2\u01c7\u01c8\7)\2\2\u01c8T\3\2\2\2\u01c9\u01ca\7?\2\2\u01caV"+
		"\3\2\2\2\u01cb\u01cc\7]\2\2\u01ccX\3\2\2\2\u01cd\u01ce\7_\2\2\u01ceZ\3"+
		"\2\2\2\u01cf\u01d0\7*\2\2\u01d0\\\3\2\2\2\u01d1\u01d2\7+\2\2\u01d2^\3"+
		"\2\2\2\u01d3\u01d5\7a\2\2\u01d4\u01d6\t\3\2\2\u01d5\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01dc\3\2"+
		"\2\2\u01d9\u01db\t\4\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd`\3\2\2\2\u01de\u01dc\3\2\2\2"+
		"\u01df\u01e1\t\3\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e7\3\2\2\2\u01e4\u01e6\t\4\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2"+
		"\2\2\u01e8\u01f5\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ec\t\3\2\2\u01eb"+
		"\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01f1\t\4\2\2\u01f0\u01ef\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2"+
		"\2\2\u01f4\u01e0\3\2\2\2\u01f4\u01eb\3\2\2\2\u01f5b\3\2\2\2\u01f6\u020b"+
		"\5S*\2\u01f7\u01f9\t\3\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u0202\3\2\2\2\u01fc\u01fe\t\4"+
		"\2\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u01f8\3\2\2\2\u0201\u01fd\3\2"+
		"\2\2\u0202\u0203\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0208\3\2\2\2\u0205\u0207\5Q)\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2"+
		"\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208"+
		"\3\2\2\2\u020b\u0201\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\5S*\2\u0210d\3\2\2\2\20"+
		"\2\u01d7\u01dc\u01e2\u01e7\u01ed\u01f2\u01f4\u01fa\u01ff\u0201\u0203\u0208"+
		"\u020d\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}