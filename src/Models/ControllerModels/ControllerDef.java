package Models.ControllerModels;

import java.util.ArrayList;
import java.util.List;

public class ControllerDef {
     String controllerDefId;
     String fileNameId;
     List<ControllerTokens> controllerTokens = new ArrayList<>();
     String controllerDefEndId;

     public String getControllerDefId() {
          return controllerDefId;
     }

     public void setControllerDefId(String controllerDefId) {
          this.controllerDefId = controllerDefId;
     }

     public String getFileNameId() {
          return fileNameId;
     }

     public void setFileNameId(String fileNameId) {
          this.fileNameId = fileNameId;
     }

     public List<ControllerTokens> getControllerTokens() {
          return controllerTokens;
     }

     public void setControllerTokens(List<ControllerTokens> controllerTokens) {
          this.controllerTokens = controllerTokens;
     }

     public String getControllerDefEndId() {
          return controllerDefEndId;
     }

     public void setControllerDefEndId(String controllerDefEndId) {
          this.controllerDefEndId = controllerDefEndId;
     }
}
