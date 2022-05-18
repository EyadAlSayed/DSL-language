package Visitors.PageVisitors;

import Models.ControllerModels.PageModels.BodyAttribute;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class BodyAttributeVisitor extends DSLParserBaseVisitor {

    BodyAttribute bodyAttribute;

    HeaderVisitor headerVisitor;
    TextVisitor textVisitor;
    TextFieldVisitor textFieldVisitor;

    @Override
    public BodyAttribute visitBodyAttributes(DSLParser.BodyAttributesContext ctx){

        bodyAttribute = new BodyAttribute();

        if(ctx.headerStructure() != null) {
            headerVisitor = new HeaderVisitor();
            bodyAttribute.setHeader(headerVisitor.visitHeaderStructure(ctx.headerStructure()));
        }
        if(ctx.text() != null){
            textVisitor = new TextVisitor();
            bodyAttribute.setText(textVisitor.visitText(ctx.text()));
        }
        if(ctx.textField() != null){
            textFieldVisitor = new TextFieldVisitor();
            bodyAttribute.setTextField(textFieldVisitor.visitTextField(ctx.textField()));
        }

        return bodyAttribute;
    }
}
