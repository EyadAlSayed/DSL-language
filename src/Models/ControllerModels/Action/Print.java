package Models.ControllerModels.Action;

import Models.TextValue;

public class Print {

    String printAction;
    TextValue textValue;
    String varNameId;
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

    public String getVarNameId() {
        return varNameId;
    }

    public void setVarNameId(String varNameId) {
        this.varNameId = varNameId;
    }

    public String getEndStatementId() {
        return endStatementId;
    }

    public void setEndStatementId(String endStatementId) {
        this.endStatementId = endStatementId;
    }
}
