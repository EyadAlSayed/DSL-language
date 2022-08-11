package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Checkbox extends Printer {

    String CHECKBOX;
    String variableName;
    String text;
    int[] MARGINS;

    public String getCHECKBOX() {
        return CHECKBOX;
    }

    public void setCHECKBOX(String CHECKBOX) {
        this.CHECKBOX = CHECKBOX;
    }


    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int[] getMARGINS() {
        return MARGINS;
    }

    public void setMARGINS(int[] MARGINS) {
        this.MARGINS = MARGINS;
    }



    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Checkbox", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","Checkbox");
        if (CHECKBOX != null)
            map.put("CheckBoxID",CHECKBOX);
        if (variableName != null)
            map.put("Variable name : ",variableName);
        if(text != null)
            map.put("Text : ",text);
        if(MARGINS != null){
            map.put("Top Margin", MARGINS[0]);
            map.put("Right Margin", MARGINS[1]);
            map.put("Bottom Margin", MARGINS[2]);
            map.put("Left Margin", MARGINS[3]);
        }
        return map;
    }
}
