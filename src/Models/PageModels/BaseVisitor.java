package Models.PageModels;


import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class BaseVisitor extends DSLParserBaseVisitor {
    @Override
    public Form visitForm(DSLParser.FormContext ctx) {
        Form form = new Form();
        if (ctx.POST_FORM() != null)
            form.setMethod("POST");
        else if (ctx.GET_FORM() != null)
            form.setMethod("GET");

        if (ctx.form_attribute() != null) {
            for (DSLParser.Form_attributeContext form_attribute : ctx.form_attribute()) {
                if (form_attribute.ACTION() != null)
                    form.setAction(form_attribute.TEXT().getText());
            }
        }

        if (ctx.children() != null) {
            for (DSLParser.ChildrenContext child : ctx.children())
                form.getNodes().add(visitChildren(child));
        }
        return form;
    }

    @Override
    public Node visitChildren(DSLParser.ChildrenContext ctx) {

        if (ctx.text_input() != null)
            return visitText_input(ctx.text_input());

        else if (ctx.email_input() != null)
            return visitEmail_input(ctx.email_input());

        else if (ctx.password_input() != null)
            return visitPassword_input(ctx.password_input());

        else if (ctx.radio_group() != null)
            return visitRadio_group(ctx.radio_group());

        else if (ctx.radio_input() != null)
            return visitRadio_input(ctx.radio_input());

        else if (ctx.checkbox_input() != null)
            return visitCheckbox_input(ctx.checkbox_input());

        else if (ctx.submit_button() != null)
            return visitSubmit_button(ctx.submit_button());

        return new Node();
    }

    @Override
    public Attribute visitAttribute(DSLParser.AttributeContext ctx) {
        Attribute attribute = new Attribute();

        if (ctx.NAME() != null)
            attribute.setName(ctx.TEXT().getText());

        else if (ctx.TEXT_DEF() != null)
            attribute.setText(ctx.TEXT().getText());

        else if (ctx.VALUE() != null)
            attribute.setValue(ctx.TEXT().getText());

        return attribute;
    }

    @Override
    public TextField visitText_input(DSLParser.Text_inputContext ctx) {
        TextField textField = new TextField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                textField.getAttributes().add(visitAttribute(attribute));
            }


        return textField;
    }


    @Override
    public EmailField visitEmail_input(DSLParser.Email_inputContext ctx) {
        EmailField emailField = new EmailField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                emailField.getAttributes().add(visitAttribute(attribute));
            }
        return emailField;
    }

    @Override
    public PasswordField visitPassword_input(DSLParser.Password_inputContext ctx) {
        PasswordField passwordField = new PasswordField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                passwordField.getAttributes().add(visitAttribute(attribute));
            }
        return passwordField;
    }

    @Override
    public RadioGroup visitRadio_group(DSLParser.Radio_groupContext ctx) {
        RadioGroup radioGroup = new RadioGroup();
        if (ctx.NAME() != null)
            radioGroup.setName(ctx.TEXT().getText());

        if (ctx.radio_input() != null)
            for (DSLParser.Radio_inputContext radio : ctx.radio_input()) {
                radioGroup.getFields().add(visitRadio_input(radio));
            }
        return radioGroup;
    }

    @Override
    public RadioField visitRadio_input(DSLParser.Radio_inputContext ctx) {
        RadioField radioField = new RadioField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                radioField.getAttributes().add(visitAttribute(attribute));
            }
        return radioField;
    }

    @Override
    public CheckBoxField visitCheckbox_input(DSLParser.Checkbox_inputContext ctx) {
        CheckBoxField checkBoxField = new CheckBoxField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                checkBoxField.getAttributes().add(visitAttribute(attribute));
            }
        return checkBoxField;
    }

    @Override
    public SubmitButton visitSubmit_button(DSLParser.Submit_buttonContext ctx) {
        SubmitButton submitButton = new SubmitButton();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                submitButton.getAttributes().add(visitAttribute(attribute));
            }
        return submitButton;
    }
}
