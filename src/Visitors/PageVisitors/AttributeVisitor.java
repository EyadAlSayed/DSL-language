package Visitors.PageVisitors;

import Models.PageModels.Attribute;
import gen.DSLParser;

public class AttributeVisitor {
    //  @Override
    public Attribute visitAttribute(DSLParser.AttributeContext ctx) {
        Attribute attribute = new Attribute();

        if (ctx.NAME() != null)
            attribute.setName(ctx.TEXT().getText());

        else if (ctx.TEXT_DEF() != null)
            attribute.setText(ctx.TEXT().getText());

        else if (ctx.VALUE() != null)
            attribute.setValue(ctx.TEXT().getText());

        return attribute;
    }
}
