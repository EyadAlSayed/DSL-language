package Models.PageModels;

import Models.Printer;

import java.util.LinkedHashMap;
import java.util.Map;

public class BodyAttribute extends Printer {

    Header header;
    Text text;
    TextField textField;
    RadioGroup radioGroup;
    Button button;
    Form form;
    Checkbox checkbox;
    ImageModel image;

    public ImageModel getImage() {
        return image;
    }

    public void setImage(ImageModel image) {
        this.image = image;
    }

    public Checkbox getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(Checkbox checkbox) {
        this.checkbox = checkbox;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public TextField getTextField() {
        return textField;
    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }

    public RadioGroup getRadioGroup() {
        return radioGroup;
    }

    public void setRadioGroup(RadioGroup radioGroup) {
        this.radioGroup = radioGroup;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
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
        if(header != null)
            map.put("Header",header.toMap());
        if(text != null)
            map.put("Text",text.toMap());
        if (textField != null)
            map.put("TextField",textField.toMap());
        if (radioGroup != null)
            map.put("RadioGroup",radioGroup.toMap());
        if (button != null)
            map.put("Button",button.toMap());
        if (form != null)
            map.put("Form",form.toMap());
        if(checkbox != null)
            map.put("CheckBox",checkbox.toMap());
        if(image != null)
            map.put("Image", image.toMap());

        return map;
    }
}
