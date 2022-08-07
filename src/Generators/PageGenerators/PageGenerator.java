package Generators.PageGenerators;

import Generators.PageGenerators.extras.MarginsMatrixClass;
import Models.PageModels.PageStructure;

import java.util.ArrayList;
import java.util.List;

public class PageGenerator {

    BodyGenerator bodyGenerator;
    StringBuilder stringBuilder = new StringBuilder();

    public static List<MarginsMatrixClass> marginsMatrix = new ArrayList<>();

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

            if (!marginsMatrix.isEmpty()){
                addCSSCode();
            }

            return stringBuilder;
    }

    private void addCSSCode(){
        for (MarginsMatrixClass margin : marginsMatrix) {
            String cssCode = "\n." + margin.getDivName() + "{\n"
                    + "margin: " + margin.getMargins()[0] + " " + margin.getMargins()[1] + " " + margin.getMargins()[2] + " " + margin.getMargins()[3] + ";\n"
                    +"}\n";
            stringBuilder.insert(21, cssCode);
        }
    }
}
