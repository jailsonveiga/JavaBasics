package scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerPredictions {
    public static void main (String[] args) throws IOException {
        //Create a new intense object and read data from the keyboard
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        //Initialize a String DataType variable name and store the value from the keyboard into variable name
        String name = userInput.readLine();

        //Initialize a String DataType variable money and store the value from the keyboard into variable money
        String money = userInput.readLine();

        //Initialize a String DataType variable years and store the value from the keyboard into variable years
        String years = userInput.readLine();

        //Display the value store from the variable name, money and years and use the + operator to join the text
        System.out.println(name + " will receive " + money + " in " + years + " years.");
    }
}
