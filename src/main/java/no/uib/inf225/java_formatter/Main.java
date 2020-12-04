package no.uib.inf225.java_formatter;

import no.uib.inf225.java_formatter.io.DirectoryScanner;
import no.uib.inf225.java_formatter.util.LogAnalyzer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;


public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static final DirectoryScanner DIRECTORY_SCANNER = new DirectoryScanner();
    private static final Path DIRECTORY_ROOT = GlobalQuickConfig.getDirectoryRoot();


    public static void main(String[] args) {
        LOGGER.info("Using directory root {}", DIRECTORY_ROOT);

        DIRECTORY_SCANNER.traverseDirectory(Path.of(DIRECTORY_ROOT + "\\src"), 0);

        //LOGGER.info("Finished scanning the directory: \n{}", DIRECTORY_SCANNER.getDirectoryImage());
        //LogAnalyzer.checkLogForUsedMethods();
    }

}
