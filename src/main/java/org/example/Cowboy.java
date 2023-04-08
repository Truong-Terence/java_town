package org.example;

public class Cowboy extends Human{
    int popularity;
    String trait;
    Cowboy(String name) {
        super(name);
        this.popularity = 0;
        this.trait = "Vaillant";
    }

    void freeLady(Lady lady) {
        lady.hero = this.name;
        System.out.println("Yeeeha " + lady.name + " !");
        lady.getReleased();
        this.popularity += 1;
    }

    void getBrigand(Brigand brigand) {
        brigand.getPrisoner();
        System.out.println("Damned, I'm done !" + this.name + ", you got me !");
        System.out.println(this.name + " got " + brigand.bounty + "$ on this catch !");
    }

    void shoot(Brigand brigand){
        System.out.println("The " + this.trait + " " + this.name + " shoot on " + brigand.name + ". PEW PEW !");
    }

    void shout() {
        System.out.println("Take this, rascal !");
    }
}
