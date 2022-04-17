package Models.ControllerModels;

public class Bundle {
    Var var;
    String Assign;
    String bundleId;
    String openSqrBracktId;
    String Text;
    String closeSqrBracktId;

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public String getAssign() {
        return Assign;
    }

    public void setAssign(String assign) {
        Assign = assign;
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public String getOpenSqrBracktId() {
        return openSqrBracktId;
    }

    public void setOpenSqrBracktId(String openSqrBracktId) {
        this.openSqrBracktId = openSqrBracktId;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getCloseSqrBracktId() {
        return closeSqrBracktId;
    }

    public void setCloseSqrBracktId(String closeSqrBracktId) {
        this.closeSqrBracktId = closeSqrBracktId;
    }
}
