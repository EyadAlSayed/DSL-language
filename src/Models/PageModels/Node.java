package Models.PageModels;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Node extends Printer {
    protected ArrayList<Attribute> attributes;

    public Node() {
        this.attributes = new ArrayList<>();
    }

    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Node", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","Node");
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
