package Visitors.Controller;

import Models.ControllerModels.Controller;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class ControllerVisitor extends DSLParserBaseVisitor {
    Controller controller;
    ControllerTokensVisitor controllerTokensVisitor;

    @Override
    public Controller visitControllerDef(DSLParser.ControllerDefContext ctx) {
        controller = new Controller();

        if (ctx.CONTROLLER_DEF() != null)
            controller.setControllerDef(ctx.CONTROLLER_DEF().getText());

        if (ctx.FILE_NAME_ID(0) != null){
            controller.setFileNameId1(ctx.FILE_NAME_ID(0).getText());
        }

        if (ctx.CONTROLLER_METHOD() != null)
            controller.setControllerMethod(ctx.CONTROLLER_METHOD().getText());

        if (ctx.FILE_NAME_ID(1) != null)
            controller.setFileNameId2(ctx.FILE_NAME_ID(1).getText());

        if (ctx.OPEN_CURLY_BRACKT_ID() != null)
            controller.setOpenCurlyBrackt(ctx.OPEN_CURLY_BRACKT_ID().getText());
        if (ctx.controllerTokens().size() > 0) {
            controllerTokensVisitor = new ControllerTokensVisitor();
            for (int i = 0; i < ctx.controllerTokens().size(); i++) {
                controller.getControllerTokens().add(controllerTokensVisitor.visitControllerTokens(ctx.controllerTokens(i)));
            }
        }

        if (ctx.CLOSE_CURLY_BRACKT_ID() != null)
            controller.setCloseCurlyBrackt(ctx.CLOSE_CURLY_BRACKT_ID().getText());

       return controller;
    }
}
