package Generators;

import Generators.Controller.ControllerGenerator;
import Models.DSLDocument;

public class BaseGenerartor {

    StringBuilder builder = new StringBuilder();
    ControllerGenerator controllerGenerator;

    public String generateController(DSLDocument dslDocument)
    {
        controllerGenerator = new ControllerGenerator();
        builder.append("<?php\n");
        builder.append(controllerGenerator.generateController(dslDocument.getController()));
        return builder.toString();
    }
}
