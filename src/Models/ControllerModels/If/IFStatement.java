package Models.ControllerModels.If;

import Models.ControllerModels.ControllerTokens;
import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IFStatement extends Printer {

    String ifId;
    String openParBracktId;
    MainCondition mainCondition;
    String closeParBracktId;
    String openCurlyBracktId;
     List<ControllerTokens> controllerTokens = new ArrayList<>();
    String closeCurlyBracktId;

    public MainCondition getMainCondition() {
        return mainCondition;
    }

    public void setMainCondition(MainCondition mainCondition) {
        this.mainCondition = mainCondition;
    }

    public void setControllerTokens(List<ControllerTokens> controllerTokens) {
        this.controllerTokens = controllerTokens;
    }

    public String getIfId() {
        return ifId;
    }

    public void setIfId(String ifId) {
        this.ifId = ifId;
    }

    public String getOpenParBracktId() {
        return openParBracktId;
    }

    public void setOpenParBracktId(String openParBracktId) {
        this.openParBracktId = openParBracktId;
    }

    public String getCloseParBracktId() {
        return closeParBracktId;
    }

    public void setCloseParBracktId(String closeParBracktId) {
        this.closeParBracktId = closeParBracktId;
    }

    public String getOpenCurlyBracktId() {
        return openCurlyBracktId;
    }

    public void setOpenCurlyBracktId(String openCurlyBracktId) {
        this.openCurlyBracktId = openCurlyBracktId;
    }

    public List<ControllerTokens> getControllerTokens() {
        return controllerTokens;
    }

    public String getCloseCurlyBracktId() {
        return closeCurlyBracktId;
    }

    public void setCloseCurlyBracktId(String closeCurlyBracktId) {
        this.closeCurlyBracktId = closeCurlyBracktId;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("IfStatement", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();

        map.put("label", "IfStatement");

        if (ifId != null)
            map.put("ifId", ifId);
        if (openParBracktId != null)
            map.put("openParBracktId", openCurlyBracktId);
       if(mainCondition != null)
           map.put("mainCondition",mainCondition);

        if (closeParBracktId != null)
            map.put("CloseParBracktId", closeCurlyBracktId);
        if (openCurlyBracktId != null)
            map.put("OpenCurlyBracktId", openCurlyBracktId);
        if (controllerTokens.size() > 0) {
            ArrayList<Map<String, Object>> list = new ArrayList<>();
            for (ControllerTokens ct : controllerTokens) {
                list.add(ct.toMap());
            }
            map.put("ControllerTokens", list);
        }

        if (closeCurlyBracktId != null)
            map.put("CloseCurlyBrackId", closeCurlyBracktId);


        return map;

    }
}
