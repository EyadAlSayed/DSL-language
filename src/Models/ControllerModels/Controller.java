package Models.ControllerModels;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *  this class has controller Def name in parser file
 */
public class Controller extends Printer {

    String controllerDef;
    String fileNameId1;
    String controllerMethod;
    String fileNameId2;
    String openCurlyBrackt;
    final List<ControllerTokens> controllerTokens = new ArrayList<>();
    String closeCurlyBrackt;

    public String getControllerDef() {
        return controllerDef;
    }

    public void setControllerDef(String controllerDef) {
        this.controllerDef = controllerDef;
    }

    public String getFileNameId1() {
        return fileNameId1;
    }

    public void setFileNameId1(String fileNameId1) {
        this.fileNameId1 = fileNameId1;
    }

    public String getControllerMethod() {
        return controllerMethod;
    }

    public void setControllerMethod(String controllerMethod) {
        this.controllerMethod = controllerMethod;
    }

    public String getFileNameId2() {
        return fileNameId2;
    }

    public void setFileNameId2(String fileNameId2) {
        this.fileNameId2 = fileNameId2;
    }

    public String getOpenCurlyBrackt() {
        return openCurlyBrackt;
    }

    public void setOpenCurlyBrackt(String openCurlyBrackt) {
        this.openCurlyBrackt = openCurlyBrackt;
    }

    public List<ControllerTokens> getControllerTokens() {
        return controllerTokens;
    }

    public String getCloseCurlyBrackt() {
        return closeCurlyBrackt;
    }

    public void setCloseCurlyBrackt(String closeCurlyBrackt) {
        this.closeCurlyBrackt = closeCurlyBrackt;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Controller",toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("label","Controller");

        if (controllerDef != null)
            map.put("ControllerDef",controllerDef);
        if (fileNameId1 != null)
            map.put("fileNameId1",fileNameId1);
        if (controllerMethod != null)
            map.put("ControllerMethod",controllerMethod);

        if (fileNameId2 != null)
            map.put("fileNameId2",fileNameId2);

        if (openCurlyBrackt != null)
            map.put("OpenCurlyBrackt",openCurlyBrackt);

        if (controllerTokens.size() > 0){
            ArrayList<Map<String,Object>> list = new ArrayList<>();
            for (ControllerTokens ct:
                 controllerTokens) {
                list.add(ct.toMap());
            }
            map.put("ControllerTokens",list);
        }

        if (closeCurlyBrackt != null)
            map.put("CloseCurlyBrackt",closeCurlyBrackt);

        return map;

    }
}
