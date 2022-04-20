package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class TextName extends Printer {

    String NAME;
    String ASSIGN;
    String TEXT;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
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
        StringBuilder stringBuilder = getPrettyString("TextName", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","TextName");
        if(NAME != null)
            map.put("Name",NAME);
        if(ASSIGN != null)
            map.put("Assign",ASSIGN);
        if(TEXT != null)
            map.put("Text",TEXT);

        return map;
    }
}
