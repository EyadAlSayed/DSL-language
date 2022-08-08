package Generators.PageGenerators;

import Generators.PageGenerators.extras.BodyAttributeAutoNameGenerator;
import Generators.PageGenerators.extras.MarginsMatrixClass;
import Models.PageModels.RadioGroup;

public class RadioGroupGenerator {

    StringBuilder str = new StringBuilder();
    boolean hasMargins = false;
    String divName = BodyAttributeAutoNameGenerator.getAutoName();

    public String generateRadioGroup(RadioGroup radioGroup) {

        if(radioGroup.getMARGINS() != null){
            hasMargins = true;
            str.append("<div class=\"").append(divName).append("\">\n");
        }
        for (String r : radioGroup.getRadioButtonVariables()) {
            str.append("<label>");
            str.append("<input type=\"radio\" ");
            str.append("name=\"").append(radioGroup.getVariableName()).append("\" ");
            str.append("value=\"").append(r).append("\" ");
            if (r.compareTo(radioGroup.getDefaultValue()) == 0) {
                str.append("checked ");
            }
            str.append("/>");
            str.append(radioGroup.getVariableName()).append("</label>");
        }
        if(hasMargins){
            str.append("</div>\n");
            addToMarginsList(radioGroup);
        }
        str.append("<br>\n");
        return str.toString();
    }

    private void addToMarginsList(RadioGroup radioGroup){
        MarginsMatrixClass margin = new MarginsMatrixClass();
        int[] marginValues = new int[4];
        marginValues[0] = radioGroup.getMARGINS()[0];
        marginValues[1] = radioGroup.getMARGINS()[1];
        marginValues[2] = radioGroup.getMARGINS()[2];
        marginValues[3] = radioGroup.getMARGINS()[3];
        margin.setDivName(divName);
        margin.setMargins(marginValues);
        PageGenerator.marginsMatrix.add(margin);
    }
}
