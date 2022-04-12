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
	 * Enter a parse tree produced by {@link DSLParser#controllerElement}.
	 * @param ctx the parse tree
	 */
	void enterControllerElement(DSLParser.ControllerElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#controllerElement}.
	 * @param ctx the parse tree
	 */
	void exitControllerElement(DSLParser.ControllerElementContext ctx);
}