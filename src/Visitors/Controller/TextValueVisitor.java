package Visitors.Controller;

import Models.TextValue;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class TextValueVisitor extends DSLParserBaseVisitor {

    TextValue textValue;


    public TextValue visitTextValue(DSLParser.TextValueContext ctx) {

        textValue = new TextValue();

        if (ctx.TEXTNUM() != null)
        textValue.setTextNum(ctx.TEXTNUM().getText());
        if (ctx.TEXT() != null)
            textValue.setText(ctx.TEXT().getText());

        return textValue;
    }
}
