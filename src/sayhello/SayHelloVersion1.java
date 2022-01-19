package sayhello;

import java.util.Scanner;

public class SayHelloVersion1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        whatIsYourName();

        whatIsYourFullName();

        randomMessage();
    }

    public static void whatIsYourName(){

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello, nice to meet you " + name + ".");
    }

    public static void whatIsYourFullName() {

        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();

        System.out.println("What is your last name:");
        String lastName = scanner.nextLine();

        System.out.println("It is so nice to formally meet you " + firstName + " " + lastName + ".");
    }
    public static void randomMessage() {
        System.out.println("What is your Name?");
        String name = scanner.nextLine();

        System.out.println("Where are you from?");
        String country = scanner.nextLine();

        System.out.println("What language do you speak?");
        String language = scanner.nextLine();

        System.out.println("What food do you like?");
        String food = scanner.nextLine();

        System.out.println("It is so nice to formally meet you " + name + " you are from " + country + " you speak " + language  + " and you like " + food);
    }
}