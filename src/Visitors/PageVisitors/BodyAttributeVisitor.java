package Visitors.PageVisitors;

import Models.PageModels.Body;
import Models.PageModels.BodyAttribute;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

import java.io.IOException;
import java.nio.file.Files;

public class BodyAttributeVisitor extends DSLParserBaseVisitor {

    BodyAttribute bodyAttribute;

    HeaderVisitor headerVisitor;
    TextVisitor textVisitor;
    TextFieldVisitor textFieldVisitor;
    ButtonVisitor buttonVisitor;
    RadioGroupVisitor radioGroupVisitor;
    FormVisitor formVisitor;


    public BodyAttribute visitBodyAttributes(DSLParser.BodyAttributesContext ctx, Body body) {

        bodyAttribute = new BodyAttribute();

        if (ctx.headerStructure() != null) {
            headerVisitor = new HeaderVisitor();
            bodyAttribute.setHeader(headerVisitor.visitHeaderStructure(ctx.headerStructure()));
        }
        if (ctx.text() != null) {
            if (!CustomPair.containVariable(ctx.text().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage)) {
                textVisitor = new TextVisitor();
                bodyAttribute.setText(textVisitor.visitText(ctx.text()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getText());
            }
        }
        if (ctx.textField() != null) {
            if (!CustomPair.containVariable(ctx.textField().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage)) {
                textFieldVisitor = new TextFieldVisitor();
                bodyAttribute.setTextField(textFieldVisitor.visitTextField(ctx.textField()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getTextField());
            }
        }

        if (ctx.button() != null) {
            if (!CustomPair.containVariable(ctx.button().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage)) {
                buttonVisitor = new ButtonVisitor();
                bodyAttribute.setButton(buttonVisitor.visitButton(ctx.button()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getButton());
            }else {
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.FILE.toPath(),"SEMANTIC ERROR: VARIABLE "+ctx.button().FILE_NAME_ID().getText()+" ALREADY EXIST!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }else
        {
            ProjectMain.ERROR=true;
        }

        if (ctx.radioGroup() != null) {
            if (!CustomPair.containVariable(ctx.radioGroup().FILE_NAME_ID(0).getText(), ProjectMain.symbolTablePage)) {
                radioGroupVisitor = new RadioGroupVisitor();
                bodyAttribute.setRadioGroup(radioGroupVisitor.visitRadioGroup(ctx.radioGroup()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getRadioGroup());
            }else {
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.FILE.toPath(),"SEMANTIC ERROR: VARIABLE "+ctx.radioGroup().FILE_NAME_ID(0).getText()+" ALREADY EXIST!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (ctx.form() != null) {
            formVisitor = new FormVisitor();
            bodyAttribute.setForm(formVisitor.visitForm(ctx.form()));
        }

        return bodyAttribute;
    }
}
