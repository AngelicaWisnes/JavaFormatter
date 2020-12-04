package no.uib.inf225.java_formatter.io;

import no.uib.inf225.java_formatter.Java9Lexer;
import no.uib.inf225.java_formatter.Java9Parser;
import no.uib.inf225.java_formatter.JavaListener;
import no.uib.inf225.java_formatter.rules.JavaFormatter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Path;

public class FileScanner {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileScanner.class);

    public void scan(Path file) {
        String fileName = file.getFileName().toString();

        if (fileName.equals("TestClass1.java")) {
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

        FileInputStream fileInput = new FileInputStream(String.valueOf(file));
        FileOutputStream fileOutput = new FileOutputStream(String.valueOf(file).replace(".", "_TEST_OUTPUT."));

        JavaFormatter formatter = new JavaFormatter(fileOutput);
        fileOutput.write("/*\n".getBytes());

        Java9Lexer lexer = new Java9Lexer(CharStreams.fromStream(fileInput));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java9Parser parser = new Java9Parser(tokens);
        ParseTree tree = parser.compilationUnit();
        //TreePrinter.prettyPrint(tree, Arrays.asList(parser.getRuleNames()));

        ParseTreeWalker walker = new ParseTreeWalker();
        JavaListener javaListener = new JavaListener(formatter);
        walker.walk(javaListener, tree);

        fileOutput.write("\n*/".getBytes());
    }

}
