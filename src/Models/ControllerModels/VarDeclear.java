package Models.ControllerModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class VarDeclear extends Printer {

    String varNameId;
    String assign;
    TextValue textValue;

    public String getVarNameId() {
        return varNameId;
    }

    public void setVarNameId(String varNameId) {
        this.varNameId = varNameId;
    }

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public TextValue getTextValue() {
        return textValue;
    }

    public void setTextValue(TextValue textValue) {
        this.textValue = textValue;
    }

    @Override
    public Map<String, Object> toMap() {
         Map<String, Object> map = new LinkedHashMap<>();

         if (varNameId != null)
             map.put("VarNameId",varNameId);

         if (assign != null)
             map.put("Assign",assign);
         if (textValue != null)
             map.put("textValue",textValue.toMap());

         return map;
    }
}
