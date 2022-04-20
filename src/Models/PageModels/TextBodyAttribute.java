package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class TextBodyAttribute extends Printer {

    String TEXT;
    TextName textName;
    Value value;
    String END_TEXT;

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public TextName getTextName() {
        return textName;
    }

    public void setTextName(TextName textName) {
        this.textName = textName;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getEND_TEXT() {
        return END_TEXT;
    }

    public void setEND_TEXT(String END_TEXT) {
        this.END_TEXT = END_TEXT;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("TextBodyAttribute", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","TextBodyAttribute");
        if(TEXT != null)
            map.put("Text",TEXT);
        if(textName != null)
            map.put("textName",textName.toMap());
        if(value != null)
            map.put("value",value.toMap());
        if(END_TEXT != null)
            map.put("EndText",END_TEXT);

        return map;
    }
}
