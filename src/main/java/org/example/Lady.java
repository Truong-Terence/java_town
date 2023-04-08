package org.example;

public class Lady extends Human {
    boolean isCaught;
    String dressColor;
    String hero;
    Lady(String name, String dressColor) {
        super(name);
        this.drink = "milk";
        this.dressColor = dressColor;
        isCaught = false;
    }

    @Override
    void getName() {
        System.out.println(this.name + " - Miss"+ " " + this.name);
    }

    @Override
    void presentation() {
        super.presentation();
        System.out.println(this.name + " - " + this.dressColor);
    }

    void getCaught() {
        this.isCaught = true;
        System.out.println(this.name + " - Here we go again");
    }

    void getReleased() {
        this.isCaught = false;
        System.out.println(this.name + " - Thank you " + hero);
    }

    void getDressColor() {
        System.out.println(this.dressColor);
    }

    void changeDressColor(String dressColor){
        this.dressColor = dressColor;
        this.getDressColor();
    }
}
