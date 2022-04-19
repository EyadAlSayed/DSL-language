package Models.ControllerModels;

import java.util.ArrayList;
import java.util.List;

public class IFCondition {

    String IfId;
    String openParBrackt;
    final List<Condition> conditions = new ArrayList<>();
    String closeParBrackt;

    public String getIfId() {
        return IfId;
    }

    public void setIfId(String ifId) {
        IfId = ifId;
    }

    public String getOpenParBrackt() {
        return openParBrackt;
    }

    public void setOpenParBrackt(String openParBrackt) {
        this.openParBrackt = openParBrackt;
    }

    public List<Condition> getConditions() {
        return conditions;
    }


    public String getCloseParBrackt() {
        return closeParBrackt;
    }

    public void setCloseParBrackt(String closeParBrackt) {
        this.closeParBrackt = closeParBrackt;
    }
}
