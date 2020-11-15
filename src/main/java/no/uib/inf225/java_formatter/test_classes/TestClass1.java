package no.uib.inf225.java_formatter.test_classes;

public class TestClass1 {

    private static final String STR = "test";
    private int a;
    private int b;
    private int c;


    public TestClass1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
