package Models.PageModels;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class DropDown extends Printer {
    private String dropDownID;
    private String name;
    private ArrayList<String> options;
    int[] MARGINS;

    public DropDown() {
        this.options = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMARGINS() {
        return MARGINS;
    }

    public void setMARGINS(int[] MARGINS) {
        this.MARGINS = MARGINS;
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
        if(MARGINS != null){
            map.put("Top Margin", MARGINS[0]);
            map.put("Right Margin", MARGINS[1]);
            map.put("Bottom Margin", MARGINS[2]);
            map.put("Left Margin", MARGINS[3]);
        }
        return map;
    }
}
