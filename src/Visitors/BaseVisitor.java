package Visitors;

import Models.DSLDocument;
import Models.PageModels.PageStructure;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;


/* This is the main visitor */
//TODO Complete BaseVisitor
public class BaseVisitor extends DSLParserBaseVisitor {

    @Override
    public DSLDocument visitDslDocument(DSLParser.DslDocumentContext ctx) {
        DSLDocument dslDocument = new DSLDocument();

        /* The visitor functions will look like this :-

            modelName = visitFunction(ctx.TheNameOfRule);

            DslDocument will have to visit either pageStructure or ControllerElement
            so the body of this function will look like this :-
         */

        if(ctx.pageStructure()!= null)
        {
            // dslDocument = visitPageStructure(ctx.pageStructure());
        }
        else
        {
            //dslDocument = visitControllerElement(ctx.controllerElement());
        }

        return dslDocument;
    }


}
