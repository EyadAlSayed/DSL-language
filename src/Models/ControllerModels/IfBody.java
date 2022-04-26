package Models.ControllerModels;

import java.util.ArrayList;
import java.util.List;

public class IfBody {

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
}
