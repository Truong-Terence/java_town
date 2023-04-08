package org.example;

public class Lady extends Human {
    boolean isCaught;
    String dressColor;
    String hero;
    Lady(String name, String dressColor) {
        super(name);
        this.dressColor = dressColor;
        isCaught = false;
    }

    @Override
    void getName() {
        System.out.println("Miss"+ " " + this.name);
    }

    void getCaught() {
        this.isCaught = true;
        System.out.println("Here we go again");
    }

    void getReleased() {
        this.isCaught = false;
        System.out.println("Thank you " + hero);
    }

    void getDressColor() {
        System.out.println(this.dressColor);
    }

    void changeDressColor(String dressColor){
        this.dressColor = dressColor;
        this.getDressColor();
    }
}
