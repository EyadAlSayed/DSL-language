package Visitors.Controller;

import Models.ControllerModels.Loop;
import Models.PageModels.Checkbox;
import Models.PageModels.DropDown;
import Models.PageModels.Input;
import Models.PageModels.RadioGroup;
import Visitors.CustomPair;
import Visitors.Node;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class LoopVisitor extends DSLParserBaseVisitor {

    Loop loop;

    ControllerTokensVisitor controllerTokensVisitor;


    public Loop visitLoop(DSLParser.LoopContext ctx, Node father) {
        loop = new Loop();
        controllerTokensVisitor = new ControllerTokensVisitor();
        Node node = new Node(father,loop);
        father.getSons().add(node);
        if (ctx.FOR_ID() != null)
            loop.setForId(ctx.FOR_ID().getText());

        if (ctx.OPEN_PAR_BRACKT_ID() != null)
            loop.setOpenParBracktId(ctx.CLOSE_PAR_BRACKT_ID().getText());

        if (ctx.loopFirstVariable().loopVariable().FILE_NAME_ID() != null) {
            Object text = CustomPair.containVariable(ctx.loopFirstVariable().loopVariable().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage);
            if(text != null) {
                if (text instanceof Input || text instanceof RadioGroup || text instanceof Checkbox || text instanceof String
                || text instanceof DropDown)
                    loop.setFileNameId1(ctx.loopFirstVariable().loopVariable().FILE_NAME_ID().getText());
                else {
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.loopFirstVariable().loopVariable().FILE_NAME_ID().getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON}\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }else{
                String variableType = CustomPair.inScope(father,ctx.loopFirstVariable().loopVariable().getText(),null);
                if (variableType == null){
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.loopFirstVariable().loopVariable().getText() + " VARIABLE DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else
                    loop.setFileNameId1(ctx.loopFirstVariable().loopVariable().FILE_NAME_ID().getText());
            }
            }

        if (ctx.loopFirstVariable().loopVariable().TEXTNUM() != null)
            loop.setTextNum1(ctx.loopFirstVariable().loopVariable().TEXTNUM().getText());

        if (ctx.RANG() != null)
            loop.setRang(ctx.RANG().getText());

        if (ctx.loopSecondVariable().loopVariable().FILE_NAME_ID() != null) {
            Object text = CustomPair.containVariable(ctx.loopSecondVariable().loopVariable().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage);
            if(text!= null){
            if( text instanceof Input || text instanceof RadioGroup || text instanceof Checkbox || text instanceof String
            || text instanceof DropDown)
                loop.setFileNameId2(ctx.loopSecondVariable().loopVariable().FILE_NAME_ID().getText());
            else{
                ProjectMain.ERROR=true;
                try{
                    Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.loopSecondVariable().loopVariable().FILE_NAME_ID().getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON}\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            }else {
                String variableType = CustomPair.inScope(father,ctx.loopSecondVariable().loopVariable().getText(),null);
                if (variableType == null){
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.loopSecondVariable().loopVariable().getText() + " VARIABLE DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else
                    loop.setFileNameId2(ctx.loopSecondVariable().loopVariable().FILE_NAME_ID().getText());

            }
        }
        if (ctx.loopSecondVariable().loopVariable().TEXTNUM() != null)
            loop.setTextNum2(ctx.loopSecondVariable().loopVariable().TEXTNUM().getText());

        if (ctx.CLOSE_PAR_BRACKT_ID() != null)
            loop.setCloseParBracktId(ctx.CLOSE_PAR_BRACKT_ID().getText());

        if (ctx.OPEN_CURLY_BRACKT_ID() != null)
            loop.setOpenCurlyBracktId(ctx.OPEN_CURLY_BRACKT_ID().getText());

        for (int i = 0; i < ctx.controllerTokens().size(); i++) {
            loop.getControllerTokens().add(controllerTokensVisitor.visitControllerTokens(ctx.controllerTokens(i),node));
        }

        if (ctx.CLOSE_CURLY_BRACKT_ID() != null)
            loop.setCloseCurlyBracktId(ctx.CLOSE_CURLY_BRACKT_ID().getText());

        return loop;
    }
}
