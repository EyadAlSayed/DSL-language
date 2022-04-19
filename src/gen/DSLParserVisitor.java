// Generated from D:/Documents/GitHub/DSL-language2/src\DSLParser.g4 by ANTLR 4.9.1
package gen;
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
	 * Visit a parse tree produced by {@link DSLParser#dslDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDslDocument(DSLParser.DslDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#pageStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageStructure(DSLParser.PageStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#headerStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderStructure(DSLParser.HeaderStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(DSLParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#bodyAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyAttribute(DSLParser.BodyAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(DSLParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#textName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextName(DSLParser.TextNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DSLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(DSLParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#form_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm_attribute(DSLParser.Form_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#children}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildren(DSLParser.ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#text_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_input(DSLParser.Text_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#email_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmail_input(DSLParser.Email_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#password_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword_input(DSLParser.Password_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#radio_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadio_input(DSLParser.Radio_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#radio_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadio_group(DSLParser.Radio_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#checkbox_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckbox_input(DSLParser.Checkbox_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#submit_button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubmit_button(DSLParser.Submit_buttonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(DSLParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#controllerElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControllerElement(DSLParser.ControllerElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#controllerDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControllerDef(DSLParser.ControllerDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#controllerTokens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControllerTokens(DSLParser.ControllerTokensContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#bundle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBundle(DSLParser.BundleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#singleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCondition(DSLParser.SingleConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#doubleCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleCondition(DSLParser.DoubleConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(DSLParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOp(DSLParser.LogicalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(DSLParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(DSLParser.SpaceContext ctx);
}