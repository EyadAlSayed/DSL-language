package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class ImageModel extends Printer {

    String IMAGE;
    String VALUE;

    public String getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(String IMAGE) {
        this.IMAGE = IMAGE;
    }

    public String getVALUE() {
        return VALUE;
    }

    public void setVALUE(String VALUE) {
        this.VALUE = VALUE;
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();

        map.put("label","Image");
        if (IMAGE != null)
            map.put("Text",IMAGE);
        if (VALUE != null)
            map.put("Value",VALUE);

        return map;
    }
}
