package Generators.PageGenerators;

import Models.PageModels.Button;

public class ButtonGenerator {
    public String generateButton(Button button) {
        StringBuilder str = new StringBuilder();
        str.append("<input type=\"submit\" ")
                .append("value=")
                .append(button.getValue())
                .append(" name=")
                .append("\"")
                .append(button.getVariableName())
                .append("\" ")
                .append("/>");

        return str.toString();
    }
}
