package Generators.PageGenerators;

import Generators.Controller.ControllerGenerator;
import Models.DSLDocument;

public class DocumentGenerator {

    PageGenerator pageGenerator;
    ControllerGenerator controllerGenerator;


    public StringBuilder code = new StringBuilder();

    private String generateCode(DSLDocument document){
        if(document.getPageStructure() != null) {
            pageGenerator = new PageGenerator();
            code.append(pageGenerator.generatePage(document.getPageStructure())).append("\n");
        }
        if(document.getController() != null){
            controllerGenerator = new ControllerGenerator();
            code.append(controllerGenerator.generateController(document.getController())).append("\n");
        }

        return code.toString();
    }
}