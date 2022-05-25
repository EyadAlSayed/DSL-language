package Visitors.Controller;

import Models.ControllerModels.Send;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

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

            }

        }


        if (ctx.CLOSE_PAR_BRACKT_ID() != null)
            send.setCloseParBracktId(ctx.CLOSE_PAR_BRACKT_ID().getText());

        if (ctx.END_STATMENT_ID() != null)
            send.setEndStatement(ctx.END_STATMENT_ID().getText());

        return send;
    }
}
