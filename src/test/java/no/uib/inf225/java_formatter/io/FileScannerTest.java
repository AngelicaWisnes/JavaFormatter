package no.uib.inf225.java_formatter.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileScannerTest {

    private static File newInputFile;
    private static File newOutputFile;

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Before
    public void init() throws IOException {
        newInputFile = temporaryFolder.newFile();
        newOutputFile = temporaryFolder.newFile();
    }

    @Test
    public void helloWorld() throws IOException {

        final String data = """
                package no.uib.inf225.java_formatter;
                

                public class HelloWorld {

                \tpublic static void main(String[] args) {
                \t\tSystem.out.println("Hello World!");
                \t}
                }
                """;

        fillInOriginalFile(newInputFile, data);
        boolean inputAndOutputAreEqual = testHandleMethod(newInputFile, newOutputFile);
        Assert.assertTrue(inputAndOutputAreEqual);
    }


    private void fillInOriginalFile(File file, String data) {
        try {
            final FileOutputStream fileInputStream = new FileOutputStream(file);
            IOUtils.copy(IOUtils.toInputStream(data, StandardCharsets.UTF_8), fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean testHandleMethod(File inputFile, File outputFile) throws IOException {
        // Initialize handling
        try {
            final FileInputStream fileInputStream = new FileInputStream(inputFile);
            final FileOutputStream fileOutputStream = new FileOutputStream(outputFile);

            FileScanner fileScanner = new FileScanner();
            fileScanner.handle(fileInputStream, fileOutputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        printFilesToConsole(inputFile, outputFile);
        return FileUtils.contentEquals(inputFile, outputFile);
    }

    private void printFilesToConsole(File inputFile, File outputFile) throws IOException {
        System.out.println("INPUT_FILE:");
        FileInputStream fis = new FileInputStream(inputFile);
        int oneByte;
        while ((oneByte = fis.read()) != -1) System.out.write(oneByte);
        System.out.flush();

        System.out.println("\nOUTPUT_FILE:");
        fis = new FileInputStream(outputFile);
        while ((oneByte = fis.read()) != -1) System.out.write(oneByte);
        System.out.flush();
    }

}