package Generators.PageGenerators;

import Generators.PageGenerators.extras.BodyAttributeAutoNameGenerator;
import Generators.PageGenerators.extras.MarginsMatrixClass;
import Models.PageModels.DropDown;

public class DropDownGenerator {

    StringBuilder str = new StringBuilder();
    boolean hasMargins = false;
    String divName = BodyAttributeAutoNameGenerator.getAutoName();

    public String generateDropDown(DropDown dropDown){

        if(dropDown.getMARGINS() != null){
            hasMargins = true;
            str.append("<div class=\"").append(divName).append("\">\n");
        }
        str.append("<select ").append("name=");
        str.append("\"").append(dropDown.getName()).append("\" >");
        for (String optionValue : dropDown.getOptions()) {
            str.append("<option vlaue=\"").append(optionValue).append("\" >");
            str.append(optionValue);
            str.append("</option>");
        }
        str.append("</select>");
        if(hasMargins){
            str.append("</div>\n");
            addToMarginsList(dropDown);
        }
        str.append("<br>\n");
        return str.toString();
    }

    private void addToMarginsList(DropDown dropDown){
        MarginsMatrixClass margin = new MarginsMatrixClass();
        int[] marginValues = new int[4];
        marginValues[0] = dropDown.getMARGINS()[0];
        marginValues[1] = dropDown.getMARGINS()[1];
        marginValues[2] = dropDown.getMARGINS()[2];
        marginValues[3] = dropDown.getMARGINS()[3];
        margin.setDivName(divName);
        margin.setMargins(marginValues);
        PageGenerator.marginsMatrix.add(margin);
    }
}
