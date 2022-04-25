package Visitors.PageVisitors;

import Models.PageModels.*;
import Visitors.BaseVisitor;
import gen.*;


public class FormChildrenVisitor extends BaseVisitor {

    private AttributeVisitor attributeVisitor = new AttributeVisitor();

    public FormChildrenVisitor() {
        this.attributeVisitor = new AttributeVisitor();
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



    // @Override
    public TextField visitText_input(DSLParser.Text_inputContext ctx) {
        TextField textField = new TextField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                textField.getAttributes().add(attributeVisitor.visitAttribute(attribute));
            }


        return textField;
    }


    // @Override
    public EmailField visitEmail_input(DSLParser.Email_inputContext ctx) {
        EmailField emailField = new EmailField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                emailField.getAttributes().add(attributeVisitor.visitAttribute(attribute));
            }
        return emailField;
    }

    // @Override
    public PasswordField visitPassword_input(DSLParser.Password_inputContext ctx) {
        PasswordField passwordField = new PasswordField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                passwordField.getAttributes().add(attributeVisitor.visitAttribute(attribute));
            }
        return passwordField;
    }

    //   @Override
    public RadioGroup visitRadio_group(DSLParser.Radio_groupContext ctx) {
        RadioGroup radioGroup = new RadioGroup();
        if (ctx.NAME() != null)
           radioGroup.setName(ctx.NAME().getText());

        if(ctx.TEXT() != null)
            radioGroup.setNameValue(ctx.TEXT().getText());

        if (ctx.radio_input() != null)
            for (DSLParser.Radio_inputContext radio : ctx.radio_input()) {
                radioGroup.getFields().add(visitRadio_input(radio));
            }
        return radioGroup;
    }

    //   @Override
    public RadioField visitRadio_input(DSLParser.Radio_inputContext ctx) {
        RadioField radioField = new RadioField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                radioField.getAttributes().add(attributeVisitor.visitAttribute(attribute));
            }
        return radioField;
    }

    //  @Override
    public CheckBoxField visitCheckbox_input(DSLParser.Checkbox_inputContext ctx) {
        CheckBoxField checkBoxField = new CheckBoxField();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                checkBoxField.getAttributes().add(attributeVisitor.visitAttribute(attribute));
            }
        return checkBoxField;
    }

    // @Override
    public SubmitButton visitSubmit_button(DSLParser.Submit_buttonContext ctx) {
        SubmitButton submitButton = new SubmitButton();
        if (ctx.attribute() != null)
            for (DSLParser.AttributeContext attribute : ctx.attribute()) {
                submitButton.getAttributes().add(attributeVisitor.visitAttribute(attribute));
            }
        return submitButton;
    }

}
