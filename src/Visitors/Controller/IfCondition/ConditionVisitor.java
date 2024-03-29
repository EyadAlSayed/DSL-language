package Visitors.Controller.IfCondition;

import Models.ControllerModels.If.Condition;
import Visitors.Controller.TextValueVisitor;
import gen.DSLParserBaseVisitor;

public class ConditionVisitor extends DSLParserBaseVisitor {


    Condition condition;

    LogicalOperationVisitor logicalOperationVisitor;
    TextValueVisitor textValueVisitor;


//    public Condition visitCondition(DSLParser.ConditionContext ctx, Node father) {
//
//        condition = new Condition();
//
//        if (ctx.equal_condition() != null && ctx.equal_condition().FILE_NAME_ID() != null)
//        {
//            Object text = CustomPair.containVariable(ctx.equal_condition().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage);
//            if(text !=null) {
//                if (text instanceof TextField || text instanceof RadioGroup || text instanceof Checkbox)
//                    condition.setFileNameId(ctx.equal_condition().FILE_NAME_ID().getText());
//                else {
//                    ProjectMain.ERROR = true;
//                    try {
//                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID().getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON}\n", StandardOpenOption.APPEND);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//            else{
//                String variableType = CustomPair.inScope(father,ctx.FILE_NAME_ID().getText(),null);
//                if (variableType == null){
//                    ProjectMain.ERROR = true;
//                    try {
//                        Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.equal_condition().FILE_NAME_ID().getText() + " VARIABLE DOES NOT EXIST!\n", StandardOpenOption.APPEND);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }else
//                    condition.setFileNameId(ctx.FILE_NAME_ID().getText());
//            }
//        }

//        if (ctx.logicalOperation(0) != null) {
//            logicalOperationVisitor = new LogicalOperationVisitor();
//            condition.setLogicalOperation1(logicalOperationVisitor.visitLogicalOperation(ctx.logicalOperation(0)));
//        }
//        if (ctx.textValue() != null) {
//            textValueVisitor = new TextValueVisitor();
//            condition.setTextValue(textValueVisitor.visitTextValue(ctx.textValue()));
//        }
//      if (ctx.logicalOperation(1) != null) {
//          logicalOperationVisitor = new LogicalOperationVisitor();
//          condition.setLogicalOperation2(logicalOperationVisitor.visitLogicalOperation(ctx.logicalOperation(1)));
//      }
//
//        return condition;
//    }
}
