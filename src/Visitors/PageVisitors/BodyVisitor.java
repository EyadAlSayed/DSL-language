package Visitors.PageVisitors;

import Models.PageModels.BodyAttribute;
import Models.PageModels.BodyStructure;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;


// TODO: Uncomment comments when 'FormVisitor' class is complete.
public class BodyVisitor extends DSLParserBaseVisitor {

    BodyStructure bodyStructure;
    TextVisitor textVisitor;
    // FormVisitor formVisitor;

    @Override
    public BodyStructure visitBody(DSLParser.BodyContext ctx){

        bodyStructure = new BodyStructure();

        if(ctx.BODY_DEF_ID() != null)
            bodyStructure.setBODY(ctx.BODY_DEF_ID().getText());
        for(int i = 0; i < ctx.bodyAttribute().size(); i++){
            bodyStructure.getBodyAttributes().add(visitBodyAttribute(ctx.bodyAttribute(i)));
        }
        if(ctx.BODY_DEF_END_ID() != null)
            bodyStructure.setEND_BODY(ctx.BODY_DEF_END_ID().getText());

        return bodyStructure;
    }

    @Override
    public BodyAttribute visitBodyAttribute(DSLParser.BodyAttributeContext ctx){

        BodyAttribute bodyAttribute = new BodyAttribute();

        if(ctx.text() != null)
            bodyAttribute.setTextBodyAttribute(textVisitor.visitText(ctx.text()));
//        if(ctx.form() != null)
//            bodyAttribute.setFormBodyAttribute(/*formVisitor.visitForm(ctx.form())*/);

        return bodyAttribute;

    }
}
