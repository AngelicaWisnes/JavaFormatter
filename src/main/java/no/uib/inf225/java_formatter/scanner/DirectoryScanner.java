package no.uib.inf225.java_formatter.scanner;

import no.uib.inf225.java_formatter.util.Ansi;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryScanner {
    private static final Logger LOGGER = LoggerFactory.getLogger(DirectoryScanner.class);
    private static final StringBuilder DIRECTORY_IMAGE = new StringBuilder();

    public void traverseDirectory(Path path, int folderIndex) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path entry : stream) handleEntry(entry, folderIndex);
        } catch (IOException e) {
            LOGGER.error("IOException in DirectoryScanner.traverseDirectory - ", e);
        }
    }

    private void handleEntry(Path entry, int folderIndex) {
        directoryImageBuilder(entry, folderIndex);
        if (isFolder(entry)) traverseDirectory(entry, folderIndex + 1);
    }

    private void directoryImageBuilder(Path entry, int indentation) {
        DIRECTORY_IMAGE.append("  ".repeat(indentation));
        DIRECTORY_IMAGE.append(getEntryColor(entry));
        DIRECTORY_IMAGE.append(entry.getFileName());
        DIRECTORY_IMAGE.append("\n");
    }

    public String getEntryColor(Path entry) {
        return switch (getFileExtension(entry)) {
            case "" -> Ansi.WHITE;
            case "java" -> Ansi.GREEN;
            case "class" -> Ansi.PURPLE;
            default -> Ansi.BLACK;
        };
    }

    public StringBuilder getDirectoryImage() {
        return DIRECTORY_IMAGE;
    }

    private boolean isFolder(Path entry) {
        return getFileExtension(entry).equals("");
    }

    private String getFileExtension(Path entry) {
        return FilenameUtils.getExtension(entry.getFileName().toString());
    }

}
