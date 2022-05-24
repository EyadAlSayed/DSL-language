package Models.ControllerModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Send extends Printer {


    String fileNameId;
    String dot;
    String send;
    String endStatement;

    public String getFileNameId() {
        return fileNameId;
    }

    public void setFileNameId(String fileNameId) {
        this.fileNameId = fileNameId;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
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

        if (fileNameId != null)
            map.put("FileNameId", fileNameId);

        if (dot != null)
            map.put("dot", dot);

        if (send != null)
            map.put("send", send);
        if (endStatement != null)
            map.put("endStatement", endStatement);

        return map;
    }
}
