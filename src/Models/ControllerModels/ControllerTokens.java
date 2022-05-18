package Models.ControllerModels;

import Models.ControllerModels.Action.Assign;
import Models.ControllerModels.Action.MathEquation;
import Models.ControllerModels.Action.Print;
import Models.ControllerModels.If.IFStatement;

public class ControllerTokens {

    IFStatement ifStatement;
    Print print;
    Assign assign;
    MathEquation mathEquation;

    public IFStatement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IFStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public Print getPrint() {
        return print;
    }

    public void setPrint(Print print) {
        this.print = print;
    }

    public Assign getAssign() {
        return assign;
    }

    public void setAssign(Assign assign) {
        this.assign = assign;
    }

    public MathEquation getMathEquation() {
        return mathEquation;
    }

    public void setMathEquation(MathEquation mathEquation) {
        this.mathEquation = mathEquation;
    }
}
