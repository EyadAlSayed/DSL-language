package Visitors.PageVisitors;

import Models.PageModels.BodyAttribute;
import Models.PageModels.BodyStructure;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;
import org.antlr.v4.runtime.misc.Pair;


public class BodyVisitor extends DSLParserBaseVisitor {

    BodyStructure bodyStructure = new BodyStructure();
    TextVisitor textVisitor = new TextVisitor();
    FormVisitor formVisitor = new FormVisitor();

    @Override
    public BodyStructure visitBody(DSLParser.BodyContext ctx) {

        bodyStructure = new BodyStructure();

        if (ctx.BODY_DEF_ID() != null)
            bodyStructure.setBODY(ctx.BODY_DEF_ID().getText());
        for (int i = 0; i < ctx.bodyAttribute().size(); i++) {
            bodyStructure.getBodyAttributes().add(visitBodyAttribute(ctx.bodyAttribute(i), bodyStructure));
        }
        if (ctx.BODY_DEF_END_ID() != null)
            bodyStructure.setEND_BODY(ctx.BODY_DEF_END_ID().getText());

        return bodyStructure;
    }


    public BodyAttribute visitBodyAttribute(DSLParser.BodyAttributeContext ctx, BodyStructure body) {

        BodyAttribute bodyAttribute = new BodyAttribute();

        //Caesar
        if (ctx.text() != null) {
            Pair<String, Object> pair = new Pair<>(ctx.text().textName().TEXT().getText(), body);
            if (!CustomPair.containPair(pair, ProjectMain.symbolTablePage)) {
                bodyAttribute.setTextBodyAttribute(textVisitor.visitText(ctx.text()));
                ProjectMain.symbolTablePage.add(new Pair<>(ctx.text().textName().TEXT().getText(), body));
            }
        } //endCaesar
            if (ctx.form() != null)
            bodyAttribute.setFormBodyAttribute(formVisitor.visitForm(ctx.form()));

        return bodyAttribute;

    }
}
