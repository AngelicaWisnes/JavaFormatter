package no.uib.inf225.java_formatter.util;

/**
 * A class containing final ANSI escape codes.
 */
public final class Ansi {

    // Reset
    public static final String RESET = "\u001b[0m";

    // Regular Colors
    public static final String BLACK = "\u001b[0;30m";
    public static final String RED = "\u001b[0;31m";
    public static final String GREEN = "\u001b[0;32m";
    public static final String YELLOW = "\u001b[0;33m";
    public static final String BLUE = "\u001b[0;34m";
    public static final String PURPLE = "\u001b[0;35m";
    public static final String CYAN = "\u001b[0;36m";
    public static final String WHITE = "\u001b[0;37m";

    // Bold
    public static final String BLACK_BOLD = "\u001b[1;30m";
    public static final String RED_BOLD = "\u001b[1;31m";
    public static final String GREEN_BOLD = "\u001b[1;32m";
    public static final String YELLOW_BOLD = "\u001b[1;33m";
    public static final String BLUE_BOLD = "\u001b[1;34m";
    public static final String PURPLE_BOLD = "\u001b[1;35m";
    public static final String CYAN_BOLD = "\u001b[1;36m";
    public static final String WHITE_BOLD = "\u001b[1;37m";

    // Underline
    public static final String BLACK_UL = "\u001b[4;30m";
    public static final String RED_UL = "\u001b[4;31m";
    public static final String GREEN_UL = "\u001b[4;32m";
    public static final String YELLOW_UL = "\u001b[4;33m";
    public static final String BLUE_UL = "\u001b[4;34m";
    public static final String PURPLE_UL = "\u001b[4;35m";
    public static final String CYAN_UL = "\u001b[4;36m";
    public static final String WHITE_UL = "\u001b[4;37m";

    // Background
    public static final String BLACK_BG = "\u001b[40m";
    public static final String RED_BG = "\u001b[41m";
    public static final String GREEN_BG = "\u001b[42m";
    public static final String YELLOW_BG = "\u001b[43m";
    public static final String BLUE_BG = "\u001b[44m";
    public static final String PURPLE_BG = "\u001b[45m";
    public static final String CYAN_BG = "\u001b[46m";
    public static final String WHITE_BG = "\u001b[47m";

    // Bright colors
    public static final String BLACK_BRIGHT = "\u001b[0;90m";
    public static final String RED_BRIGHT = "\u001b[0;91m";
    public static final String GREEN_BRIGHT = "\u001b[0;92m";
    public static final String YELLOW_BRIGHT = "\u001b[0;93m";
    public static final String BLUE_BRIGHT = "\u001b[0;94m";
    public static final String PURPLE_BRIGHT = "\u001b[0;95m";
    public static final String CYAN_BRIGHT = "\u001b[0;96m";
    public static final String WHITE_BRIGHT = "\u001b[0;97m";

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\u001b[1;90m";
    public static final String RED_BOLD_BRIGHT = "\u001b[1;91m";
    public static final String GREEN_BOLD_BRIGHT = "\u001b[1;92m";
    public static final String YELLOW_BOLD_BRIGHT = "\u001b[1;93m";
    public static final String BLUE_BOLD_BRIGHT = "\u001b[1;94m";
    public static final String PURPLE_BOLD_BRIGHT = "\u001b[1;95m";
    public static final String CYAN_BOLD_BRIGHT = "\u001b[1;96m";
    public static final String WHITE_BOLD_BRIGHT = "\u001b[1;97m";

    // Bright backgrounds
    public static final String BLACK_BG_BRIGHT = "\u001b[0;100m";
    public static final String RED_BG_BRIGHT = "\u001b[0;101m";
    public static final String GREEN_BG_BRIGHT = "\u001b[0;102m";
    public static final String YELLOW_BG_BRIGHT = "\u001b[0;103m";
    public static final String BLUE_BG_BRIGHT = "\u001b[0;104m";
    public static final String PURPLE_BG_BRIGHT = "\u001b[0;105m";
    public static final String CYAN_BG_BRIGHT = "\u001b[0;106m";
    public static final String WHITE_BG_BRIGHT = "\u001b[0;107m";

    private Ansi() {
    }

}
