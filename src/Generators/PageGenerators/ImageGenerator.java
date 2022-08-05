package Generators.PageGenerators;

import Models.PageModels.ImageModel;

public class ImageGenerator {

    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generateImage(ImageModel image){
        String imagePath = image.getVALUE().replace('"', ' ');
        stringBuilder.append("<img src=\"").append(imagePath).append("\">\n").append("<br>\n");
        return stringBuilder;
    }
}
