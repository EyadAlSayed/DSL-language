package Generators.PageGenerators;

import Models.PageModels.BodyAttribute;

import java.util.List;

public class BodyAttributeGenerator {

    TextGenerator textGenerator;
    TextFieldGenerator textFieldGenerator;
    CheckboxGenerator checkboxGenerator;
    HeaderGenerator headerGenerator;

    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generateBodyAttributes(List<BodyAttribute> bodyAttributes){
        for (int i = bodyAttributes.size() - 1; i >= 0; i --){
            if (bodyAttributes.get(i).getHeader() != null){
                headerGenerator = new HeaderGenerator();
                stringBuilder.append(headerGenerator.generateHeader(bodyAttributes.get(i).getHeader()));
                break;
            }
        }

        for (BodyAttribute attribute : bodyAttributes){
            if(attribute.getText() != null){
                textGenerator = new TextGenerator();
                stringBuilder.append(textGenerator.generateText(attribute.getText()));
            } else if(attribute.getTextField() != null){
                textFieldGenerator = new TextFieldGenerator();
                stringBuilder.append(textFieldGenerator.generateTextField(attribute.getTextField()));
            } else if(attribute.getCheckbox() != null){
                checkboxGenerator = new CheckboxGenerator();
                stringBuilder.append(checkboxGenerator.generateCheckbox(attribute.getCheckbox()));
            }
        }

        return stringBuilder;
    }
}