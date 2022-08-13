package Visitors.Controller.MathEquation;

import Models.ControllerModels.Action.MathOperation;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class MathOperationVisitor extends DSLParserBaseVisitor {

    MathOperation mathOperation;

    @Override
    public MathOperation visitMathOperation(DSLParser.MathOperationContext ctx) {
         mathOperation = new MathOperation();


        if(ctx.SUM_OP_ID() != null)
            mathOperation.setSumOpId(ctx.SUM_OP_ID().getText());

        if(ctx.MULT_OP_ID() != null)
            mathOperation.setMultOpId(ctx.MULT_OP_ID().getText());


        if(ctx.MINUS_OP_ID() != null)
            mathOperation.setMinusOpId(ctx.MINUS_OP_ID().getText());


        if(ctx.DIV_OP_ID() != null)
            mathOperation.setDivOpId(ctx.DIV_OP_ID().getText());

        if(ctx.MOD_OP_ID() != null)
            mathOperation.setModOpId(ctx.MOD_OP_ID().getText());


        return  mathOperation;
    }
}
