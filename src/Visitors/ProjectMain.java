package Visitors;

import Generators.BaseGenerartor;
import Models.DSLDocument;
import gen.DSLLexer;
import gen.DSLParser;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class ProjectMain {
    public static ArrayList<Object> symbolTablePage = new ArrayList<>();
    public static String PAGE_NAME;
    public static int VARIABLE_COUNTER = 1;
    public static File ERROR_FILE;
    public static FileOutputStream FILEOUTPUTSTREAM;
    public static boolean ERROR = false;
    static String pagePath = "src/Sample/PageSyntax";
    static String controllerPath = "src/Sample/ControllerSyntax";
    public static String htdocsPath = "D:\\xampp\\htdocs";

    protected static void showGUI(ParseTree pt, DSLParser parser) {
        Trees.inspect(pt, parser);
    }


    public static void main(String[] args) throws FileNotFoundException {
        ERROR_FILE = new File("D:\\Documents\\GitHub\\DSL-language2\\src\\Errors.txt");
        try {
            Files.writeString(ERROR_FILE.toPath(), "");
        } catch (IOException e) {
            e.printStackTrace();
        }
        FILEOUTPUTSTREAM = new FileOutputStream(ERROR_FILE, true);
        try {
            Files.writeString(ERROR_FILE.toPath(), "");
        } catch (IOException e) {
            e.printStackTrace();
        }

            DSLDocument pageDoc = generateCode(true,null,true);
            DSLDocument controllerDoc = generateCode(false,null,true);

            if (ERROR) {
                System.out.println("An error has acquired check error file");
                return;
            }
            BaseGenerartor controllerGenerator = new BaseGenerartor();
            BaseGenerartor pageGenerator = new BaseGenerartor();
            if(controllerDoc != null) {
                File controllerFile = new File(htdocsPath +"\\"+ controllerDoc.getController().getFileNameId1() + ".php");
                try {
                    Files.writeString(controllerFile.toPath(), controllerGenerator.generateController(controllerDoc));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(pageDoc != null) {
                File pageFile = new File(htdocsPath+"\\" + pageDoc.getPageStructure().getPAGE_NAME() + ".html");
                try {
                    Files.writeString(pageFile.toPath(), pageGenerator.generatePage(pageDoc));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }

    public static DSLDocument generateCode(boolean isPage , String fileName,boolean storeFile){

        String source;

        if (isPage){
            source = pagePath;
        }else{
            source = controllerPath;
        }
        if (fileName != null){
            source = fileName;
        }
        CharStream cs = null;
        try {
            cs = fromFileName(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(source));
            if(bufferedReader.readLine() == null)
                return null;
            DSLLexer dslLexer = new DSLLexer(cs);
            dslLexer.removeErrorListeners();
            dslLexer.addErrorListener(ThrowingErrorListener.INSTANCE);
            CommonTokenStream token = new CommonTokenStream(dslLexer);
            DSLParser parser = new DSLParser(token);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            DSLDocument doc;
            ParseTree tree = parser.dslDocument();
            doc = (DSLDocument) new BaseVisitor().visit(tree);
            System.out.println(doc);
            if(isPage && storeFile) {
                storeFile(doc.getPageStructure().getPAGE_NAME(), true);
            }else if(!isPage && storeFile) {
                if(doc.getController()!=null)
                    storeFile(doc.getController().getFileNameId1(),false);
            }

            return doc;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void generateSymbolTable(String pageName){
        symbolTablePage.clear();
        String source = htdocsPath + "\\" + pageName + ".txt";
        generateCode(true,source,false);

    }

    public static void  storeFile(String filename , boolean isPage){

        try {

            FileReader fr;
           if(isPage) {
                fr = new FileReader(pagePath);
           }else {
                fr = new FileReader(controllerPath);
           }
            FileWriter fw = new FileWriter(htdocsPath + "\\" + filename + ".txt");

            StringBuilder str = new StringBuilder();

            int i;
            while ((i = fr.read()) != -1) {

                str.append((char) i);
            }

            fw.write(str.toString());


            fr.close();
            fw.close();

        }

        catch (IOException ignored) {

        }
    }
}
