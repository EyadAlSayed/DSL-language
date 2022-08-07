package Visitors.Controller.IfCondition;

import Models.ControllerModels.If.BinaryEqualCondition;
import Visitors.Controller.TextValueVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class BinaryEqualConditionVisitor  extends DSLParserBaseVisitor {

    LogicalOperationVisitor logicalOperationVisitor;
    TextValueVisitor textValueVisitor;

    @Override
    public BinaryEqualCondition visitBinary_equal_condition(DSLParser.Binary_equal_conditionContext ctx) {
        BinaryEqualCondition binaryEqualCondition = new BinaryEqualCondition();
        logicalOperationVisitor = new LogicalOperationVisitor();
        textValueVisitor = new TextValueVisitor();

        if (ctx.logicalOperation() != null)
            binaryEqualCondition.setLogicalOperation(logicalOperationVisitor.visitLogicalOperation(ctx.logicalOperation()));

        if(ctx.FILE_NAME_ID() != null)
            binaryEqualCondition.setFileNameId(ctx.FILE_NAME_ID().getText());
        if(ctx.EQUAL_OP_ID() != null)
            binaryEqualCondition.setEqualOpId(ctx.EQUAL_OP_ID().getText());

        if(ctx.textValue() != null)
            binaryEqualCondition.setTextValue(textValueVisitor.visitTextValue(ctx.textValue()));

        return binaryEqualCondition;
    }
}
