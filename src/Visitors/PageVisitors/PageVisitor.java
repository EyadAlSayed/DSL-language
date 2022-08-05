package Visitors.PageVisitors;

import Models.PageModels.PageStructure;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class PageVisitor extends DSLParserBaseVisitor {

    PageStructure pageStructure = new PageStructure();

    BodyVisitor bodyVisitor = new BodyVisitor();

    @Override
    public PageStructure visitPageStructure(DSLParser.PageStructureContext ctx) {
        pageStructure = new PageStructure();

        if (ctx.PAGE() != null)
            pageStructure.setPAGE(ctx.PAGE().getText());
        if (ctx.FILE_NAME_ID() != null) {
            ProjectMain.PAGE_NAME = ctx.FILE_NAME_ID(0).getText();
            pageStructure.setPAGE_NAME(ctx.FILE_NAME_ID(0).getText());
        }

        if (ctx.body() != null)
            pageStructure.setBody(bodyVisitor.visitBody(ctx.body()));
        if (ctx.FILE_NAME_ID(1) != null)
            pageStructure.setCONTROLLER(ctx.FILE_NAME_ID(1).getText());

        return pageStructure;
    }
}
