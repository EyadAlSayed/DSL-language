package Visitors.PageVisitors;

import Models.PageModels.Body;
import Models.PageModels.BodyAttribute;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;
import org.antlr.v4.runtime.misc.Pair;

public class BodyAttributeVisitor extends DSLParserBaseVisitor {

    BodyAttribute bodyAttribute;

    HeaderVisitor headerVisitor;
    TextVisitor textVisitor;
    TextFieldVisitor textFieldVisitor;
    ButtonVisitor buttonVisitor;
    RadioGroupVisitor radioGroupVisitor;
    FormVisitor formVisitor;


    public BodyAttribute visitBodyAttributes(DSLParser.BodyAttributesContext ctx, Body body){

        bodyAttribute = new BodyAttribute();

        if(ctx.headerStructure() != null) {
            headerVisitor = new HeaderVisitor();
            bodyAttribute.setHeader(headerVisitor.visitHeaderStructure(ctx.headerStructure()));
        }
        if(ctx.text() != null) {
            Pair<String, Object> pair = new Pair<>(ctx.text().FILE_NAME_ID().getText(), body);
            if (!CustomPair.containPair(pair, ProjectMain.symbolTablePage)) {
                textVisitor = new TextVisitor();
                bodyAttribute.setText(textVisitor.visitText(ctx.text()));
                ProjectMain.symbolTablePage.add(pair);
            }
        }
        if(ctx.textField() != null) {
            Pair<String, Object> pair = new Pair<>(ctx.textField().FILE_NAME_ID().getText(), body);
            if (!CustomPair.containPair(pair, ProjectMain.symbolTablePage)) {
                textFieldVisitor = new TextFieldVisitor();
                bodyAttribute.setTextField(textFieldVisitor.visitTextField(ctx.textField()));
                ProjectMain.symbolTablePage.add(pair);
            }
        }

        if(ctx.button() != null) {
            buttonVisitor = new ButtonVisitor();
            bodyAttribute.setButton(buttonVisitor.visitButton(ctx.button()));
        }

        if(ctx.radioGroup() != null){
            radioGroupVisitor = new RadioGroupVisitor();
            bodyAttribute.setRadioGroup(radioGroupVisitor.visitRadioGroup(ctx.radioGroup()));
        }

        if(ctx.form() != null){
            formVisitor = new FormVisitor();
            bodyAttribute.setForm(formVisitor.visitForm(ctx.form()));
        }

        return bodyAttribute;
    }
}
