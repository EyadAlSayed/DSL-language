package Generators.PageGenerators;

import Generators.PageGenerators.extras.BodyAttributeAutoNameGenerator;
import Generators.PageGenerators.extras.MarginsMatrixClass;
import Models.PageModels.ImageModel;


public class ImageGenerator {

    StringBuilder stringBuilder = new StringBuilder();
    boolean hasMargins = false;
    String divName = BodyAttributeAutoNameGenerator.getAutoName();

    public StringBuilder generateImage(ImageModel image){
        String imagePath = image.getVALUE().replace('"', ' ');

        if(image.getMARGINS() != null){
            hasMargins = true;
            stringBuilder.append("<div class=\"").append(divName).append("\">\n");
        }

        stringBuilder.append("<img src=\"").append(imagePath).append("\">\n");

        if(hasMargins){
            stringBuilder.append("</div>\n");
            addToMarginsList(image);
        }

        stringBuilder.append("<br>\n");

        return stringBuilder;
    }

    private void addToMarginsList(ImageModel image){
        MarginsMatrixClass margin = new MarginsMatrixClass();
        int[] marginValues = new int[4];
        marginValues[0] = image.getMARGINS()[0];
        marginValues[1] = image.getMARGINS()[1];
        marginValues[2] = image.getMARGINS()[2];
        marginValues[3] = image.getMARGINS()[3];
        margin.setDivName(divName);
        margin.setMargins(marginValues);
        PageGenerator.marginsMatrix.add(margin);
    }
}
