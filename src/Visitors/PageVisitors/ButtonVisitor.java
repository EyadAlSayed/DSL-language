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
          //  ProjectMain.FILEOUTPUTSTREAM.write(s);
            try {
                Files.writeString(ProjectMain.FILE.toPath(),ctx.exception.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(ctx.FILE_NAME_ID() != null)
            button.setVariableName(ctx.FILE_NAME_ID().getText());
        return button;
    }
}
