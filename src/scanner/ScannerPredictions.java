package scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerPredictions {
    public static void main (String[] args) throws IOException {
        //Create a new intense object java clas to read data from the keyboard
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter your name?");
        //Initialize a String DataType variable name and store the value from the keyboard into variable name
        String name = userInput.readLine();

        System.out.println("Please enter amount?");
        //Initialize a String DataType variable money and store the value from the keyboard into variable money
        String money = userInput.readLine();

        System.out.println("Please enter year?");
        //Initialize a String DataType variable years and store the value from the keyboard into variable years
        String years = userInput.readLine();

        //Display the value store from the variable name, money and years and use the + operator to join the text
        System.out.println(name + " will receive " + money + " dollars in " + years + " years.");
    }
}
