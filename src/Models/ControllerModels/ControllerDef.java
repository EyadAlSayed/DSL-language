package Models.ControllerModels;

import Models.Printer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ControllerDef extends Printer {
     String controllerDefId;
     String fileNameId;
     final List<ControllerTokens> controllerTokens = new ArrayList<>();
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

     public String getControllerDefEndId() {
          return controllerDefEndId;
     }

     public void setControllerDefEndId(String controllerDefEndId) {
          this.controllerDefEndId = controllerDefEndId;
     }

     @Override
     public String toString() {
          StringBuilder stringBuilder = getPrettyString("ControllerDef", toMap());
          return stringBuilder.toString();
     }

     @Override
     public Map<String, Object> toMap() {
          Map<String, Object> map = new LinkedHashMap<>();
          map.put("label","ControllerDef");
          if(controllerDefId != null)
               map.put("controllerDefId",controllerDefId);
          if(fileNameId != null)
               map.put("fileNameId",fileNameId);
          if(controllerTokens.size()>0)
          {
               ArrayList<Map<String,Object>> attributes = new ArrayList<>();
               for (ControllerTokens attribute :
                       controllerTokens) {
                    attributes.add(attribute.toMap());
               }
               map.put("ControllerTokens",attributes);
          }
          if(controllerDefEndId != null)
               map.put("ControllerDefEndId",controllerDefEndId);

          return map;
     }


}
