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
	 * Visit a parse tree produced by {@link DSLParser#controllerElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControllerElement(DSLParser.ControllerElementContext ctx);
}