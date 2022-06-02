package Generators.PageGenerators;

import Models.PageModels.Body;

public class BodyGenerator {

    BodyAttributeGenerator bodyAttributeGenerator;
    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generateBody(Body body){
        stringBuilder.append("<body>\n");
        if(body.getBodyAttributes() != null){
            bodyAttributeGenerator = new BodyAttributeGenerator();
            stringBuilder.append(bodyAttributeGenerator.generateBodyAttributes(body.getBodyAttributes()));
        }
        stringBuilder.append("</body>\n");

        return stringBuilder;
    }
}
