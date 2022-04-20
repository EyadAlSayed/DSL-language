package Models.PageModels;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BodyStructure extends Printer {

    String BODY;
    ArrayList<BodyAttribute> bodyAttributes = new ArrayList<>() ;
    String END_BODY;

    public String getBODY() {
        return BODY;
    }

    public void setBODY(String BODY) {
        this.BODY = BODY;
    }

    public List<BodyAttribute> getBodyAttributes() {
        return bodyAttributes;
    }

    public void setBodyAttributes(ArrayList<BodyAttribute> bodyAttributes) {
        this.bodyAttributes = bodyAttributes;
    }

    public String getEND_BODY() {
        return END_BODY;
    }

    public void setEND_BODY(String END_BODY) {
        this.END_BODY = END_BODY;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("BodyStructure", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","BodyStructure");
        if(BODY != null)
            map.put("Body",BODY);
        if(bodyAttributes.size()>0)
        {
            ArrayList<Map<String,Object>> attributes = new ArrayList<>();
            for (BodyAttribute bodyAttribute :
                 bodyAttributes) {
                attributes.add(bodyAttribute.toMap());
            }
            map.put("BodyAttributes",attributes);
        }

        if(END_BODY != null)
        map.put("EndBody",END_BODY);

        return map;
    }
}
