package Visitors.Controller.IfCondition;

import Models.ControllerModels.If.Condition;
import Visitors.Controller.TextValueVisitor;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class ConditionVisitor extends DSLParserBaseVisitor {


    Condition condition = new Condition();

    LogicalOperationVisitor logicalOperationVisitor = new LogicalOperationVisitor();
    TextValueVisitor textValueVisitor = new TextValueVisitor();


    public Condition visitCondition(DSLParser.ConditionContext ctx) {

        if (ctx.FILE_NAME_ID() != null)
        {
           // Object text = CustomPair.containVariable(ctx.FILE_NAME_ID().getText(), ProjectMain.symbolTablePage);
           // if(text instanceof Text || text instanceof TextField|| text instanceof RadioGroup || text instanceof Checkbox)
            condition.setFileNameId(ctx.FILE_NAME_ID().getText());
           /* else{
                ProjectMain.ERROR=true;
                try{
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID().getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON} OR DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }*/
        }

        if (ctx.logicalOperation(0) != null)
            condition.setLogicalOperation1(logicalOperationVisitor.visitLogicalOperation(ctx.logicalOperation(0)));

        if (ctx.textValue() != null)
            condition.setTextValue(textValueVisitor.visitTextValue(ctx.textValue()));

      if (ctx.logicalOperation(1) != null)
          condition.setLogicalOperation2(logicalOperationVisitor.visitLogicalOperation(ctx.logicalOperation(1)));


        return condition;
    }
}
