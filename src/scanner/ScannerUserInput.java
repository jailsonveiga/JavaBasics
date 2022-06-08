package scanner;

//import the Scanner Object
import java.util.Scanner;

public class ScannerUserInput {
    public static void main (String[] args) {
        //Use the Scanner object to get input from the keyboard "user"
        Scanner userInput = new Scanner(System.in);

        //Display "Enter your name?" on the screen
        System.out.println("Enter your name?");

        //Assign the userInput.nextLine() value from the keyboard and store into inputFromTheUser
        String inputFromTheUser = userInput.nextLine();

        //Display "The name that you enter is: " and the value store from the variable inputFromTheUser, using the + operator to join the string text
        System.out.println("The name that you enter is: " + inputFromTheUser);
    }
}
