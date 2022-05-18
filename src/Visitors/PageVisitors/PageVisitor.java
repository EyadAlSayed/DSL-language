package Visitors.PageVisitors;

import Models.ControllerModels.PageModels.PageStructure;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class PageVisitor extends DSLParserBaseVisitor {

    PageStructure pageStructure;

    BodyVisitor bodyVisitor;

    @Override
    public PageStructure visitPageStructure(DSLParser.PageStructureContext ctx){
        pageStructure = new PageStructure();

        if(ctx.PAGE() != null)
            pageStructure.setPAGE(ctx.PAGE().getText());
        if(ctx.FILE_NAME_ID() != null)
            pageStructure.setPAGE_NAME(ctx.FILE_NAME_ID().getText());
        if(ctx.body() != null)
            pageStructure.setBody(bodyVisitor.visitBody(ctx.body()));

        return pageStructure;
    }
}
