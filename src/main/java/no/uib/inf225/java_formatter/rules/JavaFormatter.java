package no.uib.inf225.java_formatter.rules;

import no.uib.inf225.java_formatter.GlobalQuickConfig;
import no.uib.inf225.java_formatter.util.Ansi;
import no.uib.inf225.java_formatter.util.ConsolePrinter;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Stack;

public class JavaFormatter {

    // Settings and output
    private static FileOutputStream output;
    private static final IStyle STYLE = GlobalQuickConfig.getFormattingStyle();

    // Logical dynamics

    // Holders for token / rules
    private static String previousToken = "";
    private static final Stack<Class<?>> ruleStack = new Stack<>();
    private static Class<?> previousRule = null;
    private static Class<?> currentRule = null;


    public JavaFormatter(final FileOutputStream fileOutput) {
        output = fileOutput;
    }

    private void writeToOutput(String text) {
        try {
            ConsolePrinter.append(Ansi.GREEN, text); // Can be removed when project done
            output.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enterRule(Class<?> cl) {
        currentRule = cl;
        ruleStack.push(currentRule);
        writeToOutput(STYLE.insertNewLineBeforeRule(currentRule));
        ConsolePrinter.checkAppend("OPEN", currentRule.getSimpleName()); // Can be removed when project done
    }

    public void exitRule() {
        previousRule = ruleStack.pop();
        ConsolePrinter.checkAppend("CLOSE", previousRule.getSimpleName()); // Can be removed when project done
        writeToOutput(STYLE.insertNewLineAfterRule(previousRule));
    }

    public void visitTerminal(TerminalNode node) {
        // Check for EOF
        if (endOfFile(node)) {
            writeToOutput(STYLE.newIndentedLine());
            ConsolePrinter.print(); // Can be removed when project done
            return;
        }

        generateText(node);
    }

    private boolean endOfFile(TerminalNode node) {
        return node.getSymbol().getType() == Recognizer.EOF;
    }

    private void generateText(TerminalNode node) {
        String currentToken = node.getText();

        STYLE.manageIndentation(previousToken, currentToken);
        writeToOutput(STYLE.insertNewLineAfterToken(previousToken));

        writeToOutput(STYLE.insertSpace(previousRule, currentRule, previousToken, currentToken));

        writeToOutput(currentToken);
        STYLE.setIsOnNewLine(false);

        STYLE.checkForSpecialCase(previousToken, currentToken);

        previousToken = currentToken;
    }

}
