package no.uib.inf225.java_formatter.rules;

import no.uib.inf225.java_formatter.Java9Parser.*;

import java.util.*;

public class DefaultStyle implements IStyle {

    // Style-constants
    private static final String INDENT = "\t";
    private static final String SINGLE_SPACE = " ";
    private static final String NEW_LINE = "\n";

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
            forceSpaceBeforeRule = new HashSet<>(Arrays.asList(RelationalExpressionContext.class)),
            forceSpaceAfterRule = new HashSet<>(Arrays.asList(RelationalExpressionContext.class));


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

    private static final Map<String, String>
            interpretAsLiteral = Map.ofEntries(Map.entry("for", ")"));

    @Override
    public String getToken_indent() {
        return INDENT;
    }

    @Override
    public String getToken_singleSpace() {
        return SINGLE_SPACE;
    }

    @Override
    public String getToken_newLine() {
        return NEW_LINE;
    }

    @Override
    public Set<String> getSet_noSpaceAroundToken() {
        return noSpaceAroundToken;
    }

    @Override
    public Set<String> getSet_noSpaceBeforeToken() {
        return noSpaceBeforeToken;
    }

    @Override
    public Set<String> getSet_noSpaceAfterToken() {
        return noSpaceAfterToken;
    }

    @Override
    public Set<Class<?>> getSet_noSpaceBeforeRule() {
        return noSpaceBeforeRule;
    }

    @Override
    public Set<Class<?>> getSet_noSpaceAfterRule() {
        return noSpaceAfterRule;
    }

    @Override
    public Set<Class<?>> getSet_noSpaceAroundRule() {
        return noSpaceAroundRule;
    }

    @Override
    public Set<Class<?>> getSet_forceSpaceBeforeRule() {
        return forceSpaceBeforeRule;
    }

    @Override
    public Set<Class<?>> getSet_forceSpaceAfterRule() {
        return forceSpaceAfterRule;
    }

    @Override
    public Set<String> getSet_unindentBeforeToken() {
        return unindentBeforeToken;
    }

    @Override
    public Set<String> getSet_indentAfterToken() {
        return indentAfterToken;
    }

    @Override
    public Set<Class<?>> getSet_indentedRule() {
        return indentedRule;
    }

    @Override
    public Set<String> getSet_newLineAfterToken() {
        return newLineAfterToken;
    }

    @Override
    public Set<Class<?>> getSet_newLineBeforeRule() {
        return newLineBeforeRule;
    }

    @Override
    public Set<Class<?>> getSet_newLineAfterRule() {
        return newLineAfterRule;
    }

    @Override
    public Set<Class<?>> getSet_newLineAroundRule() {
        return newLineAroundRule;
    }

    @Override
    public Map<String, String> getMap_interpretAsLiteral() {
        return interpretAsLiteral;
    }

}
