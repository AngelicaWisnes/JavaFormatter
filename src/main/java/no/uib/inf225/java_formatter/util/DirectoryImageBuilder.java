package no.uib.inf225.java_formatter.util;

import java.nio.file.Path;

public class DirectoryImageBuilder {

    private static StringBuilder DIRECTORY_IMAGE;

    public DirectoryImageBuilder() {
        DIRECTORY_IMAGE = new StringBuilder();
    }

    public void build(Path entry, int indentation, String fileExtension) {
        DIRECTORY_IMAGE.append("  ".repeat(indentation));
        DIRECTORY_IMAGE.append(getEntryColor(fileExtension));
        DIRECTORY_IMAGE.append(entry.getFileName());
        DIRECTORY_IMAGE.append(Ansi.RESET + "\n");
    }

    private String getEntryColor(String fileExtension) {
        return switch (fileExtension) {
            case "" -> Ansi.WHITE;
            case "java" -> Ansi.GREEN;
            case "class" -> Ansi.PURPLE;
            default -> Ansi.BLACK;
        };
    }

    public String getDirectoryImage() {
        return DIRECTORY_IMAGE.toString();
    }

}
