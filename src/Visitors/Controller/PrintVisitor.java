package Visitors.Controller;

import Models.ControllerModels.Action.Print;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class PrintVisitor extends DSLParserBaseVisitor {

    Print print = new Print();

    TextValueVisitor textValueVisitor = new TextValueVisitor();
    @Override
    public Print visitPrint(DSLParser.PrintContext ctx) {

        if (ctx.PRINT_ACTION() != null)
            print.setPrintAction(ctx.PRINT_ACTION().getText());

        if (ctx.textValue() != null)
            print.setTextValue(textValueVisitor.visitTextValue(ctx.textValue()));

        if (ctx.FILE_NAME_ID() != null)
            print.setFileNameId(ctx.FILE_NAME_ID().getText());

        if (ctx.END_STATMENT_ID() != null)
            print.setEndStatementId(ctx.END_STATMENT_ID().getText());


        return print;
    }
}
