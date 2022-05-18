package Visitors.PageVisitors;

import Models.ControllerModels.PageModels.TextFieldAttribute;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class TextFieldAttributeVisitor extends DSLParserBaseVisitor {

    TextFieldAttribute textFieldAttribute;

    @Override
    public TextFieldAttribute visitTextFieldAttribute(DSLParser.TextFieldAttributeContext ctx){

        textFieldAttribute = new TextFieldAttribute();

        if(ctx.TEXT_DEF_ID() != null)
            textFieldAttribute.setTEXT(ctx.TEXT_DEF_ID().getText());
        if(ctx.EMAIL_AS_PARAMETER() != null)
            textFieldAttribute.setEMAIL(ctx.EMAIL_AS_PARAMETER().getText());
        if(ctx.PASSWORD_AS_PARAMETER() != null)
            textFieldAttribute.setPASSWORD(ctx.PASSWORD_AS_PARAMETER().getText());
        if(ctx.DATE_AS_PARAMETER() != null)
            textFieldAttribute.setDATE(ctx.DATE_AS_PARAMETER().getText());

        return textFieldAttribute;
    }
}
