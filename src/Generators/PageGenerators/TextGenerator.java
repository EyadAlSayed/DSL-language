package Generators.PageGenerators;

import Generators.PageGenerators.extras.BodyAttributeAutoNameGenerator;
import Generators.PageGenerators.extras.MarginsMatrixClass;
import Models.PageModels.Text;

public class TextGenerator {

    StringBuilder stringBuilder = new StringBuilder();
    boolean hasMargins = false;
    String divName = BodyAttributeAutoNameGenerator.getAutoName();

    public StringBuilder generateText(Text text) {
        String txt = text.getVALUE().replace('"', ' ');

        if(text.getMARGINS() != null){
            hasMargins = true;
            stringBuilder.append("<div class=\"").append(divName).append("\">\n");
        }
        stringBuilder.append("<label>").append(txt).append("</label>\n");
        if(hasMargins){
            stringBuilder.append("</div>\n");
            addToMarginsList(text);
        }
        stringBuilder.append("<br>\n");
        return stringBuilder;
    }

    private void addToMarginsList(Text text){
        MarginsMatrixClass margin = new MarginsMatrixClass();
        int[] marginValues = new int[4];
        marginValues[0] = text.getMARGINS()[0];
        marginValues[1] = text.getMARGINS()[1];
        marginValues[2] = text.getMARGINS()[2];
        marginValues[3] = text.getMARGINS()[3];
        margin.setDivName(divName);
        margin.setMargins(marginValues);
        PageGenerator.marginsMatrix.add(margin);
    }
}
