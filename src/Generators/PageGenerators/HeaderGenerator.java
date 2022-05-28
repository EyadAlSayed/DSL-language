package Generators.PageGenerators;

import Models.PageModels.Header;

public class HeaderGenerator {

    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generateHeader(Header header){
        stringBuilder.append("<title>\n")
                .append(header.getVALUE()).append("\n")
                .append("</title>\n");

        return stringBuilder;
    }
}