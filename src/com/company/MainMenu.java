package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner input = new Scanner(System.in);


    public void createCar() {

        System.out.println("What kind of car would you like to have?");
        System.out.println("1. Custom \n2. Pre-built car \n3. Exit");

        try {
            switch (input.nextInt()) {
                case 1:
                    Car car = new Car();
                    car.getCarInfo();
                    menu(car);
                    break;
                case 2:
                    preBuiltMenu();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4.");
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number between 1 and 4.");

        }
    }

    protected void preBuiltMenu() {

       System.out.println("Please pick a pre-built car!");
        System.out.println("1. Jet-Ski \n2. Corvette \n3. Exit");


        try {
            switch (input.nextInt()) {
                case 1:
//                    Car car = new Car();
                    JetSki jetski = new JetSki(2018, "Yamaha", "Waverunner SuperJet", 0, 100, "blue");
                    jetski.getJetSkiInfo();
//                  menu(car);
                    menu(jetski);
                    break;
                case 2:
//                  car = new Car();
                    Corvette corvette = new Corvette(2018, "Corvette", "Stingray", 0, 100, "yellow");
                    corvette.getCorvetteInfo();
//                    menu(car);
                    menu(corvette);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4.");

            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number between 1 and 4.");

        }

    }

    public void prebuilt() {


    }

    public void menu(Car car) {



        System.out.println("What would you like to do with the " + car.getMake() + " " + car.getModel() + "?");
        System.out.println("1. Accelerate \n2. Decelerate \n3. Fill up with gas \n4. Exit ");

        try {
            switch (input.nextInt()) {
                case 1:
                    car.driveCar(car);
                    break;
                case 2:
                    car.slowDown(car);
                    break;
                case 3:
                    car.addGas(car);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4.");
                    menu(car);
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number between 1 and 4.");
            menu(car);
        }





    }

}