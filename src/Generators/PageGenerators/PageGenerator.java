package Generators.PageGenerators;

import Models.PageModels.PageStructure;

public class PageGenerator {

    BodyGenerator bodyGenerator;
    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generatePage(PageStructure pageStructure) {
            //DocumentGenerator.code.append("<html>\n");
            stringBuilder.append("<html>\n");
            if (pageStructure.getBody() != null) {
                bodyGenerator = new BodyGenerator();
                stringBuilder.append(bodyGenerator.generateBody(pageStructure.getBody(),pageStructure.getCONTROLLER()));
            }
            stringBuilder.append("</html>\n");

            return stringBuilder;
    }
}
