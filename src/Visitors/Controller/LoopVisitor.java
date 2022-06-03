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

        if (ctx.loopFirstVariable().loopVariable().FILE_NAME_ID() != null) {
            Object text = CustomPair.containVariable(ctx.loopFirstVariable().loopVariable().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage);
            if(text instanceof Text || text instanceof TextField || text instanceof RadioGroup || text instanceof Checkbox)
            loop.setFileNameId1(ctx.loopFirstVariable().loopVariable().FILE_NAME_ID().getText());
            else{
                ProjectMain.ERROR=true;
                try{
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.loopFirstVariable().loopVariable().FILE_NAME_ID().getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON} OR DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        if (ctx.loopFirstVariable().loopVariable().TEXTNUM() != null)
            loop.setTextNum1(ctx.loopFirstVariable().loopVariable().TEXTNUM().getText());

        if (ctx.RANG() != null)
            loop.setRang(ctx.RANG().getText());

        if (ctx.loopSecondVariable().loopVariable().FILE_NAME_ID() != null) {
            Object text = CustomPair.containVariable(ctx.loopSecondVariable().loopVariable().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage);
            if(text instanceof Text || text instanceof TextField|| text instanceof RadioGroup || text instanceof Checkbox)
                loop.setFileNameId2(ctx.loopSecondVariable().loopVariable().FILE_NAME_ID().getText());
            else{
                ProjectMain.ERROR=true;
                try{
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.loopSecondVariable().loopVariable().FILE_NAME_ID().getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON} OR DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }        }
        if (ctx.loopSecondVariable().loopVariable().TEXTNUM() != null)
            loop.setTextNum2(ctx.loopSecondVariable().loopVariable().TEXTNUM().getText());

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
