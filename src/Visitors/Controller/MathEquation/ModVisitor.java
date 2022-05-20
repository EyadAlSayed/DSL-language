package Visitors.Controller.MathEquation;

import Models.ControllerModels.Action.Mod;

import Visitors.Controller.TextValueVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class ModVisitor extends DSLParserBaseVisitor {
    Mod mod = new Mod();


    TextValueVisitor textValueVisitor = new TextValueVisitor();

    @Override
    public Mod visitMod(DSLParser.ModContext ctx) {


        if (ctx.FILE_NAME_ID(0) != null)
            mod.setFileNameId1(ctx.FILE_NAME_ID(0).getText());

        if (ctx.ASSIGN_OP_ID() != null)
            mod.setAssignOpId(ctx.ASSIGN_OP_ID().getText());

        if (ctx.textValue(0) != null)
            mod.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(0)));

        if (ctx.FILE_NAME_ID(1) != null)
            mod.setFileNameId2(ctx.FILE_NAME_ID(1).getText());

        if (ctx.MOD_OP_ID() != null)
            mod.setModOpId(ctx.MOD_OP_ID().getText());

        if (ctx.textValue(1) != null)
            mod.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(1)));

        if (ctx.FILE_NAME_ID(2) != null)
            mod.setFileNameId2(ctx.FILE_NAME_ID(2).getText());

        if (ctx.END_STATMENT_ID() != null)
            mod.setEndStatementId(ctx.END_STATMENT_ID().getText());

        return mod;
    }
}
