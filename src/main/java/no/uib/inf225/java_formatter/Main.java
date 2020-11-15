package no.uib.inf225.java_formatter;

import no.uib.inf225.java_formatter.scanner.DirectoryScanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;


public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static final DirectoryScanner directoryScanner = new DirectoryScanner();
    private static final Path directoryRoot = GlobalQuickConfig.getDirectoryRoot();


    public static void main(String[] args) {
        LOGGER.info("Using directory root {}", directoryRoot);

        directoryScanner.traverseDirectory(directoryRoot, 0);
        LOGGER.info("Finished scanning the directory: \n{}", directoryScanner.getDirectoryImage());
    }

}
