package Models;

import java.util.Map;

public class TextValue  extends Printer{
    String text;
    String textNum;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextNum() {
        return textNum;
    }

    public void setTextNum(String textNum) {
        this.textNum = textNum;
    }

    @Override
    public Map<String, Object> toMap() {
        return null;
    }
}
