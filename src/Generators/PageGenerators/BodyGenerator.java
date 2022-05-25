package Generators.PageGenerators;

import Models.DSLDocument;
import Models.PageModels.Body;
import Models.PageModels.BodyAttribute;

public class BodyGenerator {

    BodyAttributeGenerator bodyAttributeGenerator;

    public void generateBody(Body body){
        DocumentGenerator.code.append("<body>\n");
        if(body.getBodyAttributes() != null){
            bodyAttributeGenerator = new BodyAttributeGenerator();
            bodyAttributeGenerator.generateBodyAttributes(body.getBodyAttributes());
        }
        DocumentGenerator.code.append("</body>\n");
    }
}
