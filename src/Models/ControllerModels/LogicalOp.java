package Models.ControllerModels;

public class LogicalOp {
    String AndOpId;
    String OrOpId;
    String equalOpId;

    public String getAndOpId() {
        return AndOpId;
    }

    public void setAndOpId(String andOpId) {
        AndOpId = andOpId;
    }

    public String getOrOpId() {
        return OrOpId;
    }

    public void setOrOpId(String orOpId) {
        OrOpId = orOpId;
    }

    public String getEqualOpId() {
        return equalOpId;
    }

    public void setEqualOpId(String equalOpId) {
        this.equalOpId = equalOpId;
    }
}
