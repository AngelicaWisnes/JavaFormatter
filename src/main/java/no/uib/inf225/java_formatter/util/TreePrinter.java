package no.uib.inf225.java_formatter.util;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;

import java.util.List;

public class TreePrinter {

    private static final String EOL = System.lineSeparator(); // End-Of-Line-marker
    private static final String INDENTS = Ansi.CYAN + ". " + Ansi.RESET;
    private static int level;

    private TreePrinter() {}

    public static void prettyPrint(final Tree tree, List<String> ruleNames) {
        level = 0;
        ruleNames.replaceAll(s -> (Ansi.PURPLE + s + Ansi.RESET));

        String prettyTree = traverse(tree, ruleNames)
                .replaceAll("(?m)^\\s+$", "") // Remove whitespaces on otherwise empty lines
                .replaceAll("\\r?\\n\\r?\\n", EOL); // Use EOL for any kind of line-break

        System.out.print("Pretty-printing tree, with color-coding: Indents = cyan | RuleName = purple | Text = white");
        System.out.println(prettyTree);
    }

    private static String traverse(final Tree tree, final List<String> ruleNames) {
        String nodeText = Trees.getNodeText(tree, ruleNames);

        if (tree.getChildCount() == 0) return nodeText;

        StringBuilder sb = new StringBuilder();
        sb.append(EOL).append(INDENTS.repeat(++level)).append(nodeText).append(" ");

        for (int i = 0; i < tree.getChildCount(); i++)
            sb.append(traverse(tree.getChild(i), ruleNames));

        sb.append(EOL).append(INDENTS.repeat(--level));
        return sb.toString();
    }

}