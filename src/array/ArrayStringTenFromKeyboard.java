package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayStringTenFromKeyboard {
    //Add the BufferedReader java class to read text from the keyboard
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //String data type array that holds 10 elements
        String[] arrName = new String[10];

        //Display message on the screen
        System.out.println("Enter a text?");

        //use a for loop, starting i with initial value of 0
        //Check if i value is less than arrName length
        //Increment i value by 1 after each iteration
        for ( int i = 0; i < arrName.length; i++) {
            //Read the text from the keyboard and store the value into arrName array
               arrName[i] = userInput.readLine();
        }
    }
}
