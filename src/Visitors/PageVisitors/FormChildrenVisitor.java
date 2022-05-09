package Visitors.PageVisitors;

import Models.PageModels.*;
import gen.*;


public class FormChildrenVisitor {

    private AttributeVisitor attributeVisitor;

    public FormChildrenVisitor() {
        this.attributeVisitor = new AttributeVisitor();
    }


    public Node visitChildren(DSLParser.ChildrenContext ctx, Form form) {

        if (ctx.text_input() != null)
            return visitText_input(ctx.text_input(),form);

        else if (ctx.email_input() != null)
            return visitEmail_input(ctx.email_input(),form);

        else if (ctx.password_input() != null)
            return visitPassword_input(ctx.password_input(),form);

        else if (ctx.radio_group() != null)
            return visitRadio_group(ctx.radio_group(),form);

        else if (ctx.radio_input() != null)
            return visitRadio_input(ctx.radio_input(),form);

        else if (ctx.checkbox_input() != null)
            return visitCheckbox_input(ctx.checkbox_input(),form);

        else if (ctx.submit_button() != null)
            return visitSubmit_button(ctx.submit_button(),form);

        return new Node();
    }


    public TextField visitText_input(DSLParser.Text_inputContext ctx, Form form) {
        TextField textField = new TextField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                textField.getAttributes().add(attributeVisitor.visitAttribute(attribute,form));
            }


        return textField;
    }



    public EmailField visitEmail_input(DSLParser.Email_inputContext ctx, Form form) {
        EmailField emailField = new EmailField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                emailField.getAttributes().add(attributeVisitor.visitAttribute(attribute,form));
            }
        return emailField;
    }


    public PasswordField visitPassword_input(DSLParser.Password_inputContext ctx, Form form) {
        PasswordField passwordField = new PasswordField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                passwordField.getAttributes().add(attributeVisitor.visitAttribute(attribute,form));
            }
        return passwordField;
    }


    public RadioGroup visitRadio_group(DSLParser.Radio_groupContext ctx, Form form) {
        RadioGroup radioGroup = new RadioGroup();
        if (ctx.NAME() != null)
           radioGroup.setName(ctx.NAME().getText());

        if(ctx.TEXT() != null)
            radioGroup.setNameValue(ctx.TEXT().getText());

        if (ctx.radio_input() != null)
            for (DSLParser.Radio_inputContext radio : ctx.radio_input()) {
                radioGroup.getFields().add(visitRadio_input(radio, form));
            }
        return radioGroup;
    }


    public RadioField visitRadio_input(DSLParser.Radio_inputContext ctx, Form form) {
        RadioField radioField = new RadioField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                radioField.getAttributes().add(attributeVisitor.visitAttribute(attribute,form));
            }
        return radioField;
    }


    public CheckBoxField visitCheckbox_input(DSLParser.Checkbox_inputContext ctx, Form form) {
        CheckBoxField checkBoxField = new CheckBoxField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                checkBoxField.getAttributes().add(attributeVisitor.visitAttribute(attribute,form));
            }
        return checkBoxField;
    }


    public SubmitButton visitSubmit_button(DSLParser.Submit_buttonContext ctx, Form form) {
        SubmitButton submitButton = new SubmitButton();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                submitButton.getAttributes().add(attributeVisitor.visitAttribute(attribute,form));
            }
        return submitButton;
    }

}
