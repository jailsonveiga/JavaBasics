package boolean_type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNumberVersionOne {
    //Add java class BufferedReade to read text from user stream
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //Display this message on the screen
        System.out.println("Enter first number?");

        //Initialize integer data type num1 and assign the value from user input and store the value into num1 variable
        int num1 = Integer.parseInt(userInput.readLine());

        //Display this message on the screen
        System.out.println("Enter second number?");

        //Initialize integer data type num2 and assign the value from user input and store the value into num2 variable
        int num2 = Integer.parseInt(userInput.readLine());

        //Display this message on the screen
        System.out.println("Enter third number");

        //Initialize integer data type num3 and assign the value from user input and store the value into num3 variable
        int num3 = Integer.parseInt(userInput.readLine());

        //Initialize Three integer data type counterPositive, counterNegative, counterZero and assign initial value to 0 and store the value into variable counterPositive, counterNegative and counterZero
        int counterPositive = 0;
        int counterNegative = 0;
        int counterZero = 0;

        //Check if num1 value is greater than 0
        if(num1 > 0) {
            //If is true added 1 to it
            counterPositive++;
        }
        //Check if num1 value is less than 0
        if(num1 < 0) {
            //If is true added 1 to it
            counterNegative++;
        }
        //Check if num1 value is equal 0
        if(num1 == 0) {
            //If is true added 1 to it
            counterZero++;
        }
        //Check if num2 value is greater than 0
        if(num2 > 0) {
            //If is true added 1 to it
            counterPositive++;
        }
        //Check if num2 value is less than 0
        if(num2 < 0) {
            //If is true added 1 to it
            counterNegative++;
        }
        //Check if num2 value is equal 0
        if(num2 == 0) {
            //If is true added 1 to it
            counterZero++;
        }
        //Check if num3 value is greater than 0
        if(num3 > 0) {
            //If is true added 1 to it
            counterPositive++;
        }
        //Check if num3 value is less than 0
        if(num3 < 0) {
            //If is true added 1 to it
            counterNegative++;
        }
        //Check if num3 value is equal 0
        if(num3 == 0) {
            //If is true added 1 to it
            counterZero++;
        }
        //Display the message on the screen
        System.out.println("Positive number? " + counterPositive);
        System.out.println("Negative number? " + counterNegative);
        System.out.println("Zero number? " + counterZero);
    }
}
