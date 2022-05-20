package Visitors.Controller;

import Models.ControllerModels.Send;
import gen.DSLParser;
import gen.DSLParserBaseListener;
import gen.DSLParserBaseVisitor;

public class SendVisitor extends DSLParserBaseVisitor {


    Send send = new Send();

    @Override
    public Send visitSend(DSLParser.SendContext ctx) {

        if (ctx.SEND_ID() != null)
            send.setSendId(ctx.SEND_ID().getText());

        if (ctx.OPEN_PAR_BRACKT_ID() != null)
            send.setOpenParBracktId(ctx.OPEN_PAR_BRACKT_ID().getText());

        if (ctx.FILE_NAME_ID() != null)
            send.setFileNameId(ctx.FILE_NAME_ID().getText());

        if (ctx.CLOSE_PAR_BRACKT_ID() != null)
            send.setCloseParBracktId(ctx.CLOSE_PAR_BRACKT_ID().getText());

        if (ctx.END_STATMENT_ID() != null)
            send.setEndStatementId(ctx.END_STATMENT_ID().getText());
        return  send;
    }
}
