package Visitors.PageVisitors;

import Models.PageModels.Body;
import Models.PageModels.BodyAttribute;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;
import org.antlr.v4.runtime.misc.Pair;

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
            Pair<String, Object> pair = new Pair<>(ctx.text().FILE_NAME_ID().getText(), body);
            if (!CustomPair.containPair(pair, ProjectMain.symbolTablePage)) {
                textVisitor = new TextVisitor();
                bodyAttribute.setText(textVisitor.visitText(ctx.text()));
                ProjectMain.symbolTablePage.add(pair);
            }
        }
        if (ctx.textField() != null) {
            Pair<String, Object> pair = new Pair<>(ctx.textField().FILE_NAME_ID().getText(), body);
            if (!CustomPair.containPair(pair, ProjectMain.symbolTablePage)) {
                textFieldVisitor = new TextFieldVisitor();
                bodyAttribute.setTextField(textFieldVisitor.visitTextField(ctx.textField()));
                ProjectMain.symbolTablePage.add(pair);
            }
        }

        if (ctx.button() != null) {
            Pair<String, Object> pair = new Pair<>(ctx.button().FILE_NAME_ID().getText(), body);
            if (!CustomPair.containPair(pair, ProjectMain.symbolTablePage)) {
                buttonVisitor = new ButtonVisitor();
                bodyAttribute.setButton(buttonVisitor.visitButton(ctx.button()));
                ProjectMain.symbolTablePage.add(pair);
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
            Pair<String, Object> pair = new Pair<>(ctx.radioGroup().FILE_NAME_ID().get(0).getText(), body);
            if (!CustomPair.containPair(pair, ProjectMain.symbolTablePage)) {
                radioGroupVisitor = new RadioGroupVisitor();
                bodyAttribute.setRadioGroup(radioGroupVisitor.visitRadioGroup(ctx.radioGroup()));
                ProjectMain.symbolTablePage.add(pair);
            }
        }

        if (ctx.form() != null) {
            formVisitor = new FormVisitor();
            bodyAttribute.setForm(formVisitor.visitForm(ctx.form()));
        }

        return bodyAttribute;
    }
}
