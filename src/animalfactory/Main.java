package animalfactory;

import java.util.Scanner;

public class Main {
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        animalDetails();
    }

    public static void animalDetails() {
        System.out.println("What type of Animal?");
        String typeDetail = userInput.nextLine();

        System.out.println("How many legs is your animal?");
        short legsDetail = userInput.nextShort();

        System.out.println("Is it your animal live in land?");
        boolean liveDetail = userInput.nextBoolean();

        Animal animalDetails = new Animal(typeDetail, legsDetail, liveDetail);

        System.out.println();

        System.out.println(animalDetails);

        System.out.println("-------------------------");

        System.out.println("My animal is: " + animalDetails.type);
        System.out.println("My animal has: " + animalDetails.legs + " legs");
        System.out.println("Is it your animal live in land: -> " + animalDetails.live);
    }
}
