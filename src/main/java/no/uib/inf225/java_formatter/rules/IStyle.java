package no.uib.inf225.java_formatter.rules;

public interface IStyle {

    boolean shouldBeSpace(Class<?> previousRule, Class<?> currentRule, String previousToken, String currentToken);

    boolean shouldBeNewLineBeforeRule(Class<?> currentRule);

    boolean shouldBeNewLineAfterRule(Class<?> previousRule);

    String getNewIndentedLine();

    boolean shouldBeNewLineAfterToken(String previousToken);

    String insertSpace(Class<?> previousRule, Class<?> currentRule, String previousToken, String currentToken);

    void checkForSpecialCase(String previousToken, String currentToken);

    void manageIndentation(String previousToken, String currentToken);

    int TEMP_getIndentLevel();

    boolean override_noNewLine();
}
