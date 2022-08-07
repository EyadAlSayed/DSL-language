package Visitors.Controller.IfCondition;

import Models.ControllerModels.If.EqualCondition;
import Models.TextValue;
import Visitors.Controller.TextValueVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class EqualConditionVisitor extends DSLParserBaseVisitor {


    TextValueVisitor textValueVisitor;
    @Override
    public EqualCondition visitEqual_condition(DSLParser.Equal_conditionContext ctx) {
        EqualCondition equalCondition = new EqualCondition();
        textValueVisitor = new TextValueVisitor();

        if(ctx.FILE_NAME_ID() != null)
            equalCondition.setFileNameId(ctx.FILE_NAME_ID().getText());

        if(ctx.EQUAL_OP_ID() != null){
            equalCondition.setEqualOpId(ctx.EQUAL_OP_ID().getText());
        }

        if(ctx.textValue() != null){
            equalCondition.setTextValue(textValueVisitor.visitTextValue(ctx.textValue()));
        }

        return  equalCondition;
    }
}
