package no.uib.inf225.java_formatter;

import no.uib.inf225.java_formatter.rules.DefaultStyle;
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
    private static final Path ROOT_SRC = Path.of(Paths.get(System.getProperty("user.dir")) + "\\src");
    private static final Path ROOT_TEST_INPUT = Path.of(ROOT_SRC +
                                                        "\\main\\java\\no\\uib\\inf225\\java_formatter\\test_classes\\test_input");
    private static final Path DIRECTORY_ROOT = ROOT_TEST_INPUT;



    // Files
    private static final List<String> LEGAL_FILE_EXTENSION = Arrays.asList("java", "class");

    // Formatting single file, instead of complete directory
    private static final boolean SHOULD_ONLY_FORMAT_SINGLE_FILE = true;
    private static final String FILE_NAME_TO_FORMAT = "TestClass1.java";

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

    public static boolean shouldOnlyFormatSingleFile() {
        return SHOULD_ONLY_FORMAT_SINGLE_FILE;
    }

    public static String getFileNameToFormat() {
        return FILE_NAME_TO_FORMAT;
    }
}
