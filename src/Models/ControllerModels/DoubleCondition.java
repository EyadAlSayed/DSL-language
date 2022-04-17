package Models.ControllerModels;

public class DoubleCondition {
    String ifId;
    String openParBracktId;
    Var var1;
    LogicalOp logicalOp1;
    String text1;
    LogicalOp logicalOp2;
    Var var2;
    LogicalOp logicalOp3;
    String text2;
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

    public Var getVar1() {
        return var1;
    }

    public void setVar1(Var var1) {
        this.var1 = var1;
    }

    public LogicalOp getLogicalOp1() {
        return logicalOp1;
    }

    public void setLogicalOp1(LogicalOp logicalOp1) {
        this.logicalOp1 = logicalOp1;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public LogicalOp getLogicalOp2() {
        return logicalOp2;
    }

    public void setLogicalOp2(LogicalOp logicalOp2) {
        this.logicalOp2 = logicalOp2;
    }

    public Var getVar2() {
        return var2;
    }

    public void setVar2(Var var2) {
        this.var2 = var2;
    }

    public LogicalOp getLogicalOp3() {
        return logicalOp3;
    }

    public void setLogicalOp3(LogicalOp logicalOp3) {
        this.logicalOp3 = logicalOp3;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getCloseParBracktId() {
        return closeParBracktId;
    }

    public void setCloseParBracktId(String closeParBracktId) {
        this.closeParBracktId = closeParBracktId;
    }
}
