package Models.ControllerModels;

import Models.Printer;

import java.util.*;

public class IfBody extends Printer {

    String ifBodyDefId;
    final List<IfBodyTokens> ifBodyTokens = new ArrayList<>();
    String ifBodyDefEndId;

    public String getIfBodyDefId() {
        return ifBodyDefId;
    }

    public void setIfBodyDefId(String ifBodyDefId) {
        this.ifBodyDefId = ifBodyDefId;
    }

    public List<IfBodyTokens> getIfBodyTokens() {
        return ifBodyTokens;
    }

    public String getIfBodyDefEndId() {
        return ifBodyDefEndId;
    }

    public void setIfBodyDefEndId(String ifBodyDefEndId) {
        this.ifBodyDefEndId = ifBodyDefEndId;
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("label","ifBody");
        if (ifBodyDefId != null){
            map.put("ifBody",ifBodyDefId);
        }
        if (ifBodyTokens.size() > 0){
            ArrayList<Map<String,Object>> tokens = new ArrayList<>();
            for (IfBodyTokens token: ifBodyTokens){
                tokens.add(token.toMap());
            }
            map.put("ifBodyTokens",tokens);
        }
        if (ifBodyDefEndId != null){
            map.put("ifBodyEnd",ifBodyDefEndId);
        }
     return map;
    }
}
