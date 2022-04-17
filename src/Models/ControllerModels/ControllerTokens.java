package Models.ControllerModels;

import gen.DSLParser;

public class ControllerTokens {
    Bundle bundle;
    SingleCondition singleCondition;
    DoubleCondition doubleCondition;
    Action action;

    public Bundle getBundle() {
        return bundle;
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public SingleCondition getSingleCondition() {
        return singleCondition;
    }

    public void setSingleCondition(SingleCondition singleCondition) {
        this.singleCondition = singleCondition;
    }

    public DoubleCondition getDoubleCondition() {
        return doubleCondition;
    }

    public void setDoubleCondition(DoubleCondition doubleCondition) {
        this.doubleCondition = doubleCondition;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
