package no.uib.inf225.java_formatter.rules;

public interface IStyle {

    // New lines
    String newIndentedLine();
    String insertNewLineBeforeRule(Class<?> currentRule);
    String insertNewLineAfterRule(Class<?> previousRule);
    String insertNewLineAfterToken(String previousToken);

    // Spacing
    void manageIndentation(String previousToken, String currentToken);
    String insertSpace(Class<?> previousRule, Class<?> currentRule, String previousToken, String currentToken);
    boolean shouldBeSpace(Class<?> previousRule, Class<?> currentRule, String previousToken, String currentToken);

    // Special cases
    void checkForSpecialCase(String previousToken, String currentToken);

    // Getters and Setters
    int getIndentLevel();
    void setIsOnNewLine(boolean isOnNewLine);

}
