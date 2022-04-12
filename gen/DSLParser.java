// Generated from D:/DSL_language/src\DSLParser.g4 by ANTLR 4.9.2
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
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML=3, CDATA=4, DTD=5, SCRIPTLET=6, 
		SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, MODEL_VARIABLE=11, 
		TAG_OPEN_INPUT=12, HTML_TEXT=13, TAG_OPEN_MUSTACH=14, APP=15, NGFOR=16, 
		NGSHOW=17, NGHIDE=18, NGIF=19, NGSWITCH=20, NGSWITCHCASE=21, NGSWITCHDEFAULT=22, 
		EVENT=23, TYPE=24, NG_MODEL=25, TAG_CLOSE=26, TAG_SLASH_CLOSE=27, TAG_SLASH=28, 
		TAG_EQUALS=29, TAG_NAME_INPUT_END=30, TAG_NAME=31, TAG_WHITESPACE=32, 
		TAG_SQ_BRACKET=33, TAG_CARLE_BRACKET=34, VAR=35, SCRIPT_CLOSE=36, STYLE_BODY=37, 
		STYLE_SHORT_BODY=38, ATTVALUE_VALUE=39, ATTRIBUTE=40, APPEQUAL=41, APP_CLOSE=42, 
		NG_SWITCH_ATTRBIUTE=43, NG_SWITCH_VALUE=44, NG_SWITCH_CASE_ATTRBIUTE=45, 
		NG_SWITCH_CASE_VALUE=46, IN=47, NGFOREQUAL=48, SPACE=49, EQUALS=50, SEM_COLON=51, 
		SINGLE_QUOTE=52, NG_FOR_CLOSE=53, NG_FOR_VALUE=54, DOT=55, NGSHOWEQUAL=56, 
		LOG_OP=57, NG_SHOW_CLOSE=58, NGHIDEEQUAL=59, NG_HIDE_CLOSE=60, NGIFEQUAL=61, 
		NG_IF_CLOSE=62, TAG_NAME_INPUT_BEGIN=63, TAG_CLOSE_INPUT=64, TAG_SLASH_CLOSE_INPUT=65, 
		TYPE_EQUALS=66, NG_MODEL_EQUALS=67, TYPE_VALUE=68, TYPE_ATTRIBUTE=69, 
		MODEL_VALUE=70, MODEL_ATTRIBUTE=71, VAR_VARIABLE=72, VAR_EQUALS=73, VAR_OBJ=74, 
		VAR_VARIABLE_VALUE=75, MY_FORMATER_NAME=76, FUNCTION_SPLITER=77, FUNCTION_INDICATOR=78, 
		FUNCTION_NAME=79, MY_FORMATER=80, FORMATER_TYPE=81, DATE_FORMAT=82, COMMA=83, 
		CLOSE_SQ_BRACKET_C=84, CLOSE_SQ_BRACKET=85, SQ_BRACKET_VALUE=86, SQ_BRACKET_ATT=87, 
		PIP=88, CLOSE_CARLE_BRAKET=89, CARLE_BRAKET_VALUE=90, MUSTACH_CLOSE=91, 
		MUSTACH_VALUE=92, EVENT_CLOSE=93, EVENTEQUAL=94, EVENT_ATTRIBUTE=95;
	public static final int
		RULE_htmlDocument = 0, RULE_scriptletOrSeaWs = 1, RULE_htmlElements = 2, 
		RULE_htmlElement = 3, RULE_htmlData = 4, RULE_htmlContent = 5, RULE_htmlAttribute = 6, 
		RULE_app = 7, RULE_ng_for = 8, RULE_ngfor_close = 9, RULE_ng_show = 10, 
		RULE_ng_hide = 11, RULE_ng_if = 12, RULE_model_variable = 13, RULE_ngswitch = 14, 
		RULE_ngswitch_case = 15, RULE_ngswitch_default = 16, RULE_ngmodel = 17, 
		RULE_event = 18, RULE_mustach_open = 19, RULE_mustach_body = 20, RULE_open_b = 21, 
		RULE_b_attribute = 22, RULE_htmlChardata = 23, RULE_htmlMisc = 24, RULE_htmlComment = 25, 
		RULE_script = 26, RULE_style = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "scriptletOrSeaWs", "htmlElements", "htmlElement", "htmlData", 
			"htmlContent", "htmlAttribute", "app", "ng_for", "ngfor_close", "ng_show", 
			"ng_hide", "ng_if", "model_variable", "ngswitch", "ngswitch_case", "ngswitch_default", 
			"ngmodel", "event", "mustach_open", "mustach_body", "open_b", "b_attribute", 
			"htmlChardata", "htmlMisc", "htmlComment", "script", "style"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'<'", null, 
			null, null, null, "'app'", null, null, null, null, "'ng-switch'", "'ng-switch-case'", 
			"'ng-switchDefault'", null, null, null, "'>'", "'/>'", "'/'", "'='", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "' '", null, "';'", null, null, 
			null, "'.'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'myFormater'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", 
			"SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "MODEL_VARIABLE", 
			"TAG_OPEN_INPUT", "HTML_TEXT", "TAG_OPEN_MUSTACH", "APP", "NGFOR", "NGSHOW", 
			"NGHIDE", "NGIF", "NGSWITCH", "NGSWITCHCASE", "NGSWITCHDEFAULT", "EVENT", 
			"TYPE", "NG_MODEL", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", 
			"TAG_NAME_INPUT_END", "TAG_NAME", "TAG_WHITESPACE", "TAG_SQ_BRACKET", 
			"TAG_CARLE_BRACKET", "VAR", "SCRIPT_CLOSE", "STYLE_BODY", "STYLE_SHORT_BODY", 
			"ATTVALUE_VALUE", "ATTRIBUTE", "APPEQUAL", "APP_CLOSE", "NG_SWITCH_ATTRBIUTE", 
			"NG_SWITCH_VALUE", "NG_SWITCH_CASE_ATTRBIUTE", "NG_SWITCH_CASE_VALUE", 
			"IN", "NGFOREQUAL", "SPACE", "EQUALS", "SEM_COLON", "SINGLE_QUOTE", "NG_FOR_CLOSE", 
			"NG_FOR_VALUE", "DOT", "NGSHOWEQUAL", "LOG_OP", "NG_SHOW_CLOSE", "NGHIDEEQUAL", 
			"NG_HIDE_CLOSE", "NGIFEQUAL", "NG_IF_CLOSE", "TAG_NAME_INPUT_BEGIN", 
			"TAG_CLOSE_INPUT", "TAG_SLASH_CLOSE_INPUT", "TYPE_EQUALS", "NG_MODEL_EQUALS", 
			"TYPE_VALUE", "TYPE_ATTRIBUTE", "MODEL_VALUE", "MODEL_ATTRIBUTE", "VAR_VARIABLE", 
			"VAR_EQUALS", "VAR_OBJ", "VAR_VARIABLE_VALUE", "MY_FORMATER_NAME", "FUNCTION_SPLITER", 
			"FUNCTION_INDICATOR", "FUNCTION_NAME", "MY_FORMATER", "FORMATER_TYPE", 
			"DATE_FORMAT", "COMMA", "CLOSE_SQ_BRACKET_C", "CLOSE_SQ_BRACKET", "SQ_BRACKET_VALUE", 
			"SQ_BRACKET_ATT", "PIP", "CLOSE_CARLE_BRAKET", "CARLE_BRAKET_VALUE", 
			"MUSTACH_CLOSE", "MUSTACH_VALUE", "EVENT_CLOSE", "EVENTEQUAL", "EVENT_ATTRIBUTE"
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

	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<ScriptletOrSeaWsContext> scriptletOrSeaWs() {
			return getRuleContexts(ScriptletOrSeaWsContext.class);
		}
		public ScriptletOrSeaWsContext scriptletOrSeaWs(int i) {
			return getRuleContext(ScriptletOrSeaWsContext.class,i);
		}
		public TerminalNode XML() { return getToken(DSLParser.XML, 0); }
		public TerminalNode DTD() { return getToken(DSLParser.DTD, 0); }
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML) {
				{
				setState(62);
				match(XML);
				}
			}

			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(71);
				match(DTD);
				}
			}

			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTML_COMMENT) | (1L << HTML_CONDITIONAL_COMMENT) | (1L << SCRIPTLET) | (1L << SEA_WS) | (1L << SCRIPT_OPEN) | (1L << STYLE_OPEN) | (1L << TAG_OPEN) | (1L << TAG_OPEN_MUSTACH))) != 0)) {
				{
				{
				setState(80);
				htmlElements();
				}
				}
				setState(85);
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

	public static class ScriptletOrSeaWsContext extends ParserRuleContext {
		public TerminalNode SCRIPTLET() { return getToken(DSLParser.SCRIPTLET, 0); }
		public TerminalNode SEA_WS() { return getToken(DSLParser.SEA_WS, 0); }
		public ScriptletOrSeaWsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptletOrSeaWs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterScriptletOrSeaWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitScriptletOrSeaWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitScriptletOrSeaWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptletOrSeaWsContext scriptletOrSeaWs() throws RecognitionException {
		ScriptletOrSeaWsContext _localctx = new ScriptletOrSeaWsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scriptletOrSeaWs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==SCRIPTLET || _la==SEA_WS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					htmlMisc();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(94);
			htmlElement();
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					htmlMisc();
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(DSLParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(DSLParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(DSLParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(DSLParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(DSLParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(DSLParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(DSLParser.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(DSLParser.TAG_SLASH, 0); }
		public TerminalNode SCRIPTLET() { return getToken(DSLParser.SCRIPTLET, 0); }
		public Mustach_openContext mustach_open() {
			return getRuleContext(Mustach_openContext.class,0);
		}
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlElement);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(TAG_OPEN);
				setState(102);
				match(TAG_NAME);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (APP - 15)) | (1L << (NGFOR - 15)) | (1L << (NGSHOW - 15)) | (1L << (NGHIDE - 15)) | (1L << (NGIF - 15)) | (1L << (NGSWITCH - 15)) | (1L << (NGSWITCHCASE - 15)) | (1L << (NGSWITCHDEFAULT - 15)) | (1L << (EVENT - 15)) | (1L << (TAG_NAME - 15)) | (1L << (TYPE_EQUALS - 15)) | (1L << (NG_MODEL_EQUALS - 15)))) != 0)) {
					{
					{
					setState(103);
					htmlAttribute();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					setState(109);
					match(TAG_CLOSE);
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(110);
						htmlContent();
						setState(111);
						match(TAG_OPEN);
						setState(112);
						match(TAG_SLASH);
						setState(113);
						match(TAG_NAME);
						setState(114);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(118);
					match(TAG_SLASH_CLOSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(SCRIPTLET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				mustach_open();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				script();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				style();
				}
				break;
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

	public static class HtmlDataContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode CDATA() { return getToken(DSLParser.CDATA, 0); }
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public HtmlAttributeContext htmlAttribute() {
			return getRuleContext(HtmlAttributeContext.class,0);
		}
		public HtmlChardataContext htmlChardata() {
			return getRuleContext(HtmlChardataContext.class,0);
		}
		public HtmlDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterHtmlData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitHtmlData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitHtmlData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDataContext htmlData() throws RecognitionException {
		HtmlDataContext _localctx = new HtmlDataContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCRIPTLET:
			case SEA_WS:
			case SCRIPT_OPEN:
			case STYLE_OPEN:
			case TAG_OPEN:
			case TAG_OPEN_MUSTACH:
				{
				setState(127);
				htmlElement();
				}
				break;
			case CDATA:
				{
				setState(128);
				match(CDATA);
				}
				break;
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				{
				setState(129);
				htmlComment();
				}
				break;
			case APP:
			case NGFOR:
			case NGSHOW:
			case NGHIDE:
			case NGIF:
			case NGSWITCH:
			case NGSWITCHCASE:
			case NGSWITCHDEFAULT:
			case EVENT:
			case TAG_NAME:
			case TYPE_EQUALS:
			case NG_MODEL_EQUALS:
				{
				setState(130);
				htmlAttribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(133);
				htmlChardata();
				}
				break;
			}
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

	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlChardataContext htmlChardata() {
			return getRuleContext(HtmlChardataContext.class,0);
		}
		public List<HtmlDataContext> htmlData() {
			return getRuleContexts(HtmlDataContext.class);
		}
		public HtmlDataContext htmlData(int i) {
			return getRuleContext(HtmlDataContext.class,i);
		}
		public Model_variableContext model_variable() {
			return getRuleContext(Model_variableContext.class,0);
		}
		public List<TerminalNode> SEA_WS() { return getTokens(DSLParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(DSLParser.SEA_WS, i);
		}
		public TerminalNode FUNCTION_INDICATOR() { return getToken(DSLParser.FUNCTION_INDICATOR, 0); }
		public TerminalNode FUNCTION_NAME() { return getToken(DSLParser.FUNCTION_NAME, 0); }
		public Open_bContext open_b() {
			return getRuleContext(Open_bContext.class,0);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(136);
					htmlChardata();
					}
					break;
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(139);
						htmlData();
						}
						} 
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEA_WS) {
					{
					{
					setState(145);
					match(SEA_WS);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				model_variable();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION_INDICATOR) {
					{
					setState(152);
					match(FUNCTION_INDICATOR);
					setState(153);
					match(FUNCTION_NAME);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(156);
						match(SEA_WS);
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(162);
				open_b();
				}
				break;
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

	public static class HtmlAttributeContext extends ParserRuleContext {
		public NgswitchContext ngswitch() {
			return getRuleContext(NgswitchContext.class,0);
		}
		public Ngswitch_caseContext ngswitch_case() {
			return getRuleContext(Ngswitch_caseContext.class,0);
		}
		public Ngswitch_defaultContext ngswitch_default() {
			return getRuleContext(Ngswitch_defaultContext.class,0);
		}
		public Ng_forContext ng_for() {
			return getRuleContext(Ng_forContext.class,0);
		}
		public Ng_showContext ng_show() {
			return getRuleContext(Ng_showContext.class,0);
		}
		public Ng_ifContext ng_if() {
			return getRuleContext(Ng_ifContext.class,0);
		}
		public Ng_hideContext ng_hide() {
			return getRuleContext(Ng_hideContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public AppContext app() {
			return getRuleContext(AppContext.class,0);
		}
		public TerminalNode TYPE_EQUALS() { return getToken(DSLParser.TYPE_EQUALS, 0); }
		public TerminalNode TYPE_VALUE() { return getToken(DSLParser.TYPE_VALUE, 0); }
		public TerminalNode NG_MODEL_EQUALS() { return getToken(DSLParser.NG_MODEL_EQUALS, 0); }
		public TerminalNode MODEL_VALUE() { return getToken(DSLParser.MODEL_VALUE, 0); }
		public TerminalNode TAG_NAME() { return getToken(DSLParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(DSLParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(DSLParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlAttribute);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NGSWITCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				ngswitch();
				}
				break;
			case NGSWITCHCASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				ngswitch_case();
				}
				break;
			case NGSWITCHDEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				ngswitch_default();
				}
				break;
			case NGFOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				ng_for();
				}
				break;
			case NGSHOW:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				ng_show();
				}
				break;
			case NGIF:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				ng_if();
				}
				break;
			case NGHIDE:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				ng_hide();
				}
				break;
			case EVENT:
				enterOuterAlt(_localctx, 8);
				{
				setState(172);
				event();
				}
				break;
			case APP:
				enterOuterAlt(_localctx, 9);
				{
				setState(173);
				app();
				}
				break;
			case TYPE_EQUALS:
				enterOuterAlt(_localctx, 10);
				{
				setState(174);
				match(TYPE_EQUALS);
				setState(175);
				match(TYPE_VALUE);
				}
				break;
			case NG_MODEL_EQUALS:
				enterOuterAlt(_localctx, 11);
				{
				setState(176);
				match(NG_MODEL_EQUALS);
				setState(177);
				match(MODEL_VALUE);
				}
				break;
			case TAG_NAME:
				enterOuterAlt(_localctx, 12);
				{
				setState(178);
				match(TAG_NAME);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(179);
					match(TAG_EQUALS);
					setState(180);
					match(ATTVALUE_VALUE);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AppContext extends ParserRuleContext {
		public TerminalNode APP() { return getToken(DSLParser.APP, 0); }
		public TerminalNode APPEQUAL() { return getToken(DSLParser.APPEQUAL, 0); }
		public TerminalNode APP_CLOSE() { return getToken(DSLParser.APP_CLOSE, 0); }
		public AppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContext app() throws RecognitionException {
		AppContext _localctx = new AppContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_app);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(APP);
			setState(186);
			match(APPEQUAL);
			setState(187);
			match(APP_CLOSE);
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

	public static class Ng_forContext extends ParserRuleContext {
		public TerminalNode NGFOR() { return getToken(DSLParser.NGFOR, 0); }
		public TerminalNode NGFOREQUAL() { return getToken(DSLParser.NGFOREQUAL, 0); }
		public TerminalNode NG_FOR_CLOSE() { return getToken(DSLParser.NG_FOR_CLOSE, 0); }
		public Ng_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterNg_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitNg_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitNg_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_forContext ng_for() throws RecognitionException {
		Ng_forContext _localctx = new Ng_forContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ng_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(NGFOR);
			setState(190);
			match(NGFOREQUAL);
			setState(191);
			match(NG_FOR_CLOSE);
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

	public static class Ngfor_closeContext extends ParserRuleContext {
		public TerminalNode NG_FOR_CLOSE() { return getToken(DSLParser.NG_FOR_CLOSE, 0); }
		public Ngfor_closeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngfor_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterNgfor_close(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitNgfor_close(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitNgfor_close(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ngfor_closeContext ngfor_close() throws RecognitionException {
		Ngfor_closeContext _localctx = new Ngfor_closeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ngfor_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(NG_FOR_CLOSE);
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

	public static class Ng_showContext extends ParserRuleContext {
		public TerminalNode NGSHOW() { return getToken(DSLParser.NGSHOW, 0); }
		public TerminalNode NGSHOWEQUAL() { return getToken(DSLParser.NGSHOWEQUAL, 0); }
		public TerminalNode NG_SHOW_CLOSE() { return getToken(DSLParser.NG_SHOW_CLOSE, 0); }
		public Ng_showContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterNg_show(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitNg_show(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitNg_show(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_showContext ng_show() throws RecognitionException {
		Ng_showContext _localctx = new Ng_showContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ng_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(NGSHOW);
			setState(196);
			match(NGSHOWEQUAL);
			setState(197);
			match(NG_SHOW_CLOSE);
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

	public static class Ng_hideContext extends ParserRuleContext {
		public TerminalNode NGHIDE() { return getToken(DSLParser.NGHIDE, 0); }
		public TerminalNode NGHIDEEQUAL() { return getToken(DSLParser.NGHIDEEQUAL, 0); }
		public TerminalNode NG_HIDE_CLOSE() { return getToken(DSLParser.NG_HIDE_CLOSE, 0); }
		public Ng_hideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_hide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterNg_hide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitNg_hide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitNg_hide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_hideContext ng_hide() throws RecognitionException {
		Ng_hideContext _localctx = new Ng_hideContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ng_hide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(NGHIDE);
			setState(200);
			match(NGHIDEEQUAL);
			setState(201);
			match(NG_HIDE_CLOSE);
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

	public static class Ng_ifContext extends ParserRuleContext {
		public TerminalNode NGIF() { return getToken(DSLParser.NGIF, 0); }
		public TerminalNode NGIFEQUAL() { return getToken(DSLParser.NGIFEQUAL, 0); }
		public TerminalNode NG_IF_CLOSE() { return getToken(DSLParser.NG_IF_CLOSE, 0); }
		public Ng_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterNg_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitNg_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitNg_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_ifContext ng_if() throws RecognitionException {
		Ng_ifContext _localctx = new Ng_ifContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ng_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(NGIF);
			setState(204);
			match(NGIFEQUAL);
			setState(205);
			match(NG_IF_CLOSE);
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

	public static class Model_variableContext extends ParserRuleContext {
		public TerminalNode MODEL_VARIABLE() { return getToken(DSLParser.MODEL_VARIABLE, 0); }
		public Model_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterModel_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitModel_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitModel_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_variableContext model_variable() throws RecognitionException {
		Model_variableContext _localctx = new Model_variableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_model_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(MODEL_VARIABLE);
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

	public static class NgswitchContext extends ParserRuleContext {
		public TerminalNode NGSWITCH() { return getToken(DSLParser.NGSWITCH, 0); }
		public TerminalNode NG_SWITCH_ATTRBIUTE() { return getToken(DSLParser.NG_SWITCH_ATTRBIUTE, 0); }
		public TerminalNode NG_SWITCH_VALUE() { return getToken(DSLParser.NG_SWITCH_VALUE, 0); }
		public NgswitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngswitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterNgswitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitNgswitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitNgswitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgswitchContext ngswitch() throws RecognitionException {
		NgswitchContext _localctx = new NgswitchContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ngswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(NGSWITCH);
			setState(210);
			match(NG_SWITCH_ATTRBIUTE);
			setState(211);
			match(NG_SWITCH_VALUE);
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

	public static class Ngswitch_caseContext extends ParserRuleContext {
		public TerminalNode NGSWITCHCASE() { return getToken(DSLParser.NGSWITCHCASE, 0); }
		public TerminalNode NG_SWITCH_CASE_ATTRBIUTE() { return getToken(DSLParser.NG_SWITCH_CASE_ATTRBIUTE, 0); }
		public TerminalNode NG_SWITCH_CASE_VALUE() { return getToken(DSLParser.NG_SWITCH_CASE_VALUE, 0); }
		public Ngswitch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngswitch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterNgswitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitNgswitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitNgswitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ngswitch_caseContext ngswitch_case() throws RecognitionException {
		Ngswitch_caseContext _localctx = new Ngswitch_caseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ngswitch_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(NGSWITCHCASE);
			setState(214);
			match(NG_SWITCH_CASE_ATTRBIUTE);
			setState(215);
			match(NG_SWITCH_CASE_VALUE);
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

	public static class Ngswitch_defaultContext extends ParserRuleContext {
		public TerminalNode NGSWITCHDEFAULT() { return getToken(DSLParser.NGSWITCHDEFAULT, 0); }
		public Ngswitch_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngswitch_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterNgswitch_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitNgswitch_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitNgswitch_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ngswitch_defaultContext ngswitch_default() throws RecognitionException {
		Ngswitch_defaultContext _localctx = new Ngswitch_defaultContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ngswitch_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(NGSWITCHDEFAULT);
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

	public static class NgmodelContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN_INPUT() { return getToken(DSLParser.TAG_OPEN_INPUT, 0); }
		public TerminalNode TAG_SLASH_CLOSE_INPUT() { return getToken(DSLParser.TAG_SLASH_CLOSE_INPUT, 0); }
		public List<TerminalNode> TYPE_EQUALS() { return getTokens(DSLParser.TYPE_EQUALS); }
		public TerminalNode TYPE_EQUALS(int i) {
			return getToken(DSLParser.TYPE_EQUALS, i);
		}
		public List<TerminalNode> TYPE_VALUE() { return getTokens(DSLParser.TYPE_VALUE); }
		public TerminalNode TYPE_VALUE(int i) {
			return getToken(DSLParser.TYPE_VALUE, i);
		}
		public List<TerminalNode> NG_MODEL_EQUALS() { return getTokens(DSLParser.NG_MODEL_EQUALS); }
		public TerminalNode NG_MODEL_EQUALS(int i) {
			return getToken(DSLParser.NG_MODEL_EQUALS, i);
		}
		public List<TerminalNode> MODEL_VALUE() { return getTokens(DSLParser.MODEL_VALUE); }
		public TerminalNode MODEL_VALUE(int i) {
			return getToken(DSLParser.MODEL_VALUE, i);
		}
		public NgmodelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngmodel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterNgmodel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitNgmodel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitNgmodel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgmodelContext ngmodel() throws RecognitionException {
		NgmodelContext _localctx = new NgmodelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ngmodel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(TAG_OPEN_INPUT);
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(220);
				match(TYPE_EQUALS);
				setState(221);
				match(TYPE_VALUE);
				setState(222);
				match(NG_MODEL_EQUALS);
				setState(223);
				match(MODEL_VALUE);
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE_EQUALS );
			setState(228);
			match(TAG_SLASH_CLOSE_INPUT);
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

	public static class EventContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(DSLParser.EVENT, 0); }
		public TerminalNode EVENTEQUAL() { return getToken(DSLParser.EVENTEQUAL, 0); }
		public TerminalNode EVENT_CLOSE() { return getToken(DSLParser.EVENT_CLOSE, 0); }
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(EVENT);
			setState(231);
			match(EVENTEQUAL);
			setState(232);
			match(EVENT_CLOSE);
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

	public static class Mustach_openContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN_MUSTACH() { return getToken(DSLParser.TAG_OPEN_MUSTACH, 0); }
		public Mustach_bodyContext mustach_body() {
			return getRuleContext(Mustach_bodyContext.class,0);
		}
		public TerminalNode MUSTACH_CLOSE() { return getToken(DSLParser.MUSTACH_CLOSE, 0); }
		public List<TerminalNode> SEA_WS() { return getTokens(DSLParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(DSLParser.SEA_WS, i);
		}
		public Mustach_openContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mustach_open; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterMustach_open(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitMustach_open(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitMustach_open(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mustach_openContext mustach_open() throws RecognitionException {
		Mustach_openContext _localctx = new Mustach_openContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mustach_open);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(234);
				match(SEA_WS);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(TAG_OPEN_MUSTACH);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(241);
				match(SEA_WS);
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			mustach_body();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(248);
				match(SEA_WS);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(MUSTACH_CLOSE);
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

	public static class Mustach_bodyContext extends ParserRuleContext {
		public TerminalNode MUSTACH_VALUE() { return getToken(DSLParser.MUSTACH_VALUE, 0); }
		public Mustach_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mustach_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterMustach_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitMustach_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitMustach_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mustach_bodyContext mustach_body() throws RecognitionException {
		Mustach_bodyContext _localctx = new Mustach_bodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mustach_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(MUSTACH_VALUE);
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

	public static class Open_bContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN_MUSTACH() { return getToken(DSLParser.TAG_OPEN_MUSTACH, 0); }
		public B_attributeContext b_attribute() {
			return getRuleContext(B_attributeContext.class,0);
		}
		public TerminalNode MUSTACH_CLOSE() { return getToken(DSLParser.MUSTACH_CLOSE, 0); }
		public List<TerminalNode> SEA_WS() { return getTokens(DSLParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(DSLParser.SEA_WS, i);
		}
		public Open_bContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterOpen_b(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitOpen_b(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitOpen_b(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_bContext open_b() throws RecognitionException {
		Open_bContext _localctx = new Open_bContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_open_b);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(258);
				match(SEA_WS);
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(TAG_OPEN_MUSTACH);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(265);
				match(SEA_WS);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			b_attribute();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS) {
				{
				{
				setState(272);
				match(SEA_WS);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(MUSTACH_CLOSE);
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

	public static class B_attributeContext extends ParserRuleContext {
		public TerminalNode MUSTACH_VALUE() { return getToken(DSLParser.MUSTACH_VALUE, 0); }
		public B_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterB_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitB_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitB_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_attributeContext b_attribute() throws RecognitionException {
		B_attributeContext _localctx = new B_attributeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_b_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(MUSTACH_VALUE);
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

	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(DSLParser.HTML_TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(DSLParser.SEA_WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==HTML_TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode SEA_WS() { return getToken(DSLParser.SEA_WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_htmlMisc);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(SEA_WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(DSLParser.HTML_COMMENT, 0); }
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(DSLParser.HTML_CONDITIONAL_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(DSLParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_CLOSE() { return getToken(DSLParser.SCRIPT_CLOSE, 0); }
		public List<TerminalNode> SEA_WS() { return getTokens(DSLParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(DSLParser.SEA_WS, i);
		}
		public List<TerminalNode> VAR() { return getTokens(DSLParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(DSLParser.VAR, i);
		}
		public List<TerminalNode> VAR_VARIABLE() { return getTokens(DSLParser.VAR_VARIABLE); }
		public TerminalNode VAR_VARIABLE(int i) {
			return getToken(DSLParser.VAR_VARIABLE, i);
		}
		public List<TerminalNode> VAR_EQUALS() { return getTokens(DSLParser.VAR_EQUALS); }
		public TerminalNode VAR_EQUALS(int i) {
			return getToken(DSLParser.VAR_EQUALS, i);
		}
		public List<TerminalNode> VAR_VARIABLE_VALUE() { return getTokens(DSLParser.VAR_VARIABLE_VALUE); }
		public TerminalNode VAR_VARIABLE_VALUE(int i) {
			return getToken(DSLParser.VAR_VARIABLE_VALUE, i);
		}
		public List<TerminalNode> VAR_OBJ() { return getTokens(DSLParser.VAR_OBJ); }
		public TerminalNode VAR_OBJ(int i) {
			return getToken(DSLParser.VAR_OBJ, i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_script);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEA_WS) {
					{
					{
					setState(290);
					match(SEA_WS);
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(296);
				match(SCRIPT_OPEN);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR) {
					{
					{
					setState(297);
					match(VAR);
					setState(298);
					match(VAR_VARIABLE);
					setState(299);
					match(VAR_EQUALS);
					setState(300);
					match(VAR_VARIABLE_VALUE);
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(306);
				match(SCRIPT_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEA_WS) {
					{
					{
					setState(307);
					match(SEA_WS);
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(313);
				match(SCRIPT_OPEN);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR) {
					{
					{
					setState(314);
					match(VAR);
					setState(315);
					match(VAR_OBJ);
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				match(SCRIPT_CLOSE);
				}
				break;
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

	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(DSLParser.STYLE_OPEN, 0); }
		public TerminalNode STYLE_BODY() { return getToken(DSLParser.STYLE_BODY, 0); }
		public TerminalNode STYLE_SHORT_BODY() { return getToken(DSLParser.STYLE_SHORT_BODY, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(STYLE_OPEN);
			setState(325);
			_la = _input.LA(1);
			if ( !(_la==STYLE_BODY || _la==STYLE_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3a\u014a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\5\2B\n\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\5\2K\n\2\3\2\7\2N\n\2\f\2"+
		"\16\2Q\13\2\3\2\7\2T\n\2\f\2\16\2W\13\2\3\3\3\3\3\4\7\4\\\n\4\f\4\16\4"+
		"_\13\4\3\4\3\4\7\4c\n\4\f\4\16\4f\13\4\3\5\3\5\3\5\7\5k\n\5\f\5\16\5n"+
		"\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5w\n\5\3\5\5\5z\n\5\3\5\3\5\3\5\3"+
		"\5\5\5\u0080\n\5\3\6\3\6\3\6\3\6\5\6\u0086\n\6\3\6\5\6\u0089\n\6\3\7\5"+
		"\7\u008c\n\7\3\7\7\7\u008f\n\7\f\7\16\7\u0092\13\7\3\7\7\7\u0095\n\7\f"+
		"\7\16\7\u0098\13\7\3\7\3\7\3\7\5\7\u009d\n\7\3\7\7\7\u00a0\n\7\f\7\16"+
		"\7\u00a3\13\7\3\7\5\7\u00a6\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b8\n\b\5\b\u00ba\n\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\6\23\u00e3\n\23\r\23\16\23\u00e4\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\7\25\u00ee\n\25\f\25\16\25\u00f1\13\25\3\25\3\25"+
		"\7\25\u00f5\n\25\f\25\16\25\u00f8\13\25\3\25\3\25\7\25\u00fc\n\25\f\25"+
		"\16\25\u00ff\13\25\3\25\3\25\3\26\3\26\3\27\7\27\u0106\n\27\f\27\16\27"+
		"\u0109\13\27\3\27\3\27\7\27\u010d\n\27\f\27\16\27\u0110\13\27\3\27\3\27"+
		"\7\27\u0114\n\27\f\27\16\27\u0117\13\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\5\32\u0121\n\32\3\33\3\33\3\34\7\34\u0126\n\34\f\34\16\34\u0129"+
		"\13\34\3\34\3\34\3\34\3\34\3\34\7\34\u0130\n\34\f\34\16\34\u0133\13\34"+
		"\3\34\3\34\7\34\u0137\n\34\f\34\16\34\u013a\13\34\3\34\3\34\3\34\7\34"+
		"\u013f\n\34\f\34\16\34\u0142\13\34\3\34\5\34\u0145\n\34\3\35\3\35\3\35"+
		"\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668\2\6\3\2\b\t\4\2\t\t\17\17\3\2\3\4\3\2\'(\2\u0160\2=\3\2\2\2\4X\3"+
		"\2\2\2\6]\3\2\2\2\b\177\3\2\2\2\n\u0085\3\2\2\2\f\u00a5\3\2\2\2\16\u00b9"+
		"\3\2\2\2\20\u00bb\3\2\2\2\22\u00bf\3\2\2\2\24\u00c3\3\2\2\2\26\u00c5\3"+
		"\2\2\2\30\u00c9\3\2\2\2\32\u00cd\3\2\2\2\34\u00d1\3\2\2\2\36\u00d3\3\2"+
		"\2\2 \u00d7\3\2\2\2\"\u00db\3\2\2\2$\u00dd\3\2\2\2&\u00e8\3\2\2\2(\u00ef"+
		"\3\2\2\2*\u0102\3\2\2\2,\u0107\3\2\2\2.\u011a\3\2\2\2\60\u011c\3\2\2\2"+
		"\62\u0120\3\2\2\2\64\u0122\3\2\2\2\66\u0144\3\2\2\28\u0146\3\2\2\2:<\5"+
		"\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>A\3\2\2\2?=\3\2\2\2@B\7"+
		"\5\2\2A@\3\2\2\2AB\3\2\2\2BF\3\2\2\2CE\5\4\3\2DC\3\2\2\2EH\3\2\2\2FD\3"+
		"\2\2\2FG\3\2\2\2GJ\3\2\2\2HF\3\2\2\2IK\7\7\2\2JI\3\2\2\2JK\3\2\2\2KO\3"+
		"\2\2\2LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PU\3\2\2\2QO\3"+
		"\2\2\2RT\5\6\4\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\3\3\2\2\2WU"+
		"\3\2\2\2XY\t\2\2\2Y\5\3\2\2\2Z\\\5\62\32\2[Z\3\2\2\2\\_\3\2\2\2][\3\2"+
		"\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`d\5\b\5\2ac\5\62\32\2ba\3\2\2\2cf\3"+
		"\2\2\2db\3\2\2\2de\3\2\2\2e\7\3\2\2\2fd\3\2\2\2gh\7\f\2\2hl\7!\2\2ik\5"+
		"\16\b\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2my\3\2\2\2nl\3\2\2\2ov"+
		"\7\34\2\2pq\5\f\7\2qr\7\f\2\2rs\7\36\2\2st\7!\2\2tu\7\34\2\2uw\3\2\2\2"+
		"vp\3\2\2\2vw\3\2\2\2wz\3\2\2\2xz\7\35\2\2yo\3\2\2\2yx\3\2\2\2z\u0080\3"+
		"\2\2\2{\u0080\7\b\2\2|\u0080\5(\25\2}\u0080\5\66\34\2~\u0080\58\35\2\177"+
		"g\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\t"+
		"\3\2\2\2\u0081\u0086\5\b\5\2\u0082\u0086\7\6\2\2\u0083\u0086\5\64\33\2"+
		"\u0084\u0086\5\16\b\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\5\60\31\2"+
		"\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\13\3\2\2\2\u008a\u008c"+
		"\5\60\31\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0090\3\2\2\2"+
		"\u008d\u008f\5\n\6\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u00a6\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0095\7\t\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009c\5\34\17\2\u009a\u009b\7P\2\2\u009b\u009d\7Q\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u00a6\3\2\2\2\u009e\u00a0\7\t\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\5,\27\2\u00a5"+
		"\u008b\3\2\2\2\u00a5\u0096\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\r\3\2\2\2"+
		"\u00a7\u00ba\5\36\20\2\u00a8\u00ba\5 \21\2\u00a9\u00ba\5\"\22\2\u00aa"+
		"\u00ba\5\22\n\2\u00ab\u00ba\5\26\f\2\u00ac\u00ba\5\32\16\2\u00ad\u00ba"+
		"\5\30\r\2\u00ae\u00ba\5&\24\2\u00af\u00ba\5\20\t\2\u00b0\u00b1\7D\2\2"+
		"\u00b1\u00ba\7F\2\2\u00b2\u00b3\7E\2\2\u00b3\u00ba\7H\2\2\u00b4\u00b7"+
		"\7!\2\2\u00b5\u00b6\7\37\2\2\u00b6\u00b8\7)\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00a7\3\2\2\2\u00b9\u00a8\3\2"+
		"\2\2\u00b9\u00a9\3\2\2\2\u00b9\u00aa\3\2\2\2\u00b9\u00ab\3\2\2\2\u00b9"+
		"\u00ac\3\2\2\2\u00b9\u00ad\3\2\2\2\u00b9\u00ae\3\2\2\2\u00b9\u00af\3\2"+
		"\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b2\3\2\2\2\u00b9\u00b4\3\2\2\2\u00ba"+
		"\17\3\2\2\2\u00bb\u00bc\7\21\2\2\u00bc\u00bd\7+\2\2\u00bd\u00be\7,\2\2"+
		"\u00be\21\3\2\2\2\u00bf\u00c0\7\22\2\2\u00c0\u00c1\7\62\2\2\u00c1\u00c2"+
		"\7\67\2\2\u00c2\23\3\2\2\2\u00c3\u00c4\7\67\2\2\u00c4\25\3\2\2\2\u00c5"+
		"\u00c6\7\23\2\2\u00c6\u00c7\7:\2\2\u00c7\u00c8\7<\2\2\u00c8\27\3\2\2\2"+
		"\u00c9\u00ca\7\24\2\2\u00ca\u00cb\7=\2\2\u00cb\u00cc\7>\2\2\u00cc\31\3"+
		"\2\2\2\u00cd\u00ce\7\25\2\2\u00ce\u00cf\7?\2\2\u00cf\u00d0\7@\2\2\u00d0"+
		"\33\3\2\2\2\u00d1\u00d2\7\r\2\2\u00d2\35\3\2\2\2\u00d3\u00d4\7\26\2\2"+
		"\u00d4\u00d5\7-\2\2\u00d5\u00d6\7.\2\2\u00d6\37\3\2\2\2\u00d7\u00d8\7"+
		"\27\2\2\u00d8\u00d9\7/\2\2\u00d9\u00da\7\60\2\2\u00da!\3\2\2\2\u00db\u00dc"+
		"\7\30\2\2\u00dc#\3\2\2\2\u00dd\u00e2\7\16\2\2\u00de\u00df\7D\2\2\u00df"+
		"\u00e0\7F\2\2\u00e0\u00e1\7E\2\2\u00e1\u00e3\7H\2\2\u00e2\u00de\3\2\2"+
		"\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\7C\2\2\u00e7%\3\2\2\2\u00e8\u00e9\7\31\2\2\u00e9"+
		"\u00ea\7`\2\2\u00ea\u00eb\7_\2\2\u00eb\'\3\2\2\2\u00ec\u00ee\7\t\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f6\7\20\2\2\u00f3"+
		"\u00f5\7\t\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fd\5*\26\2\u00fa\u00fc\7\t\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0101\7]\2\2\u0101)\3\2\2\2\u0102\u0103\7^\2\2\u0103"+
		"+\3\2\2\2\u0104\u0106\7\t\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2"+
		"\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u010a\u010e\7\20\2\2\u010b\u010d\7\t\2\2\u010c\u010b\3\2\2\2"+
		"\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0115\5.\30\2\u0112\u0114\7\t\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7]\2\2\u0119"+
		"-\3\2\2\2\u011a\u011b\7^\2\2\u011b/\3\2\2\2\u011c\u011d\t\3\2\2\u011d"+
		"\61\3\2\2\2\u011e\u0121\5\64\33\2\u011f\u0121\7\t\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u011f\3\2\2\2\u0121\63\3\2\2\2\u0122\u0123\t\4\2\2\u0123\65"+
		"\3\2\2\2\u0124\u0126\7\t\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u0131\7\n\2\2\u012b\u012c\7%\2\2\u012c\u012d\7J\2\2\u012d\u012e"+
		"\7K\2\2\u012e\u0130\7M\2\2\u012f\u012b\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0134\u0145\7&\2\2\u0135\u0137\7\t\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013b\u0140\7\n\2\2\u013c\u013d\7%\2\2\u013d"+
		"\u013f\7L\2\2\u013e\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0145\7&\2\2\u0144\u0127\3\2\2\2\u0144\u0138\3\2\2\2\u0145\67\3\2\2\2"+
		"\u0146\u0147\7\13\2\2\u0147\u0148\t\5\2\2\u01489\3\2\2\2%=AFJOU]dlvy\177"+
		"\u0085\u0088\u008b\u0090\u0096\u009c\u00a1\u00a5\u00b7\u00b9\u00e4\u00ef"+
		"\u00f6\u00fd\u0107\u010e\u0115\u0120\u0127\u0131\u0138\u0140\u0144";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}