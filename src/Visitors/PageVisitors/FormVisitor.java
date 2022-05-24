package Visitors.PageVisitors;

import Models.PageModels.Form;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class FormVisitor extends DSLParserBaseVisitor {

    Form form = new Form();

    @Override
    public Form visitForm(DSLParser.FormContext ctx) {

        if (ctx.FORM_ID() != null)
            form.setFormID(ctx.FORM_ID().getText());
        if (ctx.FILE_NAME_ID().size() > 0) {
            for (int i = 0; i < ctx.FILE_NAME_ID().size(); i++) {
                form.getComponents().add(ctx.FILE_NAME_ID().get(i).getText());
            }
        }
        return form;
    }
}
