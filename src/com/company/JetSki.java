package com.company;

public class JetSki extends Corvette {



    public JetSki(int year, String make, String model, int speed, int gas, String color) {
        super(year, make, model, speed, gas, color);
    }

    protected void getJetSkiInfo(){

        System.out.println("You have picked the " + getColor() + " " + getMake() + " " + getModel() + ". It is going " + getSpeed() + " MPH and you have " + getGas() + "% gas left." );
    }

}
