package Models.ControllerModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Send extends Printer {


    String send;
    String openParBracktId;
    String text;
    String closeParBracktId;
    String endStatement;

    public String getOpenParBracktId() {
        return openParBracktId;
    }

    public void setOpenParBracktId(String openParBracktId) {
        this.openParBracktId = openParBracktId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCloseParBracktId() {
        return closeParBracktId;
    }

    public void setCloseParBracktId(String closeParBracktId) {
        this.closeParBracktId = closeParBracktId;
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }

    public String getEndStatement() {
        return endStatement;
    }

    public void setEndStatement(String endStatement) {
        this.endStatement = endStatement;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Send", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label", "send");

        if (send != null)
            map.put("Send", send);

        if (openParBracktId != null)
            map.put("OpenParBracktId", openParBracktId);

        if (text != null)
            map.put("Text", text);
        if (closeParBracktId != null)
            map.put("CloseParBracktId", closeParBracktId);

        if (endStatement != null)
            map.put("endStatement", endStatement);

        return map;
    }
}
