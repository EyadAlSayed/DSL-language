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
		ASSIGN=1, OPEN_SQR_BRACKT_ID=2, CLOSE_SQR_BRACKT_ID=3, OPEN_PAR_BRACKT_ID=4, 
		CLOSE_PAR_BRACKT_ID=5, SPACE=6, CONTROLLER_DEF_ID=7, CONTROLLER_DEF_END_ID=8, 
		BUNDLE_ID=9, VAR_NAME_ID=10, NAME_ID=11, PRINT_ACTION=12, AND_OP_ID=13, 
		OR_OP_ID=14, EQUAL_OP_ID=15, IF_ID=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSIGN", "OPEN_SQR_BRACKT_ID", "CLOSE_SQR_BRACKT_ID", "OPEN_PAR_BRACKT_ID", 
			"CLOSE_PAR_BRACKT_ID", "SPACE", "CONTROLLER_DEF_ID", "CONTROLLER_DEF_END_ID", 
			"BUNDLE_ID", "VAR_NAME_ID", "NAME_ID", "PRINT_ACTION", "AND_OP_ID", "OR_OP_ID", 
			"EQUAL_OP_ID", "IF_ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'['", "']'", "'('", "')'", "' '", "'Controller'", "'endController'", 
			null, null, null, "'print'", null, null, "'equal'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "OPEN_SQR_BRACKT_ID", "CLOSE_SQR_BRACKT_ID", "OPEN_PAR_BRACKT_ID", 
			"CLOSE_PAR_BRACKT_ID", "SPACE", "CONTROLLER_DEF_ID", "CONTROLLER_DEF_END_ID", 
			"BUNDLE_ID", "VAR_NAME_ID", "NAME_ID", "PRINT_ACTION", "AND_OP_ID", "OR_OP_ID", 
			"EQUAL_OP_ID", "IF_ID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n[\n\n\3\13\3\13\6\13_\n\13\r\13\16\13`\3\13\7\13d\n\13\f\13\16"+
		"\13g\13\13\3\f\6\fj\n\f\r\f\16\fk\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16z\n\16\3\17\3\17\3\17\3\17\5\17\u0080\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u008c\n\21\2\2\22\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22\3\2\4\4\2C\\c|\3\2\63;\2\u0094\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3"+
		"\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17/\3\2\2\2\21:\3\2\2\2\23Z\3\2\2\2\25\\"+
		"\3\2\2\2\27i\3\2\2\2\31m\3\2\2\2\33y\3\2\2\2\35\177\3\2\2\2\37\u0081\3"+
		"\2\2\2!\u008b\3\2\2\2#$\7?\2\2$\4\3\2\2\2%&\7]\2\2&\6\3\2\2\2\'(\7_\2"+
		"\2(\b\3\2\2\2)*\7*\2\2*\n\3\2\2\2+,\7+\2\2,\f\3\2\2\2-.\7\"\2\2.\16\3"+
		"\2\2\2/\60\7E\2\2\60\61\7q\2\2\61\62\7p\2\2\62\63\7v\2\2\63\64\7t\2\2"+
		"\64\65\7q\2\2\65\66\7n\2\2\66\67\7n\2\2\678\7g\2\289\7t\2\29\20\3\2\2"+
		"\2:;\7g\2\2;<\7p\2\2<=\7f\2\2=>\7E\2\2>?\7q\2\2?@\7p\2\2@A\7v\2\2AB\7"+
		"t\2\2BC\7q\2\2CD\7n\2\2DE\7n\2\2EF\7g\2\2FG\7t\2\2G\22\3\2\2\2HI\7D\2"+
		"\2IJ\7W\2\2JK\7P\2\2KL\7F\2\2LM\7N\2\2M[\7G\2\2NO\7d\2\2OP\7w\2\2PQ\7"+
		"p\2\2QR\7f\2\2RS\7n\2\2S[\7g\2\2TU\7D\2\2UV\7w\2\2VW\7p\2\2WX\7f\2\2X"+
		"Y\7n\2\2Y[\7g\2\2ZH\3\2\2\2ZN\3\2\2\2ZT\3\2\2\2[\24\3\2\2\2\\^\7a\2\2"+
		"]_\t\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ae\3\2\2\2bd\t\3\2\2"+
		"cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\26\3\2\2\2ge\3\2\2\2hj\t\2\2"+
		"\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\30\3\2\2\2mn\7r\2\2no\7t\2"+
		"\2op\7k\2\2pq\7p\2\2qr\7v\2\2r\32\3\2\2\2st\7c\2\2tu\7p\2\2uz\7f\2\2v"+
		"w\7C\2\2wx\7P\2\2xz\7F\2\2ys\3\2\2\2yv\3\2\2\2z\34\3\2\2\2{|\7q\2\2|\u0080"+
		"\7t\2\2}~\7Q\2\2~\u0080\7T\2\2\177{\3\2\2\2\177}\3\2\2\2\u0080\36\3\2"+
		"\2\2\u0081\u0082\7g\2\2\u0082\u0083\7s\2\2\u0083\u0084\7w\2\2\u0084\u0085"+
		"\7c\2\2\u0085\u0086\7n\2\2\u0086 \3\2\2\2\u0087\u0088\7k\2\2\u0088\u008c"+
		"\7h\2\2\u0089\u008a\7K\2\2\u008a\u008c\7H\2\2\u008b\u0087\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\"\3\2\2\2\n\2Z`eky\177\u008b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}