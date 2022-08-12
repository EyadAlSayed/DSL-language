package Models.ControllerModels.If;

import Models.Printer;
import Models.TextValue;

import java.util.LinkedHashMap;
import java.util.Map;

public class BinaryEqualCondition extends Printer {
    LogicalOperation logicalOperation;
    String fileNameId1;
    String equalOpId;
    String notEqualOpId;
    TextValue textValue;
    String fileNameId2;

    public String getNotEqualOpId() {
        return notEqualOpId;
    }

    public void setNotEqualOpId(String notEqualOpId) {
        this.notEqualOpId = notEqualOpId;
    }

    public LogicalOperation getLogicalOperation() {
        return logicalOperation;
    }

    public void setLogicalOperation(LogicalOperation logicalOperation) {
        this.logicalOperation = logicalOperation;
    }

    public String getFileNameId1() {
        return fileNameId1;
    }

    public void setFileNameId1(String fileNameId1) {
        this.fileNameId1 = fileNameId1;
    }

    public String getFileNameId2() {
        return fileNameId2;
    }

    public void setFileNameId2(String fileNameId2) {
        this.fileNameId2 = fileNameId2;
    }

    public String getEqualOpId() {
        return equalOpId;
    }

    public void setEqualOpId(String equalOpId) {
        this.equalOpId = equalOpId;
    }

    public TextValue getTextValue() {
        return textValue;
    }

    public void setTextValue(TextValue textValue) {
        this.textValue = textValue;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("BinaryEqualCondition",toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> map = new LinkedHashMap<>();

        map.put("label","BinaryEqualCondition");

        if(logicalOperation != null)
            map.put("logical Operation",logicalOperation.toMap());

        if(fileNameId1 != null)
            map.put("fileNameId1",fileNameId1);

        if (equalOpId != null)
            map.put("equalOperation",equalOpId);
        if(notEqualOpId != null)
            map.put("notEqualOperation",notEqualOpId);

        if (textValue != null)
            map.put("textValue",textValue.toMap());

        if(fileNameId2 != null)
            map.put("fileNameId2",fileNameId2);

        return  map;
    }
}
