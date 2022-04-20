package Visitors;


import Models.DSLDocument;
import Visitors.ControllerVisitor.ControllerVisitor;
import Visitors.PageVisitors.PageVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;


/* This is the main visitor */
public class BaseVisitor extends DSLParserBaseVisitor {


    DSLDocument dslDocument = new DSLDocument();
    PageVisitor pageVisitor ;
    ControllerVisitor controllerVisitor ;
    @Override
    public DSLDocument visitDslDocument(DSLParser.DslDocumentContext ctx) {



        if(ctx.pageStructure()!= null)
        {
            pageVisitor = new PageVisitor();
            dslDocument.setPageStructure(pageVisitor.visitPageStructure(ctx.pageStructure()));
        }
        else if(ctx.controllerElement()!=null)
        {
            controllerVisitor = ControllerVisitor.getInstance();
            dslDocument.setControllerElement(controllerVisitor.visitControllerDef(ctx.controllerElement().controllerDef()));
        }

        return dslDocument;
    }





}
