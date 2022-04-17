package Visitors.ControllerVisitor;

import Models.ControllerModels.DoubleCondition;
import Models.ControllerModels.SingleCondition;
import gen.DSLParser;


// EYAD
public class ConditionVisitor extends ControllerVisitor{

    private static ConditionVisitor conditionVisitor;

    public static ConditionVisitor getInstance(){
        if (conditionVisitor == null){
            conditionVisitor = new ConditionVisitor();
        }
        return conditionVisitor;
    }

    @Override
    public SingleCondition visitSingleCondition(DSLParser.SingleConditionContext ctx) {
        SingleCondition singleCondition = new SingleCondition();

        if (ctx.IF_ID() != null)
            singleCondition.setIfId(ctx.IF_ID().getText());

        if (ctx.OPEN_PAR_BRACKT_ID() != null)
            singleCondition.setOpenParBracktId(ctx.OPEN_PAR_BRACKT_ID().getText());

        singleCondition.setVar(BundleVisitor.getInstance().visitVar(ctx.var()));

        singleCondition.setLogicalOp(LogicalOpVisitor.getInstance().visitLogicalOp(ctx.logicalOp()));

        if (ctx.TEXT() != null)
            singleCondition.setText(ctx.getText());

        if (ctx.CLOSE_PAR_BRACKT_ID() != null)
            singleCondition.setCloseParBracktId(ctx.CLOSE_PAR_BRACKT_ID().getText());

        return singleCondition;
    }

    @Override
    public DoubleCondition visitDoubleCondition(DSLParser.DoubleConditionContext ctx) {
        DoubleCondition doubleCondition = new DoubleCondition();

        if (ctx.IF_ID() != null)
            doubleCondition.setIfId(ctx.IF_ID().getText());

        if (ctx.OPEN_PAR_BRACKT_ID() != null)
            doubleCondition.setOpenParBracktId(ctx.OPEN_PAR_BRACKT_ID().getText());

        doubleCondition.setVar1(BundleVisitor.getInstance().visitVar(ctx.var(0)));

        doubleCondition.setLogicalOp1(LogicalOpVisitor.getInstance().visitLogicalOp(ctx.logicalOp(0)));

        if (ctx.TEXT(0) != null)
            doubleCondition.setText1(ctx.TEXT(0).getText());



        doubleCondition.setLogicalOp2(LogicalOpVisitor.getInstance().visitLogicalOp(ctx.logicalOp(1)));

        doubleCondition.setVar2(BundleVisitor.getInstance().visitVar(ctx.var(1)));

        doubleCondition.setLogicalOp3(LogicalOpVisitor.getInstance().visitLogicalOp(ctx.logicalOp(2)));

        if (ctx.TEXT(1) != null)
            doubleCondition.setText2(ctx.TEXT(1).getText());

        if (ctx.CLOSE_PAR_BRACKT_ID() != null)
            doubleCondition.setCloseParBracktId(ctx.CLOSE_PAR_BRACKT_ID().getText());


        return doubleCondition;
    }
}
