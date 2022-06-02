package Visitors.Controller.IfCondition;

import Models.ControllerModels.If.LogicalOperation;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class LogicalOperationVisitor extends DSLParserBaseVisitor {

    LogicalOperation logicalOperation;

    @Override
    public LogicalOperation visitLogicalOperation(DSLParser.LogicalOperationContext ctx) {
        logicalOperation = new LogicalOperation();

        if (ctx.AND_OP_ID() != null)
            logicalOperation.setAndId(ctx.AND_OP_ID().getText());

        if (ctx.OR_OP_ID() != null)
            logicalOperation.setOrId(ctx.OR_OP_ID().getText());

        if (ctx.EQUAL_OP_ID() != null)
            logicalOperation.setEqualId(ctx.EQUAL_OP_ID().getText());

        return logicalOperation;
    }
}
