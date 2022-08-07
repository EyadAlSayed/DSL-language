package Visitors.Controller.MathEquation;

import Models.ControllerModels.Action.MathOperation;
import Models.ControllerModels.Action.SimpleMathEquation;
import Models.TextValue;
import Visitors.Controller.TextValueVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class SimpleMathEquationVisitor extends DSLParserBaseVisitor {

    TextValueVisitor textValueVisitor;
    MathOperationVisitor mathOperationVisitor;

    @Override
    public SimpleMathEquation visitSimpleMathEquation(DSLParser.SimpleMathEquationContext ctx) {
        SimpleMathEquation simpleMathEquation = new SimpleMathEquation();

        textValueVisitor = new TextValueVisitor();
        mathOperationVisitor = new MathOperationVisitor();


        if (ctx.FILE_NAME_ID(0) != null)
            simpleMathEquation.setFileNameId1(ctx.FILE_NAME_ID(0).getText());

        if(ctx.textValue(0) != null)
            simpleMathEquation.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(0)));

        if(ctx.mathOperation() != null)
            simpleMathEquation.setMathOperation(mathOperationVisitor.visitMathOperation(ctx.mathOperation()));

        if (ctx.FILE_NAME_ID(1) != null)
            simpleMathEquation.setFileNameId2(ctx.FILE_NAME_ID(1).getText());

        if(ctx.textValue(1) != null)
            simpleMathEquation.setTextValue2(textValueVisitor.visitTextValue(ctx.textValue(1)));

        return  simpleMathEquation;
    }
}
