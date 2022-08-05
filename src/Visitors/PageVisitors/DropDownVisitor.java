package Visitors.PageVisitors;

import Models.PageModels.DropDown;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class DropDownVisitor extends DSLParserBaseVisitor {

    @Override
    public DropDown visitDropDown(DSLParser.DropDownContext ctx) {
        DropDown dropDown = new DropDown();
        if (ctx.DROPDOWN() != null)
            dropDown.setDropDownID(ctx.DROPDOWN().getText());
        if (ctx.FILE_NAME_ID().size() > 0) {
            dropDown.setName(ctx.FILE_NAME_ID(0).getText());
            for (int i = 1; i < ctx.FILE_NAME_ID().size(); i++) {
                dropDown.getOptions().add(ctx.FILE_NAME_ID().get(i).getText());
            }
            for (int i = 1 ; i < ctx.TEXTNUM().size() ; i++)
            {
                dropDown.getOptions().add(ctx.TEXTNUM().get(i).getText());
            }
        }
        return dropDown;
    }
}
