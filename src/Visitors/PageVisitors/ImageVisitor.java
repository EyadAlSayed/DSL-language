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

        return image;
    }
}
