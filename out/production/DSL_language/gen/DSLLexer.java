// Generated from D:/Documents/GitHub/DSL-language2/out/production/DSL_language\DSLLexer.g4 by ANTLR 4.9.1
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
		RADIO_GROUP=31, END_RADIO_GROUP=32, BUNDLE_ID=33, IF_ID=34, IFBODY_DEF_ID=35, 
		IFBODY_DEF_END_ID=36, AND_OP_ID=37, OR_OP_ID=38, EQUAL_OP_ID=39, PRINT_ACTION=40, 
		NEWLINE=41, WHITE_SPACE=42, SINGLE_QUOTE=43, ASSIGN=44, OPEN_SQR_BRACKT_ID=45, 
		CLOSE_SQR_BRACKT_ID=46, OPEN_PAR_BRACKT_ID=47, CLOSE_PAR_BRACKT_ID=48, 
		VAR_NAME_ID=49, FILE_NAME_ID=50, TEXT=51, TEXTNUM=52;
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
			"END_RADIO_GROUP", "BUNDLE_ID", "IF_ID", "IFBODY_DEF_ID", "IFBODY_DEF_END_ID", 
			"AND_OP_ID", "OR_OP_ID", "EQUAL_OP_ID", "PRINT_ACTION", "NEWLINE", "WHITE_SPACE", 
			"SINGLE_QUOTE", "ASSIGN", "OPEN_SQR_BRACKT_ID", "CLOSE_SQR_BRACKT_ID", 
			"OPEN_PAR_BRACKT_ID", "CLOSE_PAR_BRACKT_ID", "VAR_NAME_ID", "FILE_NAME_ID", 
			"TEXT", "TEXTNUM"
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
			"'endRadioGroup'", "'Bundle'", "'if'", "'ifBody'", "'endIfBody'", "'AND'", 
			"'OR'", "'EQUAL'", "'print'", "'\n'", null, "'''", "'='", "'['", "']'", 
			"'('", "')'"
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
			"RADIO_GROUP", "END_RADIO_GROUP", "BUNDLE_ID", "IF_ID", "IFBODY_DEF_ID", 
			"IFBODY_DEF_END_ID", "AND_OP_ID", "OR_OP_ID", "EQUAL_OP_ID", "PRINT_ACTION", 
			"NEWLINE", "WHITE_SPACE", "SINGLE_QUOTE", "ASSIGN", "OPEN_SQR_BRACKT_ID", 
			"CLOSE_SQR_BRACKT_ID", "OPEN_PAR_BRACKT_ID", "CLOSE_PAR_BRACKT_ID", "VAR_NAME_ID", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u022d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\6\62\u01ed\n\62\r\62\16\62"+
		"\u01ee\3\62\7\62\u01f2\n\62\f\62\16\62\u01f5\13\62\3\63\6\63\u01f8\n\63"+
		"\r\63\16\63\u01f9\3\63\7\63\u01fd\n\63\f\63\16\63\u0200\13\63\3\63\6\63"+
		"\u0203\n\63\r\63\16\63\u0204\3\63\6\63\u0208\n\63\r\63\16\63\u0209\5\63"+
		"\u020c\n\63\3\64\3\64\6\64\u0210\n\64\r\64\16\64\u0211\3\64\6\64\u0215"+
		"\n\64\r\64\16\64\u0216\6\64\u0219\n\64\r\64\16\64\u021a\3\64\7\64\u021e"+
		"\n\64\f\64\16\64\u0221\13\64\6\64\u0223\n\64\r\64\16\64\u0224\3\64\3\64"+
		"\3\65\6\65\u022a\n\65\r\65\16\65\u022b\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66\3\2\5\5\2\13\13\17\17\"\"\4\2C\\"+
		"c|\3\2\63;\2\u023a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k"+
		"\3\2\2\2\5p\3\2\2\2\7v\3\2\2\2\t{\3\2\2\2\13\u0083\3\2\2\2\r\u0088\3\2"+
		"\2\2\17\u0090\3\2\2\2\21\u0095\3\2\2\2\23\u009d\3\2\2\2\25\u00a2\3\2\2"+
		"\2\27\u00aa\3\2\2\2\31\u00af\3\2\2\2\33\u00b6\3\2\2\2\35\u00bd\3\2\2\2"+
		"\37\u00c6\3\2\2\2!\u00ce\3\2\2\2#\u00d6\3\2\2\2%\u00e3\3\2\2\2\'\u00f3"+
		"\3\2\2\2)\u00fd\3\2\2\2+\u010a\3\2\2\2-\u0115\3\2\2\2/\u0123\3\2\2\2\61"+
		"\u0131\3\2\2\2\63\u0142\3\2\2\2\65\u0150\3\2\2\2\67\u0161\3\2\2\29\u016c"+
		"\3\2\2\2;\u017a\3\2\2\2=\u0185\3\2\2\2?\u0193\3\2\2\2A\u019e\3\2\2\2C"+
		"\u01ac\3\2\2\2E\u01b3\3\2\2\2G\u01b6\3\2\2\2I\u01bd\3\2\2\2K\u01c7\3\2"+
		"\2\2M\u01cb\3\2\2\2O\u01ce\3\2\2\2Q\u01d4\3\2\2\2S\u01da\3\2\2\2U\u01dc"+
		"\3\2\2\2W\u01de\3\2\2\2Y\u01e0\3\2\2\2[\u01e2\3\2\2\2]\u01e4\3\2\2\2_"+
		"\u01e6\3\2\2\2a\u01e8\3\2\2\2c\u01ea\3\2\2\2e\u020b\3\2\2\2g\u020d\3\2"+
		"\2\2i\u0229\3\2\2\2kl\7p\2\2lm\7c\2\2mn\7o\2\2no\7g\2\2o\4\3\2\2\2pq\7"+
		"x\2\2qr\7c\2\2rs\7n\2\2st\7w\2\2tu\7g\2\2u\6\3\2\2\2vw\7D\2\2wx\7q\2\2"+
		"xy\7f\2\2yz\7{\2\2z\b\3\2\2\2{|\7g\2\2|}\7p\2\2}~\7f\2\2~\177\7D\2\2\177"+
		"\u0080\7q\2\2\u0080\u0081\7f\2\2\u0081\u0082\7{\2\2\u0082\n\3\2\2\2\u0083"+
		"\u0084\7V\2\2\u0084\u0085\7g\2\2\u0085\u0086\7z\2\2\u0086\u0087\7v\2\2"+
		"\u0087\f\3\2\2\2\u0088\u0089\7g\2\2\u0089\u008a\7p\2\2\u008a\u008b\7f"+
		"\2\2\u008b\u008c\7V\2\2\u008c\u008d\7g\2\2\u008d\u008e\7z\2\2\u008e\u008f"+
		"\7v\2\2\u008f\16\3\2\2\2\u0090\u0091\7R\2\2\u0091\u0092\7c\2\2\u0092\u0093"+
		"\7i\2\2\u0093\u0094\7g\2\2\u0094\20\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097"+
		"\7p\2\2\u0097\u0098\7f\2\2\u0098\u0099\7R\2\2\u0099\u009a\7c\2\2\u009a"+
		"\u009b\7i\2\2\u009b\u009c\7g\2\2\u009c\22\3\2\2\2\u009d\u009e\7J\2\2\u009e"+
		"\u009f\7g\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7f\2\2\u00a1\24\3\2\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7J\2\2"+
		"\u00a6\u00a7\7g\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7f\2\2\u00a9\26\3\2"+
		"\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7z\2\2\u00ad\u00ae"+
		"\7v\2\2\u00ae\30\3\2\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2"+
		"\7v\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7p\2\2\u00b5"+
		"\32\3\2\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7j\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7f\2\2\u00bc\34\3\2\2\2\u00bd"+
		"\u00be\7R\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7v\2\2"+
		"\u00c1\u00c2\7H\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5"+
		"\7o\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7I\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9"+
		"\7v\2\2\u00c9\u00ca\7H\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7t\2\2\u00cc"+
		"\u00cd\7o\2\2\u00cd \3\2\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7p\2\2\u00d0"+
		"\u00d1\7f\2\2\u00d1\u00d2\7H\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7t\2\2"+
		"\u00d4\u00d5\7o\2\2\u00d5\"\3\2\2\2\u00d6\u00d7\7U\2\2\u00d7\u00d8\7w"+
		"\2\2\u00d8\u00d9\7d\2\2\u00d9\u00da\7o\2\2\u00da\u00db\7k\2\2\u00db\u00dc"+
		"\7v\2\2\u00dc\u00dd\7D\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7v\2\2\u00df"+
		"\u00e0\7v\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7p\2\2\u00e2$\3\2\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7U\2\2"+
		"\u00e7\u00e8\7w\2\2\u00e8\u00e9\7d\2\2\u00e9\u00ea\7o\2\2\u00ea\u00eb"+
		"\7k\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7D\2\2\u00ed\u00ee\7w\2\2\u00ee"+
		"\u00ef\7v\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7p\2\2"+
		"\u00f2&\3\2\2\2\u00f3\u00f4\7V\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7z\2"+
		"\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7H\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa"+
		"\7g\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7f\2\2\u00fc(\3\2\2\2\u00fd\u00fe"+
		"\7g\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7f\2\2\u0100\u0101\7V\2\2\u0101"+
		"\u0102\7g\2\2\u0102\u0103\7z\2\2\u0103\u0104\7v\2\2\u0104\u0105\7H\2\2"+
		"\u0105\u0106\7k\2\2\u0106\u0107\7g\2\2\u0107\u0108\7n\2\2\u0108\u0109"+
		"\7f\2\2\u0109*\3\2\2\2\u010a\u010b\7G\2\2\u010b\u010c\7o\2\2\u010c\u010d"+
		"\7c\2\2\u010d\u010e\7k\2\2\u010e\u010f\7n\2\2\u010f\u0110\7H\2\2\u0110"+
		"\u0111\7k\2\2\u0111\u0112\7g\2\2\u0112\u0113\7n\2\2\u0113\u0114\7f\2\2"+
		"\u0114,\3\2\2\2\u0115\u0116\7g\2\2\u0116\u0117\7p\2\2\u0117\u0118\7f\2"+
		"\2\u0118\u0119\7G\2\2\u0119\u011a\7o\2\2\u011a\u011b\7c\2\2\u011b\u011c"+
		"\7k\2\2\u011c\u011d\7n\2\2\u011d\u011e\7H\2\2\u011e\u011f\7k\2\2\u011f"+
		"\u0120\7g\2\2\u0120\u0121\7n\2\2\u0121\u0122\7f\2\2\u0122.\3\2\2\2\u0123"+
		"\u0124\7R\2\2\u0124\u0125\7c\2\2\u0125\u0126\7u\2\2\u0126\u0127\7u\2\2"+
		"\u0127\u0128\7y\2\2\u0128\u0129\7q\2\2\u0129\u012a\7t\2\2\u012a\u012b"+
		"\7f\2\2\u012b\u012c\7H\2\2\u012c\u012d\7k\2\2\u012d\u012e\7g\2\2\u012e"+
		"\u012f\7n\2\2\u012f\u0130\7f\2\2\u0130\60\3\2\2\2\u0131\u0132\7g\2\2\u0132"+
		"\u0133\7p\2\2\u0133\u0134\7f\2\2\u0134\u0135\7R\2\2\u0135\u0136\7c\2\2"+
		"\u0136\u0137\7u\2\2\u0137\u0138\7u\2\2\u0138\u0139\7y\2\2\u0139\u013a"+
		"\7q\2\2\u013a\u013b\7t\2\2\u013b\u013c\7f\2\2\u013c\u013d\7H\2\2\u013d"+
		"\u013e\7k\2\2\u013e\u013f\7g\2\2\u013f\u0140\7n\2\2\u0140\u0141\7f\2\2"+
		"\u0141\62\3\2\2\2\u0142\u0143\7E\2\2\u0143\u0144\7j\2\2\u0144\u0145\7"+
		"g\2\2\u0145\u0146\7e\2\2\u0146\u0147\7m\2\2\u0147\u0148\7D\2\2\u0148\u0149"+
		"\7q\2\2\u0149\u014a\7z\2\2\u014a\u014b\7H\2\2\u014b\u014c\7k\2\2\u014c"+
		"\u014d\7g\2\2\u014d\u014e\7n\2\2\u014e\u014f\7f\2\2\u014f\64\3\2\2\2\u0150"+
		"\u0151\7g\2\2\u0151\u0152\7p\2\2\u0152\u0153\7f\2\2\u0153\u0154\7E\2\2"+
		"\u0154\u0155\7j\2\2\u0155\u0156\7g\2\2\u0156\u0157\7e\2\2\u0157\u0158"+
		"\7m\2\2\u0158\u0159\7D\2\2\u0159\u015a\7q\2\2\u015a\u015b\7z\2\2\u015b"+
		"\u015c\7H\2\2\u015c\u015d\7k\2\2\u015d\u015e\7g\2\2\u015e\u015f\7n\2\2"+
		"\u015f\u0160\7f\2\2\u0160\66\3\2\2\2\u0161\u0162\7T\2\2\u0162\u0163\7"+
		"c\2\2\u0163\u0164\7f\2\2\u0164\u0165\7k\2\2\u0165\u0166\7q\2\2\u0166\u0167"+
		"\7H\2\2\u0167\u0168\7k\2\2\u0168\u0169\7g\2\2\u0169\u016a\7n\2\2\u016a"+
		"\u016b\7f\2\2\u016b8\3\2\2\2\u016c\u016d\7g\2\2\u016d\u016e\7p\2\2\u016e"+
		"\u016f\7f\2\2\u016f\u0170\7T\2\2\u0170\u0171\7c\2\2\u0171\u0172\7f\2\2"+
		"\u0172\u0173\7k\2\2\u0173\u0174\7q\2\2\u0174\u0175\7H\2\2\u0175\u0176"+
		"\7k\2\2\u0176\u0177\7g\2\2\u0177\u0178\7n\2\2\u0178\u0179\7f\2\2\u0179"+
		":\3\2\2\2\u017a\u017b\7E\2\2\u017b\u017c\7q\2\2\u017c\u017d\7p\2\2\u017d"+
		"\u017e\7v\2\2\u017e\u017f\7t\2\2\u017f\u0180\7q\2\2\u0180\u0181\7n\2\2"+
		"\u0181\u0182\7n\2\2\u0182\u0183\7g\2\2\u0183\u0184\7t\2\2\u0184<\3\2\2"+
		"\2\u0185\u0186\7g\2\2\u0186\u0187\7p\2\2\u0187\u0188\7f\2\2\u0188\u0189"+
		"\7E\2\2\u0189\u018a\7q\2\2\u018a\u018b\7p\2\2\u018b\u018c\7v\2\2\u018c"+
		"\u018d\7t\2\2\u018d\u018e\7q\2\2\u018e\u018f\7n\2\2\u018f\u0190\7n\2\2"+
		"\u0190\u0191\7g\2\2\u0191\u0192\7t\2\2\u0192>\3\2\2\2\u0193\u0194\7T\2"+
		"\2\u0194\u0195\7c\2\2\u0195\u0196\7f\2\2\u0196\u0197\7k\2\2\u0197\u0198"+
		"\7q\2\2\u0198\u0199\7I\2\2\u0199\u019a\7t\2\2\u019a\u019b\7q\2\2\u019b"+
		"\u019c\7w\2\2\u019c\u019d\7r\2\2\u019d@\3\2\2\2\u019e\u019f\7g\2\2\u019f"+
		"\u01a0\7p\2\2\u01a0\u01a1\7f\2\2\u01a1\u01a2\7T\2\2\u01a2\u01a3\7c\2\2"+
		"\u01a3\u01a4\7f\2\2\u01a4\u01a5\7k\2\2\u01a5\u01a6\7q\2\2\u01a6\u01a7"+
		"\7I\2\2\u01a7\u01a8\7t\2\2\u01a8\u01a9\7q\2\2\u01a9\u01aa\7w\2\2\u01aa"+
		"\u01ab\7r\2\2\u01abB\3\2\2\2\u01ac\u01ad\7D\2\2\u01ad\u01ae\7w\2\2\u01ae"+
		"\u01af\7p\2\2\u01af\u01b0\7f\2\2\u01b0\u01b1\7n\2\2\u01b1\u01b2\7g\2\2"+
		"\u01b2D\3\2\2\2\u01b3\u01b4\7k\2\2\u01b4\u01b5\7h\2\2\u01b5F\3\2\2\2\u01b6"+
		"\u01b7\7k\2\2\u01b7\u01b8\7h\2\2\u01b8\u01b9\7D\2\2\u01b9\u01ba\7q\2\2"+
		"\u01ba\u01bb\7f\2\2\u01bb\u01bc\7{\2\2\u01bcH\3\2\2\2\u01bd\u01be\7g\2"+
		"\2\u01be\u01bf\7p\2\2\u01bf\u01c0\7f\2\2\u01c0\u01c1\7K\2\2\u01c1\u01c2"+
		"\7h\2\2\u01c2\u01c3\7D\2\2\u01c3\u01c4\7q\2\2\u01c4\u01c5\7f\2\2\u01c5"+
		"\u01c6\7{\2\2\u01c6J\3\2\2\2\u01c7\u01c8\7C\2\2\u01c8\u01c9\7P\2\2\u01c9"+
		"\u01ca\7F\2\2\u01caL\3\2\2\2\u01cb\u01cc\7Q\2\2\u01cc\u01cd\7T\2\2\u01cd"+
		"N\3\2\2\2\u01ce\u01cf\7G\2\2\u01cf\u01d0\7S\2\2\u01d0\u01d1\7W\2\2\u01d1"+
		"\u01d2\7C\2\2\u01d2\u01d3\7N\2\2\u01d3P\3\2\2\2\u01d4\u01d5\7r\2\2\u01d5"+
		"\u01d6\7t\2\2\u01d6\u01d7\7k\2\2\u01d7\u01d8\7p\2\2\u01d8\u01d9\7v\2\2"+
		"\u01d9R\3\2\2\2\u01da\u01db\7\f\2\2\u01dbT\3\2\2\2\u01dc\u01dd\t\2\2\2"+
		"\u01ddV\3\2\2\2\u01de\u01df\7)\2\2\u01dfX\3\2\2\2\u01e0\u01e1\7?\2\2\u01e1"+
		"Z\3\2\2\2\u01e2\u01e3\7]\2\2\u01e3\\\3\2\2\2\u01e4\u01e5\7_\2\2\u01e5"+
		"^\3\2\2\2\u01e6\u01e7\7*\2\2\u01e7`\3\2\2\2\u01e8\u01e9\7+\2\2\u01e9b"+
		"\3\2\2\2\u01ea\u01ec\7a\2\2\u01eb\u01ed\t\3\2\2\u01ec\u01eb\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f3\3\2"+
		"\2\2\u01f0\u01f2\t\4\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4d\3\2\2\2\u01f5\u01f3\3\2\2\2"+
		"\u01f6\u01f8\t\3\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01f7"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fe\3\2\2\2\u01fb\u01fd\t\4\2\2\u01fc"+
		"\u01fb\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2"+
		"\2\2\u01ff\u020c\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0203\t\3\2\2\u0202"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2"+
		"\2\2\u0205\u0207\3\2\2\2\u0206\u0208\t\4\2\2\u0207\u0206\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2"+
		"\2\2\u020b\u01f7\3\2\2\2\u020b\u0202\3\2\2\2\u020cf\3\2\2\2\u020d\u0222"+
		"\5W,\2\u020e\u0210\t\3\2\2\u020f\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0219\3\2\2\2\u0213\u0215\t\4"+
		"\2\2\u0214\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0214\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u020f\3\2\2\2\u0218\u0214\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021f\3\2\2\2\u021c\u021e\5U+\2\u021d\u021c\3\2\2\2\u021e\u0221\3\2\2"+
		"\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f"+
		"\3\2\2\2\u0222\u0218\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\5W,\2\u0227h\3\2\2\2\u0228"+
		"\u022a\t\4\2\2\u0229\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2"+
		"\2\2\u022b\u022c\3\2\2\2\u022cj\3\2\2\2\21\2\u01ee\u01f3\u01f9\u01fe\u0204"+
		"\u0209\u020b\u0211\u0216\u0218\u021a\u021f\u0224\u022b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}