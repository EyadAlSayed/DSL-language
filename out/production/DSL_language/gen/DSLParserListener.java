// Generated from D:/Documents/GitHub/DSL-language2/out/production/DSL_language\DSLParser.g4 by ANTLR 4.9.1
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