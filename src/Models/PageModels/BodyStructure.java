package Models.PageModels;

import java.util.List;

public class BodyStructure {

    String BODY;
    List<BodyAttribute> bodyAttributes;
    String END_BODY;

    public String getBODY() {
        return BODY;
    }

    public void setBODY(String BODY) {
        this.BODY = BODY;
    }

    public List<BodyAttribute> getBodyAttributes() {
        return bodyAttributes;
    }

    public void setBodyAttributes(List<BodyAttribute> bodyAttributes) {
        this.bodyAttributes = bodyAttributes;
    }

    public String getEND_BODY() {
        return END_BODY;
    }

    public void setEND_BODY(String END_BODY) {
        this.END_BODY = END_BODY;
    }
}
