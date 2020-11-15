package no.uib.inf225.java_formatter.util.logger;

import org.junit.Test;

import static no.uib.inf225.java_formatter.util.Ansi.*;
import static org.junit.Assert.assertTrue;

public class AnsiTest {

    @Test
    public void testPrintColors() {
        String bl = "BLACK ";
        String r = "RED ";
        String g = "GREEN ";
        String y = "YELLOW ";
        String b = "BLUE ";
        String p = "PURPLE ";
        String c = "CYAN ";
        String w = "WHITE ";


        // Quick for-loop for printing different text-colors
        System.out.println("Print color-map:");
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                int code = i * 16 + j;

                // Toggle line-break
                if (code == 8) System.out.println();
                if (code >= 16 && (code + 2) % 6 == 0) System.out.println();
                if ((code - 16) % 36 == 0) System.out.println();

                // Print colorCode-line
                System.out.printf("\u001b[38;5;%dm%-4.4s", code, code);
            }
        }

        // Test the print-color of the variables in this class
        System.out.println("\n" +
                           RESET + "\nTesting Regular Colors:\t\t\t" +
                           BLACK + bl + RED + r + GREEN + g + YELLOW + y +
                           BLUE + b + PURPLE + p + CYAN + c + WHITE + w +

                           RESET + "\nTesting Bold Colors:\t\t\t" +
                           BLACK_BOLD + bl + RED_BOLD + r + GREEN_BOLD + g + YELLOW_BOLD + y +
                           BLUE_BOLD + b + PURPLE_BOLD + p + CYAN_BOLD + c + WHITE_BOLD + w +

                           RESET + "\nTesting Underlined Colors:\t\t" +
                           BLACK_UL + bl + RED_UL + r + GREEN_UL + g +
                           YELLOW_UL + y + BLUE_UL + b + PURPLE_UL + p +
                           CYAN_UL + c + WHITE_UL + w +

                           RESET + "\nTesting Background Colors:\t\t" +
                           BLACK_BG + bl + RED_BG + r + GREEN_BG + g +
                           YELLOW_BG + y + BLUE_BG + b + PURPLE_BG + p +
                           CYAN_BG + c + WHITE_BG + w +

                           RESET + "\nTesting Bright Colors:\t\t\t" +
                           BLACK_BRIGHT + bl + RED_BRIGHT + r + GREEN_BRIGHT + g +
                           YELLOW_BRIGHT + y + BLUE_BRIGHT + b + PURPLE_BRIGHT + p +
                           CYAN_BRIGHT + c + WHITE_BRIGHT + w +

                           RESET + "\nTesting Bold-bright Colors:\t\t" +
                           BLACK_BOLD_BRIGHT + bl + RED_BOLD_BRIGHT + r + GREEN_BOLD_BRIGHT + g +
                           YELLOW_BOLD_BRIGHT + y + BLUE_BOLD_BRIGHT + b + PURPLE_BOLD_BRIGHT + p +
                           CYAN_BOLD_BRIGHT + c + WHITE_BOLD_BRIGHT + w +

                           RESET + "\nTesting bright backgr. Colors:\t" +
                           BLACK_BG_BRIGHT + bl + RED_BG_BRIGHT + r +
                           GREEN_BG_BRIGHT + g + YELLOW_BG_BRIGHT + y +
                           BLUE_BG_BRIGHT + b + PURPLE_BG_BRIGHT + p +
                           CYAN_BG_BRIGHT + c + WHITE_BG_BRIGHT + w + RESET + "\n");

        assertTrue(true);
    }
}