package Models;

import Models.PageModels.PageStructure;

import java.util.LinkedHashMap;
import java.util.Map;

/* This is the main model */
public class DSLDocument extends Printer {

    PageStructure pageStructure;


    public PageStructure getPageStructure() {
        return pageStructure;
    }

    public void setPageStructure(PageStructure pageStructure) {
        this.pageStructure = pageStructure;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("DSLDocument", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","DSLDocument");
        if(pageStructure != null)
        map.put("pageStructure",pageStructure.toMap());
//        if(controllerElement != null)
//        map.put("controllerElement",controllerElement.toMap());

        return map;
    }
}
