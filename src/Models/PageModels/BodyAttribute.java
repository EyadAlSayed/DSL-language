package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class BodyAttribute extends Printer {

    TextBodyAttribute textBodyAttribute;
    Form formBodyAttribute;

    public TextBodyAttribute getTextBodyAttribute() {
        return textBodyAttribute;
    }

    public void setTextBodyAttribute(TextBodyAttribute textBodyAttribute) {
        this.textBodyAttribute = textBodyAttribute;
    }

    public Form getFormBodyAttribute() {
        return formBodyAttribute;
    }

    public void setFormBodyAttribute(Form formBodyAttribute) {
        this.formBodyAttribute = formBodyAttribute;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = getPrettyString("BodyAttribute", toMap());
        return stringBuilder.toString();
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("label","BodyAttribute");
        if(textBodyAttribute != null)
            map.put("textBodyAttribute",textBodyAttribute.toMap());
        if(formBodyAttribute != null)
            map.put("formBodyAttribute",formBodyAttribute.toMap());

        return map;
    }
}
