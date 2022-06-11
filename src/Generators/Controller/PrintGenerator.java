package Generators.Controller;

import Models.ControllerModels.Action.Print;

public class PrintGenerator {

    StringBuilder stringBuilder = new StringBuilder();
    TextValueGenerator textValueGenerator;

    public String generatePrint(Print print) {
        if (print.getPrintAction() != null)
            stringBuilder.append("echo");


        if (print.getTextValue() != null) {
            textValueGenerator = new TextValueGenerator();
            stringBuilder.append(textValueGenerator.generateTextValue(print.getTextValue()));
        }

        if (print.getFileNameId() != null)
            stringBuilder.append(" $").append(print.getFileNameId());


        if (print.getEndStatementId() != null)
            stringBuilder.append(print.getEndStatementId());

        return stringBuilder.toString();
    }
}
