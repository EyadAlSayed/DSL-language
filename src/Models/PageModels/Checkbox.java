package Models.PageModels;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Checkbox extends Printer {

    String CHECKBOX;
    String NAME;
    ArrayList<String> checkboxAttributes = new ArrayList<>();

    public String getCHECKBOX() {
        return CHECKBOX;
    }

    public void setCHECKBOX(String CHECKBOX) {
        this.CHECKBOX = CHECKBOX;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public ArrayList<String> getCheckboxAttributes() {
        return checkboxAttributes;
    }

    public void setCheckboxAttributes(ArrayList<String> checkboxAttributes) {
        this.checkboxAttributes = checkboxAttributes;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Checkbox", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","Checkbox");
        if (CHECKBOX != null)
            map.put("CheckBoxID",CHECKBOX);
        if (NAME != null)
            map.put("Name",NAME);
        if(checkboxAttributes.size() > 0)
            map.put("Checkbox Choices",checkboxAttributes.toString());
        return map;
    }
}
