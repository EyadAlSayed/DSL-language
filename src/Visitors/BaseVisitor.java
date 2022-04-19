package Visitors;

import Models.ControllerModels.*;
import Models.DSLDocument;
import Models.PageModels.*;
import Visitors.ControllerVisitor.ControllerVisitor;
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

    @Override
    public FormBodyAttribute visitForm(DSLParser.FormContext ctx){
        FormBodyAttribute formBodyAttribute = new FormBodyAttribute();

            //ABOOOD 3bbi codak hon ha!! ma t3mel tabe3 jdid.. بقوصك

        return formBodyAttribute;
    }




    // EYAD
    @Override
    public ControllerElement visitControllerElement(DSLParser.ControllerElementContext ctx) {
        ControllerElement controllerElement = new ControllerElement();
        controllerElement.setControllerDef(ControllerVisitor.getInstance().visitControllerDef(ctx.controllerDef()));
        return controllerElement;
    }






}
