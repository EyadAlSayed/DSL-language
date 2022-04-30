package Visitors.ControllerVisitor;


import Models.ControllerModels.*;
import gen.DSLParser;

// EYAD
public class ConditionVisitor extends ControllerVisitor {

    private static ConditionVisitor conditionVisitor;

    public static ConditionVisitor getInstance() {
        if (conditionVisitor == null) {
            conditionVisitor = new ConditionVisitor();
        }
        return conditionVisitor;
    }

   // @Override
    public IFCondition visitIfCondition(DSLParser.IfConditionContext ctx) {
        IFCondition ifCondition = new IFCondition();

        if (ctx.IF_ID() != null)
            ifCondition.setIfId(ctx.IF_ID().getText());

        if (ctx.OPEN_PAR_BRACKT_ID() != null)
            ifCondition.setOpenParBrackt(ctx.OPEN_PAR_BRACKT_ID().getText());

        for (int i = 0; i < ctx.condition().size(); i++) {
            ifCondition.getConditions().add(visitCondition(ctx.condition(i)));
        }

        if (ctx.CLOSE_PAR_BRACKT_ID() != null)
            ifCondition.setCloseParBrackt(ctx.CLOSE_PAR_BRACKT_ID().getText());

        ifCondition.setIfBody(visitIfBody(ctx.ifBody(),ifCondition));

        return ifCondition;
    }

    @Override
    public Condition visitCondition(DSLParser.ConditionContext ctx) {
        Condition condition = new Condition();

        if (ctx.var() != null)
            condition.setVar(visitVar(ctx.var()));

        if (ctx.logicalOp(0) != null)
            condition.setLogicalOp1(LogicalOpVisitor.getInstance().visitLogicalOp(ctx.logicalOp(0)));

        if (ctx.textValue() != null)
            condition.setTextValue(visitTextValue(ctx.textValue()));

        if (ctx.logicalOp(1) != null)
            condition.setLogicalOp2(LogicalOpVisitor.getInstance().visitLogicalOp(ctx.logicalOp(1)));

        return condition;
    }

    //@Override
    public IfBody visitIfBody(DSLParser.IfBodyContext ctx,Object father) {
        IfBody ifBody = new IfBody();

        if (ctx.IFBODY_DEF_ID() != null)
            ifBody.setIfBodyDefId(ctx.IFBODY_DEF_ID().getText());

        for (int i = 0; i < ctx.ifBodyTokens().size(); i++) {
            ifBody.getIfBodyTokens().add(visitIfBodyTokens(ctx.ifBodyTokens(i),father));
        }

        if (ctx.IFBODY_DEF_END_ID() != null)
            ifBody.setIfBodyDefEndId(ctx.IFBODY_DEF_END_ID().getText());

        return ifBody;
    }

   // @Override
    public IfBodyTokens visitIfBodyTokens(DSLParser.IfBodyTokensContext ctx,Object father) {
        IfBodyTokens ifBodyTokens = new IfBodyTokens();

        ifBodyTokens.setIfCondition(visitIfCondition(ctx.ifCondition()));

        ifBodyTokens.setBundle(BundleVisitor.getInstance().visitBundle(ctx.bundle(),father));

        ifBodyTokens.setAction(ControllerActionVisitor.getInstance().visitAction(ctx.action()));

        ifBodyTokens.setVarDeclear(visitVarDeclear(ctx.varDeclear()));

        return ifBodyTokens;
    }

    @Override
    public VarDeclear visitVarDeclear(DSLParser.VarDeclearContext ctx) {
        VarDeclear varDeclear = new VarDeclear();

        if (ctx.VAR_NAME_ID() != null)
            varDeclear.setVarNameId(ctx.VAR_NAME_ID().getText());

        if (ctx.ASSIGN() != null)
            varDeclear.setAssign(ctx.ASSIGN().getText());

        varDeclear.setTextValue(visitTextValue(ctx.textValue()));

        return varDeclear;
    }

    @Override
    public Var visitVar(DSLParser.VarContext ctx) {
        Var var = new Var();

        if (ctx.VAR_NAME_ID() != null)
            var.setVarNameId(ctx.VAR_NAME_ID().getText());

        return var;

    }

    @Override
    public TextValue visitTextValue(DSLParser.TextValueContext ctx) {
        TextValue textValue = new TextValue();

        if (ctx.TEXT() != null)
            textValue.setText(ctx.TEXT().getText());

        if (ctx.TEXTNUM() != null)
            textValue.setTextNum(ctx.TEXTNUM().getText());

        return textValue;
    }
}
