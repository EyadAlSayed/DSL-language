package Models.ControllerModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class LogicalOp extends Printer {
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("LogicalOp", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","LogicalOp");
        if(AndOpId != null)
            map.put("AndOpId",AndOpId);
        if(OrOpId != null)
            map.put("OrOpId",OrOpId);
        if(equalOpId != null)
            map.put("equalOpId",equalOpId);
        return map;
    }
}
