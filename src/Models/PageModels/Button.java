package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Button extends Printer {

    String buttonID;
    String variableName;
    String sendValue;

    public String getSendValue() {
        return sendValue;
    }

    public void setSendValue(String sendValue) {
        this.sendValue = sendValue;
    }

    public String getButtonID() {
        return buttonID;
    }

    public void setButtonID(String buttonID) {
        this.buttonID = buttonID;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Button", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","Button");
        if (buttonID != null)
            map.put("ButtonID",buttonID);
        if (variableName != null)
            map.put("VariableName",variableName);
        if(sendValue != null)
            map.put("SendValue",sendValue);
        return map;

    }
}
