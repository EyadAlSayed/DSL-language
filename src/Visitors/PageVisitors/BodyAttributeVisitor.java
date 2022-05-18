package Visitors.PageVisitors;

import Models.ControllerModels.PageModels.Body;
import Models.ControllerModels.PageModels.BodyAttribute;
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

        return bodyAttribute;
    }
}
