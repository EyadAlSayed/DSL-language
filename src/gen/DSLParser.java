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
		CONTROLLER_DEF=1, CONTROLLER_METHOD=2, OPEN_CURLY_BRACKT_ID=3, CLOSE_CURLY_BRACKT_ID=4, 
		SUM_OP_ID=5, MINUS_OP_ID=6, MULT_OP_ID=7, DIV_OP_ID=8, MOD_OP_ID=9, END_STATMENT_ID=10, 
		PAGE=11, IF_ID=12, AND_OP_ID=13, OR_OP_ID=14, EQUAL_OP_ID=15, PRINT_ACTION=16, 
		NEWLINE=17, WHITE_SPACE=18, SINGLE_QUOTE=19, DOUBLE_QUOTE=20, ASSIGN_OP_ID=21, 
		OPEN_SQR_BRACKT_ID=22, CLOSE_SQR_BRACKT_ID=23, OPEN_PAR_BRACKT_ID=24, 
		CLOSE_PAR_BRACKT_ID=25, VAR_NAME_ID=26, FILE_NAME_ID=27, TEXT=28, TEXTNUM=29;
	public static final int
		RULE_dslDocument = 0, RULE_controllerDef = 1, RULE_controllerTokens = 2, 
		RULE_ifStatment = 3, RULE_logicalOperation = 4, RULE_condition = 5, RULE_textValue = 6, 
		RULE_space = 7, RULE_print = 8, RULE_assign = 9, RULE_mathEquation = 10, 
		RULE_sum = 11, RULE_mult = 12, RULE_minus = 13, RULE_div = 14, RULE_mod = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"dslDocument", "controllerDef", "controllerTokens", "ifStatment", "logicalOperation", 
			"condition", "textValue", "space", "print", "assign", "mathEquation", 
			"sum", "mult", "minus", "div", "mod"
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
		public ControllerDefContext controllerDef() {
			return getRuleContext(ControllerDefContext.class,0);
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
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case CONTROLLER_DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				controllerDef();
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

	public static class ControllerDefContext extends ParserRuleContext {
		public TerminalNode CONTROLLER_DEF() { return getToken(DSLParser.CONTROLLER_DEF, 0); }
		public List<TerminalNode> FILE_NAME_ID() { return getTokens(DSLParser.FILE_NAME_ID); }
		public TerminalNode FILE_NAME_ID(int i) {
			return getToken(DSLParser.FILE_NAME_ID, i);
		}
		public TerminalNode CONTROLLER_METHOD() { return getToken(DSLParser.CONTROLLER_METHOD, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public TerminalNode OPEN_CURLY_BRACKT_ID() { return getToken(DSLParser.OPEN_CURLY_BRACKT_ID, 0); }
		public TerminalNode CLOSE_CURLY_BRACKT_ID() { return getToken(DSLParser.CLOSE_CURLY_BRACKT_ID, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(DSLParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(DSLParser.WHITE_SPACE, i);
		}
		public List<ControllerTokensContext> controllerTokens() {
			return getRuleContexts(ControllerTokensContext.class);
		}
		public ControllerTokensContext controllerTokens(int i) {
			return getRuleContext(ControllerTokensContext.class,i);
		}
		public ControllerDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controllerDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterControllerDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitControllerDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitControllerDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControllerDefContext controllerDef() throws RecognitionException {
		ControllerDefContext _localctx = new ControllerDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_controllerDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(CONTROLLER_DEF);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(37);
				match(WHITE_SPACE);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(FILE_NAME_ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(44);
				match(WHITE_SPACE);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(CONTROLLER_METHOD);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(51);
				match(WHITE_SPACE);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(FILE_NAME_ID);
			setState(58);
			space();
			setState(59);
			match(OPEN_CURLY_BRACKT_ID);
			setState(60);
			space();
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				controllerTokens();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF_ID) | (1L << PRINT_ACTION) | (1L << VAR_NAME_ID))) != 0) );
			setState(66);
			space();
			setState(67);
			match(CLOSE_CURLY_BRACKT_ID);
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

	public static class ControllerTokensContext extends ParserRuleContext {
		public IfStatmentContext ifStatment() {
			return getRuleContext(IfStatmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public MathEquationContext mathEquation() {
			return getRuleContext(MathEquationContext.class,0);
		}
		public ControllerTokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controllerTokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterControllerTokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitControllerTokens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitControllerTokens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControllerTokensContext controllerTokens() throws RecognitionException {
		ControllerTokensContext _localctx = new ControllerTokensContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_controllerTokens);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				ifStatment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				mathEquation();
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

	public static class IfStatmentContext extends ParserRuleContext {
		public TerminalNode IF_ID() { return getToken(DSLParser.IF_ID, 0); }
		public TerminalNode OPEN_PAR_BRACKT_ID() { return getToken(DSLParser.OPEN_PAR_BRACKT_ID, 0); }
		public TerminalNode CLOSE_PAR_BRACKT_ID() { return getToken(DSLParser.CLOSE_PAR_BRACKT_ID, 0); }
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public TerminalNode OPEN_CURLY_BRACKT_ID() { return getToken(DSLParser.OPEN_CURLY_BRACKT_ID, 0); }
		public TerminalNode CLOSE_CURLY_BRACKT_ID() { return getToken(DSLParser.CLOSE_CURLY_BRACKT_ID, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(DSLParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(DSLParser.WHITE_SPACE, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ControllerTokensContext> controllerTokens() {
			return getRuleContexts(ControllerTokensContext.class);
		}
		public ControllerTokensContext controllerTokens(int i) {
			return getRuleContext(ControllerTokensContext.class,i);
		}
		public IfStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterIfStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitIfStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitIfStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatmentContext ifStatment() throws RecognitionException {
		IfStatmentContext _localctx = new IfStatmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(IF_ID);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(76);
				match(WHITE_SPACE);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(OPEN_PAR_BRACKT_ID);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(83);
				match(WHITE_SPACE);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				condition();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR_NAME_ID );
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(94);
				match(WHITE_SPACE);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(CLOSE_PAR_BRACKT_ID);
			setState(101);
			space();
			setState(102);
			match(OPEN_CURLY_BRACKT_ID);
			setState(103);
			space();
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				controllerTokens();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF_ID) | (1L << PRINT_ACTION) | (1L << VAR_NAME_ID))) != 0) );
			setState(109);
			space();
			setState(110);
			match(CLOSE_CURLY_BRACKT_ID);
			setState(111);
			space();
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

	public static class LogicalOperationContext extends ParserRuleContext {
		public TerminalNode AND_OP_ID() { return getToken(DSLParser.AND_OP_ID, 0); }
		public TerminalNode OR_OP_ID() { return getToken(DSLParser.OR_OP_ID, 0); }
		public TerminalNode EQUAL_OP_ID() { return getToken(DSLParser.EQUAL_OP_ID, 0); }
		public LogicalOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterLogicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitLogicalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitLogicalOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperationContext logicalOperation() throws RecognitionException {
		LogicalOperationContext _localctx = new LogicalOperationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logicalOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND_OP_ID) | (1L << OR_OP_ID) | (1L << EQUAL_OP_ID))) != 0)) ) {
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode VAR_NAME_ID() { return getToken(DSLParser.VAR_NAME_ID, 0); }
		public List<LogicalOperationContext> logicalOperation() {
			return getRuleContexts(LogicalOperationContext.class);
		}
		public LogicalOperationContext logicalOperation(int i) {
			return getRuleContext(LogicalOperationContext.class,i);
		}
		public TextValueContext textValue() {
			return getRuleContext(TextValueContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(DSLParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(DSLParser.WHITE_SPACE, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(VAR_NAME_ID);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(116);
				match(WHITE_SPACE);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			logicalOperation();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(123);
				match(WHITE_SPACE);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			textValue();
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND_OP_ID) | (1L << OR_OP_ID) | (1L << EQUAL_OP_ID))) != 0)) {
				{
				setState(136);
				logicalOperation();
				}
			}

			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					match(WHITE_SPACE);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class TextValueContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DSLParser.TEXT, 0); }
		public TerminalNode TEXTNUM() { return getToken(DSLParser.TEXTNUM, 0); }
		public TextValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterTextValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitTextValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitTextValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextValueContext textValue() throws RecognitionException {
		TextValueContext _localctx = new TextValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_textValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==TEXTNUM) ) {
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

	public static class SpaceContext extends ParserRuleContext {
		public List<TerminalNode> WHITE_SPACE() { return getTokens(DSLParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(DSLParser.WHITE_SPACE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DSLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DSLParser.NEWLINE, i);
		}
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_space);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(153);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NEWLINE:
						{
						setState(148); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(147);
								match(NEWLINE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(150); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case WHITE_SPACE:
						{
						setState(152);
						match(WHITE_SPACE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT_ACTION() { return getToken(DSLParser.PRINT_ACTION, 0); }
		public TerminalNode END_STATMENT_ID() { return getToken(DSLParser.END_STATMENT_ID, 0); }
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public TextValueContext textValue() {
			return getRuleContext(TextValueContext.class,0);
		}
		public TerminalNode VAR_NAME_ID() { return getToken(DSLParser.VAR_NAME_ID, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(DSLParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(DSLParser.WHITE_SPACE, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(PRINT_ACTION);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(159);
				match(WHITE_SPACE);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
			case TEXTNUM:
				{
				setState(165);
				textValue();
				}
				break;
			case VAR_NAME_ID:
				{
				setState(166);
				match(VAR_NAME_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(169);
				match(WHITE_SPACE);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(END_STATMENT_ID);
			setState(176);
			space();
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

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME_ID() { return getTokens(DSLParser.VAR_NAME_ID); }
		public TerminalNode VAR_NAME_ID(int i) {
			return getToken(DSLParser.VAR_NAME_ID, i);
		}
		public TerminalNode ASSIGN_OP_ID() { return getToken(DSLParser.ASSIGN_OP_ID, 0); }
		public TerminalNode END_STATMENT_ID() { return getToken(DSLParser.END_STATMENT_ID, 0); }
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public TextValueContext textValue() {
			return getRuleContext(TextValueContext.class,0);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(DSLParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(DSLParser.WHITE_SPACE, i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(VAR_NAME_ID);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(179);
				match(WHITE_SPACE);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(ASSIGN_OP_ID);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(186);
				match(WHITE_SPACE);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
			case TEXTNUM:
				{
				setState(192);
				textValue();
				}
				break;
			case VAR_NAME_ID:
				{
				setState(193);
				match(VAR_NAME_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(196);
				match(WHITE_SPACE);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(END_STATMENT_ID);
			setState(203);
			space();
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

	public static class MathEquationContext extends ParserRuleContext {
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public MathEquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathEquation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterMathEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitMathEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitMathEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathEquationContext mathEquation() throws RecognitionException {
		MathEquationContext _localctx = new MathEquationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mathEquation);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				sum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				mult();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				minus();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				div();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				mod();
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

	public static class SumContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME_ID() { return getTokens(DSLParser.VAR_NAME_ID); }
		public TerminalNode VAR_NAME_ID(int i) {
			return getToken(DSLParser.VAR_NAME_ID, i);
		}
		public TerminalNode ASSIGN_OP_ID() { return getToken(DSLParser.ASSIGN_OP_ID, 0); }
		public TerminalNode SUM_OP_ID() { return getToken(DSLParser.SUM_OP_ID, 0); }
		public TerminalNode END_STATMENT_ID() { return getToken(DSLParser.END_STATMENT_ID, 0); }
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public List<TextValueContext> textValue() {
			return getRuleContexts(TextValueContext.class);
		}
		public TextValueContext textValue(int i) {
			return getRuleContext(TextValueContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(DSLParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(DSLParser.WHITE_SPACE, i);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(VAR_NAME_ID);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(213);
				match(WHITE_SPACE);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(ASSIGN_OP_ID);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(220);
				match(WHITE_SPACE);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
			case TEXTNUM:
				{
				setState(226);
				textValue();
				}
				break;
			case VAR_NAME_ID:
				{
				setState(227);
				match(VAR_NAME_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(230);
				match(WHITE_SPACE);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(SUM_OP_ID);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(237);
				match(WHITE_SPACE);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
			case TEXTNUM:
				{
				setState(243);
				textValue();
				}
				break;
			case VAR_NAME_ID:
				{
				setState(244);
				match(VAR_NAME_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(247);
				match(WHITE_SPACE);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(END_STATMENT_ID);
			setState(254);
			space();
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

	public static class MultContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME_ID() { return getTokens(DSLParser.VAR_NAME_ID); }
		public TerminalNode VAR_NAME_ID(int i) {
			return getToken(DSLParser.VAR_NAME_ID, i);
		}
		public TerminalNode ASSIGN_OP_ID() { return getToken(DSLParser.ASSIGN_OP_ID, 0); }
		public TerminalNode MULT_OP_ID() { return getToken(DSLParser.MULT_OP_ID, 0); }
		public TerminalNode END_STATMENT_ID() { return getToken(DSLParser.END_STATMENT_ID, 0); }
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public List<TextValueContext> textValue() {
			return getRuleContexts(TextValueContext.class);
		}
		public TextValueContext textValue(int i) {
			return getRuleContext(TextValueContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(DSLParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(DSLParser.WHITE_SPACE, i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(VAR_NAME_ID);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(257);
				match(WHITE_SPACE);
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(ASSIGN_OP_ID);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(264);
				match(WHITE_SPACE);
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
			case TEXTNUM:
				{
				setState(270);
				textValue();
				}
				break;
			case VAR_NAME_ID:
				{
				setState(271);
				match(VAR_NAME_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(274);
				match(WHITE_SPACE);
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(MULT_OP_ID);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(281);
				match(WHITE_SPACE);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
			case TEXTNUM:
				{
				setState(287);
				textValue();
				}
				break;
			case VAR_NAME_ID:
				{
				setState(288);
				match(VAR_NAME_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(291);
				match(WHITE_SPACE);
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(END_STATMENT_ID);
			setState(298);
			space();
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

	public static class MinusContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME_ID() { return getTokens(DSLParser.VAR_NAME_ID); }
		public TerminalNode VAR_NAME_ID(int i) {
			return getToken(DSLParser.VAR_NAME_ID, i);
		}
		public TerminalNode ASSIGN_OP_ID() { return getToken(DSLParser.ASSIGN_OP_ID, 0); }
		public TerminalNode MINUS_OP_ID() { return getToken(DSLParser.MINUS_OP_ID, 0); }
		public TerminalNode END_STATMENT_ID() { return getToken(DSLParser.END_STATMENT_ID, 0); }
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public List<TextValueContext> textValue() {
			return getRuleContexts(TextValueContext.class);
		}
		public TextValueContext textValue(int i) {
			return getRuleContext(TextValueContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(DSLParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(DSLParser.WHITE_SPACE, i);
		}
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(VAR_NAME_ID);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(301);
				match(WHITE_SPACE);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(ASSIGN_OP_ID);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(308);
				match(WHITE_SPACE);
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
			case TEXTNUM:
				{
				setState(314);
				textValue();
				}
				break;
			case VAR_NAME_ID:
				{
				setState(315);
				match(VAR_NAME_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(318);
				match(WHITE_SPACE);
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(MINUS_OP_ID);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(325);
				match(WHITE_SPACE);
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
			case TEXTNUM:
				{
				setState(331);
				textValue();
				}
				break;
			case VAR_NAME_ID:
				{
				setState(332);
				match(VAR_NAME_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(335);
				match(WHITE_SPACE);
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			match(END_STATMENT_ID);
			setState(342);
			space();
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

	public static class DivContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME_ID() { return getTokens(DSLParser.VAR_NAME_ID); }
		public TerminalNode VAR_NAME_ID(int i) {
			return getToken(DSLParser.VAR_NAME_ID, i);
		}
		public TerminalNode ASSIGN_OP_ID() { return getToken(DSLParser.ASSIGN_OP_ID, 0); }
		public TerminalNode DIV_OP_ID() { return getToken(DSLParser.DIV_OP_ID, 0); }
		public TerminalNode END_STATMENT_ID() { return getToken(DSLParser.END_STATMENT_ID, 0); }
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public List<TextValueContext> textValue() {
			return getRuleContexts(TextValueContext.class);
		}
		public TextValueContext textValue(int i) {
			return getRuleContext(TextValueContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(DSLParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(DSLParser.WHITE_SPACE, i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(VAR_NAME_ID);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(345);
				match(WHITE_SPACE);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			match(ASSIGN_OP_ID);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(352);
				match(WHITE_SPACE);
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
			case TEXTNUM:
				{
				setState(358);
				textValue();
				}
				break;
			case VAR_NAME_ID:
				{
				setState(359);
				match(VAR_NAME_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(362);
				match(WHITE_SPACE);
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			match(DIV_OP_ID);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(369);
				match(WHITE_SPACE);
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
			case TEXTNUM:
				{
				setState(375);
				textValue();
				}
				break;
			case VAR_NAME_ID:
				{
				setState(376);
				match(VAR_NAME_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(379);
				match(WHITE_SPACE);
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
			match(END_STATMENT_ID);
			setState(386);
			space();
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

	public static class ModContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME_ID() { return getTokens(DSLParser.VAR_NAME_ID); }
		public TerminalNode VAR_NAME_ID(int i) {
			return getToken(DSLParser.VAR_NAME_ID, i);
		}
		public TerminalNode ASSIGN_OP_ID() { return getToken(DSLParser.ASSIGN_OP_ID, 0); }
		public TerminalNode MOD_OP_ID() { return getToken(DSLParser.MOD_OP_ID, 0); }
		public TerminalNode END_STATMENT_ID() { return getToken(DSLParser.END_STATMENT_ID, 0); }
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public List<TextValueContext> textValue() {
			return getRuleContexts(TextValueContext.class);
		}
		public TextValueContext textValue(int i) {
			return getRuleContext(TextValueContext.class,i);
		}
		public List<TerminalNode> WHITE_SPACE() { return getTokens(DSLParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(DSLParser.WHITE_SPACE, i);
		}
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLParserListener ) ((DSLParserListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLParserVisitor ) return ((DSLParserVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(VAR_NAME_ID);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(389);
				match(WHITE_SPACE);
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
			match(ASSIGN_OP_ID);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(396);
				match(WHITE_SPACE);
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
			case TEXTNUM:
				{
				setState(402);
				textValue();
				}
				break;
			case VAR_NAME_ID:
				{
				setState(403);
				match(VAR_NAME_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(406);
				match(WHITE_SPACE);
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			match(MOD_OP_ID);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(413);
				match(WHITE_SPACE);
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
			case TEXTNUM:
				{
				setState(419);
				textValue();
				}
				break;
			case VAR_NAME_ID:
				{
				setState(420);
				match(VAR_NAME_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE_SPACE) {
				{
				{
				setState(423);
				match(WHITE_SPACE);
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
			match(END_STATMENT_ID);
			setState(430);
			space();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u01b3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\5\2%\n\2\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\7\3\60\n\3\f\3\16\3"+
		"\63\13\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\3\3\3\3\3\6\3A\n"+
		"\3\r\3\16\3B\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\7\5P\n\5\f\5"+
		"\16\5S\13\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\6\5]\n\5\r\5\16\5^\3\5"+
		"\7\5b\n\5\f\5\16\5e\13\5\3\5\3\5\3\5\3\5\3\5\6\5l\n\5\r\5\16\5m\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\7\7x\n\7\f\7\16\7{\13\7\3\7\3\7\7\7\177\n\7"+
		"\f\7\16\7\u0082\13\7\3\7\3\7\7\7\u0086\n\7\f\7\16\7\u0089\13\7\3\7\5\7"+
		"\u008c\n\7\3\7\7\7\u008f\n\7\f\7\16\7\u0092\13\7\3\b\3\b\3\t\6\t\u0097"+
		"\n\t\r\t\16\t\u0098\3\t\7\t\u009c\n\t\f\t\16\t\u009f\13\t\3\n\3\n\7\n"+
		"\u00a3\n\n\f\n\16\n\u00a6\13\n\3\n\3\n\5\n\u00aa\n\n\3\n\7\n\u00ad\n\n"+
		"\f\n\16\n\u00b0\13\n\3\n\3\n\3\n\3\13\3\13\7\13\u00b7\n\13\f\13\16\13"+
		"\u00ba\13\13\3\13\3\13\7\13\u00be\n\13\f\13\16\13\u00c1\13\13\3\13\3\13"+
		"\5\13\u00c5\n\13\3\13\7\13\u00c8\n\13\f\13\16\13\u00cb\13\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00d5\n\f\3\r\3\r\7\r\u00d9\n\r\f\r\16\r"+
		"\u00dc\13\r\3\r\3\r\7\r\u00e0\n\r\f\r\16\r\u00e3\13\r\3\r\3\r\5\r\u00e7"+
		"\n\r\3\r\7\r\u00ea\n\r\f\r\16\r\u00ed\13\r\3\r\3\r\7\r\u00f1\n\r\f\r\16"+
		"\r\u00f4\13\r\3\r\3\r\5\r\u00f8\n\r\3\r\7\r\u00fb\n\r\f\r\16\r\u00fe\13"+
		"\r\3\r\3\r\3\r\3\16\3\16\7\16\u0105\n\16\f\16\16\16\u0108\13\16\3\16\3"+
		"\16\7\16\u010c\n\16\f\16\16\16\u010f\13\16\3\16\3\16\5\16\u0113\n\16\3"+
		"\16\7\16\u0116\n\16\f\16\16\16\u0119\13\16\3\16\3\16\7\16\u011d\n\16\f"+
		"\16\16\16\u0120\13\16\3\16\3\16\5\16\u0124\n\16\3\16\7\16\u0127\n\16\f"+
		"\16\16\16\u012a\13\16\3\16\3\16\3\16\3\17\3\17\7\17\u0131\n\17\f\17\16"+
		"\17\u0134\13\17\3\17\3\17\7\17\u0138\n\17\f\17\16\17\u013b\13\17\3\17"+
		"\3\17\5\17\u013f\n\17\3\17\7\17\u0142\n\17\f\17\16\17\u0145\13\17\3\17"+
		"\3\17\7\17\u0149\n\17\f\17\16\17\u014c\13\17\3\17\3\17\5\17\u0150\n\17"+
		"\3\17\7\17\u0153\n\17\f\17\16\17\u0156\13\17\3\17\3\17\3\17\3\20\3\20"+
		"\7\20\u015d\n\20\f\20\16\20\u0160\13\20\3\20\3\20\7\20\u0164\n\20\f\20"+
		"\16\20\u0167\13\20\3\20\3\20\5\20\u016b\n\20\3\20\7\20\u016e\n\20\f\20"+
		"\16\20\u0171\13\20\3\20\3\20\7\20\u0175\n\20\f\20\16\20\u0178\13\20\3"+
		"\20\3\20\5\20\u017c\n\20\3\20\7\20\u017f\n\20\f\20\16\20\u0182\13\20\3"+
		"\20\3\20\3\20\3\21\3\21\7\21\u0189\n\21\f\21\16\21\u018c\13\21\3\21\3"+
		"\21\7\21\u0190\n\21\f\21\16\21\u0193\13\21\3\21\3\21\5\21\u0197\n\21\3"+
		"\21\7\21\u019a\n\21\f\21\16\21\u019d\13\21\3\21\3\21\7\21\u01a1\n\21\f"+
		"\21\16\21\u01a4\13\21\3\21\3\21\5\21\u01a8\n\21\3\21\7\21\u01ab\n\21\f"+
		"\21\16\21\u01ae\13\21\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \2\4\3\2\17\21\3\2\36\37\2\u01e5\2$\3\2\2\2\4&\3\2"+
		"\2\2\6K\3\2\2\2\bM\3\2\2\2\ns\3\2\2\2\fu\3\2\2\2\16\u0093\3\2\2\2\20\u009d"+
		"\3\2\2\2\22\u00a0\3\2\2\2\24\u00b4\3\2\2\2\26\u00d4\3\2\2\2\30\u00d6\3"+
		"\2\2\2\32\u0102\3\2\2\2\34\u012e\3\2\2\2\36\u015a\3\2\2\2 \u0186\3\2\2"+
		"\2\"%\3\2\2\2#%\5\4\3\2$\"\3\2\2\2$#\3\2\2\2%\3\3\2\2\2&*\7\3\2\2\')\7"+
		"\24\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-"+
		"\61\7\35\2\2.\60\7\24\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\648\7\4\2\2\65\67\7\24\2\2\66\65\3"+
		"\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\35\2"+
		"\2<=\5\20\t\2=>\7\5\2\2>@\5\20\t\2?A\5\6\4\2@?\3\2\2\2AB\3\2\2\2B@\3\2"+
		"\2\2BC\3\2\2\2CD\3\2\2\2DE\5\20\t\2EF\7\6\2\2F\5\3\2\2\2GL\5\b\5\2HL\5"+
		"\22\n\2IL\5\24\13\2JL\5\26\f\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2"+
		"L\7\3\2\2\2MQ\7\16\2\2NP\7\24\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2"+
		"\2\2RT\3\2\2\2SQ\3\2\2\2TX\7\32\2\2UW\7\24\2\2VU\3\2\2\2WZ\3\2\2\2XV\3"+
		"\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[]\5\f\7\2\\[\3\2\2\2]^\3\2\2\2^"+
		"\\\3\2\2\2^_\3\2\2\2_c\3\2\2\2`b\7\24\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2"+
		"\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\33\2\2gh\5\20\t\2hi\7\5\2\2ik\5\20"+
		"\t\2jl\5\6\4\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\5\20"+
		"\t\2pq\7\6\2\2qr\5\20\t\2r\t\3\2\2\2st\t\2\2\2t\13\3\2\2\2uy\7\34\2\2"+
		"vx\7\24\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2"+
		"\2|\u0080\5\n\6\2}\177\7\24\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0087\5\16\b\2\u0084\u0086\7\24\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008c\5\n\6\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u0090\3\2\2\2\u008d\u008f\7\24\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\r\3\2\2\2"+
		"\u0092\u0090\3\2\2\2\u0093\u0094\t\3\2\2\u0094\17\3\2\2\2\u0095\u0097"+
		"\7\23\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009c\7\24\2\2\u009b\u0096"+
		"\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\21\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a4\7\22\2"+
		"\2\u00a1\u00a3\7\24\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u00aa\5\16\b\2\u00a8\u00aa\7\34\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\7\24\2\2\u00ac\u00ab\3"+
		"\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\f\2\2\u00b2\u00b3\5\20"+
		"\t\2\u00b3\23\3\2\2\2\u00b4\u00b8\7\34\2\2\u00b5\u00b7\7\24\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bf\7\27\2\2\u00bc"+
		"\u00be\7\24\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3"+
		"\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c5\5\16\b\2\u00c3\u00c5\7\34\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3"+
		"\2\2\2\u00c5\u00c9\3\2\2\2\u00c6\u00c8\7\24\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\f\2\2\u00cd\u00ce\5\20\t\2\u00ce"+
		"\25\3\2\2\2\u00cf\u00d5\5\30\r\2\u00d0\u00d5\5\32\16\2\u00d1\u00d5\5\34"+
		"\17\2\u00d2\u00d5\5\36\20\2\u00d3\u00d5\5 \21\2\u00d4\u00cf\3\2\2\2\u00d4"+
		"\u00d0\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\27\3\2\2\2\u00d6\u00da\7\34\2\2\u00d7\u00d9\7\24\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e1\7\27\2\2\u00de"+
		"\u00e0\7\24\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e6\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e7\5\16\b\2\u00e5\u00e7\7\34\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3"+
		"\2\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00ea\7\24\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f2\7\7\2\2\u00ef\u00f1\7\24\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\5\16\b\2\u00f6"+
		"\u00f8\7\34\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fc\3"+
		"\2\2\2\u00f9\u00fb\7\24\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u0100\7\f\2\2\u0100\u0101\5\20\t\2\u0101\31\3\2\2\2\u0102\u0106"+
		"\7\34\2\2\u0103\u0105\7\24\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2"+
		"\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0109\u010d\7\27\2\2\u010a\u010c\7\24\2\2\u010b\u010a\3\2\2\2"+
		"\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0112"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0113\5\16\b\2\u0111\u0113\7\34\2\2"+
		"\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0117\3\2\2\2\u0114\u0116"+
		"\7\24\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011e"+
		"\7\t\2\2\u011b\u011d\7\24\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2"+
		"\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0123\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0121\u0124\5\16\b\2\u0122\u0124\7\34\2\2\u0123\u0121\3\2\2\2"+
		"\u0123\u0122\3\2\2\2\u0124\u0128\3\2\2\2\u0125\u0127\7\24\2\2\u0126\u0125"+
		"\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7\f\2\2\u012c\u012d\5\20"+
		"\t\2\u012d\33\3\2\2\2\u012e\u0132\7\34\2\2\u012f\u0131\7\24\2\2\u0130"+
		"\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0139\7\27\2\2\u0136"+
		"\u0138\7\24\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3"+
		"\2\2\2\u0139\u013a\3\2\2\2\u013a\u013e\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013f\5\16\b\2\u013d\u013f\7\34\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3"+
		"\2\2\2\u013f\u0143\3\2\2\2\u0140\u0142\7\24\2\2\u0141\u0140\3\2\2\2\u0142"+
		"\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0146\u014a\7\b\2\2\u0147\u0149\7\24\2\2\u0148"+
		"\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014f\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0150\5\16\b\2\u014e"+
		"\u0150\7\34\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0154\3"+
		"\2\2\2\u0151\u0153\7\24\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0157\u0158\7\f\2\2\u0158\u0159\5\20\t\2\u0159\35\3\2\2\2\u015a\u015e"+
		"\7\34\2\2\u015b\u015d\7\24\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2"+
		"\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0161\u0165\7\27\2\2\u0162\u0164\7\24\2\2\u0163\u0162\3\2\2\2"+
		"\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016a"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016b\5\16\b\2\u0169\u016b\7\34\2\2"+
		"\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b\u016f\3\2\2\2\u016c\u016e"+
		"\7\24\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2"+
		"\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0176"+
		"\7\n\2\2\u0173\u0175\7\24\2\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2"+
		"\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017b\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0179\u017c\5\16\b\2\u017a\u017c\7\34\2\2\u017b\u0179\3\2\2\2"+
		"\u017b\u017a\3\2\2\2\u017c\u0180\3\2\2\2\u017d\u017f\7\24\2\2\u017e\u017d"+
		"\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7\f\2\2\u0184\u0185\5\20"+
		"\t\2\u0185\37\3\2\2\2\u0186\u018a\7\34\2\2\u0187\u0189\7\24\2\2\u0188"+
		"\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u0191\7\27\2\2\u018e"+
		"\u0190\7\24\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3"+
		"\2\2\2\u0191\u0192\3\2\2\2\u0192\u0196\3\2\2\2\u0193\u0191\3\2\2\2\u0194"+
		"\u0197\5\16\b\2\u0195\u0197\7\34\2\2\u0196\u0194\3\2\2\2\u0196\u0195\3"+
		"\2\2\2\u0197\u019b\3\2\2\2\u0198\u019a\7\24\2\2\u0199\u0198\3\2\2\2\u019a"+
		"\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2"+
		"\2\2\u019d\u019b\3\2\2\2\u019e\u01a2\7\13\2\2\u019f\u01a1\7\24\2\2\u01a0"+
		"\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3\u01a7\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a8\5\16\b\2\u01a6"+
		"\u01a8\7\34\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ac\3"+
		"\2\2\2\u01a9\u01ab\7\24\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01ac\3\2"+
		"\2\2\u01af\u01b0\7\f\2\2\u01b0\u01b1\5\20\t\2\u01b1!\3\2\2\2@$*\618BK"+
		"QX^cmy\u0080\u0087\u008b\u0090\u0098\u009b\u009d\u00a4\u00a9\u00ae\u00b8"+
		"\u00bf\u00c4\u00c9\u00d4\u00da\u00e1\u00e6\u00eb\u00f2\u00f7\u00fc\u0106"+
		"\u010d\u0112\u0117\u011e\u0123\u0128\u0132\u0139\u013e\u0143\u014a\u014f"+
		"\u0154\u015e\u0165\u016a\u016f\u0176\u017b\u0180\u018a\u0191\u0196\u019b"+
		"\u01a2\u01a7\u01ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}