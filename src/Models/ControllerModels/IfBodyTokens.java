package Models.ControllerModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class IfBodyTokens extends Printer {

    IFCondition ifCondition;
    Bundle bundle;
    Action action;
    VarDeclear varDeclear;

    public IFCondition getIfCondition() {
        return ifCondition;
    }

    public void setIfCondition(IFCondition ifCondition) {
        this.ifCondition = ifCondition;
    }

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

    public VarDeclear getVarDeclear() {
        return varDeclear;
    }

    public void setVarDeclear(VarDeclear varDeclear) {
        this.varDeclear = varDeclear;
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label", "ifBodyTokens");
        if (ifCondition != null) {
            map.put("ifCondition", ifCondition.toMap());
        }

        if (action != null)
            map.put("Action", action.toMap());

        if (bundle != null)
            map.put("Bundle", bundle.toMap());
        if (varDeclear != null)
            map.put("VarDeclear", varDeclear.toMap());
        return map;
    }
}
