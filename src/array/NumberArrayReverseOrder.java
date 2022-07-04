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

        //use a for loop, starting i with initial value of 0
        //Check if i value is less than 10
        //Increment i value by 1 after each iteration
        for (int i = 0; i < 10; i++) {
            //Read the input from user and convert the string to integer and then store the value into arrNum array
            arrNum[i] = Integer.parseInt(userInput.readLine());
        }
    }
}
