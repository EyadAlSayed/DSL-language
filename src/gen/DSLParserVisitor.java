// Generated from D:/DSL-language/src\DSLParser.g4 by ANTLR 4.9.2
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