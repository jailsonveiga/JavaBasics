package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberArrayReverseOrder {
    //Import BufferedReader to read text from the user input
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        //integer data type array that hold 10 elements
        int[] arrNum = new int [10];

        //Display the message on the screen
        System.out.println("Enter a Number?");

        //use a for loop, starting i with initial value of 0
        //Check if i value is less than 10
        //Increment i value by 1 after each iteration
        for (int i = 0; i < 10; i++) {
            //Read the input from user and convert the string to integer and then store the value into arrNum array
            arrNum[i] = Integer.parseInt(userInput.readLine());
        }
        //use a for loop, starting i with initial value of 9
        //Check if i value is greater or equal 0
        //Decrement i value by 1 after each iteration
        for (int i = 9; i >= 0; i--) {
            //Display the message on the screen
            System.out.println("Reverse order array elements: " + i + " => " + arrNum[i]);
        }
    }
}
