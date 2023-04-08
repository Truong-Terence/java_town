package org.example;

public class Barman extends Human{

    String barName;
    Barman(String name) {
        super(name);
        this.drink = "wine";
        this.barName = "At " + this.name;
    }

    void speak(String sentence) {
        System.out.println(this.name + " - " + sentence + " Coco.");
    }
    @Override
    void presentation() {
        super.presentation();
        System.out.println("Welcome to : '" + this.barName + "'s'");
    }
    @Override
    void drink() {
        super.drink();
    }
}
