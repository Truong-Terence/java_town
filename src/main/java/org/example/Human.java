package org.example;

public class Human {
    String name;
    String drink;

    Human(String name) {
        this.name = name;
        this.drink = "Water";
    }

    void speak() {
        System.out.println(this.name + " - HOLLY ! I can speak !");
    }

    void presentation() {
        System.out.println("Hello, " + this.name + ", I love " + this.drink + ".");
    }

    void drink() {
        System.out.println("Ah ! A gud old " + this.drink + "! GLOUPS !");
    }

    String getName(){

        return this.name;
    }

    String getDrink() {

        return this.drink;
    }
}
