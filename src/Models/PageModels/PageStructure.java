package Models.PageModels;


import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class PageStructure extends Printer {

    String PAGE;
    String PAGE_NAME;
    HeaderStructure headerStructure;
    BodyStructure bodyStructure;
    String END_PAGE;

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

    public HeaderStructure getHeaderStructure() {
        return headerStructure;
    }

    public void setHeaderStructure(HeaderStructure headerStructure) {
        this.headerStructure = headerStructure;
    }

    public BodyStructure getBodyStructure() {
        return bodyStructure;
    }

    public void setBodyStructure(BodyStructure bodyStructure) {
        this.bodyStructure = bodyStructure;
    }

    public String getEND_PAGE() {
        return END_PAGE;
    }

    public void setEND_PAGE(String END_PAGE) {
        this.END_PAGE = END_PAGE;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("PageStructure", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","PageStructure");
        if(PAGE != null)
            map.put("Page",PAGE);
        if(PAGE_NAME != null)
            map.put("Page_name",PAGE_NAME);
        if (headerStructure != null)
            map.put("HeaderStructure",headerStructure.toMap());
        if (bodyStructure != null)
            map.put("BodyStructure",bodyStructure.toMap());
        if(END_PAGE!=null)
            map.put("EndPage",END_PAGE);

        return map;
    }
}