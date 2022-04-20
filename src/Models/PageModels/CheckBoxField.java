package Models.PageModels;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class CheckBoxField extends Node{

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("CheckBoxField", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","CheckBoxField");
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
