package Generators.Controller;

import Models.ControllerModels.Loop;
import Visitors.ProjectMain;

public class LoopGenerator {

    StringBuilder stringBuilder;
    ControllerGenerator controllerGenerator;

    public String generateLoop(Loop loop) {

        stringBuilder = new StringBuilder();
        String var1 = "", var2 = "";
        boolean addElse = false;

        if(loop.getFileNameId1()!=null && loop.getFileNameId2()!=null) {
            stringBuilder.append("if(is_numeric($").append(loop.getFileNameId1()).append(") && is_numeric($").append(loop.getFileNameId2())
                    .append("))");
            addElse = true;
        }
        else if(loop.getFileNameId1()!=null)
        stringBuilder.append("if(is_numeric($").append(loop.getFileNameId1()).append(")").append(")\n");
       else if(loop.getFileNameId2()!=null)
            stringBuilder.append("if(is_numeric($").append(loop.getFileNameId2()).append(")").append(")\n");
        stringBuilder.append("for( $i").append(ProjectMain.VARIABLE_COUNTER).append(" = ");

        if (loop.getFileNameId1() != null) {
            var1 = "$"+loop.getFileNameId1();
            stringBuilder.append("$").append(loop.getFileNameId1()).append(" ;");
        }
        if (loop.getTextNum1() != null) {
            var1 = loop.getTextNum1();
            stringBuilder.append(loop.getTextNum1()).append(" ;");
        }
        if (loop.getFileNameId2() != null) {
            var2 = "$"+loop.getFileNameId2();
        }
        if (loop.getTextNum2() != null) {
            var2 = loop.getTextNum2();
        }

        stringBuilder.append(" ").append("$i").append(ProjectMain.VARIABLE_COUNTER).append("<=").append(var2).append(" ;").append(" ")
                .append("$i").append(ProjectMain.VARIABLE_COUNTER).append("++ )\n").append("{\n");

        if (loop.getControllerTokens().size() > 0){
            controllerGenerator = new ControllerGenerator();
            for (int i=0 ; i < loop.getControllerTokens().size() ; i++){
                stringBuilder.append(controllerGenerator.generateControllerToken(loop.getControllerTokens().get(i))).append("\n");
            }
        }

        ProjectMain.VARIABLE_COUNTER++;
        if(addElse)
    stringBuilder.append("}else{echo\"could not execute for because one of the variables is not a number\";}\n");
        else
            stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
