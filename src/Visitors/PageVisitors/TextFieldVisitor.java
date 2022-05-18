package Visitors.PageVisitors;

import Models.ControllerModels.PageModels.TextField;
import Models.ControllerModels.PageModels.TextFieldAttribute;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class TextFieldVisitor extends DSLParserBaseVisitor {

    TextField textField;
    TextFieldAttributeVisitor visitTextFieldAttribute;

    @Override
    public TextField visitTextField(DSLParser.TextFieldContext ctx){

        textField = new TextField();

        if(ctx.TEXT_FIELD() != null)
            textField.setTEXT_FIELD(ctx.TEXT_FIELD().getText());
        if(ctx.FILE_NAME_ID() != null)
            textField.setNAME(ctx.FILE_NAME_ID().getText());
        if(ctx.TEXT() != null)
            textField.setTEXT(ctx.TEXT().getText());
        else
            textField.setTEXT("");
        if(ctx.textFieldAttribute() != null) {
            visitTextFieldAttribute = new TextFieldAttributeVisitor();
            textField.setATTRIBUTE(visitTextFieldAttribute.visitTextFieldAttribute(ctx.textFieldAttribute()));
        }else{
            TextFieldAttribute attribute = new TextFieldAttribute();
            attribute.setTEXT("Text");
            textField.setATTRIBUTE(attribute);
        }

        return textField;
    }
}
