package Models.PageModels;

import Models.Printer;

import java.util.List;
import java.util.Map;

public class Body extends Printer {

    List<BodyAttribute> bodyAttributes;

    public List<BodyAttribute> getBodyAttributes() {
        return bodyAttributes;
    }

    public void setBodyAttributes(List<BodyAttribute> bodyAttributes) {
        this.bodyAttributes = bodyAttributes;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Body", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        return null;
    }
}
