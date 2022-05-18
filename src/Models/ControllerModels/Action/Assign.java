package Models.ControllerModels.Action;

import Models.TextValue;

public class Assign {

    String varNameId1;
    String assignOpId;
    TextValue textValue;
    String varNameId2;
    String endStatementId;

    public String getVarNameId1() {
        return varNameId1;
    }

    public void setVarNameId1(String varNameId1) {
        this.varNameId1 = varNameId1;
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

    public String getVarNameId2() {
        return varNameId2;
    }

    public void setVarNameId2(String varNameId2) {
        this.varNameId2 = varNameId2;
    }

    public String getEndStatementId() {
        return endStatementId;
    }

    public void setEndStatementId(String endStatementId) {
        this.endStatementId = endStatementId;
    }
}
