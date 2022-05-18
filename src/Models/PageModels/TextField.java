package Models.PageModels;

import Models.Printer;

import java.util.Map;

public class TextField extends Printer {

    String TEXT_FIELD;
    String NAME;
    String TEXT;
    TextFieldAttribute ATTRIBUTE;

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
        return null;
    }
}