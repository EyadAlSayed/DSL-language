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


        if (mathEquation.getSimpleMathEquation() != null)
            generateSimpleMathEquation(mathEquation.getSimpleMathEquation());


        for (int i = 0; i < mathEquation.getComplexMathEquationList().size(); i++) {
            generateComplexMathEquation(mathEquation.getComplexMathEquationList().get(i));
        }

        return stringBuilder.toString();
    }

    public void generateSimpleMathEquation(SimpleMathEquation simpleMathEquation) {
        if(simpleMathEquation.getFileNameId1() != null)
            stringBuilder.append(simpleMathEquation.getFileNameId1());

        if(simpleMathEquation.getTextValue1() != null)
            stringBuilder.append(textValueGenerator.generateTextValue(simpleMathEquation.getTextValue1()));

        if(simpleMathEquation.getMathOperation() != null)
            generateMathOperation(simpleMathEquation.getMathOperation());

        if(simpleMathEquation.getFileNameId2() != null)
            stringBuilder.append(simpleMathEquation.getFileNameId2());

        if(simpleMathEquation.getTextValue2() != null)
            stringBuilder.append(textValueGenerator.generateTextValue(simpleMathEquation.getTextValue2()));

    }

    public void generateComplexMathEquation(ComplexMathEquation complexMathEquation) {

        if(complexMathEquation.getMathOperation() != null)
            generateMathOperation(complexMathEquation.getMathOperation());

        if(complexMathEquation.getFileNameId() != null)
            stringBuilder.append(complexMathEquation.getFileNameId());

        if(complexMathEquation.getTextValue() != null)
            stringBuilder.append(textValueGenerator.generateTextValue(complexMathEquation.getTextValue()));


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
