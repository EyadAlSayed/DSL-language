package Generators.PageGenerators;

import Generators.PageGenerators.extras.BodyAttributeAutoNameGenerator;
import Generators.PageGenerators.extras.MarginsMatrixClass;
import Models.PageModels.Checkbox;

public class CheckboxGenerator {

    StringBuilder stringBuilder = new StringBuilder();
    boolean hasMargins = false;
    String divName = BodyAttributeAutoNameGenerator.getAutoName();

    public StringBuilder generateCheckbox(Checkbox checkbox) {

            if(checkbox.getMARGINS() != null){
                hasMargins = true;
                stringBuilder.append("<div class=\"").append(divName).append("\">\n");
            }
            stringBuilder.append("<label> ");
            stringBuilder.append("<input type=").append("\"checkbox\" ");
            stringBuilder.append("name=\"").append(checkbox.getVariableName()).append("\">");

            stringBuilder.append(checkbox.getText().replace("\"","")).append("</label>\n");

        if(hasMargins){
            stringBuilder.append("</div>\n");
            addToMarginsList(checkbox);
        }
        stringBuilder.append("<br>\n");
        return stringBuilder;
    }

    private void addToMarginsList(Checkbox checkbox){
        MarginsMatrixClass margin = new MarginsMatrixClass();
        int[] marginValues = new int[4];
        marginValues[0] = checkbox.getMARGINS()[0];
        marginValues[1] = checkbox.getMARGINS()[1];
        marginValues[2] = checkbox.getMARGINS()[2];
        marginValues[3] = checkbox.getMARGINS()[3];
        margin.setDivName(divName);
        margin.setMargins(marginValues);
        PageGenerator.marginsMatrix.add(margin);
    }
}
