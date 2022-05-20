package Visitors.Controller.MathEquation;

import Models.ControllerModels.Action.Minus;

import Visitors.Controller.TextValueVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class MinusVisitor extends DSLParserBaseVisitor {

    Minus minus = new Minus();


    TextValueVisitor textValueVisitor = new TextValueVisitor();

    @Override
    public Minus visitMinus(DSLParser.MinusContext ctx) {


        if (ctx.FILE_NAME_ID(0) != null)
            minus.setFileNameId1(ctx.FILE_NAME_ID(0).getText());

        if (ctx.ASSIGN_OP_ID() != null)
            minus.setAssignOpId(ctx.ASSIGN_OP_ID().getText());

        if (ctx.textValue(0) != null)
            minus.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(0)));

        if (ctx.FILE_NAME_ID(1) != null)
            minus.setFileNameId2(ctx.FILE_NAME_ID(1).getText());

        if (ctx.MINUS_OP_ID() != null)
            minus.setMinusOpId(ctx.MINUS_OP_ID().getText());

        if (ctx.textValue(1) != null)
            minus.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(1)));

        if (ctx.FILE_NAME_ID(2) != null)
            minus.setFileNameId2(ctx.FILE_NAME_ID(2).getText());

        if (ctx.END_STATMENT_ID() != null)
            minus.setEndStatementId(ctx.END_STATMENT_ID().getText());

        return minus;
    }
}
