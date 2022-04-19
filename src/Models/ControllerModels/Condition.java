package Models.ControllerModels;

public class Condition {

    Var var;
    LogicalOp logicalOp1;
    TextValue textValue;
    LogicalOp logicalOp2;

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public LogicalOp getLogicalOp1() {
        return logicalOp1;
    }

    public void setLogicalOp1(LogicalOp logicalOp1) {
        this.logicalOp1 = logicalOp1;
    }

    public TextValue getTextValue() {
        return textValue;
    }

    public void setTextValue(TextValue textValue) {
        this.textValue = textValue;
    }

    public LogicalOp getLogicalOp2() {
        return logicalOp2;
    }

    public void setLogicalOp2(LogicalOp logicalOp2) {
        this.logicalOp2 = logicalOp2;
    }
}
