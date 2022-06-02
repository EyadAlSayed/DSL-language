package Generators.Controller;

import Models.ControllerModels.If.Condition;
import Models.ControllerModels.If.IFStatement;
import Models.ControllerModels.If.LogicalOperation;

public class IfStatementGenerator {

    StringBuilder stringBuilder = new StringBuilder();
    ControllerGenerator controllerGenerator;
    TextValueGenerator textValueGenerator;

    public String ifStatementGenerate(IFStatement ifStatement) {
        stringBuilder.append("if(");
        if (ifStatement.getConditions().size() > 0)
            for (int i = 0; i < ifStatement.getConditions().size(); i++) {

                conditionGenerate(ifStatement.getConditions().get(i));

            }
        stringBuilder.append(" )\n");
        stringBuilder.append("{\n");

        if (ifStatement.getControllerTokens().size() > 0) {

            controllerGenerator = new ControllerGenerator();

            for (int i = 0; i < ifStatement.getControllerTokens().size(); i++) {

                stringBuilder.append(controllerGenerator.generateControllerToken(ifStatement.getControllerTokens().get(i)));
            }
        }
        stringBuilder.append("}\n");

        return stringBuilder.toString();

    }


    public void conditionGenerate(Condition condition) {
       /// System.out.println(condition.getfileNameId());
        if (condition.getfileNameId() != null)
            stringBuilder.append(" $").append(condition.getfileNameId());

        if (condition.getLogicalOperation1() != null)
            logicalOperationGenerate(condition.getLogicalOperation1());

        if (condition.getTextValue() != null) {
            textValueGenerator = new TextValueGenerator();
            stringBuilder.append(textValueGenerator.generateTextValue(condition.getTextValue()));
        }

        if (condition.getLogicalOperation2() != null)
            logicalOperationGenerate(condition.getLogicalOperation2());

    }

    public void logicalOperationGenerate(LogicalOperation logicalOperation) {

        if (logicalOperation.getAndId() != null)
            stringBuilder.append(" &&");

        else if (logicalOperation.getEqualId() != null)
            stringBuilder.append(" ==");

        else if (logicalOperation.getOrId() != null)
            stringBuilder.append(" ||");

    }


}
