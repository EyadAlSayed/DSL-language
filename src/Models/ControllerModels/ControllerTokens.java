package Models.ControllerModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class ControllerTokens extends Printer {
    Bundle bundle;
    Action action;
    IFCondition ifCondition;

    public Bundle getBundle() {
        return bundle;
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public IFCondition getIfCondition() {
        return ifCondition;
    }

    public void setIfCondition(IFCondition ifCondition) {
        this.ifCondition = ifCondition;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("ControllerToken", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","ControllerToken");
        if(bundle != null)
            map.put("Bundle",bundle.toMap());
        if(action != null)
            map.put("Action",action.toMap());
        if(ifCondition != null)
            map.put("ifCondition",ifCondition.toMap());

        return map;
    }
}
