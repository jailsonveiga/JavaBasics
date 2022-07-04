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

        for (int i = 0; i < 10; i++) {
            arrName[i] = userInput.readLine();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(arrName[i]);
        }
    }
}
