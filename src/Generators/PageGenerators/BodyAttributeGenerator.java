package Generators.PageGenerators;

import Models.PageModels.BodyAttribute;

import java.util.List;

public class BodyAttributeGenerator {

    TextGenerator textGenerator;
    TextFieldGenerator textFieldGenerator;
    CheckboxGenerator checkboxGenerator;
    HeaderGenerator headerGenerator;

    public void generateBodyAttributes(List<BodyAttribute> bodyAttributes){
        for (int i = bodyAttributes.size() - 1; i >= 0; i --){
            if (bodyAttributes.get(i).getHeader() != null){
                headerGenerator = new HeaderGenerator();
                headerGenerator.generateHeader(bodyAttributes.get(i).getHeader());
                break;
            }
        }

        for (BodyAttribute attribute : bodyAttributes){
            if(attribute.getText() != null){
                textGenerator = new TextGenerator();
                textGenerator.generateText(attribute.getText());
            } else if(attribute.getTextField() != null){
                textFieldGenerator = new TextFieldGenerator();
                textFieldGenerator.generateTextField(attribute.getTextField());
            } else if(attribute.getCheckbox() != null){
                checkboxGenerator = new CheckboxGenerator();
                checkboxGenerator.generateCheckbox(attribute.getCheckbox());
            }
        }

    }
}
