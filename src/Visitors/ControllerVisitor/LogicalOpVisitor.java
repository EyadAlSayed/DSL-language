package Visitors.ControllerVisitor;

import Models.ControllerModels.LogicalOp;
import gen.DSLParser;


// EYAD
public class LogicalOpVisitor extends ConditionVisitor{


    private static LogicalOpVisitor logicalOpVisitor;

    public static LogicalOpVisitor getInstance(){
        if (logicalOpVisitor == null){
            logicalOpVisitor = new LogicalOpVisitor();
        }
        return logicalOpVisitor;
    }

    @Override
    public LogicalOp visitLogicalOp(DSLParser.LogicalOpContext ctx) {
        LogicalOp logicalOp = new LogicalOp();

        if (ctx.AND_OP_ID() != null)
            logicalOp.setAndOpId(ctx.AND_OP_ID().getText());

        if (ctx.OR_OP_ID() != null)
            logicalOp.setOrOpId(ctx.OR_OP_ID().getText());

        if (ctx.EQUAL_OP_ID() != null)
            logicalOp.setEqualOpId(ctx.EQUAL_OP_ID().getText());

        return logicalOp;
    }
}
