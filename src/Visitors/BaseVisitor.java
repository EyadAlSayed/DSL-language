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
    public PageStructure visitPageStructure(DSLParser.PageStructureContext ctx){

        PageStructure pageStructure = new PageStructure();

        if(ctx.PAGE() != null)
            pageStructure.setPAGE(ctx.PAGE().getText());
        if(ctx.FILE_NAME_ID() != null)
            pageStructure.setPAGE_NAME(ctx.FILE_NAME_ID().getText());
        if(ctx.headerStructure() != null)
            pageStructure.setHeaderStructure(visitHeaderStructure(ctx.headerStructure()));
        if(ctx.body() != null)
            pageStructure.setBodyStructure(visitBody(ctx.body()));
        if(ctx.END_PAGE() != null)
            pageStructure.setEND_PAGE(ctx.END_PAGE().getText());

        return pageStructure;
    }

    @Override
    public HeaderStructure visitHeaderStructure(DSLParser.HeaderStructureContext ctx){

        HeaderStructure headerStructure = new HeaderStructure();

        if(ctx.HEADER() != null)
            headerStructure.setHEADER(ctx.HEADER().getText());
        if(ctx.value() != null)
            headerStructure.setValue(visitValue(ctx.value()));
        if(ctx.ENDHEADER() != null)
            headerStructure.setEND_HEADER(ctx.ENDHEADER().getText());

        return headerStructure;
    }

    @Override
    public BodyStructure visitBody(DSLParser.BodyContext ctx){

        BodyStructure bodyStructure = new BodyStructure();

        if(ctx.BODY_DEF_ID() != null)
            bodyStructure.setBODY(ctx.BODY_DEF_ID().getText());
        for(int i = 0; i < ctx.bodyAttribute().size(); i++){
            bodyStructure.getBodyAttributes().add(visitBodyAttribute(ctx.bodyAttribute(i)));
        }
        if(ctx.BODY_DEF_END_ID() != null)
            bodyStructure.setEND_BODY(ctx.BODY_DEF_END_ID().getText());

        return bodyStructure;
    }

    @Override
    public Value visitValue(DSLParser.ValueContext ctx){

        Value value = new Value();

        if(ctx.VALUE() != null)
            value.setVALUE(ctx.VALUE().getText());
        if(ctx.ASSIGN() != null)
            value.setVALUE(ctx.ASSIGN().getText());
        if(ctx.TEXT() != null)
            value.setTEXT(ctx.TEXT().getText());

        return value;
    }

    @Override
    public BodyAttribute visitBodyAttribute(DSLParser.BodyAttributeContext ctx){

        BodyAttribute bodyAttribute = new BodyAttribute();

        if(ctx.text() != null)
            bodyAttribute.setTextBodyAttribute(visitText(ctx.text()));
        if(ctx.form() != null)
            bodyAttribute.setFormBodyAttribute(visitForm(ctx.form()));

        return bodyAttribute;

    }

    @Override
    public TextBodyAttribute visitText(DSLParser.TextContext ctx){

        TextBodyAttribute textBodyAttribute = new TextBodyAttribute();

        if(ctx.TEXT_DEF_ID() != null)
            textBodyAttribute.setTEXT(ctx.TEXT_DEF_ID().getText());
        if(ctx.textName() != null)
            textBodyAttribute.setTextName(visitTextName(ctx.textName()));
        if(ctx.value() != null)
            textBodyAttribute.setValue(visitValue(ctx.value()));
        if(ctx.value() != null)
            textBodyAttribute.setEND_TEXT(ctx.TEXT_DEF_END_ID().getText());

        return textBodyAttribute;
    }

    @Override
    public TextName visitTextName(DSLParser.TextNameContext ctx){

        TextName textName = new TextName();

        if(ctx.NAME() != null)
            textName.setNAME(ctx.NAME().getText());
        if(ctx.ASSIGN() != null)
            textName.setASSIGN(ctx.ASSIGN().getText());
        if(ctx.TEXT() != null)
            textName.setTEXT(ctx.TEXT().getText());

        return textName;
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
