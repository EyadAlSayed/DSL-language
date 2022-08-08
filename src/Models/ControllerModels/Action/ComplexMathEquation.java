package Models.ControllerModels.Action;

import Models.Printer;
import Models.TextValue;

import java.util.LinkedHashMap;
import java.util.Map;

public class ComplexMathEquation extends Printer {
    MathOperation mathOperation1;
    TextValue textValue;
    String fileNameId;


    public MathOperation getMathOperation() {
        return mathOperation1;
    }

    public void setMathOperation(MathOperation mathOperation1) {
        this.mathOperation1 = mathOperation1;
    }

    public TextValue getTextValue() {
        return textValue;
    }

    public void setTextValue(TextValue textValue1) {
        this.textValue = textValue1;
    }

    public String getFileNameId() {
        return fileNameId;
    }

    public void setFileNameId(String fileNameId1) {
        this.fileNameId = fileNameId1;
    }




    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("ComplexMathEquation",toMap());
        return stringBuilder.toString();
    }


    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> map = new LinkedHashMap<>();

        map.put("label","ComplexMathEquation");

        if(mathOperation1 != null)
            map.put("mathOperation 1",mathOperation1.toMap());

        if (textValue != null)
            map.put("textValue 1",textValue.toMap());

        if(fileNameId != null)
            map.put("fileNameId 1",fileNameId);




        return  map;
    }
}
