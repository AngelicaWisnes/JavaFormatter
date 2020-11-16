package no.uib.inf225.java_formatter.scanner;

import no.uib.inf225.java_formatter.Java9Lexer;
import no.uib.inf225.java_formatter.Java9Parser;
import no.uib.inf225.java_formatter.JavaListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileScanner {

    public void scan(Path entry) {
        String fileName = entry.getFileName().toString();
        if (fileName.equals("BookClub.java")) {
            try {
                handle(new String(Files.readAllBytes(entry)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void handle(String data) throws Exception {
        Java9Lexer java9Lexer = new Java9Lexer(CharStreams.fromString(data));
        CommonTokenStream tokens = new CommonTokenStream(java9Lexer);
        Java9Parser java9Parser = new Java9Parser(tokens);
        ParseTree tree = java9Parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();

        JavaListener javaListener = new JavaListener();
        walker.walk(javaListener, tree);
    }
}
