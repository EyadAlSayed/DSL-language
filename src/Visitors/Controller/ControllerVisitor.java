package Visitors.Controller;

import Models.ControllerModels.Controller;
import Visitors.Node;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

import java.util.Objects;

public class ControllerVisitor extends DSLParserBaseVisitor {
    Controller controller;
    ControllerTokensVisitor controllerTokensVisitor;
    @Override
    public Controller visitControllerDef(DSLParser.ControllerDefContext ctx) {
        controller = new Controller();

        Node node = new Node(null,controller);
        if (ctx.CONTROLLER_DEF() != null)
            controller.setControllerDef(ctx.CONTROLLER_DEF().getText());

        if (ctx.FILE_NAME_ID(0) != null){
            controller.setFileNameId1(ctx.FILE_NAME_ID(0).getText());
        }

        if (ctx.CONTROLLER_METHOD() != null)
            controller.setControllerMethod(ctx.CONTROLLER_METHOD().getText());

        if (ctx.FILE_NAME_ID(1) != null) {
            if(ProjectMain.PAGE_NAME != null) {
                if (!Objects.equals(ProjectMain.PAGE_NAME, ctx.FILE_NAME_ID(1).getText())) {
                    ProjectMain.generateSymbolTable(ctx.FILE_NAME_ID(1).getText());
                }
            }else
                ProjectMain.generateSymbolTable(ctx.FILE_NAME_ID(1).getText());
            controller.setFileNameId2(ctx.FILE_NAME_ID(1).getText());
        }
        if (ctx.OPEN_CURLY_BRACKT_ID() != null)
            controller.setOpenCurlyBrackt(ctx.OPEN_CURLY_BRACKT_ID().getText());
        if (ctx.controllerTokens().size() > 0) {
            controllerTokensVisitor = new ControllerTokensVisitor();
            for (int i = 0; i < ctx.controllerTokens().size(); i++) {
                controller.getControllerTokens().add(controllerTokensVisitor.visitControllerTokens(ctx.controllerTokens(i),node));
            }
        }

        if (ctx.CLOSE_CURLY_BRACKT_ID() != null)
            controller.setCloseCurlyBrackt(ctx.CLOSE_CURLY_BRACKT_ID().getText());

       return controller;
    }
}
