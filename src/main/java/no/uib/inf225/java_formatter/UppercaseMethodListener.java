package no.uib.inf225.java_formatter;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UppercaseMethodListener extends Java9BaseListener {
    private List<String> errors = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(UppercaseMethodListener.class);

    @Override
    public void enterMethodDeclarator(Java9Parser.MethodDeclaratorContext ctx) {

        TerminalNode node = ctx.identifier().Identifier();
        String text = node.getText();

        LOGGER.trace("In method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);

        if (Character.isUpperCase(text.charAt(0))) {
            errors.add(String.format("Method %s is uppercased!", text));
        }
    }

    public List<String> getErrors() {
        return Collections.unmodifiableList(errors);
    }
}
