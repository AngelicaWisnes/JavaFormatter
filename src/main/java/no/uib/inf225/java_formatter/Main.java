package no.uib.inf225.java_formatter;

import no.uib.inf225.java_formatter.scanner.DirectoryScanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static final DirectoryScanner DIRECTORY_SCANNER = new DirectoryScanner();
    private static final Path DIRECTORY_ROOT = GlobalQuickConfig.getDirectoryRoot();


    public static void main(String[] args) {
        LOGGER.info("Using directory root {}", DIRECTORY_ROOT);

        DIRECTORY_SCANNER.traverseDirectory(Path.of(DIRECTORY_ROOT + "\\src"), 0);
        //LOGGER.info("Finished scanning the directory: \n{}", DIRECTORY_SCANNER.getDirectoryImage());

        checkLogForUsedMethods();
    }


    public static void checkLogForUsedMethods() {
        try {
            String fileName = (DIRECTORY_ROOT + "\\log\\singleRunLogFile.log");
            File file = new File(fileName);
            Scanner sc = new Scanner(file);

            // Define the regex-pattern
            //String regex = "(?<=((Method: enter)|(Method: exit)))([a-zA-Z0-9_]*)"; // Matches JavaListener
            String regex = "(?<=(Method: ))([a-zA-Z0-9_]*)"; // Matches JavaVisitor
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

            // Add all regex-matches to list
            List<String> methods = new ArrayList<>();
            while (sc.hasNextLine()) {
                Matcher matcher = pattern.matcher(sc.nextLine());
                if (matcher.find()) methods.add(matcher.group());
            }

            // Clean up list (Delete duplicates, and sort)
            Set<String> set = new HashSet<>(methods);
            methods.clear();
            methods.addAll(set);
            Collections.sort(methods);

            System.out.println("Number of methods: " + methods.size());
            for (String s : methods) System.out.println(s);

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
