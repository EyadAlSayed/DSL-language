package Visitors;


import Models.DSLDocument;
import Visitors.PageVisitors.PageVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;


/* This is the main visitor */
public class BaseVisitor extends DSLParserBaseVisitor {

    PageVisitor pageVisitor;

    DSLDocument dslDocument;

    @Override
    public DSLDocument visitDslDocument(DSLParser.DslDocumentContext ctx) {

        if (ctx.pageStructure() != null) {
            pageVisitor = new PageVisitor();
            dslDocument.setPageStructure(pageVisitor.visitPageStructure(ctx.pageStructure()));
        }

        return dslDocument;
    }
}
