package Visitors.Controller;

import Models.ControllerModels.Action.Assign;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;
import org.antlr.v4.runtime.misc.Pair;

public class AssignVisitor extends DSLParserBaseVisitor {

    Assign assign = new Assign();

    TextValueVisitor textValueVisitor = new TextValueVisitor();

    @Override
    public Assign visitAssign(DSLParser.AssignContext ctx) {
        if (ctx.ASSIGN_OP_ID() != null)
            assign.setAssignOpId(ctx.ASSIGN_OP_ID().getText());

        if (ctx.textValue() != null)
            assign.setTextValue(textValueVisitor.visitTextValue(ctx.textValue()));

        if (ctx.FILE_NAME_ID(1) != null)
            assign.setFileNameId2(ctx.FILE_NAME_ID(1).getText());

        if (ctx.END_STATMENT_ID() != null)
            assign.setEndStatementId(ctx.END_STATMENT_ID().getText());

        return assign;
    }
}
