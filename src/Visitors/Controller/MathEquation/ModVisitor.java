package Visitors.Controller.MathEquation;

import Models.ControllerModels.Action.Mod;
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

public class ModVisitor extends DSLParserBaseVisitor {
    Mod mod = new Mod();


    TextValueVisitor textValueVisitor = new TextValueVisitor();

    @Override
    public Mod visitMod(DSLParser.ModContext ctx) {


        if (ctx.FILE_NAME_ID(0) != null)
        {
            Object text = CustomPair.containVariable(ctx.FILE_NAME_ID(0).getText(), ProjectMain.symbolTablePage);
            if( text instanceof TextField || text instanceof RadioGroup)
                mod.setFileNameId1(ctx.FILE_NAME_ID(0).getText());
            else{
                ProjectMain.ERROR=true;
                try{
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(0).getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON} DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        if (ctx.ASSIGN_OP_ID() != null)
            mod.setAssignOpId(ctx.ASSIGN_OP_ID().getText());

        if (ctx.textValue(0) != null)
            mod.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(0)));

        if (ctx.FILE_NAME_ID(1) != null)
        {
            Object text = CustomPair.containVariable(ctx.FILE_NAME_ID(1).getText(), ProjectMain.symbolTablePage);
            if( text instanceof TextField || text instanceof RadioGroup)
                mod.setFileNameId1(ctx.FILE_NAME_ID(1).getText());
            else{
                ProjectMain.ERROR=true;
                try{
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(1).getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON} DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        if (ctx.MOD_OP_ID() != null)
            mod.setModOpId(ctx.MOD_OP_ID().getText());

        if (ctx.textValue(1) != null)
            mod.setTextValue1(textValueVisitor.visitTextValue(ctx.textValue(1)));

        if (ctx.FILE_NAME_ID(2) != null)
        {
            Object text = CustomPair.containVariable(ctx.FILE_NAME_ID(2).getText(), ProjectMain.symbolTablePage);
            if( text instanceof TextField || text instanceof RadioGroup)
                mod.setFileNameId1(ctx.FILE_NAME_ID(2).getText());
            else{
                ProjectMain.ERROR=true;
                try{
                    Files.writeString(ProjectMain.FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.FILE_NAME_ID(2).getText() + " IS NOT {TEXT,TEXTFIELD,CHECKBOX,RADIOBUTTON} DOES NOT EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        if (ctx.END_STATMENT_ID() != null)
            mod.setEndStatementId(ctx.END_STATMENT_ID().getText());

        return mod;
    }
}
