package Models.ControllerModels.If;

import Models.Printer;
import Models.TextValue;

import java.util.LinkedHashMap;
import java.util.Map;

public class Condition  extends Printer {
    String fileNameId;
    LogicalOperation logicalOperation1;
    TextValue textValue;
    LogicalOperation logicalOperation2;

    public String getfileNameId() {
        return fileNameId;
    }

    public void setFileNameId(String fileNameId) {
        this.fileNameId = fileNameId;
    }

    public LogicalOperation getLogicalOperation1() {
        return logicalOperation1;
    }

    public void setLogicalOperation1(LogicalOperation logicalOperation1) {
        this.logicalOperation1 = logicalOperation1;
    }

    public TextValue getTextValue() {
        return textValue;
    }

    public void setTextValue(TextValue textValue) {
        this.textValue = textValue;
    }

    public LogicalOperation getLogicalOperation2() {
        return logicalOperation2;
    }

    public void setLogicalOperation2(LogicalOperation logicalOperation2) {
        this.logicalOperation2 = logicalOperation2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Condition",toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> map = new LinkedHashMap<>();

        map.put("label","Condition");
        if (fileNameId != null)
            map.put("fileNameId",fileNameId);
        if (logicalOperation1 != null)
            map.put("LogicalOperation1",logicalOperation1.toMap());
        if (textValue != null)
            map.put("TextValue",textValue.toMap());
        if (logicalOperation2 != null)
            map.put("LogicalOperation2",logicalOperation2.toMap());
        return map;
    }
}
