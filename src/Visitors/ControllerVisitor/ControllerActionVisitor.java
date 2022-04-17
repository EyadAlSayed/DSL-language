package Visitors.ControllerVisitor;

import Models.ControllerModels.Action;
import gen.DSLParser;


// EYAD
public class ControllerActionVisitor extends ControllerVisitor{

    private static ControllerActionVisitor controllerActionVisitor;

    public static ControllerActionVisitor getInstance(){
        if (controllerActionVisitor == null){
            controllerActionVisitor = new ControllerActionVisitor();
        }
        return controllerActionVisitor;
    }

    @Override
    public Action visitAction(DSLParser.ActionContext ctx) {
        Action action  = new Action();
        if (ctx.PRINT_ACTION() != null)
            action.setPrintAction(ctx.PRINT_ACTION().getText());

        for (int i = 0; i < ctx.TEXT().size(); i++) {
            action.getText().add(ctx.TEXT(i).getText());
        }

        return action;
    }


}
