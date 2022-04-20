package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Value extends Printer {

    String VALUE;
    String ASSIGN;
    String TEXT;

    public String getVALUE() {
        return VALUE;
    }

    public void setVALUE(String VALUE) {
        this.VALUE = VALUE;
    }

    public String getASSIGN() {
        return ASSIGN;
    }

    public void setASSIGN(String ASSIGN) {
        this.ASSIGN = ASSIGN;
    }

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Value", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","Value");
        if(VALUE != null)
            map.put("Value",VALUE);
        if(ASSIGN != null)
            map.put("Assign",ASSIGN);
        if(TEXT!=null)
            map.put("Text",TEXT);
        return map;
    }
}
