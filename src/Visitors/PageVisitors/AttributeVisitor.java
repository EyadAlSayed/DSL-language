package Visitors.PageVisitors;

import Models.PageModels.Attribute;
import Models.PageModels.Form;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;
import org.antlr.v4.runtime.misc.Pair;

public class AttributeVisitor  {
    /**
     *
     if (ctx.text() != null) {
     Pair<String, Object> pair = new Pair<>(ctx.text().textName().TEXT().getText(), body);
     if (!CustomPair.containPair(pair, ProjectMain.symbolTablePage)) {
     bodyAttribute.setTextBodyAttribute(textVisitor.visitText(ctx.text()));
     ProjectMain.symbolTablePage.add(new Pair<>(bodyAttribute.getTextBodyAttribute().getTEXT(), body));
     }
     }
     */
    public Attribute visitAttribute(DSLParser.AttributeContext ctx, Form form) {
        Attribute attribute = new Attribute();

        if (ctx.NAME() != null) {
            Pair<String, Object> pair = new Pair<>(ctx.TEXT().getText(), form);
            if (!CustomPair.containPair(pair, ProjectMain.symbolTablePage)) {
                attribute.setName(ctx.TEXT().getText());
                ProjectMain.symbolTablePage.add(new Pair<>(attribute.getName(), form));
            }

        }

        else if (ctx.TEXT_DEF() != null)
            attribute.setText(ctx.TEXT().getText());

        else if (ctx.VALUE() != null)
            attribute.setValue(ctx.TEXT().getText());

        return attribute;
    }
}
