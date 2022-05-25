package Generators.PageGenerators;

import Models.PageModels.Text;
import Models.PageModels.TextField;

public class TextFieldGenerator {

    public void generateTextField(TextField textField) {
        DocumentGenerator.code.append("<input type=");
        if(textField.getATTRIBUTE() == null || textField.getATTRIBUTE().getTEXT() != null){
            DocumentGenerator.code.append("\"text\" ");
        } else{
            if(textField.getATTRIBUTE().getPASSWORD() != null){
                DocumentGenerator.code.append("\"password\" ");
            } else if(textField.getATTRIBUTE().getDATE() != null){
                //append date format.
            } else if(textField.getATTRIBUTE().getEMAIL() != null){
                //append email format.
            }
        }
        DocumentGenerator.code.append("name=\"").append(textField.getNAME()).append("\">");
    }
}
