package Generators.PageGenerators;

import Models.PageModels.Checkbox;

public class CheckboxGenerator {

    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generateCheckbox(Checkbox checkbox) {
        for (int i = 0; i < checkbox.getCheckboxAttributes().size(); i++) {
            stringBuilder.append("<label> ");
            stringBuilder.append("<input type=").append("\"checkbox\" ");
            if (checkbox.getNAME() != null) {
                stringBuilder.append("name=\"").append(checkbox.getNAME()).append("\">");
            }
            stringBuilder.append(checkbox.getCheckboxAttributes().get(i)).append("</label>\n");
        }
        return stringBuilder;
    }
}
