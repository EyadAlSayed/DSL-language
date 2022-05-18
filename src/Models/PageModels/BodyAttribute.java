package Models.PageModels;

import Models.Printer;

import java.util.Map;

public class BodyAttribute extends Printer {

    Header header;
    Text text;
    TextField textField;
    RadioGroup radioGroup;
    Button button;
    Form form;

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
        return null;
    }
}
