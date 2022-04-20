import Models.DSLDocument;
import Visitors.BaseVisitor;
import gen.DSLLexer;
import gen.DSLParser;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Compiler {
    static String pagePath = "src/Sample/PageSyntax";
    static String controllerPath = "src/Sample/ControllerSyntax";
    static String ASTPath = "AST.txt";

    protected static void showGUI(ParseTree pt, DSLParser parser) {
        Trees.inspect(pt, parser);
    }


    public static void main(String[] args) {

//        Map<String, Object> map = new HashMap<>();
//        Map<String, String> map2 = new HashMap<>();
//        Map<String, String> map3 = new HashMap<>();
//        ArrayList<Map> maps = new ArrayList<>();
//        maps.add(map2);
//        maps.add(map3);
//        map2.put("Key2", "Value");
//        map2.put("Key22", "Value");
//        map3.put("Key3", "Value");
//
//        map.put("key2", map2);
//        map.put("key3", map3);
//        map.put("outerKey", "outerValue");
////        map.put("nestedMap", maps);
//
//
//        //MapUtils.verbosePrint(System.out,"map",map);
////        System.out.println(verbosePrintInternal("map", map, new ArrayStack(),false));
//        return;


        try {
            String source = controllerPath;
            CharStream cs = fromFileName(source);
            DSLLexer dslLexer = new DSLLexer(cs);
            CommonTokenStream token = new CommonTokenStream(dslLexer);
            DSLParser parser = new DSLParser(token);
           // showGUI(parser.dslDocument(),parser);
           ParseTree tree = parser.dslDocument();
            DSLDocument doc = (DSLDocument) new BaseVisitor().visit(tree);
            System.out.println(doc);




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
