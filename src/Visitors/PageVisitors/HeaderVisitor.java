package Visitors.PageVisitors;

import Models.ControllerModels.PageModels.Header;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class HeaderVisitor extends DSLParserBaseVisitor {

    Header header;

    @Override
    public Header visitHeaderStructure(DSLParser.HeaderStructureContext ctx){

        header = new Header();

        if(ctx.TITLE() != null)
            header.setTITLE(ctx.TITLE().getText());
        if(ctx.TEXT() != null)
            header.setVALUE(ctx.TEXT().getText());

        return header;
    }
}
