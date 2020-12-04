package no.uib.inf225.java_formatter;

import no.uib.inf225.java_formatter.rules.JavaFormatter;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaListener extends Java9BaseListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaListener.class);
    private static JavaFormatter FORMATTER;

    public JavaListener(final JavaFormatter formatter) {
        FORMATTER = formatter;
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
        FORMATTER.enterRule(ctx.getClass());

        LOGGER.trace("Method: {} - {}", method, ctx.getClass().getSimpleName());
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
        FORMATTER.exitRule();

        LOGGER.trace("Method: {} - {}", method, ctx.getClass().getSimpleName());
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        String method = Thread.currentThread().getStackTrace()[1].getMethodName();

        FORMATTER.visitTerminal(node);

        LOGGER.debug("Method: {} - {}", method, node.getText());
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        String text = node.getText();
        LOGGER.debug("Method: {} - {}", Thread.currentThread().getStackTrace()[1].getMethodName(), text);
        super.visitErrorNode(node);
    }

}
