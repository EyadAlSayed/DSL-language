package Visitors.PageVisitors;

import Models.PageModels.Button;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class ButtonVisitor extends DSLParserBaseVisitor {

    Button button = new Button();

    @Override
    public Button visitButton(DSLParser.ButtonContext ctx) {
        if (ctx.BUTTON_ID() != null)
            button.setButtonID(ctx.BUTTON_ID().getText());

        if (ctx.FILE_NAME_ID() != null) {
            button.setVariableName(ctx.FILE_NAME_ID().getText());
        }
        if (ctx.TEXT() != null)
            button.setValue(ctx.TEXT().getText());

        if (ctx.marginList().TEXTNUM(0) != null) {
            int[] MARGINS = new int[4];

            MARGINS[0] = Integer.parseInt(ctx.marginList().TEXTNUM(0).getText());
            MARGINS[1] = Integer.parseInt(ctx.marginList().TEXTNUM(1).getText());
            MARGINS[2] = Integer.parseInt(ctx.marginList().TEXTNUM(2).getText());
            MARGINS[3] = Integer.parseInt(ctx.marginList().TEXTNUM(3).getText());

            button.setMARGINS(MARGINS);
        }
        return button;
    }
}
