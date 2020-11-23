package no.uib.inf225.java_formatter;

import no.uib.inf225.java_formatter.rules.DefaultStyle;
import no.uib.inf225.java_formatter.rules.JavaFormatter;
import no.uib.inf225.java_formatter.rules.IStyle;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Utility class for easy access to final variables
 */
public final class GlobalQuickConfig {

    // Directory and files
    private static final Path DIRECTORY_ROOT = Paths.get(System.getProperty("user.dir"));
    private static final List<String> LEGAL_FILE_EXTENSION = Arrays.asList("java", "class");

    // Formatting styles
    private static final IStyle FORMATTING_STYLE = new DefaultStyle();

    private GlobalQuickConfig() {
    }

    public static Path getDirectoryRoot() {
        return DIRECTORY_ROOT;
    }

    public static boolean isLegalFileExtension(String fileExtension) {
        return LEGAL_FILE_EXTENSION.contains(fileExtension);
    }

    public static IStyle getFormattingStyle() {
        return FORMATTING_STYLE;
    }
}
