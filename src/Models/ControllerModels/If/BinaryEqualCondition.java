package Models.ControllerModels.If;

import Models.Printer;
import Models.TextValue;

import java.util.LinkedHashMap;
import java.util.Map;

public class BinaryEqualCondition extends Printer {
    LogicalOperation logicalOperation;
    String fileNameId;
    String equalOpId;
    TextValue textValue;

    public LogicalOperation getLogicalOperation() {
        return logicalOperation;
    }

    public void setLogicalOperation(LogicalOperation logicalOperation) {
        this.logicalOperation = logicalOperation;
    }

    public String getFileNameId() {
        return fileNameId;
    }

    public void setFileNameId(String fileNameId) {
        this.fileNameId = fileNameId;
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

        if(fileNameId != null)
            map.put("fileNameId",fileNameId);

        if (equalOpId != null)
            map.put("equalOperation",equalOpId);

        if (textValue != null)
            map.put("textValue",textValue.toMap());

        return  map;
    }
}
