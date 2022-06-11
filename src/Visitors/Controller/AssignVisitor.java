package Visitors.Controller;

import Models.ControllerModels.Action.Assign;
import Models.PageModels.TextField;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class AssignVisitor extends DSLParserBaseVisitor {

    Assign assign = new Assign();

    TextValueVisitor textValueVisitor;

    @Override
    public Assign visitAssign(DSLParser.AssignContext ctx) {
        if (ctx.ASSIGN_OP_ID() != null)
            assign.setAssignOpId(ctx.ASSIGN_OP_ID().getText());

        if (ctx.textValue() != null) {
            textValueVisitor = new TextValueVisitor();
            assign.setTextValue(textValueVisitor.visitTextValue(ctx.textValue()));
        }

        if (ctx.FILE_NAME_ID(0) != null) {
            Object object = CustomPair.containVariable(ctx.FILE_NAME_ID(0).getText(), ProjectMain.symbolTablePage);
            if (object instanceof TextField)
                assign.setFileNameId1(ctx.FILE_NAME_ID(0).getText());
            else {
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(0).getText() + " IS NOT TEXT OR DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (ctx.FILE_NAME_ID(1) != null) {
            Object object = CustomPair.containVariable(ctx.FILE_NAME_ID(1).getText(), ProjectMain.symbolTablePage);
            if (object instanceof TextField)
                assign.setFileNameId1(ctx.FILE_NAME_ID(1).getText());
            else {
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(1).getText() + " IS NOT TEXT OR DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            assign.setFileNameId2(ctx.FILE_NAME_ID(1).getText());
        }
        if (ctx.END_STATMENT_ID() != null)
            assign.setEndStatementId(ctx.END_STATMENT_ID().getText());

        return assign;
    }
}
