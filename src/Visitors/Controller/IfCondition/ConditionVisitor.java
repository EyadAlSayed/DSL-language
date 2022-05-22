package Visitors.Controller.IfCondition;

import Models.ControllerModels.If.Condition;
import Visitors.Controller.TextValueVisitor;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;
import org.antlr.v4.runtime.misc.Pair;

public class ConditionVisitor extends DSLParserBaseVisitor {


    Condition condition = new Condition();

    LogicalOperationVisitor logicalOperationVisitor = new LogicalOperationVisitor();
    TextValueVisitor textValueVisitor = new TextValueVisitor();


    public Condition visitCondition(DSLParser.ConditionContext ctx,Object father) {

        if (ctx.FILE_NAME_ID() != null)
        {
            Pair<String, Object> pair = new Pair<>(ctx.FILE_NAME_ID().getText(), father);
            if(!CustomPair.containVariable(ctx.FILE_NAME_ID().getText(), ProjectMain.symbolTablePage))
            {
                if(!CustomPair.containPair(pair,ProjectMain.symbolTableController)) {
                    //TODO: ERROR HANDLING HERE
                }
            }
            condition.setFileNameId(ctx.FILE_NAME_ID().getText());
        }

        if (ctx.logicalOperation(0) != null)
            condition.setLogicalOperation1(logicalOperationVisitor.visitLogicalOperation(ctx.logicalOperation(0)));

        if (ctx.textValue() != null)
            condition.setTextValue(textValueVisitor.visitTextValue(ctx.textValue()));

      if (ctx.logicalOperation(1) != null)
          condition.setLogicalOperation2(logicalOperationVisitor.visitLogicalOperation(ctx.logicalOperation(1)));


        return condition;
    }
}
