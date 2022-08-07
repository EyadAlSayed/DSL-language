package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class TextField extends Printer {

    String TEXT_FIELD;
    String NAME;
    String TEXT;
    TextFieldAttribute ATTRIBUTE;
    int[] MARGINS;

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public String getTEXT_FIELD() {
        return TEXT_FIELD;
    }

    public void setTEXT_FIELD(String TEXT_FIELD) {
        this.TEXT_FIELD = TEXT_FIELD;
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

    public TextFieldAttribute getATTRIBUTE() {
        return ATTRIBUTE;
    }

    public void setATTRIBUTE(TextFieldAttribute ATTRIBUTE) {
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
        if (TEXT_FIELD != null)
            map.put("TextField",TEXT_FIELD);
        if (NAME != null)
            map.put("Name",NAME);
        if (TEXT != null)
            map.put("Text",TEXT);
        if (ATTRIBUTE != null)
            map.put("Attribute",ATTRIBUTE.toMap());
        if(MARGINS != null){
            map.put("Left Margin", MARGINS[0]);
            map.put("Top Margin", MARGINS[1]);
            map.put("Right Margin", MARGINS[2]);
            map.put("Bottom Margin", MARGINS[3]);
        }
        return map;
    }
}