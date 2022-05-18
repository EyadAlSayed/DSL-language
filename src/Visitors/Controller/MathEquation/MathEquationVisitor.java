package Visitors.Controller.MathEquation;

import Models.ControllerModels.Action.MathEquation;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class MathEquationVisitor extends DSLParserBaseVisitor {

    MathEquation mathEquation;

    SumVisitor sumVisitor = new SumVisitor();
    MinusVisitor minusVisitor = new MinusVisitor();
    DivVisitor divVisitor = new DivVisitor();
    ModVisitor modVisitor = new ModVisitor();
    MultVisitor multVisitor = new MultVisitor();

    @Override
    public MathEquation visitMathEquation(DSLParser.MathEquationContext ctx) {

        if (ctx.sum() !=null)
            mathEquation.setSum(sumVisitor.visitSum(ctx.sum()));

        if (ctx.minus() != null)
            mathEquation.setMinus(minusVisitor.visitMinus(ctx.minus()));

        if (ctx.div() != null)
            mathEquation.setDiv(divVisitor.visitDiv(ctx.div()));

        if (ctx.mult() != null)
            mathEquation.setMult(multVisitor.visitMult(ctx.mult()));

        if (ctx.mod() != null)
            mathEquation.setMod(modVisitor.visitMod(ctx.mod()));

        return mathEquation;
    }
}
