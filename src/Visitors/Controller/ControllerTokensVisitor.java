package Visitors.Controller;

import Models.ControllerModels.ControllerTokens;
import Visitors.Controller.IfCondition.IfStatementVisitor;
import Visitors.Controller.MathEquation.MathEquationVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class ControllerTokensVisitor extends DSLParserBaseVisitor {

    ControllerTokens controllerTokens;

    IfStatementVisitor ifStatementVisitor;

    AssignVisitor assignVisitor;
    PrintVisitor printVisitor;
    MathEquationVisitor mathEquationVisitor;
    LoopVisitor loopVisitor;
    SendVisitor sendVisitor;


    public ControllerTokens visitControllerTokens(DSLParser.ControllerTokensContext ctx) {

        controllerTokens = new ControllerTokens();

        if (ctx.ifStatment() != null) {
            ifStatementVisitor = new IfStatementVisitor();
            controllerTokens.setIfStatement(ifStatementVisitor.visitIfStatment(ctx.ifStatment()));
        }
        if (ctx.loop() != null) {
            loopVisitor = new LoopVisitor();
            controllerTokens.setLoop(loopVisitor.visitLoop(ctx.loop()));
        }
        if (ctx.assign() != null) {
            assignVisitor = new AssignVisitor();
            controllerTokens.setAssign(assignVisitor.visitAssign(ctx.assign()));
        }
        if (ctx.print() != null) {
            printVisitor = new PrintVisitor();
            controllerTokens.setPrint(printVisitor.visitPrint(ctx.print()));
        }
        if (ctx.send() != null) {
            sendVisitor = new SendVisitor();
            controllerTokens.setSend(sendVisitor.visitSend(ctx.send()));
        }
        if (ctx.mathEquation() != null) {
            mathEquationVisitor = new MathEquationVisitor();
            controllerTokens.setMathEquation(mathEquationVisitor.visitMathEquation(ctx.mathEquation()));
        }

        return controllerTokens;
    }
}
