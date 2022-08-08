package Visitors.Controller;

import Models.ControllerModels.Action.Assign;
import Models.PageModels.TextField;
import Visitors.CustomPair;
import Visitors.Node;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;
import org.antlr.v4.runtime.misc.Pair;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class AssignVisitor extends DSLParserBaseVisitor {

    Assign assign = new Assign();

    TextValueVisitor textValueVisitor;


    public Assign visitAssign(DSLParser.AssignContext ctx, Node father) {

        String variableType="";

        if (ctx.ASSIGN_OP_ID() != null)
            assign.setAssignOpId(ctx.ASSIGN_OP_ID().getText());

        if (ctx.textValue() != null) {
            textValueVisitor = new TextValueVisitor();
            assign.setTextValue(textValueVisitor.visitTextValue(ctx.textValue()));

            if(assign.getTextValue().getText()!=null)
                variableType = "TEXT";
            else if(assign.getTextValue().getTextNum()!=null)
                variableType = "NUMBER";
        }

        if (ctx.FILE_NAME_ID(0) != null) {
            Object object = CustomPair.containVariable(ctx.FILE_NAME_ID(0).getText(), ProjectMain.symbolTablePage);
            if(object != null) {
                if (object instanceof TextField)
                assign.setFileNameId1(ctx.FILE_NAME_ID(0).getText());
                else {
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(0).getText() + " IS NOT TEXT!\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }else{
                String variableTypeNode = CustomPair.inScope(father,ctx.FILE_NAME_ID(0).getText(),variableType);
                if (variableTypeNode == null){
                    father.getVariables().add(new Pair<>(ctx.FILE_NAME_ID(0).getText(),variableType));
                }
                assign.setFileNameId1(ctx.FILE_NAME_ID(0).getText());
            }
        }

        if (ctx.FILE_NAME_ID(1) != null) {
            Object object = CustomPair.containVariable(ctx.FILE_NAME_ID(1).getText(), ProjectMain.symbolTablePage);
            if(object!= null) {
                if (object instanceof TextField)
                    assign.setFileNameId2(ctx.FILE_NAME_ID(1).getText());
                else {
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(1).getText() + " IS NOT TEXT!\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }else{
                String variableTypeNode = CustomPair.inScope(father,ctx.FILE_NAME_ID(0).getText(),variableType);
                if (variableTypeNode == null){
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(1).getText() + " DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else
                    assign.setFileNameId2(ctx.FILE_NAME_ID(1).getText());
            }
        }
        if (ctx.END_STATMENT_ID() != null)
            assign.setEndStatementId(ctx.END_STATMENT_ID().getText());

        return assign;
    }
}
