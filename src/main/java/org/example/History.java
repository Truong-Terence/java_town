package org.example;

public class History {

    public static void main(String[] args) {
        new Human("Hermann").presentation();
        new Human("Hermann").drink();
        new Brigand("Jackson").getName();
        new Lady("Frizz", "blue").getName();
        System.out.println(new Barman("Polo").barName);
    }

}
