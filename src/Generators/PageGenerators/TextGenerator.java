package Generators.PageGenerators;

import Models.PageModels.Text;

public class TextGenerator {


    public void generateText(Text text) {
        DocumentGenerator.code.append("<label>").append(text.getVALUE()).append("</label>\n");
    }
}
