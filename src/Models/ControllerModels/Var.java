package Models.ControllerModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Var extends Printer {
    String varNameId;

    public String getVarNameId() {
        return varNameId;
    }

    public void setVarNameId(String varNameId) {
        this.varNameId = varNameId;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Var", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","Var");
        if(varNameId != null)
            map.put("varNameId",varNameId);


        return map;
    }
}
