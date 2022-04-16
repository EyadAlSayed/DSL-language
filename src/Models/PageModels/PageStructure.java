package Models.PageModels;


//TODO Complete this model
public class PageStructure {

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
}