package Generators.PageGenerators;

import Models.PageModels.PageStructure;

public class PageGenerator {

    BodyGenerator bodyGenerator;
    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generatePage(PageStructure pageStructure) {
            stringBuilder.append("<html>\n");
            stringBuilder.append("<head>\n");
            stringBuilder.append("<style>\n");
            stringBuilder.append("</style>\n");
            stringBuilder.append("</head>\n");
            if (pageStructure.getBody() != null) {
                bodyGenerator = new BodyGenerator();
                stringBuilder.append(bodyGenerator.generateBody(pageStructure.getBody(),pageStructure.getCONTROLLER()));
            }
            stringBuilder.append("</html>\n");

            return stringBuilder;
    }
}
