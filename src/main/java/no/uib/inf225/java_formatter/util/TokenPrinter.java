package no.uib.inf225.java_formatter.util;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.List;

public class TokenPrinter {

    public static void printTokens(CommonTokenStream tokens) {
        List<Token> tokenList = tokens.getTokens();
        StringBuilder sb = new StringBuilder();

        sb.append("Tokens-size: ").append(tokenList.size()).append("\n");

        for (int i = 0; i < tokens.size(); i++) {
            Token t = (Token) tokenList.get(i);
            String text = t.getText();

            if (text.trim().length() == 0) sb.append("'").append(text).append("'");
            else sb.append(text);

            //sb.append('[').append(t.getType()).append(']');
            sb.append(" ");
        }

        sb.append("\n");
        System.out.println(sb.toString());
    }

}
