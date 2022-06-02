package Visitors.Controller;

import Models.ControllerModels.Loop;
import Models.PageModels.Checkbox;
import Models.PageModels.RadioGroup;
import Models.PageModels.Text;
import Models.PageModels.TextField;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class LoopVisitor extends DSLParserBaseVisitor {

    Loop loop;

    ControllerTokensVisitor controllerTokensVisitor;

    @Override
    public Loop visitLoop(DSLParser.LoopContext ctx) {
        loop = new Loop();
        controllerTokensVisitor = new ControllerTokensVisitor();
        if (ctx.FOR_ID() != null)
            loop.setForId(ctx.FOR_ID().getText());

        if (ctx.OPEN_PAR_BRACKT_ID() != null)
            loop.setOpenParBracktId(ctx.CLOSE_PAR_BRACKT_ID().getText());

        if (ctx.FILE_NAME_ID(0) != null) {
            Object text = CustomPair.containVariable(ctx.FILE_NAME_ID(0).getText(), ProjectMain.symbolTablePage);
            if(text instanceof Text || text instanceof TextField || text instanceof RadioGroup || text instanceof Checkbox)
            loop.setFileNameId1(ctx.FILE_NAME_ID(0).getText());
            else{
                ProjectMain.ERROR=true;
                try{
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(0).getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON} OR DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        if (ctx.TEXTNUM(0) != null)
            loop.setTextNum1(ctx.TEXTNUM(0).getText());

        if (ctx.RANG() != null)
            loop.setRang(ctx.RANG().getText());

        if (ctx.FILE_NAME_ID(1) != null) {
            Object text = CustomPair.containVariable(ctx.FILE_NAME_ID(1).getText(), ProjectMain.symbolTablePage);
            if(text instanceof Text || text instanceof TextField|| text instanceof RadioGroup || text instanceof Checkbox)
                loop.setFileNameId1(ctx.FILE_NAME_ID(1).getText());
            else{
                ProjectMain.ERROR=true;
                try{
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(1).getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON} OR DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }        }
        if (ctx.TEXTNUM(1) != null)
            loop.setTextNum2(ctx.TEXTNUM(1).getText());

        if (ctx.CLOSE_PAR_BRACKT_ID() != null)
            loop.setCloseParBracktId(ctx.CLOSE_PAR_BRACKT_ID().getText());

        if (ctx.OPEN_CURLY_BRACKT_ID() != null)
            loop.setOpenCurlyBracktId(ctx.OPEN_CURLY_BRACKT_ID().getText());

        for (int i = 0; i < ctx.controllerTokens().size(); i++) {
            loop.getControllerTokens().add(controllerTokensVisitor.visitControllerTokens(ctx.controllerTokens(i)));
        }

        if (ctx.CLOSE_CURLY_BRACKT_ID() != null)
            loop.setCloseCurlyBracktId(ctx.CLOSE_CURLY_BRACKT_ID().getText());

        return loop;
    }
}
