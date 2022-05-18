package Models.ControllerModels;

import java.util.ArrayList;
import java.util.List;

public class Controller {

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
}
