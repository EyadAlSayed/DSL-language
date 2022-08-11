package Models.ControllerModels.Action;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class ComplexMathEquation extends Printer {
    MathOperation mathOperation1;
    String number;
    String fileNameId;


    public MathOperation getMathOperation() {
        return mathOperation1;
    }

    public void setMathOperation(MathOperation mathOperation1) {
        this.mathOperation1 = mathOperation1;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

        if (number != null)
            map.put("number",number);

        if(fileNameId != null)
            map.put("variable",fileNameId);




        return  map;
    }
}
