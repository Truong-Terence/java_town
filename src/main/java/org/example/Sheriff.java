package org.example;

public class Sheriff extends Cowboy{
    Brigand[] brigands;
    int nbBrigand;
    Sheriff(String name){
        super("Sheriff " + name);
        this.nbBrigand = 0;
        this.trait  = "protected";
    }

    @Override
    void presentation() {
        super.presentation();
        System.out.println(this.name + " - I've " + nbBrigand + " brigands in my brigandex.");
    }
    void lockUp(Brigand brigand) {
        brigand.getPrisoner();
        System.out.println("In the name of the law, you're under arrest");
    }

    void lookForBrigand(Brigand brigand) {
        System.out.println("-- The sheriff plasters the wall of the saloon with a notice of search --");
        brigand.bounty *= 2;
        System.out.println(this.name + " - HEAR HEAR BRAVE PEOPLE!! " + brigand.bounty + " to whom will stop " + brigand.name +" the brigand, dead or alive!!");
    }

}
