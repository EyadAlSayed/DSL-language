package Visitors.Controller.MathEquation;

import Models.ControllerModels.Action.MathEquation;
import Visitors.Node;
import Models.ControllerModels.Action.SimpleMathEquation;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class MathEquationVisitor extends DSLParserBaseVisitor {

    SimpleMathEquationVisitor simpleMathEquationVisitor;
    ComplexMathEquationVisitor complexMathEquationVisitor;


    public MathEquation visitMathEquation(DSLParser.MathEquationContext ctx, Node father) {

        simpleMathEquationVisitor = new SimpleMathEquationVisitor();
        complexMathEquationVisitor = new ComplexMathEquationVisitor();

        if(ctx.FILE_NAME_ID() != null)
            mathEquation.setFileNameId(ctx.FILE_NAME_ID().getText());

        if (ctx.ASSIGN_OP_ID() != null)
            mathEquation.setAssignOpId(ctx.ASSIGN_OP_ID().getText());

        if(ctx.simpleMathEquation() != null)
            mathEquation.setSimpleMathEquation(simpleMathEquationVisitor.visitSimpleMathEquation(ctx.simpleMathEquation()));

        for (int i = 0; i < ctx.complexMathEquation().size(); i++) {
            mathEquation.getComplexMathEquationList().add(complexMathEquationVisitor.visitComplexMathEquation(ctx.complexMathEquation(i)));
        }

        if(ctx.END_STATMENT_ID() != null)
            mathEquation.setEndStatementId(ctx.END_STATMENT_ID().getText());
        return mathEquation;
    }
}
