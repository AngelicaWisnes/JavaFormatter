package no.uib.inf225.java_formatter.test_classes;

import java.util.ArrayList;

public class TestClass1 {


    private static ArrayList<Integer>[] hasOfInterest;
    private static int[] matched;
    private static boolean[] visited;

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int a = -1;
        int b = 1 + 1;
        int c = 1 - 1;
        int d = 2 + (3 / 4 + 1);
        if (a > b) a += 1;
        if (a < b) a -= 1;
        if (a >= b) a += 1;
        if (a <= b) a -= 1;
        int N = io.getInt();
        int M = io.getInt();
        hasOfInterest = new ArrayList[N];
        matched = new int[N];
        for (int i = 0; i < N; i++) hasOfInterest[i] = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            hasOfInterest[io.getInt()].add(io.getInt());
        }
        for (int i = 0; i < N; i++)
            matched[i] = -1;
        io.println(matchPossible(N) ? "YES" : "NO");
        io.flush();
        io.close();
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

    private static final String STR = "test";
    private int a;
    private int b;
    private int c;


    public TestClass1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void setVisited(boolean[] visited) {
        TestClass1.visited = visited;
    }

    public String getSTR() {
        return STR;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return String.format("TestClass_1[STR = %s, a = %d, b = %d, c = %d]", STR, a, b, c);
    }
}
