package org.example;

public class Human {
    String name;
    String drink;

    Human(String name) {
        this.name = name;
        this.drink = "water";
    }

    void speak() {
        System.out.println(this.name + " - HOLLY ! I can speak !");
    }

    void presentation() {
        System.out.println(this.name + " - Hello, " + this.name + ", I love " + this.drink + ".");
    }

    void drink() {
        System.out.println(this.name + " - Ah ! A gud old " + this.drink + "! GLOUPS !");
    }

    void getName(){
        System.out.println(this.name);
    }

    void getDrink() {
        System.out.println(this.drink);
    }
}
