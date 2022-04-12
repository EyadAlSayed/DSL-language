// Generated from D:/DSL_language/src\DSLParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLParser}.
 */
public interface DSLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(DSLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(DSLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(DSLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(DSLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(DSLParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(DSLParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(DSLParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(DSLParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#htmlData}.
	 * @param ctx the parse tree
	 */
	void enterHtmlData(DSLParser.HtmlDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#htmlData}.
	 * @param ctx the parse tree
	 */
	void exitHtmlData(DSLParser.HtmlDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(DSLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(DSLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(DSLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(DSLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#app}.
	 * @param ctx the parse tree
	 */
	void enterApp(DSLParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#app}.
	 * @param ctx the parse tree
	 */
	void exitApp(DSLParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ng_for}.
	 * @param ctx the parse tree
	 */
	void enterNg_for(DSLParser.Ng_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ng_for}.
	 * @param ctx the parse tree
	 */
	void exitNg_for(DSLParser.Ng_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ngfor_close}.
	 * @param ctx the parse tree
	 */
	void enterNgfor_close(DSLParser.Ngfor_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ngfor_close}.
	 * @param ctx the parse tree
	 */
	void exitNgfor_close(DSLParser.Ngfor_closeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ng_show}.
	 * @param ctx the parse tree
	 */
	void enterNg_show(DSLParser.Ng_showContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ng_show}.
	 * @param ctx the parse tree
	 */
	void exitNg_show(DSLParser.Ng_showContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ng_hide}.
	 * @param ctx the parse tree
	 */
	void enterNg_hide(DSLParser.Ng_hideContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ng_hide}.
	 * @param ctx the parse tree
	 */
	void exitNg_hide(DSLParser.Ng_hideContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ng_if}.
	 * @param ctx the parse tree
	 */
	void enterNg_if(DSLParser.Ng_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ng_if}.
	 * @param ctx the parse tree
	 */
	void exitNg_if(DSLParser.Ng_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#model_variable}.
	 * @param ctx the parse tree
	 */
	void enterModel_variable(DSLParser.Model_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#model_variable}.
	 * @param ctx the parse tree
	 */
	void exitModel_variable(DSLParser.Model_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ngswitch}.
	 * @param ctx the parse tree
	 */
	void enterNgswitch(DSLParser.NgswitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ngswitch}.
	 * @param ctx the parse tree
	 */
	void exitNgswitch(DSLParser.NgswitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ngswitch_case}.
	 * @param ctx the parse tree
	 */
	void enterNgswitch_case(DSLParser.Ngswitch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ngswitch_case}.
	 * @param ctx the parse tree
	 */
	void exitNgswitch_case(DSLParser.Ngswitch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ngswitch_default}.
	 * @param ctx the parse tree
	 */
	void enterNgswitch_default(DSLParser.Ngswitch_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ngswitch_default}.
	 * @param ctx the parse tree
	 */
	void exitNgswitch_default(DSLParser.Ngswitch_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ngmodel}.
	 * @param ctx the parse tree
	 */
	void enterNgmodel(DSLParser.NgmodelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ngmodel}.
	 * @param ctx the parse tree
	 */
	void exitNgmodel(DSLParser.NgmodelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(DSLParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(DSLParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#mustach_open}.
	 * @param ctx the parse tree
	 */
	void enterMustach_open(DSLParser.Mustach_openContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#mustach_open}.
	 * @param ctx the parse tree
	 */
	void exitMustach_open(DSLParser.Mustach_openContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#mustach_body}.
	 * @param ctx the parse tree
	 */
	void enterMustach_body(DSLParser.Mustach_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#mustach_body}.
	 * @param ctx the parse tree
	 */
	void exitMustach_body(DSLParser.Mustach_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#open_b}.
	 * @param ctx the parse tree
	 */
	void enterOpen_b(DSLParser.Open_bContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#open_b}.
	 * @param ctx the parse tree
	 */
	void exitOpen_b(DSLParser.Open_bContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#b_attribute}.
	 * @param ctx the parse tree
	 */
	void enterB_attribute(DSLParser.B_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#b_attribute}.
	 * @param ctx the parse tree
	 */
	void exitB_attribute(DSLParser.B_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(DSLParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(DSLParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(DSLParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(DSLParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(DSLParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(DSLParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(DSLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(DSLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(DSLParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(DSLParser.StyleContext ctx);
}