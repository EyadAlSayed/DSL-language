package Visitors.Controller.MathEquation;

import Models.ControllerModels.Action.MathEquation;
import Models.PageModels.*;
import Visitors.CustomPair;
import Visitors.Node;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;
import org.antlr.v4.runtime.misc.Pair;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class MathEquationVisitor extends DSLParserBaseVisitor {

    SimpleMathEquationVisitor simpleMathEquationVisitor;
    ComplexMathEquationVisitor complexMathEquationVisitor;


    public MathEquation visitMathEquation(DSLParser.MathEquationContext ctx, Node father) {

        MathEquation mathEquation = new MathEquation();
        simpleMathEquationVisitor = new SimpleMathEquationVisitor();
        complexMathEquationVisitor = new ComplexMathEquationVisitor();

        if (ctx.FILE_NAME_ID() != null) {
            Object object = CustomPair.containVariable(ctx.FILE_NAME_ID().getText(), ProjectMain.symbolTablePage);
            if (object != null) {
                if (object instanceof Text || object instanceof TextField || object instanceof RadioGroup || object instanceof Checkbox
                || object instanceof String || object instanceof DropDown) {
                    mathEquation.setFileNameId(ctx.FILE_NAME_ID().getText());
                } else {
                    ProjectMain.ERROR = true;
                    try {
                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID().getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON}\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                String variableType = CustomPair.inScope(father, ctx.FILE_NAME_ID().getText(), "NUMBER");
                if (variableType == null) {
                   father.getVariables().add(new Pair<>(ctx.FILE_NAME_ID().getText(),"NUMBER"));
                } else {
                    mathEquation.setFileNameId(ctx.FILE_NAME_ID().getText());
                }
            }
        }

        if (ctx.ASSIGN_OP_ID() != null)
            mathEquation.setAssignOpId(ctx.ASSIGN_OP_ID().getText());

        if (ctx.simpleMathEquation() != null)
            mathEquation.setSimpleMathEquation(simpleMathEquationVisitor.visitSimpleMathEquation(ctx.simpleMathEquation(),father));

        for (int i = 0; i < ctx.complexMathEquation().size(); i++) {
            mathEquation.getComplexMathEquationList().add(complexMathEquationVisitor.visitComplexMathEquation(ctx.complexMathEquation(i),father));
        }

        if (ctx.END_STATMENT_ID() != null)
            mathEquation.setEndStatementId(ctx.END_STATMENT_ID().getText());
        return mathEquation;
    }
}
