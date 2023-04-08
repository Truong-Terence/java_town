package org.example;

public class Barman extends Human{

    String barName;
    Barman(String name) {
        super(name);
        this.drink = "wine";
        this.barName = "At " + this.name;
    }
}
