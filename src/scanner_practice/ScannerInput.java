package scanner_practice;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        //Using the Scanner object to get the user input using System.in
        Scanner userInput = new Scanner(System.in);

        //Display "Please enter your name?" on the screen
        System.out.println("Please enter your name?");
        //Get the user input text value using the String datatype and store the value into the name variable
        String name = userInput.nextLine();

        //Display "Please enter a number?" on the screen
        System.out.println("Please enter a number?");
        //Get the user input number value using int datatype and store the value into the number variable
        int number = userInput.nextInt();

        //Get the value store from the variable name and number and use the + operator to join the text and display on the screen
        System.out.println(name + " will take over the world in " + number + " years. Mwa-ha-ha!");
    }
}
