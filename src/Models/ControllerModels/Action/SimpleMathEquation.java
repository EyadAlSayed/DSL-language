package Models.ControllerModels.Action;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleMathEquation extends Printer {
    String number1;
    String fileNameId1;
    MathOperation mathOperation;
    String number2;
    String fileNameId2;

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
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

        if (number1 != null)
            map.put("number 1",number1);

        if(fileNameId1 != null)
            map.put("fileNameId 1",fileNameId1);


        if(mathOperation != null)
            map.put("mathOperation ",mathOperation.toMap());

        if (number2 != null)
            map.put("number 2",number2);

        if(fileNameId2 != null)
            map.put("fileNameId 2",fileNameId2);

        return  map;
    }
}
