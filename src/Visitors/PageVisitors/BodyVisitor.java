package Visitors.PageVisitors;

import Models.PageModels.Body;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class BodyVisitor extends DSLParserBaseVisitor {

    Body body;

    BodyAttributeVisitor bodyAttributeVisitor;

    @Override
    public Body visitBody(DSLParser.BodyContext ctx){
        body = new Body();

        if(ctx.bodyAttributes() != null){
            for (int i = 0; i < ctx.bodyAttributes().size(); i++) {
                body.getBodyAttributes().add(bodyAttributeVisitor.visitBodyAttributes(ctx.bodyAttributes(i), body));
            }
        }

        return body;
    }
}
