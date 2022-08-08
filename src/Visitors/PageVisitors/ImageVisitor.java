package Visitors.PageVisitors;

import Models.PageModels.ImageModel;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

public class ImageVisitor extends DSLParserBaseVisitor {

    ImageModel image;

    @Override
    public ImageModel visitImage(DSLParser.ImageContext ctx){
        image = new ImageModel();

        if(ctx.IMAGE() != null){
            image.setIMAGE(ctx.IMAGE().getText());
        }
        if(ctx.TEXT() != null){
            image.setVALUE(ctx.TEXT().getText());
        }
        if (ctx.marginList().TEXTNUM(0) != null) {
            int[] MARGINS = new int[4];

            MARGINS[0] = Integer.parseInt(ctx.marginList().TEXTNUM(0).getText());
            MARGINS[1] = Integer.parseInt(ctx.marginList().TEXTNUM(1).getText());
            MARGINS[2] = Integer.parseInt(ctx.marginList().TEXTNUM(2).getText());
            MARGINS[3] = Integer.parseInt(ctx.marginList().TEXTNUM(3).getText());

            image.setMARGINS(MARGINS);
        }

        return image;
    }
}
