package Generators.PageGenerators;

import Generators.PageGenerators.extras.BodyAttributeAutoNameGenerator;
import Generators.PageGenerators.extras.MarginsMatrixClass;
import Models.PageModels.TextField;

public class TextFieldGenerator {

    StringBuilder stringBuilder = new StringBuilder();
    boolean hasMargins = false;
    String divName = BodyAttributeAutoNameGenerator.getAutoName();

    public StringBuilder generateTextField(TextField textField) {

        if(textField.getMARGINS() != null){
            hasMargins = true;
            stringBuilder.append("<div class=\"").append(divName).append("\">\n");
        }

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
            stringBuilder.append("placeholder=\"").append(textFieldValue).append("\">\n");
        }

        if(hasMargins){
            stringBuilder.append("</div>\n");
            addToMarginsList(textField);
        }
        stringBuilder.append("<br>\n");

        return stringBuilder;
    }

    private void addToMarginsList(TextField textField){
        MarginsMatrixClass margin = new MarginsMatrixClass();
        int[] marginValues = new int[4];
        marginValues[0] = textField.getMARGINS()[0];
        marginValues[1] = textField.getMARGINS()[1];
        marginValues[2] = textField.getMARGINS()[2];
        marginValues[3] = textField.getMARGINS()[3];
        margin.setDivName(divName);
        margin.setMargins(marginValues);
        PageGenerator.marginsMatrix.add(margin);
    }
}