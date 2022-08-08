package Generators.PageGenerators;

import Models.PageModels.RadioGroup;

public class RadioGroupGenerator {

    public String generateRadioGroup(RadioGroup radioGroup) {
        StringBuilder str = new StringBuilder();

        for (String r : radioGroup.getRadioButtonVariables()) {
            str.append("<label>");
            str.append("<input type=\"radio\" ");
            str.append("name=\"").append(radioGroup.getVariableName()).append("\" ");
            str.append("value=\"").append(r).append("\" ");
            if (r.compareTo(radioGroup.getDefaultValue()) == 0) {
                str.append("checked ");
            }
            str.append("/>");
            str.append(r).append("<br></label>");
        }

        return str.toString();
    }
}
