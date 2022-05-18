package Models.ControllerModels.If;

import Models.TextValue;

public class Condition {
    String varNameId;
    LogicalOperation logicalOperation1;
    TextValue textValue;
    LogicalOperation logicalOperation2;

    public String getVarNameId() {
        return varNameId;
    }

    public void setVarNameId(String varNameId) {
        this.varNameId = varNameId;
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
}
