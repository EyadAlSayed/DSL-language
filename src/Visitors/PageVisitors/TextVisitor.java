package Visitors.PageVisitors;

import Models.ControllerModels.PageModels.Text;
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

        return text;
    }
}
