package Visitors.PageVisitors;

import Models.PageModels.Input;
import Models.PageModels.InputAttribute;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class InputVisitor extends DSLParserBaseVisitor {

    Input input;
    InputAttributeVisitor visitInputAttribute;

    @Override
    public Input visitInput(DSLParser.InputContext ctx){

        input = new Input();

        if(ctx.INPUT() != null)
            input.setINPUT(ctx.INPUT().getText());
        if(ctx.FILE_NAME_ID() != null)
            input.setNAME(ctx.FILE_NAME_ID().getText());
        if(ctx.TEXT() != null)
            input.setTEXT(ctx.TEXT().getText());
        else
            input.setTEXT("");
        if(ctx.inputAttribute() != null) {
            visitInputAttribute = new InputAttributeVisitor();
            input.setATTRIBUTE(visitInputAttribute.visitInputAttribute(ctx.inputAttribute()));
        }else{
            InputAttribute attribute = new InputAttribute();
            attribute.setTEXT("Text");
            input.setATTRIBUTE(attribute);
        }
        if (ctx.marginList().TEXTNUM(0) != null) {
            int[] MARGINS = new int[4];

            MARGINS[0] = Integer.parseInt(ctx.marginList().TEXTNUM(0).getText());
            MARGINS[1] = Integer.parseInt(ctx.marginList().TEXTNUM(1).getText());
            MARGINS[2] = Integer.parseInt(ctx.marginList().TEXTNUM(2).getText());
            MARGINS[3] = Integer.parseInt(ctx.marginList().TEXTNUM(3).getText());

            input.setMARGINS(MARGINS);
        }

        return input;
    }
}
