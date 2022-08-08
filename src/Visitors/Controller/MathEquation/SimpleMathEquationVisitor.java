package Visitors.Controller.MathEquation;

import Models.ControllerModels.Action.SimpleMathEquation;
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

public class SimpleMathEquationVisitor extends DSLParserBaseVisitor {

    TextValueVisitor textValueVisitor;
    MathOperationVisitor mathOperationVisitor;

    public SimpleMathEquation visitSimpleMathEquation(DSLParser.SimpleMathEquationContext ctx, Node father) {
        SimpleMathEquation simpleMathEquation = new SimpleMathEquation();

        textValueVisitor = new TextValueVisitor();
        mathOperationVisitor = new MathOperationVisitor();


        if (ctx.FILE_NAME_ID(0) != null) {
            Object object = CustomPair.containVariable(ctx.FILE_NAME_ID(0).getText(), ProjectMain.symbolTablePage);
            if (object != null) {
                if (object instanceof Text || object instanceof TextField || object instanceof RadioGroup || object instanceof Checkbox) {
                    simpleMathEquation.setFileNameId1(ctx.FILE_NAME_ID(0).getText());
                } else {
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(0).getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON}\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                String variableType = CustomPair.inScope(father, ctx.FILE_NAME_ID(0).getText(), null);
                if (variableType == null) {
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(0).getText() + " DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    simpleMathEquation.setFileNameId1(ctx.FILE_NAME_ID(0).getText());
                }
            }        }
        if(ctx.textValue(0) != null)
            simpleMathEquation.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(0)));

        if(ctx.mathOperation() != null)
            simpleMathEquation.setMathOperation(mathOperationVisitor.visitMathOperation(ctx.mathOperation()));

        if (ctx.FILE_NAME_ID(1) != null) {
            Object object = CustomPair.containVariable(ctx.FILE_NAME_ID(1).getText(), ProjectMain.symbolTablePage);
            if (object != null) {
                if (object instanceof Text || object instanceof TextField || object instanceof RadioGroup || object instanceof Checkbox
                || object instanceof String || object instanceof DropDown) {
                    simpleMathEquation.setFileNameId2(ctx.FILE_NAME_ID(1).getText());
                } else {
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(1).getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON}\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                String variableType = CustomPair.inScope(father, ctx.FILE_NAME_ID(1).getText(), null);
                if (variableType == null) {
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(1).getText() + " DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    simpleMathEquation.setFileNameId2(ctx.FILE_NAME_ID(1).getText());
                }
            }        }
        if(ctx.textValue(1) != null)
            simpleMathEquation.setTextValue2(textValueVisitor.visitTextValue(ctx.textValue(1)));

        return  simpleMathEquation;
    }
}
