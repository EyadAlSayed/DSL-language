package Visitors.PageVisitors;

import Models.PageModels.BodyAttribute;
import Visitors.CustomPair;
import Visitors.ProjectMain;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class BodyAttributeVisitor extends DSLParserBaseVisitor {

    BodyAttribute bodyAttribute;

    HeaderVisitor headerVisitor;
    TextVisitor textVisitor;
    InputVisitor inputVisitor;
    ButtonVisitor buttonVisitor;
    RadioGroupVisitor radioGroupVisitor;
    CheckboxVisitor checkboxVisitor;
    ImageVisitor imageVisitor;
    DropDownVisitor dropDownVisitor;

    @Override
    public BodyAttribute visitBodyAttributes(DSLParser.BodyAttributesContext ctx) {

        bodyAttribute = new BodyAttribute();

        if (ctx.headerStructure() != null) {
            headerVisitor = new HeaderVisitor();
            bodyAttribute.setHeader(headerVisitor.visitHeaderStructure(ctx.headerStructure()));
        }
        if (ctx.text() != null) {
            if (CustomPair.containVariable(ctx.text().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage) == null) {
                textVisitor = new TextVisitor();
                bodyAttribute.setText(textVisitor.visitText(ctx.text()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getText());
            } else{
                ProjectMain.ERROR = true;
                try{
                    Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.text().FILE_NAME_ID().getText() + " ALREADY EXISTS!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        if (ctx.input() != null) {
            if (CustomPair.containVariable(ctx.input().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage) == null) {
                inputVisitor = new InputVisitor();
                bodyAttribute.setInput(inputVisitor.visitInput(ctx.input()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getInput());
            } else{
                ProjectMain.ERROR = true;
                try{
                    Files.writeString(ProjectMain.ERROR_FILE.toPath(), "SEMANTIC ERROR: VARIABLE " + ctx.input().FILE_NAME_ID().getText() + " ALREADY EXISTS!\n", StandardOpenOption.APPEND);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        if (ctx.button() != null) {
            if (CustomPair.containVariable(ctx.button().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage) == null) {
                buttonVisitor = new ButtonVisitor();
                bodyAttribute.setButton(buttonVisitor.visitButton(ctx.button()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getButton());
            }else {
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.ERROR_FILE.toPath(),"SEMANTIC ERROR: VARIABLE "+ctx.button().FILE_NAME_ID().getText()+" ALREADY EXISTS!\n", StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (ctx.radioGroup() != null) {
            if (CustomPair.containVariable(ctx.radioGroup().FILE_NAME_ID(0).getText(), ProjectMain.symbolTablePage) == null) {
                radioGroupVisitor = new RadioGroupVisitor();
                bodyAttribute.setRadioGroup(radioGroupVisitor.visitRadioGroup(ctx.radioGroup()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getRadioGroup());
            }else {
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.ERROR_FILE.toPath(),"SEMANTIC ERROR: VARIABLE "+ctx.radioGroup().FILE_NAME_ID(0).getText()+" ALREADY EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if(ctx.checkbox() != null){
            if(CustomPair.containVariable(ctx.checkbox().FILE_NAME_ID().getText(), ProjectMain.symbolTablePage) == null) {
                checkboxVisitor = new CheckboxVisitor();
                bodyAttribute.setCheckbox(checkboxVisitor.visitCheckbox(ctx.checkbox()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getCheckbox());
            }else{
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.ERROR_FILE.toPath(),"SEMANTIC ERROR: VARIABLE "+ctx.checkbox().FILE_NAME_ID().getText()+" ALREADY EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }

        if(ctx.image() != null){
            imageVisitor = new ImageVisitor();
            bodyAttribute.setImage(imageVisitor.visitImage(ctx.image()));
        }

        if(ctx.dropDown() != null){
            if(CustomPair.containVariable(ctx.dropDown().FILE_NAME_ID(0).getText(),ProjectMain.symbolTablePage) == null){
                dropDownVisitor = new DropDownVisitor();
                bodyAttribute.setDropDown(dropDownVisitor.visitDropDown(ctx.dropDown()));
                ProjectMain.symbolTablePage.add(bodyAttribute.getDropDown());
            }else {
                ProjectMain.ERROR = true;
                try {
                    Files.writeString(ProjectMain.ERROR_FILE.toPath(),"SEMANTIC ERROR: VARIABLE "+ctx.dropDown().FILE_NAME_ID(0).getText()+" ALREADY EXIST!\n", StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return bodyAttribute;
    }
}
