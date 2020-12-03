package no.uib.inf225.java_formatter.rules;

import no.uib.inf225.java_formatter.Java9Parser;
import no.uib.inf225.java_formatter.Java9Parser.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DefaultStyle implements IStyle {

    // Style-constants
    private static final String INDENT = "\t";
    private static final String SINGLE_SPACE = " ";
    private static final String NEW_LINE = "\n";


    // Logical dynamics
    private static boolean isNegativeNumber = false;
    private static boolean override_noNewLine = false;
    private static String override_closingToken = "";
    private static int indentLevel = 0;
    private static boolean isOnNewLine = true;


    // Spacing
    private static final Set<String>
            noSpaceAroundToken = new HashSet<>(Arrays.asList(".", "[", "<", ">")),
            noSpaceBeforeToken = new HashSet<>(Arrays.asList(";", ",", ")", "]", "++", "--")),
            noSpaceAfterToken = new HashSet<>(Arrays.asList("(", "!", "@"));

    private static final Set<Class<?>>
            noSpaceBeforeRule = new HashSet<>(Arrays.asList()),
            noSpaceAfterRule = new HashSet<>(Arrays.asList(
                    MethodNameContext.class // Removes space between method-name and "("
                                                          )),
            noSpaceAroundRule = new HashSet<>(Arrays.asList()),
            forceSpaceBeforeRule = new HashSet<>(Arrays.asList(
                    RelationalExpressionContext.class
                    // Force space before relational (Override noSpaceAroundToken "<" / ">")
                                                              )),
            forceSpaceAfterRule = new HashSet<>(Arrays.asList(
                    RelationalExpressionContext.class
                    // Force space after relational (Override noSpaceAroundToken "<" / ">")
                                                             ));

    // Indentation
    private static final Set<String>
            unindentBeforeToken = new HashSet<>(Arrays.asList("}")),
            indentAfterToken = new HashSet<>(Arrays.asList("{"));

    private static final Set<Class<?>>
            indentedRule = new HashSet<>(Arrays.asList());

    // New-line
    private static final Set<String>
            newLineAfterToken = new HashSet<>(Arrays.asList(";", "{", "}"));

    private static final Set<Class<?>>
            newLineBeforeRule = new HashSet<>(Arrays.asList(
            ClassDeclarationContext.class, // Inserts extra newline before class-declaration
            MethodDeclarationContext.class // Inserts extra newline before method-declaration
                                                           )),
            newLineAfterRule = new HashSet<>(Arrays.asList(
                    PackageDeclarationContext.class, // Inserts extra newline after package-declaration
                    AnnotationContext.class // Inserts newline after annotation
                                                          )),
            newLineAroundRule = new HashSet<>(Arrays.asList());

    // Special cases
    private static final Map<String, String>
            interpretAsLiteral = Map.ofEntries(Map.entry("for", ")"));
    private static final Set<String>
            interpretAsLiteral_keySet = interpretAsLiteral.keySet();



    // New lines
    @Override
    public String newIndentedLine() {
        if (override_noNewLine) return "";
        setIsOnNewLine(true);
        return NEW_LINE + INDENT.repeat(indentLevel);
    }

    @Override
    public String insertNewLineBeforeRule(Class<?> currentRule) {
        if (newLineBeforeRule.contains(currentRule) || newLineAroundRule.contains(currentRule))
            return newIndentedLine();
        else return "";
    }

    @Override
    public String insertNewLineAfterRule(Class<?> previousRule) {
        if (newLineAfterRule.contains(previousRule) || newLineAroundRule.contains(previousRule))
            return newIndentedLine();
        else return "";
    }

    @Override
    public String insertNewLineAfterToken(String previousToken) {
        if (newLineAfterToken.contains(previousToken)) return newIndentedLine();
        else return "";

    }


    // Spacing
    @Override
    public void manageIndentation(String previousToken, String currentToken) {
        if (indentAfterToken.contains(previousToken)) indentLevel++;
        if (unindentBeforeToken.contains(currentToken)) indentLevel--;
    }

    @Override
    public String insertSpace(Class<?> previousRule, Class<?> currentRule, String previousToken, String currentToken) {
        return shouldBeSpace(previousRule, currentRule, previousToken, currentToken) ? SINGLE_SPACE : "";
    }

    @Override
    public boolean shouldBeSpace(Class<?> previousRule, Class<?> currentRule, String previousToken,
                                 String currentToken) {
        boolean shouldBeForced = forceSpaceBeforeRule.contains(currentRule) ||
                                 forceSpaceAfterRule.contains(previousRule);

        boolean shouldBeNearToken = !noSpaceAroundToken.contains(currentToken) &&
                                    !noSpaceAroundToken.contains(previousToken) &&
                                    !noSpaceBeforeToken.contains(currentToken) &&
                                    !noSpaceAfterToken.contains(previousToken);

        boolean shouldBeNearRule = !noSpaceBeforeRule.contains(currentRule) &&
                                   !noSpaceAfterRule.contains(previousRule) &&
                                   !noSpaceAroundRule.contains(currentRule) &&
                                   !noSpaceAroundRule.contains(previousRule);

        boolean isBetweenTwoIdentifiers = previousRule != null &&
                                          previousRule.equals(Java9Parser.IdentifierContext.class) &&
                                          currentRule.equals(Java9Parser.IdentifierContext.class);

        return shouldBeForced
               || (!isOnNewLine &&
                   !isNegativeNumber &&
                   shouldBeNearToken &&
                   shouldBeNearRule &&
                   !isBetweenTwoIdentifiers);
    }


    // Special cases
    @Override
    public void checkForSpecialCase(String previousToken, String currentToken) {
        isNegativeNumber = false;
        if (interpretAsLiteral_keySet.contains(currentToken)) {
            override_noNewLine = true;
            override_closingToken = interpretAsLiteral.get(currentToken);
        }
        if (currentToken.equals(override_closingToken)) {
            override_noNewLine = false;
            override_closingToken = "";
        }
        if ((previousToken.equals("=") && currentToken.equals("-")) ||
            (previousToken.equals("==") && currentToken.equals("-"))) isNegativeNumber = true;
    }


    // Getters and Setters
    @Override
    public int getIndentLevel() {
        return indentLevel;
    }

    @Override
    public void setIsOnNewLine(boolean isOnNewLine) {
        DefaultStyle.isOnNewLine = isOnNewLine;
    }

}
