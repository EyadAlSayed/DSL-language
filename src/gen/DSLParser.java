// Generated from D:/DSL-language/src\DSLParser.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONTROLLER_DEF_ID=1, CONTROLLER_DEF_END_ID=2, OPEN_SQR_BRACKT_ID=3, CLOSE_SQR_BRACKT_ID=4, 
		OPEN_PAR_BRACKT_ID=5, CLOSE_PAR_BRACKT_ID=6, BUNDLE_ID=7, VAR_NAME_ID=8, 
		PRINT_ACTION=9, AND_OP_ID=10, OR_OP_ID=11, EQUAL_OP_ID=12, NAME_ID=13;
	public static final int
		RULE_dslDocument = 0, RULE_controllerElement = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"dslDocument", "controllerElement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Controller'", "'endController'", "'['", "']'", "'('", "')'", 
			"'BUNDLE'", null, "'print'", null, null, "'equal'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONTROLLER_DEF_ID", "CONTROLLER_DEF_END_ID", "OPEN_SQR_BRACKT_ID", 
			"CLOSE_SQR_BRACKT_ID", "OPEN_PAR_BRACKT_ID", "CLOSE_PAR_BRACKT_ID", "BUNDLE_ID", 
			"VAR_NAME_ID", "PRINT_ACTION", "AND_OP_ID", "OR_OP_ID", "EQUAL_OP_ID", 
			"NAME_ID"
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

	@Override
	public String getGrammarFileName() { return "DSLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DslDocumentContext extends ParserRuleContext {
		public List<ControllerElementContext> controllerElement() {
			return getRuleContexts(ControllerElementContext.class);
		}
		public ControllerElementContext controllerElement(int i) {
			return getRuleContext(ControllerElementContext.class,i);
		}
		public DslDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dslDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterDslDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitDslDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitDslDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DslDocumentContext dslDocument() throws RecognitionException {
		DslDocumentContext _localctx = new DslDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dslDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONTROLLER_DEF_ID) {
				{
				{
				setState(4);
				controllerElement();
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControllerElementContext extends ParserRuleContext {
		public TerminalNode CONTROLLER_DEF_ID() { return getToken(DSLParser.CONTROLLER_DEF_ID, 0); }
		public ControllerElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controllerElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterControllerElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitControllerElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitControllerElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControllerElementContext controllerElement() throws RecognitionException {
		ControllerElementContext _localctx = new ControllerElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_controllerElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(CONTROLLER_DEF_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\17\4\2\t\2\4\3"+
		"\t\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\3\3\3\3\3\2\2\4\2\4\2\2\2\r\2\t"+
		"\3\2\2\2\4\f\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\13\3\2\2\2\t\7\3\2\2\2"+
		"\t\n\3\2\2\2\n\3\3\2\2\2\13\t\3\2\2\2\f\r\7\3\2\2\r\5\3\2\2\2\3\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}