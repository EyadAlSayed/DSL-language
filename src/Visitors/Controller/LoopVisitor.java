package Visitors.Controller;

import Models.ControllerModels.Loop;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class LoopVisitor extends DSLParserBaseVisitor {

    Loop loop = new Loop();

    ControllerTokensVisitor controllerTokensVisitor = new ControllerTokensVisitor();
    @Override
    public Loop visitLoop(DSLParser.LoopContext ctx) {

        if (ctx.FOR_ID() != null)
            loop.setForId(ctx.FOR_ID().getText());

        if (ctx.OPEN_PAR_BRACKT_ID() != null)
            loop.setOpenParBracktId(ctx.CLOSE_PAR_BRACKT_ID().getText());

        if (ctx.FILE_NAME_ID(0) != null)
            loop.setFileNameId1(ctx.FILE_NAME_ID(0).getText());

        if (ctx.TEXTNUM(0)  != null)
            loop.setTextNum1(ctx.TEXTNUM(0).getText());

        if (ctx.RANG() != null)
            loop.setRang(ctx.RANG().getText());

        if (ctx.FILE_NAME_ID(1) != null)
            loop.setFileNameId2(ctx.FILE_NAME_ID(1).getText());

        if (ctx.TEXTNUM(1)  != null)
            loop.setTextNum2(ctx.TEXTNUM(1).getText());

        if (ctx.CLOSE_PAR_BRACKT_ID() != null)
            loop.setCloseParBracktId(ctx.CLOSE_PAR_BRACKT_ID().getText());

        if (ctx.OPEN_CURLY_BRACKT_ID() != null)
            loop.setOpenCurlyBracktId(ctx.OPEN_CURLY_BRACKT_ID().getText());

        for (int i = 0; i < ctx.controllerTokens().size(); i++) {
            loop.getControllerTokens().add(controllerTokensVisitor.visitControllerTokens(ctx.controllerTokens(i)));
        }

        if(ctx.CLOSE_CURLY_BRACKT_ID() != null)
            loop.setCloseCurlyBracktId(ctx.CLOSE_CURLY_BRACKT_ID().getText());

        return loop;
    }
}
