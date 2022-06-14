package Visitors;

import Generators.BaseGenerartor;
import Models.DSLDocument;
import gen.DSLLexer;
import gen.DSLParser;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

//TODO: Generate error page

public class ProjectMain {
    public static ArrayList<Object> symbolTablePage = new ArrayList<>();
    public  static int VARIABLE_COUNTER = 1;
    public static File FILE;
    public static FileOutputStream FILEOUTPUTSTREAM;
    public static boolean ERROR = false;
    static String pagePath = "src/Sample/PageSyntax";
    static String controllerPath = "src/Sample/ControllerSyntax";
    static String ASTPath = "AST.txt";

    protected static void showGUI(ParseTree pt, DSLParser parser) {
        Trees.inspect(pt, parser);
    }


    public static void main(String[] args) throws FileNotFoundException {
        FILE = new File("D:\\Documents\\GitHub\\DSL-language2\\src\\Errors.txt");
        try {
            Files.writeString(FILE.toPath(), "");
        } catch (IOException e) {
            e.printStackTrace();
        }
        FILEOUTPUTSTREAM = new FileOutputStream(FILE, true);
        try {
            Files.writeString(FILE.toPath(), "");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String source = pagePath;
            CharStream cs = fromFileName(source);
            DSLLexer dslLexer = new DSLLexer(cs);
            dslLexer.removeErrorListeners();
            dslLexer.addErrorListener(ThrowingErrorListener.INSTANCE);
            CommonTokenStream token = new CommonTokenStream(dslLexer);
            DSLParser parser = new DSLParser(token);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            //showGUI(parser.dslDocument(),parser);
            DSLDocument doc = null;
            ParseTree tree = parser.dslDocument();
            doc = (DSLDocument) new BaseVisitor().visit(tree);
            System.out.println(doc);

            String sourceController = controllerPath;
            CharStream csController = fromFileName(sourceController);
            DSLLexer dslLexerController = new DSLLexer(csController);
            dslLexerController.removeErrorListeners();
            dslLexerController.addErrorListener(ThrowingErrorListener.INSTANCE);
            CommonTokenStream tokenController = new CommonTokenStream(dslLexerController);
            DSLParser parserController = new DSLParser(tokenController);
            parserController.removeErrorListeners();
            parserController.addErrorListener(ThrowingErrorListener.INSTANCE);
            //showGUI(parser.dslDocument(),parser);
            DSLDocument docController = null;
            ParseTree treeController = parserController.dslDocument();
            docController = (DSLDocument) new BaseVisitor().visit(treeController);
            System.out.println(docController);

            if (ERROR) {
                System.out.println("An error has acquired check error file");
                return;
            }
            BaseGenerartor controllerGenerator = new BaseGenerartor();
            BaseGenerartor pageGenerator = new BaseGenerartor();
            File controllerFile = new File("D:\\xampp\\htdocs\\"+docController.getController().getFileNameId1()+".php");
            try {
                Files.writeString(controllerFile.toPath(),controllerGenerator.generateController(docController));
            } catch (IOException e) {
                e.printStackTrace();
            }
            File pageFile = new File("D:\\xampp\\htdocs\\"+doc.getPageStructure().getPAGE_NAME()+".php");
            try {
                Files.writeString(pageFile.toPath(),pageGenerator.generatePage(doc));
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
