package Models.ControllerModels;

public class SingleCondition {
    String ifId;
    String openParBracktId;
    Var var;
    LogicalOp logicalOp;
    String text;
    String closeParBracktId;

    public String getIfId() {
        return ifId;
    }

    public void setIfId(String ifId) {
        this.ifId = ifId;
    }

    public String getOpenParBracktId() {
        return openParBracktId;
    }

    public void setOpenParBracktId(String openParBracktId) {
        this.openParBracktId = openParBracktId;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public LogicalOp getLogicalOp() {
        return logicalOp;
    }

    public void setLogicalOp(LogicalOp logicalOp) {
        this.logicalOp = logicalOp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCloseParBracktId() {
        return closeParBracktId;
    }

    public void setCloseParBracktId(String closeParBracktId) {
        this.closeParBracktId = closeParBracktId;
    }
}
