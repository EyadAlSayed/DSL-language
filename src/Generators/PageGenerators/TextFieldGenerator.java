package Generators.PageGenerators;

import Models.PageModels.TextField;

public class TextFieldGenerator {

    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generateTextField(TextField textField) {
        stringBuilder.append("<input type=");
        if (textField.getATTRIBUTE() == null || textField.getATTRIBUTE().getTEXT() != null) {
            stringBuilder.append("\"text\" ");
        } else {
            if (textField.getATTRIBUTE().getPASSWORD() != null) {
                stringBuilder.append("\"password\" ");
            } else if (textField.getATTRIBUTE().getDATE() != null) {
                stringBuilder.append("\"date\" ");
            } else if (textField.getATTRIBUTE().getEMAIL() != null) {
                stringBuilder.append("\"email\" ");
            }
        }

        if (textField.getNAME() != null)
            stringBuilder.append("name=\"").append(textField.getNAME()).append("\" ");

        if(textField.getTEXT() != null) {
            String textFieldValue = textField.getTEXT().replace('"', ' ');
            stringBuilder.append("placeholder=\"").append(textFieldValue).append("\">\n").append("<br>\n");
        }

        return stringBuilder;
    }
}
