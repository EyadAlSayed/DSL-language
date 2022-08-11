package Visitors.Controller.MathEquation;

import Models.ControllerModels.Action.ComplexMathEquation;
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

public class ComplexMathEquationVisitor extends DSLParserBaseVisitor {

    MathOperationVisitor mathOperationVisitor;

    TextValueVisitor textValueVisitor;

    public ComplexMathEquation visitComplexMathEquation(DSLParser.ComplexMathEquationContext ctx, Node father) {
        ComplexMathEquation complexMathEquation = new ComplexMathEquation();

        textValueVisitor = new TextValueVisitor();
        mathOperationVisitor = new MathOperationVisitor();

        if (ctx.mathOperation() != null)
            complexMathEquation.setMathOperation(mathOperationVisitor.visitMathOperation(ctx.mathOperation()));

        if (ctx.FILE_NAME_ID() != null) {
            Object object = CustomPair.containVariable(ctx.FILE_NAME_ID().getText(), ProjectMain.symbolTablePage);
            if (object != null) {
                if (object instanceof Text || object instanceof Input || object instanceof RadioGroup || object instanceof Checkbox
                || object instanceof String || object instanceof DropDown) {
                    complexMathEquation.setFileNameId(ctx.FILE_NAME_ID().getText());
                } else {
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID().getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON}\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                String variableType = CustomPair.inScope(father, ctx.FILE_NAME_ID().getText(), null);
                if (variableType == null) {
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID().getText() + " DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    complexMathEquation.setFileNameId(ctx.FILE_NAME_ID().getText());
                }
            }
        }
        if (ctx.TEXTNUM() != null)
            complexMathEquation.setNumber(ctx.TEXTNUM().getText());

        return complexMathEquation;
    }


}
