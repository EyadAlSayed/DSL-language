package Generators.PageGenerators;

import Models.PageModels.BodyAttribute;

import java.util.List;

public class BodyAttributeGenerator {

    TextGenerator textGenerator;
    InputGenerator inputGenerator;
    CheckboxGenerator checkboxGenerator;
    HeaderGenerator headerGenerator;
    RadioGroupGenerator radioGroupGenerator;
    ButtonGenerator buttonGenerator;
    ImageGenerator imageGenerator;
    DropDownGenerator dropDownGenerator;

    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generateBodyAttributes(List<BodyAttribute> bodyAttributes, String controller) {


        stringBuilder.append("<form action=\"").append(controller).append(".php")
                .append("\" ").append("method=\"post\" >\n");
        for (int i = bodyAttributes.size() - 1; i >= 0; i--) {
            if (bodyAttributes.get(i).getHeader() != null) {
                headerGenerator = new HeaderGenerator();
                stringBuilder.append(headerGenerator.generateHeader(bodyAttributes.get(i).getHeader()));
                break;
            }
        }

        for (BodyAttribute attribute : bodyAttributes) {
            if (attribute.getText() != null) {
                textGenerator = new TextGenerator();
                stringBuilder.append(textGenerator.generateText(attribute.getText()));
            } else if (attribute.getInput() != null) {
                inputGenerator = new InputGenerator();
                stringBuilder.append(inputGenerator.generateInput(attribute.getInput()));
            } else if (attribute.getCheckbox() != null) {
                checkboxGenerator = new CheckboxGenerator();
                stringBuilder.append(checkboxGenerator.generateCheckbox(attribute.getCheckbox()));
            } else if (attribute.getRadioGroup() != null) {
                radioGroupGenerator = new RadioGroupGenerator();
                stringBuilder.append(radioGroupGenerator.generateRadioGroup(attribute.getRadioGroup()));
            } else if (attribute.getButton() != null) {
                buttonGenerator = new ButtonGenerator();
                stringBuilder.append(buttonGenerator.generateButton(attribute.getButton()));
            } else if (attribute.getImage() != null){
                imageGenerator = new ImageGenerator();
                stringBuilder.append(imageGenerator.generateImage(attribute.getImage()));
            }else if(attribute.getDropDown() != null){
                dropDownGenerator = new DropDownGenerator();
                stringBuilder.append(dropDownGenerator.generateDropDown(attribute.getDropDown()));
            }
        }
        stringBuilder.append("\n</form>\n");
        return stringBuilder;
    }
}