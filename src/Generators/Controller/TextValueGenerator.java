package Generators.Controller;

import Models.TextValue;

public class TextValueGenerator {

    StringBuilder stringBuilder = new StringBuilder();

    public String generateTextValue(TextValue textValue) {
        if (textValue.getText() != null)
            stringBuilder.append(" ").append(textValue.getText());

        if (textValue.getTextNum() != null)
            stringBuilder.append(" ").append(textValue.getTextNum());

        return stringBuilder.toString();
    }

}
