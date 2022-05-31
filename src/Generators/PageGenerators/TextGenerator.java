package Generators.PageGenerators;

import Models.PageModels.Text;

public class TextGenerator {

    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generateText(Text text) {
        stringBuilder.append("<label>").append(text.getVALUE()).append("</label>\n");
        return stringBuilder;
    }
}
