package no.uib.inf225.java_formatter;

import no.uib.inf225.java_formatter.util.Ansi;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Utility class for easy access to final variables
 */
public final class GlobalQuickConfig {


    private static final Path DIRECTORY_ROOT = Paths.get(System.getProperty("user.dir"));

    private static final List<String> LEGAL_FILE_EXTENSION = Arrays.asList("java", "class");

    private GlobalQuickConfig() {
    }

    public static Path getDirectoryRoot() {
        return DIRECTORY_ROOT;
    }

    public static boolean isLegalFileExtension(String fileExtension) {
        return LEGAL_FILE_EXTENSION.contains(fileExtension);
    }

}
