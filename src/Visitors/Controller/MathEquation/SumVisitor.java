package Visitors.Controller.MathEquation;

import Models.ControllerModels.Action.Sum;
import Visitors.Controller.TextValueVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class SumVisitor extends DSLParserBaseVisitor {

    Sum sum = new Sum();

    TextValueVisitor textValueVisitor = new TextValueVisitor();
    @Override
    public Sum visitSum(DSLParser.SumContext ctx) {


        if (ctx.FILE_NAME_ID(0) != null)
            sum.setFileNameId1(ctx.FILE_NAME_ID(0).getText());

        if (ctx.ASSIGN_OP_ID() != null)
            sum.setAssignOpId(ctx.ASSIGN_OP_ID().getText());

        if (ctx.textValue(0) != null)
            sum.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(0)));

        if (ctx.FILE_NAME_ID(1) != null)
            sum.setFileNameId2(ctx.FILE_NAME_ID(1).getText());

        if (ctx.SUM_OP_ID() != null)
            sum.setSumOpId(ctx.SUM_OP_ID().getText());

        if (ctx.textValue(1) != null)
            sum.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(1)));

        if (ctx.FILE_NAME_ID(2) != null)
            sum.setFileNameId2(ctx.FILE_NAME_ID(2).getText());

        if (ctx.END_STATMENT_ID() != null)
            sum.setEndStatementId(ctx.END_STATMENT_ID().getText());

        return sum;
    }
}
