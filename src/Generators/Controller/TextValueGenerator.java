package Generators.Controller;

import Models.TextValue;

public class TextValueGenerator {

    StringBuilder stringBuilder;

    public String generateTextValue(TextValue textValue) {

        stringBuilder = new StringBuilder();
        if (textValue.getText() != null)
            stringBuilder.append(" ").append(textValue.getText());

        if (textValue.getTextNum() != null)
            stringBuilder.append(" ").append(textValue.getTextNum());

        return stringBuilder.toString();
    }

}
