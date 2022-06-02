package Generators.PageGenerators;

import Models.PageModels.Header;

public class HeaderGenerator {

    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generateHeader(Header header){
        String title = header.getVALUE().replace('"', ' ');
        stringBuilder.append("<title>\n")
                .append(title).append("\n")
                .append("</title>\n");

        return stringBuilder;
    }
}