package Models.ControllerModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Send extends Printer {


    String sendId;
    String openParBracktId;
    String fileNameId;
    String closeParBracktId;
    String endStatementId;

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public String getOpenParBracktId() {
        return openParBracktId;
    }

    public void setOpenParBracktId(String openParBracktId) {
        this.openParBracktId = openParBracktId;
    }

    public String getFileNameId() {
        return fileNameId;
    }

    public void setFileNameId(String fileNameId) {
        this.fileNameId = fileNameId;
    }

    public String getCloseParBracktId() {
        return closeParBracktId;
    }

    public void setCloseParBracktId(String closeParBracktId) {
        this.closeParBracktId = closeParBracktId;
    }

    public String getEndStatementId() {
        return endStatementId;
    }

    public void setEndStatementId(String endStatementId) {
        this.endStatementId = endStatementId;
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

        if (sendId != null)
            map.put("sendId", sendId);
        if (openParBracktId != null)
            map.put("openParBracktId", openParBracktId);
        if (fileNameId != null)
            map.put("fileNameId", fileNameId);
        if (closeParBracktId != null)
            map.put("closeParBracktId", closeParBracktId);
        if (endStatementId != null)
            map.put("endStatementId", endStatementId);

        return map;

    }
}
