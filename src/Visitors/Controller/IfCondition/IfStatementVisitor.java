package Visitors.Controller.IfCondition;

import Models.ControllerModels.If.IFStatement;
import Visitors.Controller.ControllerTokensVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class IfStatementVisitor extends DSLParserBaseVisitor {

    IFStatement ifStatement = new IFStatement();

    ConditionVisitor conditionVisitor;

    ControllerTokensVisitor controllerTokensVisitor;

    @Override
    public IFStatement visitIfStatment(DSLParser.IfStatmentContext ctx) {
        conditionVisitor = new ConditionVisitor();
        controllerTokensVisitor = new ControllerTokensVisitor();


        if (ctx.IF_ID() != null)
            ifStatement.setIfId(ctx.IF_ID().getText());

        if (ctx.OPEN_PAR_BRACKT_ID() != null)
            ifStatement.setOpenParBracktId(ctx.OPEN_PAR_BRACKT_ID().getText());

        for (int i = 0; i < ctx.condition().size(); i++) {
            ifStatement.getConditions().add(conditionVisitor.visitCondition(ctx.condition(i)));
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
