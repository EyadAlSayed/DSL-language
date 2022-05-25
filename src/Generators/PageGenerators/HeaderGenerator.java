package Generators.PageGenerators;

import Models.PageModels.Header;

public class HeaderGenerator {

    public void generateHeader(Header header){
        DocumentGenerator.code.append("<title>\n")
                .append(header.getVALUE()).append("\n")
                .append("</title>\n");
    }
}
