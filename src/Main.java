import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ChocopyLexer lexer = new ChocopyLexer(CharStreams.fromFileName(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ChocopyParser parser = new ChocopyParser(tokens);
        ParseTree tree = parser.program();

        Visitor loader = new Visitor();
        loader.visit(tree);
    }
}
