package Models.ControllerModels.PageModels;

import Models.Printer;

import java.util.Map;

public class Text extends Printer {

    String TEXT;
    String NAME;
    String VALUE;

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
        return null;
    }
}
