package org.example;

public class Brigand extends Human{
    String look;
    short bounty;
    boolean isPrisoner;
    Lady[] ladies = new Lady[100];
    int nbLady;
    Brigand(String name) {
        super(name);
        look = "Bad";
        nbLady = 0;
        bounty = 100;
        isPrisoner = false;
    }


    void captureLady(Lady lady) {
        lady.getCaught();
        System.out.println("Ah ah ! " + lady.name + ", you're mine now.");
    }

    void getPrisoner() {
        isPrisoner = true;
    }

}
