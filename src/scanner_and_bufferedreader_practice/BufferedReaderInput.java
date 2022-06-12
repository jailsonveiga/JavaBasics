package scanner_and_bufferedreader_practice;

//Import the BufferedReader Object
import java.io.BufferedReader;
import java.io.IOException;
//Import the InputStreamReader Object
import java.io.InputStreamReader;

public class BufferedReaderInput {
    public static void main (String[] args) throws IOException {
        //Get the BufferedReader Object to get the user input using System.in
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        //Display "Enter your name?" on the screen
        System.out.println("Enter your name?");
        //get the value of userInput and store the value into the name variable
        String name = userInput.readLine();

        //Display "Enter a number" on the screen
        System.out.println("Enter a number");
        //get the value of UserInput and store the value into the number variable
        String number = userInput.readLine();

        //display the value from the variable name and number and use the + operator to join the text together and display on the screen
        System.out.println(name + " will take over the world in " + number + " years");


    }
}
