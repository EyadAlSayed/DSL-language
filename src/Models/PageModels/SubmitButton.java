package Models.PageModels;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class SubmitButton extends Node{
    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("SubmitButton", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","SubmitButton");
        if(attributes.size()>0)
        {
            ArrayList<Map<String,Object>> attributess = new ArrayList<>();
            for (Attribute attribute :
                    attributes) {
                attributess.add(attribute.toMap());
            }
            map.put("Attribute",attributess);
        }
        return map;
    }
}
