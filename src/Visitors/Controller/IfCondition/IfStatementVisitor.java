package Visitors.Controller.IfCondition;

import Models.ControllerModels.If.IFStatement;
import Visitors.Controller.ControllerTokensVisitor;
import Visitors.Node;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class IfStatementVisitor extends DSLParserBaseVisitor {

    IFStatement ifStatement;

    ConditionVisitor conditionVisitor;

    ControllerTokensVisitor controllerTokensVisitor;
    MainConditionVisitor mainConditionVisitor;


    public IFStatement visitIfStatment(DSLParser.IfStatmentContext ctx,Node father) {
        ifStatement = new IFStatement();
        conditionVisitor = new ConditionVisitor();
        controllerTokensVisitor = new ControllerTokensVisitor();
        Node node = new Node(father,ifStatement);
        father.getSons().add(node);
        mainConditionVisitor = new MainConditionVisitor();


        if (ctx.IF_ID() != null)
            ifStatement.setIfId(ctx.IF_ID().getText());

        if (ctx.OPEN_PAR_BRACKT_ID() != null)
            ifStatement.setOpenParBracktId(ctx.OPEN_PAR_BRACKT_ID().getText());

        if(ctx.main_condition() != null){
            ifStatement.setMainCondition(mainConditionVisitor.visitMain_condition(ctx.main_condition(),father));
        }
        if (ctx.CLOSE_PAR_BRACKT_ID() != null)
            ifStatement.setCloseParBracktId(ctx.CLOSE_PAR_BRACKT_ID().getText());

        if (ctx.OPEN_CURLY_BRACKT_ID() != null)
            ifStatement.setOpenCurlyBracktId(ctx.OPEN_CURLY_BRACKT_ID().getText());

        for (int i = 0; i < ctx.controllerTokens().size(); i++) {
            ifStatement.getControllerTokens().add(controllerTokensVisitor.visitControllerTokens(ctx.controllerTokens(i),node));
        }

        if (ctx.CLOSE_CURLY_BRACKT_ID() != null)
            ifStatement.setCloseParBracktId(ctx.CLOSE_CURLY_BRACKT_ID().getText());

        return  ifStatement;
    }
}
