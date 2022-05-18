package Models.ControllerModels.If;

import Models.ControllerModels.ControllerTokens;

import java.util.ArrayList;
import java.util.List;

public class IFStatement {

    String ifId;
    String openParBracktId;
    final List<Condition> conditions = new ArrayList<>();
    String closeParBracktId;
    String openCurlyBracktId;
    final List<ControllerTokens> controllerTokens = new ArrayList<>();
    String closeCurlyBracktId;

    public String getIfId() {
        return ifId;
    }

    public void setIfId(String ifId) {
        this.ifId = ifId;
    }
}
