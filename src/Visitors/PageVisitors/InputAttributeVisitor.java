package Visitors.PageVisitors;

import Models.PageModels.InputAttribute;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class InputAttributeVisitor extends DSLParserBaseVisitor {

    InputAttribute inputAttribute;

    @Override
    public InputAttribute visitInputAttribute(DSLParser.InputAttributeContext ctx){

        inputAttribute = new InputAttribute();

        if(ctx.TEXT_DEF_ID() != null)
            inputAttribute.setTEXT(ctx.TEXT_DEF_ID().getText());
        if(ctx.EMAIL_AS_PARAMETER() != null)
            inputAttribute.setEMAIL(ctx.EMAIL_AS_PARAMETER().getText());
        if(ctx.PASSWORD_AS_PARAMETER() != null)
            inputAttribute.setPASSWORD(ctx.PASSWORD_AS_PARAMETER().getText());
        if(ctx.DATE_AS_PARAMETER() != null)
            inputAttribute.setDATE(ctx.DATE_AS_PARAMETER().getText());

        return inputAttribute;
    }
}
