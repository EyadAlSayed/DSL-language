package Models.ControllerModels.Action;

import Models.Printer;
import Models.TextValue;

import java.util.LinkedHashMap;
import java.util.Map;

public class Div extends Printer {

    String fileNameId1;
    String assignOpId;
    TextValue textValue1;
    String fileNameId2;
    String divOpId;
    TextValue textValue2;
    String fileNameId3;
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

    public TextValue getTextValue1() {
        return textValue1;
    }

    public void setTextValue1(TextValue textValue1) {
        this.textValue1 = textValue1;
    }

    public String getFileNameId2() {
        return fileNameId2;
    }

    public void setFileNameId2(String fileNameId2) {
        this.fileNameId2 = fileNameId2;
    }

    public String getDivOpId() {
        return divOpId;
    }

    public void setDivOpId(String divOpId) {
        this.divOpId = divOpId;
    }

    public TextValue getTextValue2() {
        return textValue2;
    }

    public void setTextValue2(TextValue textValue2) {
        this.textValue2 = textValue2;
    }

    public String getFileNameId3() {
        return fileNameId3;
    }

    public void setFileNameId3(String fileNameId3) {
        this.fileNameId3 = fileNameId3;
    }

    public String getEndStatementId() {
        return endStatementId;
    }

    public void setEndStatementId(String endStatementId) {
        this.endStatementId = endStatementId;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Div",toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("label","Div");

        if (fileNameId1 != null)
            map.put("fileNameId1",fileNameId1);

        if (assignOpId != null)
            map.put("assignOperationId",assignOpId);

        if (textValue1 != null)
            map.put("TextValue1",textValue1.toMap());

        if (fileNameId2 != null)
            map.put("fileNameId2",fileNameId2);

        if (divOpId != null)
            map.put("DivOperation",divOpId);

        if (textValue2 != null)
            map.put("TextValue2",textValue2.toMap());
        if (fileNameId3 != null)
            map.put("fileNameId",fileNameId3);

        if (endStatementId != null)
            map.put("EndStatement",endStatementId);

        return map;
    }
}
