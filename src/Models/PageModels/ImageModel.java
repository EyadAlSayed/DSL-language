package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class ImageModel extends Printer {

    String IMAGE;
    String VALUE;
    int[] MARGINS;

    public String getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(String IMAGE) {
        this.IMAGE = IMAGE;
    }

    public int[] getMARGINS() {
        return MARGINS;
    }

    public void setMARGINS(int[] MARGINS) {
        this.MARGINS = MARGINS;
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
        if(MARGINS != null){
            map.put("Top Margin", MARGINS[0]);
            map.put("Right Margin", MARGINS[1]);
            map.put("Bottom Margin", MARGINS[2]);
            map.put("Left Margin", MARGINS[3]);
        }
        return map;
    }
}
