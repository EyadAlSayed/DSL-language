package Visitors.Controller.IfCondition;

import Models.ControllerModels.If.Condition;
import Visitors.Controller.TextValueVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class ConditionVisitor extends DSLParserBaseVisitor {


    Condition condition = new Condition();

    LogicalOperationVisitor logicalOperationVisitor = new LogicalOperationVisitor();
    TextValueVisitor textValueVisitor = new TextValueVisitor();
    @Override
    public Condition visitCondition(DSLParser.ConditionContext ctx) {

        if (ctx.FILE_NAME_ID() != null)
            condition.setFileNameId(ctx.FILE_NAME_ID().getText());

        if (ctx.logicalOperation(0) != null)
            condition.setLogicalOperation1(logicalOperationVisitor.visitLogicalOperation(ctx.logicalOperation(0)));

        if (ctx.textValue() != null)
            condition.setTextValue(textValueVisitor.visitTextValue(ctx.textValue()));

      if (ctx.logicalOperation(1) != null)
          condition.setLogicalOperation2(logicalOperationVisitor.visitLogicalOperation(ctx.logicalOperation(1)));


        return condition;
    }
}