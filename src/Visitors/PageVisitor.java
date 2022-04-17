package Visitors;

import Models.PageModels.HeaderStructure;
import Models.PageModels.PageStructure;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class PageVisitor extends DSLParserBaseVisitor {

    PageStructure pageStructure;
    HeaderStructure headerStructure;
    BodyVisitor bodyVisitor;
    ValueVisitor valueVisitor;

    @Override
    public PageStructure visitPageStructure(DSLParser.PageStructureContext ctx){

        pageStructure = new PageStructure();

        if(ctx.PAGE() != null)
            pageStructure.setPAGE(ctx.PAGE().getText());
        if(ctx.FILE_NAME_ID() != null)
            pageStructure.setPAGE_NAME(ctx.FILE_NAME_ID().getText());
        if(ctx.headerStructure() != null)
            pageStructure.setHeaderStructure(visitHeaderStructure(ctx.headerStructure()));
        if(ctx.body() != null)
            pageStructure.setBodyStructure(bodyVisitor.visitBody(ctx.body()));
        if(ctx.END_PAGE() != null)
            pageStructure.setEND_PAGE(ctx.END_PAGE().getText());

        return pageStructure;
    }

    @Override
    public HeaderStructure visitHeaderStructure(DSLParser.HeaderStructureContext ctx){

        headerStructure = new HeaderStructure();

        if(ctx.HEADER() != null)
            headerStructure.setHEADER(ctx.HEADER().getText());
        if(ctx.value() != null)
            headerStructure.setValue(valueVisitor.visitValue(ctx.value()));
        if(ctx.ENDHEADER() != null)
            headerStructure.setEND_HEADER(ctx.ENDHEADER().getText());

        return headerStructure;
    }
}
