package no.uib.inf225.java_formatter.util;

import no.uib.inf225.java_formatter.GlobalQuickConfig;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogAnalyzer {

    public static void checkLogForUsedMethods() {
        try {
            String fileName = (GlobalQuickConfig.getDirectoryRoot() + "\\log\\singleRunLogFile.log");
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
            //Set<String> set = new HashSet<>(methods);
            //methods.clear();
            //methods.addAll(set);
            //Collections.sort(methods);

            System.out.println("Number of methods: " + methods.size());
            for (String s : methods) System.out.println(s);

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
