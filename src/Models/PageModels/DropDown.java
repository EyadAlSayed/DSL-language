package Models.PageModels;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class DropDown extends Printer {
    private String dropDownID;
    private String name;
    private ArrayList<String> options;

    public DropDown() {
        this.options = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public String getDropDownID() {
        return dropDownID;
    }

    public void setDropDownID(String dropDownID) {
        this.dropDownID = dropDownID;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("DropDown", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","DropDown");
        if (dropDownID != null)
            map.put("dropDownId",dropDownID);
        if (name != null)
            map.put("name",name);
        if(options.size() > 0)
            map.put("Options",options.toString());

        return map;
    }
}
