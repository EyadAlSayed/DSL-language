package Visitors.PageVisitors;

import Models.PageModels.Button;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

import java.io.IOException;
import java.nio.file.Files;

public class ButtonVisitor extends DSLParserBaseVisitor {

    Button button = new Button();

    @Override
    public Button visitButton(DSLParser.ButtonContext ctx) {
        if(ctx.BUTTON_ID() != null)
            button.setButtonID(ctx.BUTTON_ID().getText());
        else
        {
            String s = "SYNTAX ERROR: EXPECTED Button BUT RESERVED "+ctx.BUTTON_ID().getText();
            try {
                Files.writeString(ProjectMain.ERROR_FILE.toPath(),ctx.exception.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(ctx.FILE_NAME_ID() != null)
            button.setVariableName(ctx.FILE_NAME_ID().getText());

        if(ctx.TEXT() != null)
            button.setValue(ctx.TEXT().getText());

        if(ctx.marginList() != null){
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
