package Visitors.ControllerVisitor;

import Models.ControllerModels.ControllerDef;
import Models.ControllerModels.ControllerTokens;
import Visitors.BaseVisitor;
import gen.DSLParser;


// EYAD
public class ControllerVisitor extends BaseVisitor {

    private static ControllerVisitor controllerVisitor;

    public static ControllerVisitor getInstance() {
        if (controllerVisitor == null) {
            controllerVisitor = new ControllerVisitor();
        }
        return controllerVisitor;
    }

    @Override
    public ControllerDef visitControllerDef(DSLParser.ControllerDefContext ctx) {
        ControllerDef controllerDef = new ControllerDef();

        if (ctx.CONTROLLER_DEF_ID() != null)
            controllerDef.setControllerDefId(ctx.CONTROLLER_DEF_ID().getText());

        if (ctx.FILE_NAME_ID() != null)
            controllerDef.setFileNameId(ctx.FILE_NAME_ID().getText());

        for (int i = 0; i < ctx.controllerTokens().size(); i++) {
            controllerDef.getControllerTokens().add(visitControllerTokens(ctx.controllerTokens(i),controllerDef));
        }

        if (ctx.CONTROLLER_DEF_END_ID() != null)
            controllerDef.setControllerDefEndId(ctx.CONTROLLER_DEF_END_ID().getText());

        return controllerDef;
    }


    public ControllerTokens visitControllerTokens(DSLParser.ControllerTokensContext ctx, ControllerDef controllerDef) {
        ControllerTokens controllerTokens = new ControllerTokens();
        if (ctx.bundle() != null) {
            controllerTokens.setBundle(BundleVisitor.getInstance().visitBundle(ctx.bundle(),controllerDef));
        }
        if (ctx.ifCondition() != null)
            controllerTokens.setIfCondition(ConditionVisitor.getInstance().visitIfCondition(ctx.ifCondition()));
        if (ctx.action() != null)
            controllerTokens.setAction(ControllerActionVisitor.getInstance().visitAction(ctx.action()));
        return controllerTokens;
    }
}
