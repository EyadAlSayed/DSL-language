package Visitors.Controller;

import Models.ControllerModels.Send;
import Models.PageModels.Button;
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

        if (ctx.FILE_NAME_ID() != null) {
            Object button = CustomPair.containVariable(ctx.FILE_NAME_ID().getText(), ProjectMain.symbolTablePage);
            if(button instanceof Button)
            {send.setFileNameId(ctx.FILE_NAME_ID().getText());}
            else
            {
                ProjectMain.ERROR=true;
                try{
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID().getText() + " IS NOT BUTTON OR DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        if (ctx.DOT()!=null)
            send.setDot(ctx.DOT().getText());
        if (ctx.SEND() != null)
            send.setSend(ctx.SEND().getText());

        if (ctx.END_STATMENT_ID()!=null)
            send.setEndStatement(ctx.END_STATMENT_ID().getText());

        return send;
    }
}
