package Models.ControllerModels.Action;

import Models.Printer;
import Models.TextValue;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assign extends Printer {

    String fileNameId1;
    String assignOpId;
    TextValue textValue;
    String fileNameId2;
    String endStatementId;

    public String getFileNameId1() {
        return fileNameId1;
    }

    public void setFileNameId1(String fileNameId1) {
        this.fileNameId1 = fileNameId1;
    }

    public String getAssignOpId() {
        return assignOpId;
    }

    public void setAssignOpId(String assignOpId) {
        this.assignOpId = assignOpId;
    }

    public TextValue getTextValue() {
        return textValue;
    }

    public void setTextValue(TextValue textValue) {
        this.textValue = textValue;
    }

    public String getFileNameId2() {
        return fileNameId2;
    }

    public void setFileNameId2(String fileNameId2) {
        this.fileNameId2 = fileNameId2;
    }

    public String getEndStatementId() {
        return endStatementId;
    }

    public void setEndStatementId(String endStatementId) {
        this.endStatementId = endStatementId;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Assign",toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {

        Map<String,Object> map = new LinkedHashMap<>();
        map.put("label","Assign");
        if (fileNameId1 != null)
            map.put("fileNameId1",fileNameId1);

        if (assignOpId != null)
            map.put("assignOpreationId",assignOpId);

        if (textValue != null)
            map.put("TextValue",textValue.toMap());

        if (fileNameId2 != null)
            map.put("fileNameId2",fileNameId2);

        if (endStatementId != null)
            map.put("EndStatementId",endStatementId);
        return map;
    }
}
