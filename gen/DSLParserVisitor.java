// Generated from D:/DSL_language/src\DSLParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DSLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DSLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(DSLParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletOrSeaWs(DSLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(DSLParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(DSLParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#htmlData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlData(DSLParser.HtmlDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(DSLParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(DSLParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(DSLParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ng_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_for(DSLParser.Ng_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ngfor_close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgfor_close(DSLParser.Ngfor_closeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ng_show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_show(DSLParser.Ng_showContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ng_hide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_hide(DSLParser.Ng_hideContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ng_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_if(DSLParser.Ng_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#model_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_variable(DSLParser.Model_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ngswitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgswitch(DSLParser.NgswitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ngswitch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgswitch_case(DSLParser.Ngswitch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ngswitch_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgswitch_default(DSLParser.Ngswitch_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ngmodel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgmodel(DSLParser.NgmodelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(DSLParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#mustach_open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustach_open(DSLParser.Mustach_openContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#mustach_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustach_body(DSLParser.Mustach_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#open_b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_b(DSLParser.Open_bContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#b_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_attribute(DSLParser.B_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(DSLParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(DSLParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(DSLParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(DSLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(DSLParser.StyleContext ctx);
}