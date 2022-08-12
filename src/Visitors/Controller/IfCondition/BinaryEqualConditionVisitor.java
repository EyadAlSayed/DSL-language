package Visitors.Controller.IfCondition;

import Models.ControllerModels.If.BinaryEqualCondition;
import Models.PageModels.*;
import Visitors.Controller.TextValueVisitor;
import Visitors.CustomPair;
import Visitors.Node;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class BinaryEqualConditionVisitor  extends DSLParserBaseVisitor {

    LogicalOperationVisitor logicalOperationVisitor;
    TextValueVisitor textValueVisitor;


    public BinaryEqualCondition visitBinary_equal_condition(DSLParser.Binary_equal_conditionContext ctx, Node father) {
        BinaryEqualCondition binaryEqualCondition = new BinaryEqualCondition();
        logicalOperationVisitor = new LogicalOperationVisitor();
        textValueVisitor = new TextValueVisitor();
        String firstVariableType = "";

        if (ctx.logicalOperation() != null)
            binaryEqualCondition.setLogicalOperation(logicalOperationVisitor.visitLogicalOperation(ctx.logicalOperation()));

        if(ctx.FILE_NAME_ID(0) != null) {
            Object object = CustomPair.containVariable(ctx.FILE_NAME_ID(0).getText(), ProjectMain.symbolTablePage);
            if(object != null){
                if(object instanceof Text || object instanceof Input || object instanceof RadioGroup || object instanceof Checkbox||
                object instanceof String || object instanceof DropDown){
                    binaryEqualCondition.setFileNameId1(ctx.FILE_NAME_ID(0).getText());
                    firstVariableType = "TEXT";
                }else{
                    ProjectMain.ERROR=true;
                    try{
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(0).getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON}\n", StandardOpenOption.APPEND);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }else{
                String variableType = CustomPair.inScope(father,ctx.FILE_NAME_ID(0).getText(),null);
                if (variableType == null){
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(0).getText() + " VARIABLE DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else {
                    binaryEqualCondition.setFileNameId1(ctx.FILE_NAME_ID(0).getText());
                    firstVariableType = variableType;
                }
            }
        }
        if(ctx.EQUAL_OP_ID() != null)
            binaryEqualCondition.setEqualOpId(ctx.EQUAL_OP_ID().getText());

        if (ctx.NOT_EQUAL_OP_ID()!= null)
            binaryEqualCondition.setNotEqualOpId(ctx.NOT_EQUAL_OP_ID().getText());

        if(ctx.textValue() != null)
            binaryEqualCondition.setTextValue(textValueVisitor.visitTextValue(ctx.textValue()));

        if(ctx.FILE_NAME_ID(1) != null){
            Object object = CustomPair.containVariable(ctx.FILE_NAME_ID(1).getText(), ProjectMain.symbolTablePage);
            if(object != null){
                if((object instanceof Text || object instanceof Input || object instanceof RadioGroup || object instanceof Checkbox
                || object instanceof String || object instanceof DropDown)
                        && firstVariableType.equals("STRING")){
                    binaryEqualCondition.setFileNameId2(ctx.FILE_NAME_ID(1).getText());
                }else{
                    ProjectMain.ERROR=true;
                    try{
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(1).getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON} OR THE FIRST VARIABLE IS NOT STRING\n", StandardOpenOption.APPEND);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }else{
                String variableType = CustomPair.inScope(father,ctx.FILE_NAME_ID(1).getText(),null);
                if (variableType == null){
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(1).getText() + " VARIABLE DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else {
                    if(variableType.equals(firstVariableType)) {
                        binaryEqualCondition.setFileNameId2(ctx.FILE_NAME_ID(1).getText());
                    }else{
                        ProjectMain.ERROR = true;
                        try {
                            Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: " + " VARIABLES HAVE DIFFERENT TYPES!\n", StandardOpenOption.APPEND);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        return binaryEqualCondition;
    }
}
