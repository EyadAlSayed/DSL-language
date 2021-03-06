package Visitors.Controller;

import Models.ControllerModels.Action.Print;
import Models.PageModels.Checkbox;
import Models.PageModels.RadioGroup;
import Models.PageModels.TextField;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class PrintVisitor extends DSLParserBaseVisitor {

    Print print;

    TextValueVisitor textValueVisitor;
    @Override
    public Print visitPrint(DSLParser.PrintContext ctx) {

        print = new Print();

        if (ctx.PRINT_ACTION() != null)
            print.setPrintAction(ctx.PRINT_ACTION().getText());

        if (ctx.textValue() != null) {
            textValueVisitor = new TextValueVisitor();
            print.setTextValue(textValueVisitor.visitTextValue(ctx.textValue()));
        }
        if (ctx.FILE_NAME_ID() != null) {
            Object text = CustomPair.containVariable(ctx.FILE_NAME_ID().getText(), ProjectMain.symbolTablePage);
            if( text instanceof TextField || text instanceof RadioGroup || text instanceof Checkbox)
            print.setFileNameId(ctx.FILE_NAME_ID().getText());
            else {
                ProjectMain.ERROR=true;
                try{
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID().getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON} OR DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        if (ctx.END_STATMENT_ID() != null)
            print.setEndStatementId(ctx.END_STATMENT_ID().getText());


        return print;
    }
}
