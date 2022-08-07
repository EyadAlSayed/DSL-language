package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Text extends Printer {

    String TEXT;
    String NAME;
    String VALUE;
    int[] MARGINS;

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int[] getMARGINS() {
        return MARGINS;
    }

    public void setMARGINS(int[] MARGINS) {
        this.MARGINS = MARGINS;
    }

    public String getVALUE() {
        return VALUE;
    }

    public void setVALUE(String VALUE) {
        this.VALUE = VALUE;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Text", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","Text");
        if (TEXT != null)
            map.put("Text",TEXT);
        if (NAME != null)
            map.put("Name",NAME);
        if (VALUE != null)
            map.put("Value",VALUE);
        if(MARGINS != null){
            map.put("Top Margin", MARGINS[0]);
            map.put("Right Margin", MARGINS[1]);
            map.put("Bottom Margin", MARGINS[2]);
            map.put("Left Margin", MARGINS[3]);
        }
        return map;

    }
}
