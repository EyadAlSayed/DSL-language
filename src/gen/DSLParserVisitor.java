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
	 * Visit a parse tree produced by {@link DSLParser#bodyAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyAttributes(DSLParser.BodyAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(DSLParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#radioGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadioGroup(DSLParser.RadioGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#checkbox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckbox(DSLParser.CheckboxContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(DSLParser.ButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(DSLParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#buttonSend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonSend(DSLParser.ButtonSendContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#controllerDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControllerDef(DSLParser.ControllerDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#textField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextField(DSLParser.TextFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#controllerTokens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControllerTokens(DSLParser.ControllerTokensContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#send}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend(DSLParser.SendContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#textFieldAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldAttribute(DSLParser.TextFieldAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(DSLParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#ifStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatment(DSLParser.IfStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#logicalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperation(DSLParser.LogicalOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DSLParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#textValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextValue(DSLParser.TextValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(DSLParser.SpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(DSLParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(DSLParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#mathEquation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathEquation(DSLParser.MathEquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(DSLParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(DSLParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(DSLParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(DSLParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(DSLParser.ModContext ctx);
}