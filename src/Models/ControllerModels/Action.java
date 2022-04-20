package Models.ControllerModels;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Action extends Printer {
    String printAction;
    final List<String> text = new ArrayList<>();

    public String getPrintAction() {
        return printAction;
    }

    public void setPrintAction(String printAction) {
        this.printAction = printAction;
    }

    public List<String> getText() {
        return text;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Action", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","Action");
        if(printAction != null)
            map.put("printAction",printAction);
        if(text.size()>0)
        {
           map.put("Text",text);
        }

        return map;
    }

}
