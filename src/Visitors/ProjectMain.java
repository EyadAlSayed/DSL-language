package Visitors;

import Models.DSLDocument;
import gen.DSLLexer;
import gen.DSLParser;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class ProjectMain {
    static String pagePath = "src/Sample/PageSyntax";
    static String controllerPath = "src/Sample/ControllerSyntax";
    static String ASTPath = "AST.txt";
   public static ArrayList<Pair<String,Object>> symbolTableController = new ArrayList<>();
    public static ArrayList<Pair<String,Object>> symbolTablePage = new ArrayList<>();
    public static File FILE;
    public static FileOutputStream FILEOUTPUTSTREAM;
    public static DSLParser parser;


    protected static void showGUI(ParseTree pt, DSLParser parser) {
        Trees.inspect(pt, parser);
    }


    public static void main(String[] args) throws FileNotFoundException {
                FILE =  new File("D:\\Documents\\GitHub\\DSL-language2\\src\\Errors");
                FILEOUTPUTSTREAM = new FileOutputStream(FILE,true);
        try {
            String source = pagePath;
            CharStream cs = fromFileName(source);
            DSLLexer dslLexer = new DSLLexer(cs);
            CommonTokenStream token = new CommonTokenStream(dslLexer);
                parser = new DSLParser(token);

            //showGUI(parser.dslDocument(),parser);
            ParseTree tree = parser.dslDocument();
            DSLDocument doc = (DSLDocument) new BaseVisitor().visit(tree);
            System.out.println(doc);




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
