package fruitfactory;

import java.util.Scanner;

public class Main {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        fruitDetails();
    }

    public static void fruitDetails() {
        System.out.println("What is the fruit name?");
        String nameDetail = userInput.nextLine();

        System.out.println("What is the fruit color?");
        String colorDetail = userInput.nextLine();

        System.out.println("Is it the fruit has seeds?");
        boolean hasSeedsDetail = userInput.nextBoolean();

        Fruit fruitDetails = new Fruit(nameDetail, colorDetail, hasSeedsDetail);

        System.out.println();

        System.out.println(fruitDetails);

        System.out.println("---------------");

        System.out.println("The name of the fruit is: " + fruitDetails.name);
        System.out.println("The color of the fruit is: " + fruitDetails.color);
        System.out.println("my fruit has seeds: " + fruitDetails.hasSeeds);
    }
}
