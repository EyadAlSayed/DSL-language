package Visitors.PageVisitors;

import Models.PageModels.Checkbox;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class CheckboxVisitor extends DSLParserBaseVisitor {

    Checkbox checkbox;

    @Override
    public Checkbox visitCheckbox(DSLParser.CheckboxContext ctx){

        checkbox = new Checkbox();

        if(ctx.CHECKBOX() != null){
            checkbox.setCHECKBOX(ctx.CHECKBOX().getText());
        }
        if(ctx.FILE_NAME_ID().size() > 0){
            checkbox.setNAME(ctx.FILE_NAME_ID().get(0).getText());
            for (int i = 1; i < ctx.FILE_NAME_ID().size(); i++) {
                checkbox.getCheckboxAttributes().add(ctx.FILE_NAME_ID().get(i).getText());
            }
        }
        if (ctx.marginList().TEXTNUM(0) != null) {
            int[] MARGINS = new int[4];

            MARGINS[0] = Integer.parseInt(ctx.marginList().TEXTNUM(0).getText());
            MARGINS[1] = Integer.parseInt(ctx.marginList().TEXTNUM(1).getText());
            MARGINS[2] = Integer.parseInt(ctx.marginList().TEXTNUM(2).getText());
            MARGINS[3] = Integer.parseInt(ctx.marginList().TEXTNUM(3).getText());

            checkbox.setMARGINS(MARGINS);
        }

        return checkbox;
    }
}
