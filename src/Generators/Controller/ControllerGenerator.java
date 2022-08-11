package Generators.Controller;

import Models.ControllerModels.Controller;
import Models.ControllerModels.ControllerTokens;
import Models.PageModels.*;
import Visitors.ProjectMain;

public class ControllerGenerator {

    StringBuilder stringBuilder;
    IfStatementGenerator ifStatementGenerator;
    AssignGenerator assignGenerator;
    LoopGenerator loopGenerator;
    PrintGenerator printGenerator;
    SendGenerator sendGenerator;
    MathEquationGenerator mathEquationGenerator;


    public String generateController(Controller controller) {

        stringBuilder = new StringBuilder();

        generateVariables();

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

        if (controllerTokens.getLoop() != null) {
            loopGenerator = new LoopGenerator();
            return loopGenerator.generateLoop(controllerTokens.getLoop());

        }
        if (controllerTokens.getPrint() != null) {
            printGenerator = new PrintGenerator();
            return printGenerator.generatePrint(controllerTokens.getPrint());
        }
        if (controllerTokens.getSend() != null) {
            sendGenerator = new SendGenerator();
            return sendGenerator.sendGenerator(controllerTokens.getSend());
        }
        if(controllerTokens.getMathEquation()!=null){
            mathEquationGenerator = new MathEquationGenerator();
            return mathEquationGenerator.generateMathEquation(controllerTokens.getMathEquation());
        }
        return "\n";

    }

    public void generateVariables(){
        for (Object object:
                ProjectMain.symbolTablePage) {
            if(object instanceof Button){
                stringBuilder.append("$").append(((Button) object).getVariableName())
                        .append("= $_POST[\"").append(((Button) object).getVariableName()).append("\"];\n");
            }
            if(object instanceof Checkbox){
                    stringBuilder.append("if(isset($_POST[\"").append(((Checkbox) object).getVariableName()).append("\"]))\n");
                    stringBuilder.append("$").append(((Checkbox) object).getVariableName())
                            .append("= $_POST[\"").append(((Checkbox) object).getVariableName()).append("\"];\n");
                    stringBuilder.append("else\n$").append(((Checkbox) object).getVariableName()).append("=\"off\";");


            }
            if(object instanceof RadioGroup){
                stringBuilder.append("$").append(((RadioGroup) object).getVariableName())
                        .append("= $_POST[\"").append(((RadioGroup) object).getVariableName()).append("\"];\n");
            }
            if(object instanceof Input){
                stringBuilder.append("$").append(((Input) object).getNAME())
                        .append("= $_POST[\"").append(((Input) object).getNAME()).append("\"];\n");
            }
            if(object instanceof DropDown){
                stringBuilder.append("$").append(((DropDown) object).getName())
                        .append(" =$_POST[\"").append(((DropDown) object).getName()).append("\"];\n");
            }
        }
    }

}
