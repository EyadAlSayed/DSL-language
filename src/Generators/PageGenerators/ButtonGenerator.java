package Generators.PageGenerators;

import Generators.PageGenerators.extras.BodyAttributeAutoNameGenerator;
import Generators.PageGenerators.extras.MarginsMatrixClass;
import Models.PageModels.Button;

public class ButtonGenerator {

    StringBuilder str = new StringBuilder();
    boolean hasMargins = false;
    String divName = BodyAttributeAutoNameGenerator.getAutoName();

    public String generateButton(Button button) {
        if(button.getMARGINS() != null){
            hasMargins = true;
            str.append("<div class=\"").append(divName).append("\">\n");
        }
        str.append("<input type=\"submit\" ")
                .append("value=")
                .append(button.getValue())
                .append(" name=")
                .append("\"")
                .append(button.getVariableName())
                .append("\" ")
                .append("/>");

        if(hasMargins){
            str.append("</div>\n");
            addToMarginsList(button);
        }

        str.append("<br>\n");
        return str.toString();
    }

    private void addToMarginsList(Button button){
        MarginsMatrixClass margin = new MarginsMatrixClass();
        int[] marginValues = new int[4];
        marginValues[0] = button.getMARGINS()[0];
        marginValues[1] = button.getMARGINS()[1];
        marginValues[2] = button.getMARGINS()[2];
        marginValues[3] = button.getMARGINS()[3];
        margin.setDivName(divName);
        margin.setMargins(marginValues);
        PageGenerator.marginsMatrix.add(margin);
    }
}
