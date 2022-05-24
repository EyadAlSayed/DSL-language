package Models.PageModels;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Body extends Printer {

    List<BodyAttribute> bodyAttributes = new ArrayList<>();

    public List<BodyAttribute> getBodyAttributes() {
        return bodyAttributes;
    }

    public void setBodyAttributes(List<BodyAttribute> bodyAttributes) {
        this.bodyAttributes = bodyAttributes;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Body", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label", "BodyStructure");
        if (bodyAttributes.size() > 0) {
            ArrayList<Map<String, Object>> attributes = new ArrayList<>();
            for (BodyAttribute bodyAttribute :
                    bodyAttributes) {
                attributes.add(bodyAttribute.toMap());
            }
            map.put("BodyAttributes", attributes);
        }
        return map;
    }
}
