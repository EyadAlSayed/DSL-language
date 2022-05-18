package Visitors.PageVisitors;

import Models.PageModels.Button;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class ButtonVisitor extends DSLParserBaseVisitor {

    Button button = new Button();

    @Override
    public Button visitButton(DSLParser.ButtonContext ctx) {
        if(ctx.BUTTON_ID() != null)
            button.setButtonID(ctx.BUTTON_ID().getText());
        if(ctx.FILE_NAME_ID() != null)
            button.setVariableName(ctx.FILE_NAME_ID().getText());
        return button;
    }
}
