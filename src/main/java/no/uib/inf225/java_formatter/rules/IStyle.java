package no.uib.inf225.java_formatter.rules;

import java.util.Set;

public interface IStyle {

    // Style-constants
    String getToken_indent();

    String getToken_singleSpace();

    String getToken_newLine();

    // Spacing
    Set<String> getSet_noSpaceAroundToken();

    Set<String> getSet_noSpaceBeforeToken();

    Set<String> getSet_noSpaceAfterToken();

    Set<Class<?>> getSet_noSpaceBeforeRule();

    Set<Class<?>> getSet_noSpaceAfterRule();

    Set<Class<?>> getSet_noSpaceBeforeAndAfterRule();

    Set<Class<?>> getSet_forceSpaceBeforeRule();

    // Indentation
    Set<Class<?>> getSet_indentedRule();

    // New lines
    Set<String> getSet_newLineAfterToken();

    Set<Class<?>> getSet_newLineBeforeRule();

    Set<Class<?>> getSet_newLineAfterRule();

    Set<Class<?>> getSet_newLineBeforeAndAfterRule();

}
