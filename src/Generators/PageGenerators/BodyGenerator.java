package Generators.PageGenerators;

import Models.PageModels.Body;

public class BodyGenerator {

    BodyAttributeGenerator bodyAttributeGenerator;
    StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder generateBody(Body body, String controller){
        stringBuilder.append("<body>\n");
        if(body.getBodyAttributes() != null){
            bodyAttributeGenerator = new BodyAttributeGenerator();
            stringBuilder.append(bodyAttributeGenerator.generateBodyAttributes(body.getBodyAttributes(),controller));
        }
        stringBuilder.append("</body>\n");

        return stringBuilder;
    }
}
