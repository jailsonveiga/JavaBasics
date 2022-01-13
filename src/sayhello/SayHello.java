package sayhello;

import java.util.Scanner;

public class SayHello {

   public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        whatIsYourName();

        whatIsYourFullName();
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
}
