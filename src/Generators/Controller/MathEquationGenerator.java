package Generators.Controller;

import Models.ControllerModels.Action.ComplexMathEquation;
import Models.ControllerModels.Action.MathEquation;
import Models.ControllerModels.Action.MathOperation;
import Models.ControllerModels.Action.SimpleMathEquation;

public class MathEquationGenerator {

    StringBuilder stringBuilder;
    TextValueGenerator textValueGenerator;


    String generateMathEquation(MathEquation mathEquation) {
        stringBuilder = new StringBuilder();
        textValueGenerator = new TextValueGenerator();


        if(mathEquation.getFileNameId()!= null){
            stringBuilder.append("$").append(mathEquation.getFileNameId());
        }
        stringBuilder.append(" =");

        if (mathEquation.getSimpleMathEquation() != null)
            generateSimpleMathEquation(mathEquation.getSimpleMathEquation());


        for (int i = 0; i < mathEquation.getComplexMathEquationList().size(); i++) {
            generateComplexMathEquation(mathEquation.getComplexMathEquationList().get(i));
        }
        stringBuilder.append(";");
        return stringBuilder.toString();
    }

    public void generateSimpleMathEquation(SimpleMathEquation simpleMathEquation) {
        if(simpleMathEquation.getFileNameId1() != null)
            stringBuilder.append("$").append(simpleMathEquation.getFileNameId1());

        if(simpleMathEquation.getNumber1() != null)
            stringBuilder.append(simpleMathEquation.getNumber1());

        if(simpleMathEquation.getMathOperation() != null)
            generateMathOperation(simpleMathEquation.getMathOperation());

        if(simpleMathEquation.getFileNameId2() != null)
            stringBuilder.append("$").append(simpleMathEquation.getFileNameId2());

        if(simpleMathEquation.getNumber2() != null)
            stringBuilder.append(simpleMathEquation.getNumber2());


    }

    public void generateComplexMathEquation(ComplexMathEquation complexMathEquation) {

        if(complexMathEquation.getMathOperation() != null)
            generateMathOperation(complexMathEquation.getMathOperation());

        if(complexMathEquation.getFileNameId() != null)
            stringBuilder.append("$").append(complexMathEquation.getFileNameId());

        if(complexMathEquation.getNumber() != null)
            stringBuilder.append(complexMathEquation.getNumber());


    }

    public void generateMathOperation(MathOperation mathOperation){

        if(mathOperation.getSumOpId() != null)
            stringBuilder.append("+");

        if (mathOperation.getMinusOpId() != null)
            stringBuilder.append("-");
        if (mathOperation.getMultOpId() != null)
            stringBuilder.append("*");

        if(mathOperation.getDivOpId() != null)
            stringBuilder.append("/");

        if (mathOperation.getModOpId() != null)
            stringBuilder.append("%");
    }
}
