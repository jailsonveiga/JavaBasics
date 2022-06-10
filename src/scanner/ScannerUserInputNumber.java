package scanner;

//Import The Scanner object
import java.util.Scanner;

public class ScannerUserInputNumber {
    public static void main (String[] args) {
        //Using the Scanner object and the System.in to get the value from the keyboard or user
        Scanner userInput = new Scanner(System.in);

        //Display "How old are you?" on the screen
        System.out.println("How old are you?");

        //Get the userInput value as an integer and store the value into userInputNum
        int userInputNum = userInput.nextInt();

        //Display "I am " use the+ operator to join the text and get the value from userInputNum and use the + operator to join the text " years old"
        System.out.println("I am " + userInputNum + " years old");
    }
}
