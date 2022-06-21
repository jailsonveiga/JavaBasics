package boolean_type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DescribingNumbers {

    //add a java class BufferedReader to read text from the user stream
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //Display this message on the screen
        System.out.println("Enter a number in the range 1 - 999?");

        //Initialize the integer data type num1 and assign the value from the user input and store the value into num1 variable
        int num1 = Integer.parseInt(userInput.readLine());

        //Check if num1 value modulo 2 is equal 0 and num1 value is less than 10
        if(num1 % 2 == 0 && num1 < 10) {
            //If is true executed this message
            System.out.println("Even single digit number");
        }
        //Check if num1 value modulo 2 is not equal 0 and num1 value is less than 10
        else if(num1 % 2 != 0 && num1 < 10) {
            //If is true executed this message
            System.out.println("Odd single-digit number");
        }
        //Check if num1 value modulo 2 equal 0 and num1 greater and equal 10 and num1 value is less equal 99
        else if(num1 % 2 == 0 && num1 <= 99){
            //If is true executed this message
            System.out.println("Even two-digit number");
        }
        //Check if num1 value modulo 2 not equal 0 and num1 value less equal 99
        else if(num1 % 2 != 0 && num1 <= 99) {
            //If is true executed this message
            System.out.println("Odd two digit number");
        }
        //Check if num1 value modulo 2 equal 0
        else if(num1 % 2 == 0) {
            //If is executed this message
            System.out.println("Even three digit number");
        }
        //Otherwise, executed this message
        else {
            System.out.println("Odd three digit number");
        }
    }
}
