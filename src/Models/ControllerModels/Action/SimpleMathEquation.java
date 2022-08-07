package Models.ControllerModels.Action;

import Models.Printer;
import Models.TextValue;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleMathEquation extends Printer {
    TextValue textValue1;
    String fileNameId1;
    MathOperation mathOperation;
    TextValue textValue2;
    String fileNameId2;

    public TextValue getTextValue1() {
        return textValue1;
    }

    public void setTextValue1(TextValue textValue1) {
        this.textValue1 = textValue1;
    }

    public String getFileNameId1() {
        return fileNameId1;
    }

    public void setFileNameId1(String fileNameId1) {
        this.fileNameId1 = fileNameId1;
    }

    public MathOperation getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public TextValue getTextValue2() {
        return textValue2;
    }

    public void setTextValue2(TextValue textValue2) {
        this.textValue2 = textValue2;
    }

    public String getFileNameId2() {
        return fileNameId2;
    }

    public void setFileNameId2(String fileNameId2) {
        this.fileNameId2 = fileNameId2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("SimpleMathEquation",toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> map = new LinkedHashMap<>();

        map.put("label","SimpleMathEquation");

        if (textValue1 != null)
            map.put("textValue 1",textValue1.toMap());

        if(fileNameId1 != null)
            map.put("fileNameId 1",fileNameId1);


        if(mathOperation != null)
            map.put("mathOperation ",mathOperation.toMap());

        if (textValue2 != null)
            map.put("textValue 2",textValue2.toMap());

        if(fileNameId2 != null)
            map.put("fileNameId 2",fileNameId2);

        return  map;
    }
}
