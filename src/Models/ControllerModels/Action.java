package Models.ControllerModels;

import java.util.ArrayList;
import java.util.List;

public class Action {
    String printAction;
    List<String> text = new ArrayList<>();

    public String getPrintAction() {
        return printAction;
    }

    public void setPrintAction(String printAction) {
        this.printAction = printAction;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }
}
