package Visitors.PageVisitors;

import Models.PageModels.Text;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class TextVisitor extends DSLParserBaseVisitor {

    Text text;

    @Override
    public Text visitText(DSLParser.TextContext ctx){

        text = new Text();

        if(ctx.TEXT_DEF_ID() != null)
            text.setTEXT(ctx.TEXT_DEF_ID().getText());
        if(ctx.FILE_NAME_ID() != null)
            text.setNAME(ctx.FILE_NAME_ID().getText());
        if(ctx.TEXT() != null)
            text.setVALUE(ctx.TEXT().getText());
        else
            text.setVALUE("");
        if (ctx.marginList().TEXTNUM(0) != null) {
            int[] MARGINS = new int[4];


            MARGINS[0] = Integer.parseInt(ctx.marginList().TEXTNUM(0).getText());
            MARGINS[1] = Integer.parseInt(ctx.marginList().TEXTNUM(1).getText());
            MARGINS[2] = Integer.parseInt(ctx.marginList().TEXTNUM(2).getText());
            MARGINS[3] = Integer.parseInt(ctx.marginList().TEXTNUM(3).getText());

            text.setMARGINS(MARGINS);
        }
        return text;
    }
}
