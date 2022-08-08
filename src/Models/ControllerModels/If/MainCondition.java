package Models.ControllerModels.If;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainCondition extends Printer {


    EqualCondition equalCondition;
    List<BinaryEqualCondition> binaryEqualCondition = new ArrayList<>();

    public EqualCondition getEqualCondition() {
        return equalCondition;
    }

    public void setEqualCondition(EqualCondition equalCondition) {
        this.equalCondition = equalCondition;
    }

    public List<BinaryEqualCondition> getBinaryEqualCondition() {
        return binaryEqualCondition;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("MainCondition",toMap());
        return stringBuilder.toString();
    }


    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> map = new LinkedHashMap<>();

        map.put("label","MainCondition");

        if(equalCondition != null)
            map.put("equalCondition",equalCondition.toMap());


        if (binaryEqualCondition.size() > 0) {
            ArrayList<Map<String, Object>> list = new ArrayList<>();
            for (BinaryEqualCondition bc : binaryEqualCondition) {
                list.add(bc.toMap());
            }
            map.put("BinaryCondition", list);
        }
        return  map;
    }
}
