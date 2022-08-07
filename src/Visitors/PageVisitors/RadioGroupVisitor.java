package Visitors.PageVisitors;

import Models.PageModels.RadioGroup;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class RadioGroupVisitor extends DSLParserBaseVisitor {

    RadioGroup radioGroup = new RadioGroup();

    @Override
    public RadioGroup visitRadioGroup(DSLParser.RadioGroupContext ctx) {
        if (ctx.RADIO_GROUP_ID() != null)
            radioGroup.setRadioGroupID(ctx.RADIO_GROUP_ID().getText());
        if (ctx.FILE_NAME_ID().size() > 0) {
            radioGroup.setVariableName(ctx.FILE_NAME_ID(0).getText());
            for (int i = 1; i < ctx.FILE_NAME_ID().size(); i++) {
                radioGroup.getRadioButtonVariables().add(ctx.FILE_NAME_ID().get(i).getText());
            }
            for (int i = 1 ; i < ctx.TEXTNUM().size() ; i++)
            {
                radioGroup.getRadioButtonVariables().add(ctx.TEXTNUM().get(i).getText());
            }
        }
        if (ctx.radioDefault().FILE_NAME_ID()!= null)
        {
            radioGroup.setDefaultValue(ctx.radioDefault().FILE_NAME_ID().getText());
        }else if(ctx.radioDefault().TEXTNUM() != null)
            radioGroup.setDefaultValue(ctx.radioDefault().TEXTNUM().getText());
        if(ctx.marginList() != null){
            int[] MARGINS = new int[4];
            if(ctx.marginList().TEXTNUM(0)!=null) {
                MARGINS[0] = Integer.parseInt(ctx.marginList().TEXTNUM(0).getText());
                MARGINS[1] = Integer.parseInt(ctx.marginList().TEXTNUM(1).getText());
                MARGINS[2] = Integer.parseInt(ctx.marginList().TEXTNUM(2).getText());
                MARGINS[3] = Integer.parseInt(ctx.marginList().TEXTNUM(3).getText());
            }
            radioGroup.setMARGINS(MARGINS);
        }
        return radioGroup;
    }
}
