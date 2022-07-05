package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringArrayReverseOrder {
    //Add BufferedReader java class to read text from the keyboard
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //String data type array that holds 10 elements
        String[] arrName = new String[10];

        //Display the message on the screen
        System.out.println("Enter a text?");

        //use a for loop, starting i with initial value of 0
        //Check if i value is less than 10
        //Increment i value by 1 after each iteration
        for (int i = 0; i < 10; i++) {
            //Read text from the user input and store the value into arrName array
            arrName[i] = userInput.readLine();
        }

        //use a for loop, starting i with initial value of 9
        //Check if i value is greater than or equal 0
        //decrement  i value by 1 after each iteration
        for (int i = 9; i >= 0; i--) {
            //Display message on the screen
            System.out.println("Reverse order array elements: " + i + " => " + arrName[i]);
        }
    }
}
