package sayhello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name\nName: ");

        String name = scanner.nextLine();

        System.out.println("Hello, nice to meet you " + whatsYourName(name));

        whatsYourFullNme();

    }

    public static String whatsYourName(String name) {

        return name;
    }

    public static void whatsYourFullNme() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your first name: ");

        String firstName = scanner.nextLine();

        System.out.print("What is your last name: ");

        String lastName = scanner.nextLine();

        System.out.println("It is so nice to formally meet you " + generateFullName(firstName, lastName) + ".");
    }

    public static String generateFullName (String firstName, String lastName){

        return firstName + " " + lastName;

    }
}



