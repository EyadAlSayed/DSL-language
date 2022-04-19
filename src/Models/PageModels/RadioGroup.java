package Models.PageModels;

import java.util.ArrayList;

public class RadioGroup extends Node{
    private String name;
    private ArrayList<RadioField> fields;

    public RadioGroup() {
        this.fields = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<RadioField> getFields() {
        return fields;
    }

    public void setFields(ArrayList<RadioField> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return "RadioGroup{" +
                "name='" + name + '\'' +
                ", fields=" + fields +
                '}';
    }
}
