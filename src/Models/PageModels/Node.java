package Models.PageModels;

import java.util.ArrayList;

public class Node {
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


}
