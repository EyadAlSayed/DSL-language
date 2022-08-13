package Visitors.Controller.IfCondition;

import Models.ControllerModels.If.MainCondition;
import Visitors.Node;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class MainConditionVisitor extends DSLParserBaseVisitor {

    EqualConditionVisitor equalConditionVisitor;
    BinaryEqualConditionVisitor binaryEqualConditionVisitor;
    MainCondition mainCondition;

    public MainCondition visitMain_condition(DSLParser.Main_conditionContext ctx, Node father) {
         mainCondition = new MainCondition();

        equalConditionVisitor = new EqualConditionVisitor();
        binaryEqualConditionVisitor = new BinaryEqualConditionVisitor();

        if(ctx.equal_condition() != null)
            mainCondition.setEqualCondition(equalConditionVisitor.visitEqual_condition(ctx.equal_condition(),father));

        for (int i = 0; i < ctx.binary_equal_condition().size(); i++) {
            mainCondition.getBinaryEqualCondition().add(binaryEqualConditionVisitor.visitBinary_equal_condition(ctx.binary_equal_condition(i),father));
        }

        return  mainCondition;
    }
}
