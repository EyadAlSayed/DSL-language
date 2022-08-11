package Generators.PageGenerators;

import Generators.PageGenerators.extras.BodyAttributeAutoNameGenerator;
import Generators.PageGenerators.extras.MarginsMatrixClass;
import Models.PageModels.Input;

public class InputGenerator {

    StringBuilder stringBuilder = new StringBuilder();
    boolean hasMargins = false;
    String divName = BodyAttributeAutoNameGenerator.getAutoName();

    public StringBuilder generateInput(Input input) {

        if(input.getMARGINS() != null){
            hasMargins = true;
            stringBuilder.append("<div class=\"").append(divName).append("\">\n");
        }

        stringBuilder.append("<input type=");
        if (input.getATTRIBUTE() == null || input.getATTRIBUTE().getTEXT() != null) {
            stringBuilder.append("\"text\" ");
        } else {
            if (input.getATTRIBUTE().getPASSWORD() != null) {
                stringBuilder.append("\"password\" ");
            } else if (input.getATTRIBUTE().getDATE() != null) {
                stringBuilder.append("\"date\" ");
            } else if (input.getATTRIBUTE().getEMAIL() != null) {
                stringBuilder.append("\"email\" ");
            }
        }

        if (input.getNAME() != null)
            stringBuilder.append("name=\"").append(input.getNAME()).append("\" ");

        if(input.getTEXT() != null) {
            String textFieldValue = input.getTEXT().replace('"', ' ');
            stringBuilder.append("placeholder=\"").append(textFieldValue).append("\">\n");
        }

        if(hasMargins){
            stringBuilder.append("</div>\n");
            addToMarginsList(input);
        }
        stringBuilder.append("<br>\n");

        return stringBuilder;
    }

    private void addToMarginsList(Input input){
        MarginsMatrixClass margin = new MarginsMatrixClass();
        int[] marginValues = new int[4];
        marginValues[0] = input.getMARGINS()[0];
        marginValues[1] = input.getMARGINS()[1];
        marginValues[2] = input.getMARGINS()[2];
        marginValues[3] = input.getMARGINS()[3];
        margin.setDivName(divName);
        margin.setMargins(marginValues);
        PageGenerator.marginsMatrix.add(margin);
    }
}