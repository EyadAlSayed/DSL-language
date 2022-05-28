package Generators.PageGenerators;

import Models.DSLDocument;

public class DocumentGenerator {

    PageGenerator pageGenerator;


    public StringBuilder code = new StringBuilder();

    private StringBuilder generateCode(DSLDocument document){
        if(document.getPageStructure() != null)
            code.append(pageGenerator.generatePage(document.getPageStructure()));
        //if(document.getController() != null)
            //generate controller.
        return code;
    }
}