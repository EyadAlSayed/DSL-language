package Generators.PageGenerators;

import Models.PageModels.Checkbox;

public class CheckboxGenerator {

    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generateCheckbox(Checkbox checkbox) {
        for (int i = 0; i < checkbox.getCheckboxAttributes().size(); i++) {
            stringBuilder.append("<label> ");
            stringBuilder.append("<input type=").append("\"checkbox\" ");
            stringBuilder.append("name=\"").append(checkbox.getCheckboxAttributes().get(i)).append("\">");

            stringBuilder.append(checkbox.getCheckboxAttributes().get(i)).append("</label>\n").append("<br>\n");
        }
        return stringBuilder;
    }
}
