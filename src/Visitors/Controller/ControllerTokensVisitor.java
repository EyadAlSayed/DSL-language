package Visitors.Controller;

import Models.ControllerModels.ControllerTokens;
import Visitors.Controller.IfCondition.IfStatementVisitor;
import Visitors.Controller.MathEquation.MathEquationVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class ControllerTokensVisitor extends DSLParserBaseVisitor {

    ControllerTokens controllerTokens = new ControllerTokens();

    IfStatementVisitor ifStatementVisitor = new IfStatementVisitor();

    AssignVisitor assignVisitor = new AssignVisitor();
    PrintVisitor printVisitor = new PrintVisitor();
    MathEquationVisitor mathEquationVisitor = new MathEquationVisitor();
    LoopVisitor loopVisitor = new LoopVisitor();
    SendVisitor sendVisitor = new SendVisitor();


    public ControllerTokens visitControllerTokens(DSLParser.ControllerTokensContext ctx) {

        if (ctx.ifStatment() != null)

            controllerTokens.setIfStatement(ifStatementVisitor.visitIfStatment(ctx.ifStatment()));

        if (ctx.loop() != null)

            controllerTokens.setLoop(loopVisitor.visitLoop(ctx.loop()));

        if (ctx.assign() != null)
            controllerTokens.setAssign(assignVisitor.visitAssign(ctx.assign()));

        if (ctx.print() != null)
            controllerTokens.setPrint(printVisitor.visitPrint(ctx.print()));

        if (ctx.send() != null)
            controllerTokens.setSend(sendVisitor.visitSend(ctx.send()));

        if (ctx.mathEquation() != null)
            controllerTokens.setMathEquation(mathEquationVisitor.visitMathEquation(ctx.mathEquation()));


        return controllerTokens;
    }
}
