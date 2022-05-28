package Generators.PageGenerators;

import Models.PageModels.Text;
import Models.PageModels.TextField;

public class TextFieldGenerator {

    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generateTextField(TextField textField) {
        stringBuilder.append("<input type=");
        if(textField.getATTRIBUTE() == null || textField.getATTRIBUTE().getTEXT() != null){
            stringBuilder.append("\"text\" ");
        } else{
            if(textField.getATTRIBUTE().getPASSWORD() != null){
                stringBuilder.append("\"password\" ");
            } else if(textField.getATTRIBUTE().getDATE() != null){
                //append date format.
            } else if(textField.getATTRIBUTE().getEMAIL() != null){
                //append email format.
            }
        }
        stringBuilder.append("name=\"").append(textField.getNAME()).append("\">");

        return stringBuilder;
    }
}
