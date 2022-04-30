package Models.ControllerModels;

public class IfBodyTokens {

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
}
