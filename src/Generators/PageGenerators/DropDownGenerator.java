package Generators.PageGenerators;

import Models.PageModels.DropDown;

public class DropDownGenerator {

    public String generateDropDown(DropDown dropDown){
        StringBuilder str = new StringBuilder();
        str.append("<select ").append("name=");
        str.append("\"").append(dropDown.getName()).append("\" >");
        for (String optionValue : dropDown.getOptions()) {
            str.append("<option vlaue=\"").append(optionValue).append("\" >");
            str.append(optionValue);
            str.append("</option>");
        }
        str.append("</select>").append("<br>");
        return str.toString();
    }
}
