package Visitors;


import Models.DSLDocument;
import Visitors.Controller.ControllerVisitor;
import Visitors.PageVisitors.PageVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;


/* This is the main visitor */
public class BaseVisitor extends DSLParserBaseVisitor {

    PageVisitor pageVisitor;
    ControllerVisitor controllerVisitor;


    DSLDocument dslDocument  = new DSLDocument();

    @Override
    public DSLDocument visitDslDocument(DSLParser.DslDocumentContext ctx) {

        if (ctx.pageStructure() != null) {
            pageVisitor = new PageVisitor();
            dslDocument.setPageStructure(pageVisitor.visitPageStructure(ctx.pageStructure()));
        }

        if (ctx.controllerDef() != null){
            controllerVisitor = new ControllerVisitor();
            dslDocument.setController(controllerVisitor.visitControllerDef(ctx.controllerDef()));
        }

        return dslDocument;
    }
}
