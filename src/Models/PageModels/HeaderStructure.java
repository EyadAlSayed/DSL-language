package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class HeaderStructure extends Printer {

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

    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("HeaderStructure", toMap());
        return stringBuilder.toString();    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","HeaderStructure");
        if(HEADER != null)
            map.put("Header",HEADER);
        if(value != null)
            map.put("Value",value.toMap());
        if(END_HEADER != null)
            map.put("EndHeader",END_HEADER);

        return map;
    }
}
