package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Input extends Printer {

    String INPUT;
    String NAME;
    String TEXT;
    InputAttribute ATTRIBUTE;
    int[] MARGINS;

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public String getINPUT() {
        return INPUT;
    }

    public void setINPUT(String INPUT) {
        this.INPUT = INPUT;
    }

    public int[] getMARGINS() {
        return MARGINS;
    }

    public void setMARGINS(int[] MARGINS) {
        this.MARGINS = MARGINS;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public InputAttribute getATTRIBUTE() {
        return ATTRIBUTE;
    }

    public void setATTRIBUTE(InputAttribute ATTRIBUTE) {
        this.ATTRIBUTE = ATTRIBUTE;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("TextField", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","TextField");
        if (INPUT != null)
            map.put("Input",INPUT);
        if (NAME != null)
            map.put("Name",NAME);
        if (TEXT != null)
            map.put("Text",TEXT);
        if (ATTRIBUTE != null)
            map.put("Attribute",ATTRIBUTE.toMap());
        if(MARGINS != null){
            map.put("Top Margin", MARGINS[0]);
            map.put("Right Margin", MARGINS[1]);
            map.put("Bottom Margin", MARGINS[2]);
            map.put("Left Margin", MARGINS[3]);
        }
        return map;
    }
}