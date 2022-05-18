package Models.ControllerModels.PageModels;

import Models.Printer;

import java.util.Map;

public class Header extends Printer {

    String TITLE;
    String VALUE;

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getVALUE() {
        return VALUE;
    }

    public void setVALUE(String VALUE) {
        this.VALUE = VALUE;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("Header", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        return null;
    }
}
