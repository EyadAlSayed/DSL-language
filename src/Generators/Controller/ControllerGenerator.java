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
                for (int i = 0; i < ((Checkbox) object).getCheckboxAttributes().size(); i++) {
                    stringBuilder.append("if(isset($_POST[\"").append(((Checkbox) object).getCheckboxAttributes().get(i)).append("\"]))\n");
                    stringBuilder.append("$").append(((Checkbox) object).getCheckboxAttributes().get(i))
                            .append("= $_POST[\"").append(((Checkbox) object).getCheckboxAttributes().get(i)).append("\"];\n");
                    stringBuilder.append("else\n$").append(((Checkbox) object).getCheckboxAttributes().get(i)).append("=\"off\";");
                }

            }
            if(object instanceof RadioGroup){
                stringBuilder.append("$").append(((RadioGroup) object).getVariableName())
                        .append("= $_POST[\"").append(((RadioGroup) object).getVariableName()).append("\"];\n");
            }
            if(object instanceof TextField){
                stringBuilder.append("$").append(((TextField) object).getNAME())
                        .append("= $_POST[\"").append(((TextField) object).getNAME()).append("\"];\n");
            }
            if(object instanceof DropDown){
                stringBuilder.append("$").append(((DropDown) object).getName())
                        .append(" =$_POST[\"").append(((DropDown) object).getName()).append("\"];\n");
            }
        }
    }

}
