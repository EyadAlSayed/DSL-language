package Visitors.Controller.MathEquation;

import Models.ControllerModels.Action.Div;

import Visitors.Controller.TextValueVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class DivVisitor extends DSLParserBaseVisitor {

    Div div = new Div();


    TextValueVisitor textValueVisitor = new TextValueVisitor();

    @Override
    public Div visitDiv(DSLParser.DivContext ctx) {


        if (ctx.FILE_NAME_ID(0) != null)
            div.setFileNameId1(ctx.FILE_NAME_ID(0).getText());

        if (ctx.ASSIGN_OP_ID() != null)
            div.setAssignOpId(ctx.ASSIGN_OP_ID().getText());

        if (ctx.textValue(0) != null)
            div.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(0)));

        if (ctx.FILE_NAME_ID(1) != null)
            div.setFileNameId2(ctx.FILE_NAME_ID(1).getText());

        if (ctx.DIV_OP_ID() != null)
            div.setDivOpId(ctx.DIV_OP_ID().getText());

        if (ctx.textValue(1) != null)
            div.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(1)));

        if (ctx.FILE_NAME_ID(2) != null)
            div.setFileNameId2(ctx.FILE_NAME_ID(2).getText());

        if (ctx.END_STATMENT_ID() != null)
            div.setEndStatementId(ctx.END_STATMENT_ID().getText());

        return div;
    }
}
