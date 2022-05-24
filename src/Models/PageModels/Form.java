package Models.PageModels;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Form extends Printer {

    String formID;
    ArrayList<String> components = new ArrayList<>();

    public String getFormID() {
        return formID;
    }

    public void setFormID(String formID) {
        this.formID = formID;
    }

    public ArrayList<String> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<String> components) {
        this.components = components;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Form", toMap());
        return stringBuilder.toString();    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","Form");
        if (formID != null)
            map.put("FormID",formID);
        if(components.size() > 0)
           map.put("Components",components.toString());

        return map;

    }
}
