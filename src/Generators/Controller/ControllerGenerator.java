package Generators.Controller;

import Models.ControllerModels.Controller;
import Models.ControllerModels.ControllerTokens;

public class ControllerGenerator {

    StringBuilder stringBuilder;
    IfStatementGenerator ifStatementGenerator;
    AssignGenerator assignGenerator;
    LoopGenerator loopGenerator;


    public String generateController(Controller controller) {
        stringBuilder = new StringBuilder();

        stringBuilder.append("<?php\n");

        if (controller.getControllerTokens().size() > 0) {
            for (int i = 0; i < controller.getControllerTokens().size(); i++) {
               stringBuilder.append(generateControllerToken(controller.getControllerTokens().get(i)));
            }
        }

      //  System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    public String generateControllerToken(ControllerTokens controllerTokens)
    {
        if (controllerTokens.getIfStatement() != null) {
            ifStatementGenerator = new IfStatementGenerator();
            return  ifStatementGenerator.ifStatementGenerate(controllerTokens.getIfStatement());
        }

        if (controllerTokens.getAssign() != null){
    StringBuilder stringBuilder = new StringBuilder();
    IfStatementGenerator ifStatementGenerator;
    AssignGenerator assignGenerator;
    PrintGenerator printGenerator;
    SendGenerator sendGenerator;


    public String generateController(Controller controller) {

        if (controller.getControllerTokens().size() > 0) {
            for (int i = 0; i < controller.getControllerTokens().size(); i++) {
                stringBuilder.append(generateControllerToken(controller.getControllerTokens().get(i)));
            }
        }

        //  System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    public String generateControllerToken(ControllerTokens controllerTokens) {
        if (controllerTokens.getIfStatement() != null) {
            ifStatementGenerator = new IfStatementGenerator();
            return ifStatementGenerator.ifStatementGenerate(controllerTokens.getIfStatement());
        }

        if (controllerTokens.getAssign() != null) {
            assignGenerator = new AssignGenerator();
            return assignGenerator.generateAssign(controllerTokens.getAssign());
        }

        if (controllerTokens.getLoop() != null){
            loopGenerator = new LoopGenerator();
            return loopGenerator.generateLoop(controllerTokens.getLoop());
        if (controllerTokens.getPrint() != null) {
            printGenerator = new PrintGenerator();
            return printGenerator.generatePrint(controllerTokens.getPrint());
        }
        if (controllerTokens.getSend() != null){
            sendGenerator = new SendGenerator();
            return sendGenerator.sendGenerator(controllerTokens.getSend());
        }
        return "\n";
    }

}
