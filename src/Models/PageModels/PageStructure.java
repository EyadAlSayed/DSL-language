package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class PageStructure extends Printer {

    String PAGE;
    String PAGE_NAME;
    Body body;

    public String getPAGE() {
        return PAGE;
    }

    public void setPAGE(String PAGE) {
        this.PAGE = PAGE;
    }

    public String getPAGE_NAME() {
        return PAGE_NAME;
    }

    public void setPAGE_NAME(String PAGE_NAME) {
        this.PAGE_NAME = PAGE_NAME;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("PageStructure", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("label","PageStructure");
        if(PAGE != null)
            map.put("Page",PAGE);
        if(PAGE_NAME != null)
            map.put("Page_name",PAGE_NAME);
        if(body != null)
            map.put("Page_Body",body.toMap());
        return map;
    }
}
