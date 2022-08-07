package Visitors.Controller.MathEquation;

import Models.ControllerModels.Action.ComplexMathEquation;
import Visitors.Controller.TextValueVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class ComplexMathEquationVisitor extends DSLParserBaseVisitor {

    MathOperationVisitor mathOperationVisitor;

    TextValueVisitor textValueVisitor;

    @Override
    public ComplexMathEquation visitComplexMathEquation(DSLParser.ComplexMathEquationContext ctx) {
        ComplexMathEquation complexMathEquation = new ComplexMathEquation();

        textValueVisitor = new TextValueVisitor();
        mathOperationVisitor = new MathOperationVisitor();

        if(ctx.mathOperation(0) != null)
            complexMathEquation.setMathOperation1(mathOperationVisitor.visitMathOperation(ctx.mathOperation(0)));

        if (ctx.FILE_NAME_ID(0) != null)
            complexMathEquation.setFileNameId1(ctx.FILE_NAME_ID(0).getText());

        if(ctx.textValue(0) != null)
            complexMathEquation.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(0)));

        if(ctx.mathOperation(1) != null)
            complexMathEquation.setMathOperation2(mathOperationVisitor.visitMathOperation(ctx.mathOperation(1)));

        if (ctx.FILE_NAME_ID(1) != null)
            complexMathEquation.setFileNameId2(ctx.FILE_NAME_ID(1).getText());

        if(ctx.textValue(1) != null)
            complexMathEquation.setTextValue2(textValueVisitor.visitTextValue(ctx.textValue(1)));

        return  complexMathEquation;
    }


}
