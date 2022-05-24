package Visitors.PageVisitors;

import Models.PageModels.PageStructure;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class PageVisitor extends DSLParserBaseVisitor {

    PageStructure pageStructure = new PageStructure();

    BodyVisitor bodyVisitor = new BodyVisitor();

    @Override
    public PageStructure visitPageStructure(DSLParser.PageStructureContext ctx){
        pageStructure = new PageStructure();

        if(ctx.PAGE() != null){
            pageStructure.setPAGE(ctx.PAGE().getText());
        }

        if(ctx.FILE_NAME_ID() != null){
            if (CustomPair.containVariable(ctx.FILE_NAME_ID().getText(), ProjectMain.symbolTablePage) == null){
                pageStructure.setPAGE_NAME(ctx.FILE_NAME_ID().getText());
                ProjectMain.symbolTablePage.add(ctx.FILE_NAME_ID().getText());
            }
            else {
                ProjectMain.ERROR = true;
                try{
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID().getText() + " ALREADY EXISTS!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        if(ctx.body() != null)
            pageStructure.setBody(bodyVisitor.visitBody(ctx.body()));

        return pageStructure;
    }
}
