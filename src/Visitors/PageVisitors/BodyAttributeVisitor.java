package Visitors.PageVisitors;

import Models.PageModels.BodyAttribute;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class BodyAttributeVisitor extends DSLParserBaseVisitor {

    BodyAttribute bodyAttribute;

    HeaderVisitor headerVisitor;
    TextVisitor textVisitor;
    TextFieldVisitor textFieldVisitor;
    ButtonVisitor buttonVisitor;
    RadioGroupVisitor radioGroupVisitor;
    FormVisitor formVisitor;

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

        if(ctx.button() != null) {
            buttonVisitor = new ButtonVisitor();
            bodyAttribute.setButton(buttonVisitor.visitButton(ctx.button()));
        }

        if(ctx.radioGroup() != null){
            radioGroupVisitor = new RadioGroupVisitor();
            bodyAttribute.setRadioGroup(radioGroupVisitor.visitRadioGroup(ctx.radioGroup()));
        }

        if(ctx.form() != null){
            formVisitor = new FormVisitor();
            bodyAttribute.setForm(formVisitor.visitForm(ctx.form()));
        }

        return bodyAttribute;
    }
}
