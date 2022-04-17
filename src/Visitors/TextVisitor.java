package Visitors;

import Models.PageModels.TextBodyAttribute;
import Models.PageModels.TextName;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class TextVisitor extends DSLParserBaseVisitor {

    TextBodyAttribute textBodyAttribute;
    ValueVisitor valueVisitor;

    @Override
    public TextBodyAttribute visitText(DSLParser.TextContext ctx){

        textBodyAttribute = new TextBodyAttribute();

        if(ctx.TEXT_DEF_ID() != null)
            textBodyAttribute.setTEXT(ctx.TEXT_DEF_ID().getText());
        if(ctx.textName() != null)
            textBodyAttribute.setTextName(visitTextName(ctx.textName()));
        if(ctx.value() != null)
            textBodyAttribute.setValue(valueVisitor.visitValue(ctx.value()));
        if(ctx.value() != null)
            textBodyAttribute.setEND_TEXT(ctx.TEXT_DEF_END_ID().getText());

        return textBodyAttribute;
    }

    @Override
    public TextName visitTextName(DSLParser.TextNameContext ctx){

        textBodyAttribute.setTextName(new TextName());

        if(ctx.NAME() != null)
            textBodyAttribute.getTextName().setNAME(ctx.NAME().getText());
        if(ctx.ASSIGN() != null)
            textBodyAttribute.getTextName().setASSIGN(ctx.ASSIGN().getText());
        if(ctx.TEXT() != null)
            textBodyAttribute.getTextName().setTEXT(ctx.TEXT().getText());

        return textBodyAttribute.getTextName();
    }
}
