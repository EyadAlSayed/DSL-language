package Models.PageModels;

import java.util.ArrayList;

public class Form {
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
        return "Form{" +
                "method='" + method + '\'' +
                ", action='" + action + '\'' +
                ", nodes=" + nodes +
                '}';
    }
}
