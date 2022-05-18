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
	 * Enter a parse tree produced by {@link DSLParser#ifStatment}.
	 * @param ctx the parse tree
	 */
	void enterIfStatment(DSLParser.IfStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#ifStatment}.
	 * @param ctx the parse tree
	 */
	void exitIfStatment(DSLParser.IfStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperation(DSLParser.LogicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperation(DSLParser.LogicalOperationContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link DSLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DSLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DSLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DSLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DSLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#mathEquation}.
	 * @param ctx the parse tree
	 */
	void enterMathEquation(DSLParser.MathEquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#mathEquation}.
	 * @param ctx the parse tree
	 */
	void exitMathEquation(DSLParser.MathEquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(DSLParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(DSLParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(DSLParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(DSLParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(DSLParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(DSLParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(DSLParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(DSLParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(DSLParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(DSLParser.ModContext ctx);
}