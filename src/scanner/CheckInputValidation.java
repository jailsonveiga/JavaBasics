package scanner;

//Import Scanner object
import java.util.Scanner;

public class CheckInputValidation {
    public static void main (String[] args) {
        //Using Scanner object to get the data or value from the user or keyboard
        Scanner userInput = new Scanner(System.in);

        //Display "Enter a number?" on the screen
        System.out.println("Enter a number?");


        //Checking if nextInt() is a number
        if(userInput.hasNextInt()) {
            //Getting the value or data from the user and store the value into the userInputNum
            int userInputNum = userInput.nextInt();
            //if is true execute this command
            //Display "The number you enter is " and use the + operator to join the text and show the value store from the userInputNum variable
            System.out.println("The number you enter is " + userInputNum);
        }
        else{
            //if is false execute this command if not a number
            //Display "Please enter a number" on the screen
            System.out.println("Please enter a number");
        }
    }
}
