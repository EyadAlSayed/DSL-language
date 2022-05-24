package Models.ControllerModels;

import Models.ControllerModels.Action.Assign;
import Models.ControllerModels.Action.MathEquation;
import Models.ControllerModels.Action.Print;
import Models.ControllerModels.If.IFStatement;
import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class ControllerTokens extends Printer {

    IFStatement ifStatement;
    Loop loop;
    Print print;
    Assign assign;
    MathEquation mathEquation;
    Send send;


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

    public Loop getLoop() {
        return loop;
    }

    public void setLoop(Loop loop) {
        this.loop = loop;
    }

    public Send getSend() {
        return send;
    }

    public void setSend(Send send) {
        this.send = send;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("ControllerTokens", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label", "ControllerTokens");

        if (ifStatement != null)
            map.put("ifStatement", ifStatement);
        if (loop != null)
            map.put("Loop", loop);

        if (print != null)
            map.put("Print", print);

        if (assign != null)
            map.put("Assign", assign);
        if (send != null)
            map.put("send", send);
        if (mathEquation != null)
            map.put("MathEquation", mathEquation);

        return map;
    }
}
