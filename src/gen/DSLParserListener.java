// Generated from D:/DSL-language/src\DSLParser.g4 by ANTLR 4.9.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLParser}.
 */
public interface DSLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLParser#dslDocument}.
	 * @param ctx the parse tree
	 */
	void enterDslDocument(DSLParser.DslDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#dslDocument}.
	 * @param ctx the parse tree
	 */
	void exitDslDocument(DSLParser.DslDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#pageStructure}.
	 * @param ctx the parse tree
	 */
	void enterPageStructure(DSLParser.PageStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#pageStructure}.
	 * @param ctx the parse tree
	 */
	void exitPageStructure(DSLParser.PageStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#headerStructure}.
	 * @param ctx the parse tree
	 */
	void enterHeaderStructure(DSLParser.HeaderStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#headerStructure}.
	 * @param ctx the parse tree
	 */
	void exitHeaderStructure(DSLParser.HeaderStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(DSLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(DSLParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#bodyAttribute}.
	 * @param ctx the parse tree
	 */
	void enterBodyAttribute(DSLParser.BodyAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#bodyAttribute}.
	 * @param ctx the parse tree
	 */
	void exitBodyAttribute(DSLParser.BodyAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(DSLParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(DSLParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#textName}.
	 * @param ctx the parse tree
	 */
	void enterTextName(DSLParser.TextNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#textName}.
	 * @param ctx the parse tree
	 */
	void exitTextName(DSLParser.TextNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DSLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DSLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(DSLParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(DSLParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#form_attribute}.
	 * @param ctx the parse tree
	 */
	void enterForm_attribute(DSLParser.Form_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#form_attribute}.
	 * @param ctx the parse tree
	 */
	void exitForm_attribute(DSLParser.Form_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#children}.
	 * @param ctx the parse tree
	 */
	void enterChildren(DSLParser.ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#children}.
	 * @param ctx the parse tree
	 */
	void exitChildren(DSLParser.ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#text_input}.
	 * @param ctx the parse tree
	 */
	void enterText_input(DSLParser.Text_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#text_input}.
	 * @param ctx the parse tree
	 */
	void exitText_input(DSLParser.Text_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#email_input}.
	 * @param ctx the parse tree
	 */
	void enterEmail_input(DSLParser.Email_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#email_input}.
	 * @param ctx the parse tree
	 */
	void exitEmail_input(DSLParser.Email_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#password_input}.
	 * @param ctx the parse tree
	 */
	void enterPassword_input(DSLParser.Password_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#password_input}.
	 * @param ctx the parse tree
	 */
	void exitPassword_input(DSLParser.Password_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#radio_input}.
	 * @param ctx the parse tree
	 */
	void enterRadio_input(DSLParser.Radio_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#radio_input}.
	 * @param ctx the parse tree
	 */
	void exitRadio_input(DSLParser.Radio_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#radio_group}.
	 * @param ctx the parse tree
	 */
	void enterRadio_group(DSLParser.Radio_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#radio_group}.
	 * @param ctx the parse tree
	 */
	void exitRadio_group(DSLParser.Radio_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#checkbox_input}.
	 * @param ctx the parse tree
	 */
	void enterCheckbox_input(DSLParser.Checkbox_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#checkbox_input}.
	 * @param ctx the parse tree
	 */
	void exitCheckbox_input(DSLParser.Checkbox_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#submit_button}.
	 * @param ctx the parse tree
	 */
	void enterSubmit_button(DSLParser.Submit_buttonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#submit_button}.
	 * @param ctx the parse tree
	 */
	void exitSubmit_button(DSLParser.Submit_buttonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(DSLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(DSLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#controllerElement}.
	 * @param ctx the parse tree
	 */
	void enterControllerElement(DSLParser.ControllerElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#controllerElement}.
	 * @param ctx the parse tree
	 */
	void exitControllerElement(DSLParser.ControllerElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#controllerDef}.
	 * @param ctx the parse tree
	 */
	void enterControllerDef(DSLParser.ControllerDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#controllerDef}.
	 * @param ctx the parse tree
	 */
	void exitControllerDef(DSLParser.ControllerDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#controllerTokens}.
	 * @param ctx the parse tree
	 */
	void enterControllerTokens(DSLParser.ControllerTokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#controllerTokens}.
	 * @param ctx the parse tree
	 */
	void exitControllerTokens(DSLParser.ControllerTokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#bundle}.
	 * @param ctx the parse tree
	 */
	void enterBundle(DSLParser.BundleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#bundle}.
	 * @param ctx the parse tree
	 */
	void exitBundle(DSLParser.BundleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(DSLParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(DSLParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DSLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DSLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(DSLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(DSLParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOp(DSLParser.LogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOp(DSLParser.LogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(DSLParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(DSLParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#textValue}.
	 * @param ctx the parse tree
	 */
	void enterTextValue(DSLParser.TextValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#textValue}.
	 * @param ctx the parse tree
	 */
	void exitTextValue(DSLParser.TextValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(DSLParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(DSLParser.SpaceContext ctx);
}