package Generators.PageGenerators;

import Models.PageModels.PageStructure;

public class PageGenerator {

    BodyGenerator bodyGenerator;

    public void generatePage(PageStructure pageStructure) {
            DocumentGenerator.code.append("<html>\n");
            if (pageStructure.getBody() != null) {
                bodyGenerator = new BodyGenerator();
                bodyGenerator.generateBody(pageStructure.getBody());
            }
            DocumentGenerator.code.append("</html>\n");
    }
}
