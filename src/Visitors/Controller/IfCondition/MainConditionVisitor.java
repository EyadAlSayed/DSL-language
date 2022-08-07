package Visitors.Controller.IfCondition;

import Models.ControllerModels.If.MainCondition;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class MainConditionVisitor extends DSLParserBaseVisitor {

    EqualConditionVisitor equalConditionVisitor;
    BinaryEqualConditionVisitor binaryEqualConditionVisitor;

    @Override
    public MainCondition visitMain_condition(DSLParser.Main_conditionContext ctx) {
        MainCondition mainCondition = new MainCondition();

        equalConditionVisitor = new EqualConditionVisitor();
        binaryEqualConditionVisitor = new BinaryEqualConditionVisitor();

        if(ctx.equal_condition() != null)
            mainCondition.setEqualCondition(equalConditionVisitor.visitEqual_condition(ctx.equal_condition()));

        for (int i = 0; i < ctx.binary_equal_condition().size(); i++) {
            mainCondition.getBinaryEqualCondition().add(binaryEqualConditionVisitor.visitBinary_equal_condition(ctx.binary_equal_condition(i)));
        }

        return  mainCondition;
    }
}
