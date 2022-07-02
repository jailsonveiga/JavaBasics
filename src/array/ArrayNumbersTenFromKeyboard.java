package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayNumbersTenFromKeyboard {
    //Add the BufferedReader java class to read text from the keyboard
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        //Integer data type array that holds 10 elements
        int[] arrNum = new int[10];

        //Display message on the screen
        System.out.println("Enter a Number?");

        //use a for loop, starting i with initial value of 0
        //Check if i value is less than arrNum length
        //Increment i value by 1 after each iteration
        for (int i = 0; i < arrNum.length; i++) {
            //Read the text from the keyboard and store the value into text variable
            String text = userInput.readLine();

            //Convert text variable value to an integer data type and store the value into arrNum array
            arrNum[i] = Integer.parseInt(text);
        }
    }
}
