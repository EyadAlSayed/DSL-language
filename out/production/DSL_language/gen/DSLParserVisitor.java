// Generated from D:/Documents/GitHub/DSL-language2/out/production/DSL_language\DSLParser.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link DSLParser#space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(DSLParser.SpaceContext ctx);
}