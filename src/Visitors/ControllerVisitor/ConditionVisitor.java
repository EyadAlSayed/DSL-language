package Visitors.ControllerVisitor;


import Models.ControllerModels.Condition;
import Models.ControllerModels.IFCondition;
import Models.ControllerModels.TextValue;
import Models.ControllerModels.Var;
import gen.DSLParser;

// EYAD
public class ConditionVisitor extends ControllerVisitor{

    private static ConditionVisitor conditionVisitor;

    public static ConditionVisitor getInstance(){
        if (conditionVisitor == null){
            conditionVisitor = new ConditionVisitor();
        }
        return conditionVisitor;
    }

    @Override
    public IFCondition visitIfCondition(DSLParser.IfConditionContext ctx) {
        IFCondition ifCondition = new IFCondition();

        if (ctx.OPEN_PAR_BRACKT_ID() != null)
            ifCondition.setOpenParBrackt(ctx.OPEN_PAR_BRACKT_ID().getText());

        for (int i = 0; i < ctx.condition().size(); i++) {
            ifCondition.getConditions().add(visitCondition(ctx.condition(i)));
        }

        if (ctx.CLOSE_PAR_BRACKT_ID() != null)
            ifCondition.setCloseParBrackt(ctx.CLOSE_PAR_BRACKT_ID().getText());



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
