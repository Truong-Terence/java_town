package org.example;

public class Cowboy extends Human{
    int popularity;
    String trait;
    Cowboy(String name) {
        super(name);
        this.drink = "whisky";
        this.popularity = 0;
        this.trait = "valiant";
    }

    @Override
    void presentation() {
        super.presentation();
        System.out.println(this.name + " - " + "I'm " + this.trait + " and my popularity IS OVER " + this.popularity + " !!");
    }

    void freeLady(Lady lady) {
        lady.hero = this.name;
        System.out.println(this.name + " - Yeeeha " + lady.name + " !");
        lady.getReleased();
        this.popularity += 1;
    }

    void getBrigand(Brigand brigand) {
        brigand.getPrisoner();
        System.out.println(brigand.name + " - " + this.name + ", you got me !");
        System.out.println(this.name + " got " + brigand.bounty + "$ on this catch !");
    }

    void shoot(Brigand brigand){
        System.out.println("-- The " + this.trait + " " + this.name + " shoot on " + brigand.name + ". PEW PEW ! --");
    }

    void shout() {
        System.out.println(this.name + " - Take this, rascal !");
    }
}
