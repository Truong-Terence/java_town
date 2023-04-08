package org.example;

public class Test {

    public static void main(String[] args) {
//        testSpeak();
//        testPresentation();
//        testDrink();
        testGetName();

    }

    public static void testSpeak() {
        new Human("Hermann").speak();
    }
    public static void testPresentation() {
        new Human("Hermann").presentation();
    }
    public static void testDrink() {
        new Human("Hermann").drink();
    }
    public static void testGetName() {
        new Human("Hermann").getName();
    }
}
