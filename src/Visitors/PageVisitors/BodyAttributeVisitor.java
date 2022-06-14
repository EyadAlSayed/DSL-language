package Visitors.PageVisitors;

import Models.PageModels.BodyAttribute;
import Models.PageModels.Button;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class BodyAttributeVisitor extends DSLParserBaseVisitor {

    BodyAttribute bodyAttribute;

    HeaderVisitor headerVisitor;
    TextVisitor textVisitor;
    TextFieldVisitor textFieldVisitor;
    ButtonVisitor buttonVisitor;
    RadioGroupVisitor radioGroupVisitor;
    FormVisitor formVisitor;
    CheckboxVisitor checkboxVisitor;
    DropDownVisitor dropDownVisitor;

    @Override
    public BodyAttribute visitBodyAttributes(DSLParser.BodyAttributesContext ctx) {

        bodyAttribute = new BodyAttribute();

        if (ctx.headerStructure() != null) {
            headerVisitor = new HeaderVisitor();
            bodyAttribute.setHeader(headerVisitor.visitHeaderStructure(ctx.headerStructure()));
        }
        if (ctx.text() != null) {
            if (CustomPair.containVariable(ctx.text().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage) == null) {
                textVisitor = new TextVisitor();
                bodyAttribute.setText(textVisitor.visitText(ctx.text()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getText());
            } else {
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.text().FILE_NAME_ID().getText() + " ALREADY EXISTS!\n", StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (ctx.textField() != null) {
            if (CustomPair.containVariable(ctx.textField().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage) == null) {
                textFieldVisitor = new TextFieldVisitor();
                bodyAttribute.setTextField(textFieldVisitor.visitTextField(ctx.textField()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getTextField());
            } else {
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.textField().FILE_NAME_ID().getText() + " ALREADY EXISTS!\n", StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (ctx.button() != null) {
            if (CustomPair.containVariable(ctx.button().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage) == null) {
                buttonVisitor = new ButtonVisitor();
                bodyAttribute.setButton(buttonVisitor.visitButton(ctx.button()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getButton());
            } else {
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.button().FILE_NAME_ID().getText() + " ALREADY EXISTS!\n", StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            ProjectMain.ERROR = true;
        }

        if (ctx.radioGroup() != null) {
            if (CustomPair.containVariable(ctx.radioGroup().FILE_NAME_ID(0).getText(), ProjectMain.symbolTablePage) == null) {
                radioGroupVisitor = new RadioGroupVisitor();
                bodyAttribute.setRadioGroup(radioGroupVisitor.visitRadioGroup(ctx.radioGroup()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getRadioGroup());
            } else {
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.radioGroup().FILE_NAME_ID(0).getText() + " ALREADY EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            ProjectMain.ERROR = true;
        }
        if (ctx.buttonSend() != null) {
            Object button = CustomPair.containVariable(ctx.buttonSend().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage);
            if (button instanceof Button)
                ((Button) button).setSendValue(ctx.buttonSend().TEXT().getText());

            else {
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.buttonSend().FILE_NAME_ID().getText() + " IS EITHER NULL OR IS NOT BUTTON\n", StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } else {
            ProjectMain.ERROR = true;
        }

        if (ctx.checkbox() != null) {
            if (CustomPair.containVariable(ctx.checkbox().FILE_NAME_ID(0).getText(), ProjectMain.symbolTablePage) == null) {
                checkboxVisitor = new CheckboxVisitor();
                bodyAttribute.setCheckbox(checkboxVisitor.visitCheckbox(ctx.checkbox()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getCheckbox());
            } else {
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.checkbox().FILE_NAME_ID(0).getText() + " ALREADY EXISTS!\n", StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (ctx.form() != null) {

            formVisitor = new FormVisitor();
            bodyAttribute.setForm(formVisitor.visitForm(ctx.form()));
        }

        if (ctx.dropDown() != null) {
            if (CustomPair.containVariable(ctx.dropDown().FILE_NAME_ID(0).getText(), ProjectMain.symbolTablePage) == null) {
                dropDownVisitor = new DropDownVisitor();
                bodyAttribute.setDropDown(dropDownVisitor.visitDropDown(ctx.dropDown()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getDropDown());
            } else {
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.dropDown().FILE_NAME_ID(0).getText() + " ALREADY EXISTS!\n", StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return bodyAttribute;
    }
}
