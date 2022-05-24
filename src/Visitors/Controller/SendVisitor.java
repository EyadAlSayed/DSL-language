package Visitors.Controller;

import Models.ControllerModels.Send;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class SendVisitor extends DSLParserBaseVisitor {

    Send send = new Send();

    @Override
    public Send visitSend(DSLParser.SendContext ctx) {

        if (ctx.FILE_NAME_ID() != null)
            send.setFileNameId(ctx.FILE_NAME_ID().getText());

        if (ctx.DOT()!=null)
            send.setDot(ctx.FILE_NAME_ID().getText());
        if (ctx.SEND() != null)
            send.setSend(ctx.SEND().getText());

        if (ctx.END_STATMENT_ID()!=null)
            send.setEndStatement(ctx.END_STATMENT_ID().getText());

        return send;
    }
}
