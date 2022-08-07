package Generators;

import Generators.Controller.ControllerGenerator;
import Generators.PageGenerators.PageGenerator;
import Models.DSLDocument;

public class BaseGenerartor {

    StringBuilder builder = new StringBuilder();
    ControllerGenerator controllerGenerator;
    PageGenerator pageGenerator;
    public String generateController(DSLDocument dslDocument)
    {
        builder.append("<?php\n");
        controllerGenerator = new ControllerGenerator();
        builder.append(controllerGenerator.generateController(dslDocument.getController()));
        return builder.toString();
    }

    public  String generatePage(DSLDocument dslDocument){
        if (dslDocument.getPageStructure()!= null){
            pageGenerator = new PageGenerator();
            builder.append(pageGenerator.generatePage(dslDocument.getPageStructure()));
        }
        return builder.toString();
    }
}
