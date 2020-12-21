package no.uib.inf225.java_formatter.test_classes.test_input;

import java.util.ArrayList;

/**
 * @author Roger Wisnes
 */
public class BookClub {
    private static ArrayList<Integer>[] hasOfInterest;
    private static int[] matched;
    private static boolean[] visited;

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int N = io.getInt();
        int M = io.getInt();
        hasOfInterest = new ArrayList[N];
        matched = new int[N];

        for (int i = 0; i < N; i++) hasOfInterest[i] = new ArrayList<>();
        for (int i = 0; i < M; i++) hasOfInterest[io.getInt()].add(io.getInt());
        for (int i = 0; i < N; i++) matched[i] = -1;

        io.println(maxBipartiteMatchEquals(N) ? "YES" : "NO");
        io.flush();
        io.close();
    }

    private static boolean maxBipartiteMatchEquals(int N) {
        for (int person = 0; person < N; person++) {
            visited = new boolean[N];
            if (!matchPossible(person)) return false;
        }
        return true;
    }

    private static boolean matchPossible(int person) {
        for (int book : hasOfInterest[person]) {
            if (visited[book]) continue;
            visited[book] = true;

            if (matched[book] == -1 || matchPossible(matched[book])) {
                matched[book] = person;
                return true;
            }
        }
        return false;
    }
}
