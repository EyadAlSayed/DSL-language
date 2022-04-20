package Models.PageModels;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class RadioGroup extends Node{
    private String name;
    private String nameValue;
    private ArrayList<RadioField> fields;

    public String getNameValue() {
        return nameValue;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }

    public RadioGroup() {
        this.fields = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<RadioField> getFields() {
        return fields;
    }

    public void setFields(ArrayList<RadioField> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("RadioGroup", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","RadioGroup");

        if (name != null)
            map.put("Name",nameValue);

        if(attributes.size()>0)
        {
            ArrayList<Map<String,Object>> attributess = new ArrayList<>();
            for (Attribute attribute :
                    attributes) {
                attributess.add(attribute.toMap());
            }
            map.put("Attribute",attributess);
        }
        return map;
    }
}
