package Generators.Controller;

import Models.ControllerModels.If.BinaryEqualCondition;
import Models.ControllerModels.If.EqualCondition;
import Models.ControllerModels.If.LogicalOperation;
import Models.ControllerModels.If.MainCondition;

public class MainConditionGenerator {

    StringBuilder stringBuilder;

    TextValueGenerator textValueGenerator;

    String generateMainCondition(MainCondition mainCondition) {
        stringBuilder = new StringBuilder();
        textValueGenerator = new TextValueGenerator();


        if (mainCondition.getEqualCondition() != null)
            generateEqualCondition(mainCondition.getEqualCondition());


        for (int i = 0; i < mainCondition.getBinaryEqualCondition().size(); i++) {
            generateBinaryEqualCondition(mainCondition.getBinaryEqualCondition().get(i));
        }
        return stringBuilder.toString();
    }

    public void generateBinaryEqualCondition(BinaryEqualCondition binaryEqualCondition) {

        if (binaryEqualCondition.getLogicalOperation() != null)
            logicalOperationGenerate(binaryEqualCondition.getLogicalOperation());

        if (binaryEqualCondition.getFileNameId() != null)
            stringBuilder.append(binaryEqualCondition.getFileNameId());

        if (binaryEqualCondition.getEqualOpId() != null)
            stringBuilder.append("==");

        if (binaryEqualCondition.getTextValue() != null)
            stringBuilder.append(textValueGenerator.generateTextValue(binaryEqualCondition.getTextValue()));
    }

    public void generateEqualCondition(EqualCondition equalCondition) {
        if (equalCondition.getFileNameId() != null) {
            stringBuilder.append(equalCondition.getFileNameId());
        }

        if (equalCondition.getEqualOpId() != null) {
            stringBuilder.append("==");
        }

        if (equalCondition.getTextValue() != null) {
            stringBuilder.append(textValueGenerator.generateTextValue(equalCondition.getTextValue()));
        }
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
