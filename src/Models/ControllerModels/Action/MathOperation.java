package Models.ControllerModels.Action;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class MathOperation extends Printer {

    String sumOpId, multOpId, minusOpId, divOpId, modOpId;

    public String getSumOpId() {
        return sumOpId;
    }

    public void setSumOpId(String sumOpId) {
        this.sumOpId = sumOpId;
    }

    public String getMultOpId() {
        return multOpId;
    }

    public void setMultOpId(String multOpId) {
        this.multOpId = multOpId;
    }

    public String getMinusOpId() {
        return minusOpId;
    }

    public void setMinusOpId(String minusOpId) {
        this.minusOpId = minusOpId;
    }

    public String getDivOpId() {
        return divOpId;
    }

    public void setDivOpId(String divOpId) {
        this.divOpId = divOpId;
    }

    public String getModOpId() {
        return modOpId;
    }

    public void setModOpId(String modOpId) {
        this.modOpId = modOpId;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("MathOperation", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();

        map.put("label", "MathOperation");

        if(sumOpId != null)
            map.put("SumOpId",sumOpId);

        if(minusOpId != null)
            map.put("MinusOpId",minusOpId);

        if(multOpId != null)
            map.put("MultOpId",multOpId);


        if(divOpId != null)
            map.put("DivOpId",divOpId);

        if(modOpId != null)
            map.put("ModOpId",modOpId);


        return map;
    }
}
