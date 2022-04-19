package Visitors;

import Models.PageModels.Value;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class ValueVisitor extends DSLParserBaseVisitor {

    Value value;

    @Override
    public Value visitValue(DSLParser.ValueContext ctx){

        value = new Value();

        if(ctx.VALUE() != null)
            value.setVALUE(ctx.VALUE().getText());
        if(ctx.ASSIGN() != null)
            value.setVALUE(ctx.ASSIGN().getText());
        if(ctx.TEXT() != null)
            value.setTEXT(ctx.TEXT().getText());

        return value;
    }
}
