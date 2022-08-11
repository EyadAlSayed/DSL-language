package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class InputAttribute extends Printer {

    String TEXT;
    String EMAIL;
    String PASSWORD;
    String DATE;

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("TextFieldAttribute", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","TextFieldAttribute");
        if(TEXT != null)
            map.put("TEXT",TEXT);
        if(EMAIL != null)
            map.put("Email",EMAIL);
        if(PASSWORD != null)
            map.put("Password",PASSWORD);
        if(DATE != null)
            map.put("Date",DATE);

        return map;

    }
}
