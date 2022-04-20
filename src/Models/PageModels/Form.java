package Models.PageModels;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Form extends Printer {
    private String method;
    private String action;
    private ArrayList<Node> nodes;

    public Form() {
        this.nodes = new ArrayList<>();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Form", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","Form");
        if(method != null)
            map.put("Method", method);
        if(action != null)
            map.put("Action",action);
        if(nodes.size()>0)
        {
            ArrayList<Map<String,Object>> attributes = new ArrayList<>();
            for (Node node :
                    nodes) {
                attributes.add(node.toMap());
            }
            map.put("Nodes",attributes);
        }

        return map;
    }
}
