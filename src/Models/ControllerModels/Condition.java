package Models.ControllerModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class Condition extends Printer {

    Var var;
    LogicalOp logicalOp1;
    TextValue textValue;
    LogicalOp logicalOp2;

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public LogicalOp getLogicalOp1() {
        return logicalOp1;
    }

    public void setLogicalOp1(LogicalOp logicalOp1) {
        this.logicalOp1 = logicalOp1;
    }

    public TextValue getTextValue() {
        return textValue;
    }

    public void setTextValue(TextValue textValue) {
        this.textValue = textValue;
    }

    public LogicalOp getLogicalOp2() {
        return logicalOp2;
    }

    public void setLogicalOp2(LogicalOp logicalOp2) {
        this.logicalOp2 = logicalOp2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Condition", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","Condition");
        if(var != null)
            map.put("Var",var.toMap());
        if(logicalOp1 != null)
            map.put("logicalOp1",logicalOp1.toMap());
        if(textValue != null)
            map.put("textValue",textValue.toMap());
        if(logicalOp2 != null)
            map.put("logicalOp2",logicalOp2.toMap());

        return map;
    }
}
