package Models.ControllerModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bundle extends Printer {
    Var var;
    String Assign;
    String bundleId;
    String openSqrBracktId;
    String Text;
    String closeSqrBracktId;

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public String getAssign() {
        return Assign;
    }

    public void setAssign(String assign) {
        Assign = assign;
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public String getOpenSqrBracktId() {
        return openSqrBracktId;
    }

    public void setOpenSqrBracktId(String openSqrBracktId) {
        this.openSqrBracktId = openSqrBracktId;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getCloseSqrBracktId() {
        return closeSqrBracktId;
    }

    public void setCloseSqrBracktId(String closeSqrBracktId) {
        this.closeSqrBracktId = closeSqrBracktId;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Bundle", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","Bundle");
        if(var != null)
            map.put("Var",var.toMap());
        if(Assign != null)
            map.put("Assign",Assign);
        if(bundleId != null)
            map.put("bundleId",bundleId);
        if(openSqrBracktId != null)
            map.put("openSqrBracktId",openSqrBracktId);
        if(Text != null)
            map.put("Text",Text);
        if(closeSqrBracktId != null)
            map.put("closeSqrBracktId",closeSqrBracktId);
        return map;
    }
}
