package no.uib.inf225.java_formatter.io;

import no.uib.inf225.java_formatter.util.Ansi;
import no.uib.inf225.java_formatter.util.DirectoryImageBuilder;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static no.uib.inf225.java_formatter.GlobalQuickConfig.isLegalFileExtension;

public class DirectoryScanner {
    private static final Logger LOGGER = LoggerFactory.getLogger(DirectoryScanner.class);
    private static final FileScanner fileScanner = new FileScanner();
    private static final DirectoryImageBuilder DIRECTORY_IMAGE_BUILDER = new DirectoryImageBuilder();

    public void traverseDirectory(Path path, int folderIndex) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path entry : stream) handleEntry(entry, folderIndex);
        } catch (IOException e) {
            LOGGER.error("IOException in DirectoryScanner.traverseDirectory - ", e);
        }
    }

    private void handleEntry(Path entry, int folderIndex) {
        String fileExtension = getFileExtension(entry);

        DIRECTORY_IMAGE_BUILDER.build(entry, folderIndex, fileExtension);

        if (isFolder(entry)) traverseDirectory(entry, folderIndex + 1);
        if (isLegalFileExtension(fileExtension)) fileScanner.scan(entry);
    }

    public String getDirectoryImage() {
        return DIRECTORY_IMAGE_BUILDER.getDirectoryImage();
    }

    private boolean isFolder(Path entry) {
        return getFileExtension(entry).equals("");
    }

    private String getFileExtension(Path entry) {
        return FilenameUtils.getExtension(entry.getFileName().toString());
    }

}
