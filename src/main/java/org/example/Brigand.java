package org.example;

public class Brigand extends Human{
    String look;
    short bounty;
    boolean isPrisoner;
    Lady[] ladies = new Lady[100];
    int nbLady;
    Brigand(String name) {
        super(name);
        this.drink = "villageoise";
        look = "bad";
        nbLady = 0;
        bounty = 100;
        isPrisoner = false;
    }

    @Override
    void getName() {
        System.out.println(this.name + " - " + this.name + " the " + this.look);
    }

    @Override
    void presentation() {
        super.presentation();
        System.out.println(this.name + " - I seam " + this.look + "and I've taken' " + this.nbLady + "ladies !");
        System.out.println(this.name + " - My bounty is worth " + this.bounty + " !");
    }

    void captureLady(Lady lady) {
        lady.getCaught();
        System.out.println(this.name + " - " + this.name + " - Ah ah ! " + lady.name + ", you're mine now.");
    }

    void getPrisoner() {
        isPrisoner = true;
    }

    public short getBounty() {
        return bounty;
    }
}
