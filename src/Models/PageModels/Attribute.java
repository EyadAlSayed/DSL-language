package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Attribute extends Printer {
    protected String name;
    protected String value;
    protected String text;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Attribute", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","Attribute");
        if(name != null)
            map.put("Name",name);
        if(value != null)
            map.put("Value",value);
        if(text != null)
            map.put("Text",text);

        return map;
    }
}
