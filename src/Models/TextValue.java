package Models;

import java.util.LinkedHashMap;
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
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("TextValue",toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {

        Map<String,Object> map = new LinkedHashMap<>();
        map.put("label","TextValue");
        if (text != null)
           map.put("text",text);
        if(textNum != null)
            map.put("textNum",textNum);
        return map;
    }
}
