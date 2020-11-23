package no.uib.inf225.java_formatter.rules;

import no.uib.inf225.java_formatter.Java9Parser.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DefaultStyle implements IStyle {

    // Style-constants
    private static final String INDENT = "\t";
    private static final String SINGLE_SPACE = " ";
    private static final String NEW_LINE = "\n";

    // Spacing
    private static final Set<String>
            noSpaceAroundToken = new HashSet<>(Arrays.asList(".", "(", ")")),
            noSpaceBeforeToken = new HashSet<>(Arrays.asList(";")),
            noSpaceAfterToken = new HashSet<>(Arrays.asList());

    private static final Set<Class<?>>
            noSpaceBeforeRule = new HashSet<>(Arrays.asList(PackageDeclarationContext.class,
                                                            DimsContext.class,
                                                            TypeArgumentsContext.class)),
            noSpaceAfterRule = new HashSet<>(Arrays.asList(PackageNameContext.class)),
            forceSpaceBeforeRule = new HashSet<>(Arrays.asList(BlockContext.class));


    // Indentation
    private static final Set<Class<?>>
            indentedRule = new HashSet<>(Arrays.asList(ClassBodyDeclarationContext.class,
                                                       BlockStatementsContext.class));
    // New-line
    private static final Set<String>
            newLineAfterToken = new HashSet<>();//Arrays.asList("{", "}"));

    private static final Set<Class<?>>
            newLineBeforeRule = new HashSet<>(Arrays.asList(ClassDeclarationContext.class)),
            newLineAfterRule = new HashSet<>(Arrays.asList(PackageDeclarationContext.class)),
            newLineBeforeAndAfterRule = new HashSet<>(Arrays.asList(ImportDeclarationContext.class,
                                                                    ClassBodyDeclarationContext.class,
                                                                    BlockStatementsContext.class));

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
    public Set<Class<?>> getSet_forceSpaceBeforeRule() {
        return forceSpaceBeforeRule;
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
    public Set<Class<?>> getSet_newLineBeforeAndAfterRule() {
        return newLineBeforeAndAfterRule;
    }

}
