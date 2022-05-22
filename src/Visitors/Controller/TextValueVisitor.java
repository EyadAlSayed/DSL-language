package Visitors.Controller;

import Models.TextValue;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class TextValueVisitor extends DSLParserBaseVisitor {

    TextValue textValue = new TextValue();


    public TextValue visitTextValue(DSLParser.TextValueContext ctx) {

        if (ctx.TEXTNUM() != null)
        textValue.setTextNum(ctx.TEXTNUM().getText());
        if (ctx.TEXT() != null)
            textValue.setText(ctx.TEXT().getText());

        return textValue;
    }
}
