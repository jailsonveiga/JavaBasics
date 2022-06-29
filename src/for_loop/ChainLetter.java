package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChainLetter {

    //Import the BufferedReader java class that reads text from the user input
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        //Display message on the screen
        System.out.println("Please Enter Your Name?");

        //Assign the value from the input and store the value into name variable
        String name = userInput.readLine();

        //Initialize data type i and assign initial value to 1 and store the value into i
        //Check if i value is less than equal 10
        //add i value by 1 after each iteration
        for (int i = 0; i < 10; i++) {
            //Display message on the screen
            System.out.println(name + " love java programing");
        }

    }
}
