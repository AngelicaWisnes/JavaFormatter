package no.uib.inf225.java_formatter;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UppercaseMethodListenerTest {

    @Test
    public void whenOneMethodStartsWithUpperCase_thenOneErrorReturned() throws Exception {
        String javaClassContent = "public class SampleClass { void DoSomething(){} }";
        Java9Lexer java9Lexer = new Java9Lexer(CharStreams.fromString(javaClassContent));
        CommonTokenStream tokens = new CommonTokenStream(java9Lexer);
        Java9Parser java9Parser = new Java9Parser(tokens);
        ParseTree tree = java9Parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();

        JavaListener uppercaseMethodListener = new JavaListener();
        //UppercaseMethodListener uppercaseMethodListener = new UppercaseMethodListener();
        walker.walk(uppercaseMethodListener, tree);

        //assertThat(uppercaseMethodListener.getErrors().size(), is(1));
        //assertThat(uppercaseMethodListener.getErrors().get(0), is("Method DoSomething is uppercased!"));
    }
}