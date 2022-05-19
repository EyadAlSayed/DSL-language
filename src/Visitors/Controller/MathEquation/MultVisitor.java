package Visitors.Controller.MathEquation;


import Models.ControllerModels.Action.Mult;
import Visitors.Controller.TextValueVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class MultVisitor extends DSLParserBaseVisitor {

    Mult mult = new Mult();


    TextValueVisitor textValueVisitor = new TextValueVisitor();

    @Override
    public Mult visitMult(DSLParser.MultContext ctx) {


        if (ctx.FILE_NAME_ID(0) != null)
            mult.setFileNameId1(ctx.FILE_NAME_ID(0).getText());

        if (ctx.ASSIGN_OP_ID() != null)
            mult.setAssignOpId(ctx.ASSIGN_OP_ID().getText());

        if (ctx.textValue(0) != null)
            mult.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(0)));

        if (ctx.FILE_NAME_ID(1) != null)
            mult.setFileNameId2(ctx.FILE_NAME_ID(1).getText());

        if (ctx.MULT_OP_ID() != null)
            mult.setMultOpId(ctx.MULT_OP_ID().getText());

        if (ctx.textValue(1) != null)
            mult.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(1)));

        if (ctx.FILE_NAME_ID(2) != null)
            mult.setFileNameId2(ctx.FILE_NAME_ID(2).getText());

        if (ctx.END_STATMENT_ID() != null)
            mult.setEndStatementId(ctx.END_STATMENT_ID().getText());

        return mult;
    }
}
