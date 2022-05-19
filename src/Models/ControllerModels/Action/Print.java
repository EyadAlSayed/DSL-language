package Models.ControllerModels.Action;

import Models.Printer;
import Models.TextValue;

import java.util.LinkedHashMap;
import java.util.Map;

public class Print extends Printer {

    String printAction;
    TextValue textValue;
    String fileNameId;
    String endStatementId;

    public String getPrintAction() {
        return printAction;
    }

    public void setPrintAction(String printAction) {
        this.printAction = printAction;
    }

    public TextValue getTextValue() {
        return textValue;
    }

    public void setTextValue(TextValue textValue) {
        this.textValue = textValue;
    }

    public String getFileNameId() {
        return fileNameId;
    }

    public void setFileNameId(String varNameId) {
        this.fileNameId = varNameId;
    }

    public String getEndStatementId() {
        return endStatementId;
    }

    public void setEndStatementId(String endStatementId) {
        this.endStatementId = endStatementId;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Print", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();

        map.put("label","Print");

        if (printAction != null)
            map.put("PrintAction", printAction);
        if (textValue != null)
            map.put("TextValue", textValue.toMap());

        if (fileNameId != null)
            map.put("FileNameId", fileNameId);
        if (endStatementId != null)
            map.put("EndStatement", endStatementId);
        return map;
    }
}
