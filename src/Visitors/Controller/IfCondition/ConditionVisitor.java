package Visitors.Controller.IfCondition;

import Models.ControllerModels.If.Condition;
import Models.PageModels.Checkbox;
import Models.PageModels.RadioGroup;
import Models.PageModels.TextField;
import Visitors.Controller.TextValueVisitor;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class ConditionVisitor extends DSLParserBaseVisitor {


    Condition condition;

    LogicalOperationVisitor logicalOperationVisitor;
    TextValueVisitor textValueVisitor;


    public Condition visitCondition(DSLParser.ConditionContext ctx) {

        condition = new Condition();

        if (ctx.FILE_NAME_ID() != null)
        {
            Object text = CustomPair.containVariable(ctx.FILE_NAME_ID().getText(), ProjectMain.symbolTablePage);
            if(text instanceof TextField || text instanceof RadioGroup || text instanceof Checkbox)
            condition.setFileNameId(ctx.FILE_NAME_ID().getText());
            else{
                ProjectMain.ERROR=true;
                try{
                    Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID().getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON} OR DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        if (ctx.logicalOperation(0) != null) {
            logicalOperationVisitor = new LogicalOperationVisitor();
            condition.setLogicalOperation1(logicalOperationVisitor.visitLogicalOperation(ctx.logicalOperation(0)));
        }
        if (ctx.textValue() != null) {
            textValueVisitor = new TextValueVisitor();
            condition.setTextValue(textValueVisitor.visitTextValue(ctx.textValue()));
        }
      if (ctx.logicalOperation(1) != null) {
          logicalOperationVisitor = new LogicalOperationVisitor();
          condition.setLogicalOperation2(logicalOperationVisitor.visitLogicalOperation(ctx.logicalOperation(1)));
      }

        return condition;
    }
}
