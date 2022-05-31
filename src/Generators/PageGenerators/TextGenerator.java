package Generators.PageGenerators;

import Models.PageModels.Text;

public class TextGenerator {

    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generateText(Text text) {
        String txt = text.getVALUE().replace('"', ' ');
        stringBuilder.append("<label>").append(txt).append("</label>\n").append("<br>\n");
        return stringBuilder;
    }
}
