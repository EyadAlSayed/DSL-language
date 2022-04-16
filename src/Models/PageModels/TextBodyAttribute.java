package Models.PageModels;

public class TextBodyAttribute {

    String TEXT;
    TextName textName;
    Value value;
    String END_TEXT;

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }

    public TextName getTextName() {
        return textName;
    }

    public void setTextName(TextName textName) {
        this.textName = textName;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getEND_TEXT() {
        return END_TEXT;
    }

    public void setEND_TEXT(String END_TEXT) {
        this.END_TEXT = END_TEXT;
    }
}
