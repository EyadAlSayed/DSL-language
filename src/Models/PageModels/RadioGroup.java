package Models.PageModels;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class RadioGroup extends Printer {

    String radioGroupID;
    String variableName;
    ArrayList<String> radioButtonVariables = new ArrayList<>();

    public String getRadioGroupID() {
        return radioGroupID;
    }

    public void setRadioGroupID(String radioGroupID) {
        this.radioGroupID = radioGroupID;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public ArrayList<String> getRadioButtonVariables() {
        return radioButtonVariables;
    }

    public void setRadioButtonVariables(ArrayList<String> radioButtonVariables) {
        this.radioButtonVariables = radioButtonVariables;
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
        if (radioGroupID != null)
            map.put("radioGroupId",radioGroupID);
        if (variableName != null)
            map.put("VariableName",variableName);
        if(radioButtonVariables.size() > 0)
        map.put("RadioButtons",radioButtonVariables.toString());
        return map;

    }
}