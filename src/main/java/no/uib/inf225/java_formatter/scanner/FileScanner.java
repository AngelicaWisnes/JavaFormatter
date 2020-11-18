package no.uib.inf225.java_formatter.scanner;

import no.uib.inf225.java_formatter.Java9BaseVisitor;
import no.uib.inf225.java_formatter.Java9Lexer;
import no.uib.inf225.java_formatter.Java9Parser;
import no.uib.inf225.java_formatter.JavaVisitor;
import no.uib.inf225.java_formatter.util.TreePrinter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class FileScanner {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileScanner.class);

    public void scan(Path file) {
        String fileName = file.getFileName().toString();

        if (fileName.equals("HelloWorld.java")) {
            LOGGER.info("Scanner initiated with file: {}", fileName);
            try {
                handle(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void handle(Path file) throws Exception {
        LOGGER.info("Started handling of file: {}", file.getFileName());

        String data = new String(Files.readAllBytes(file));
        Java9Lexer lexer = new Java9Lexer(CharStreams.fromString(data));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java9Parser parser = new Java9Parser(tokens);
        ParseTree tree = parser.compilationUnit();

        //ParseTreeWalker walker = new ParseTreeWalker();

        //JavaListener javaListener = new JavaListener();
        //walker.walk(javaListener, tree);

        LOGGER.info("STARTING VISITOR");
        JavaVisitor visitor = new JavaVisitor();
        visitor.visit(tree);
        LOGGER.info("DONE VISITING");



        TreePrinter.prettyPrint(tree, Arrays.asList(parser.getRuleNames()));
    }
}
