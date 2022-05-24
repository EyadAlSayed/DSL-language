package Visitors.Controller;

import Models.ControllerModels.Send;
import Models.PageModels.Button;
import Models.PageModels.PageStructure;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class SendVisitor extends DSLParserBaseVisitor {

    Send send = new Send();

    @Override
    public Send visitSend(DSLParser.SendContext ctx) {

        if (ctx.SEND() != null)
            send.setSend(ctx.SEND().getText());

        if(ctx.OPEN_PAR_BRACKT_ID() != null)
            send.setOpenParBracktId(ctx.OPEN_PAR_BRACKT_ID().getText());

        if (ctx.TEXT() != null){
            Object fileName = CustomPair.containVariable(ctx.TEXT().getText(), ProjectMain.symbolTablePage);
            if (fileName != null){
                send.setText(ctx.TEXT().getText());
            }
            else {
                ProjectMain.ERROR=true;
                try{
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.TEXT().getText() + " IS NOT BUTTON OR DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }

        }


        if (ctx.CLOSE_PAR_BRACKT_ID() != null)
            send.setCloseParBracktId(ctx.CLOSE_PAR_BRACKT_ID().getText());

        if (ctx.END_STATMENT_ID() != null)
            send.setEndStatement(ctx.END_STATMENT_ID().getText());

        return send;
    }
}
