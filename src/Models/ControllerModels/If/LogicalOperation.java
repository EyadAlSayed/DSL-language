package Models.ControllerModels.If;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class LogicalOperation extends Printer {
    String andId;
    String orId;
    String equalId;

    public String getAndId() {
        return andId;
    }

    public void setAndId(String andId) {
        this.andId = andId;
    }

    public String getOrId() {
        return orId;
    }

    public void setOrId(String orId) {
        this.orId = orId;
    }

    public String getEqualId() {
        return equalId;
    }

    public void setEqualId(String equalId) {
        this.equalId = equalId;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("LogicalOperation", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();

        map.put("label", "LogicalOperation");
        if (andId != null)
            map.put("AndId", andId);
        if (orId != null)
            map.put("OrId", orId);
        if (equalId != null)
            map.put("EqualId", equalId);
        return map;
    }
}
