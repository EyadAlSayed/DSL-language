package Models.ControllerModels;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IFCondition extends Printer {

    String IfId;
    String openParBrackt;
    final List<Condition> conditions = new ArrayList<>();
    String closeParBrackt;
    IfBody ifBody;


    public IfBody getIfBody() {
        return ifBody;
    }

    public void setIfBody(IfBody ifBody) {
        this.ifBody = ifBody;
    }

    public String getIfId() {
        return IfId;
    }

    public void setIfId(String ifId) {
        IfId = ifId;
    }

    public String getOpenParBrackt() {
        return openParBrackt;
    }

    public void setOpenParBrackt(String openParBrackt) {
        this.openParBrackt = openParBrackt;
    }

    public List<Condition> getConditions() {
        return conditions;
    }


    public String getCloseParBrackt() {
        return closeParBrackt;
    }

    public void setCloseParBrackt(String closeParBrackt) {
        this.closeParBrackt = closeParBrackt;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("IfId", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","IfId");
        if(IfId != null)
            map.put("IfId",IfId);
        if(openParBrackt != null)
            map.put("openParBracket",openParBrackt);
        if(conditions.size()>0)
        {
            ArrayList<Map<String,Object>> attributes = new ArrayList<>();
            for (Condition attribute :
                    conditions) {
                attributes.add(attribute.toMap());
            }
            map.put("Condition",attributes);
        }

        if(closeParBrackt != null)
            map.put("closeParBracket",closeParBrackt);

        return map;
    }
}
