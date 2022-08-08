package Visitors.PageVisitors;

import Models.PageModels.TextField;
import Models.PageModels.TextFieldAttribute;
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
        if (ctx.marginList().TEXTNUM(0) != null) {
            int[] MARGINS = new int[4];

            MARGINS[0] = Integer.parseInt(ctx.marginList().TEXTNUM(0).getText());
            MARGINS[1] = Integer.parseInt(ctx.marginList().TEXTNUM(1).getText());
            MARGINS[2] = Integer.parseInt(ctx.marginList().TEXTNUM(2).getText());
            MARGINS[3] = Integer.parseInt(ctx.marginList().TEXTNUM(3).getText());

            textField.setMARGINS(MARGINS);
        }

        return textField;
    }
}
