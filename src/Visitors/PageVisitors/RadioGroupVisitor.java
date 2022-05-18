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
        }
        return radioGroup;
    }
}
