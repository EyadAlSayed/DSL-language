package Visitors.Controller.IfCondition;

import Models.ControllerModels.If.IFStatement;
import Models.ControllerModels.If.MainCondition;
import Visitors.Controller.ControllerTokensVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class IfStatementVisitor extends DSLParserBaseVisitor {

    IFStatement ifStatement;

    ConditionVisitor conditionVisitor;

    ControllerTokensVisitor controllerTokensVisitor;

    MainConditionVisitor mainConditionVisitor;
    @Override
    public IFStatement visitIfStatment(DSLParser.IfStatmentContext ctx) {
        ifStatement = new IFStatement();
        conditionVisitor = new ConditionVisitor();
        controllerTokensVisitor = new ControllerTokensVisitor();
        mainConditionVisitor = new MainConditionVisitor();


        if (ctx.IF_ID() != null)
            ifStatement.setIfId(ctx.IF_ID().getText());

        if (ctx.OPEN_PAR_BRACKT_ID() != null)
            ifStatement.setOpenParBracktId(ctx.OPEN_PAR_BRACKT_ID().getText());

        if(ctx.main_condition() != null){
            ifStatement.setMainCondition(mainConditionVisitor.visitMain_condition(ctx.main_condition()));
        }
        if (ctx.CLOSE_PAR_BRACKT_ID() != null)
            ifStatement.setCloseParBracktId(ctx.CLOSE_PAR_BRACKT_ID().getText());

        if (ctx.OPEN_CURLY_BRACKT_ID() != null)
            ifStatement.setOpenCurlyBracktId(ctx.OPEN_CURLY_BRACKT_ID().getText());

        for (int i = 0; i < ctx.controllerTokens().size(); i++) {
            ifStatement.getControllerTokens().add(controllerTokensVisitor.visitControllerTokens(ctx.controllerTokens(i)));
        }

        if (ctx.CLOSE_CURLY_BRACKT_ID() != null)
            ifStatement.setCloseParBracktId(ctx.CLOSE_CURLY_BRACKT_ID().getText());

        return  ifStatement;
    }
}
