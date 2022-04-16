package Models.PageModels;

public class HeaderStructure {

    String HEADER;
    Value value;
    String END_HEADER;

    public String getHEADER() {
        return HEADER;
    }

    public void setHEADER(String HEADER) {
        this.HEADER = HEADER;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getEND_HEADER() {
        return END_HEADER;
    }

    public void setEND_HEADER(String END_HEADER) {
        this.END_HEADER = END_HEADER;
    }
}
