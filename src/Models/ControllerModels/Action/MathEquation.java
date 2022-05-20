package Models.ControllerModels.Action;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class MathEquation extends Printer {

    Sum sum;
    Mult mult;
    Div div;
    Minus minus;
    Mod mod;

    public Sum getSum() {
        return sum;
    }

    public void setSum(Sum sum) {
        this.sum = sum;
    }

    public Mult getMult() {
        return mult;
    }

    public void setMult(Mult mult) {
        this.mult = mult;
    }

    public Div getDiv() {
        return div;
    }

    public void setDiv(Div div) {
        this.div = div;
    }

    public Minus getMinus() {
        return minus;
    }

    public void setMinus(Minus minus) {
        this.minus = minus;
    }

    public Mod getMod() {
        return mod;
    }

    public void setMod(Mod mod) {
        this.mod = mod;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("MathEquation",toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> map = new LinkedHashMap<>();

        map.put("label","MathEquation");
        if (sum != null)
            map.put("sum",sum.toMap());

        if (minus != null)
            map.put("minus",minus.toMap());

        if (mult != null)
            map.put("mult",mult.toMap());

        if (div != null)
            map.put("div",div.toMap());

        if (mod != null)
            map.put("mod",mod.toMap());
        return map;
    }
}
