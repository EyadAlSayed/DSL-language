package Visitors.Controller;

import Models.ControllerModels.Action.Print;
import Models.PageModels.DropDown;
import Models.PageModels.RadioGroup;
import Models.PageModels.Input;
import Visitors.CustomPair;
import Visitors.Node;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class PrintVisitor extends DSLParserBaseVisitor {

    Print print;

    TextValueVisitor textValueVisitor;
    public Print visitPrint(DSLParser.PrintContext ctx, Node father) {

        print = new Print();

        if (ctx.PRINT_ACTION() != null)
            print.setPrintAction(ctx.PRINT_ACTION().getText());

        if (ctx.textValue() != null) {
            textValueVisitor = new TextValueVisitor();
            print.setTextValue(textValueVisitor.visitTextValue(ctx.textValue()));
        }
        if (ctx.FILE_NAME_ID() != null) {
            Object text = CustomPair.containVariable(ctx.FILE_NAME_ID().getText(), ProjectMain.symbolTablePage);

            if(text != null){
            if( text instanceof Input || text instanceof RadioGroup || text instanceof String || text instanceof DropDown)
            print.setFileNameId(ctx.FILE_NAME_ID().getText());
            else {
                ProjectMain.ERROR=true;
                try{
                    Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID().getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON}\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            }else{
                String variableTypeNode = CustomPair.inScope(father,ctx.FILE_NAME_ID().getText(),null);
                if (variableTypeNode == null){
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID().getText() + " DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else
                    print.setFileNameId(ctx.FILE_NAME_ID().getText());
            }

        }
        if (ctx.END_STATMENT_ID() != null)
            print.setEndStatementId(ctx.END_STATMENT_ID().getText());


        return print;
    }
}
