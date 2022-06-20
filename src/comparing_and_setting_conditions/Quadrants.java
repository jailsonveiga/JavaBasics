package comparing_and_setting_conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadrants {
    //Add a java class BufferedReader that can read text from the user stream
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //Display this statement on the screen
        System.out.println("Enter your first number?");

        //Initialize the integer num1 and assign the value from the user and store the value into num1 variable
        int num1 = Integer.parseInt(userInput.readLine());

        //Display this statement on the screen
        System.out.println("Enter the second number?");

        //Initialize the integer data type and assign the value from the user input and store the value into num2 variable
        int num2 = Integer.parseInt(userInput.readLine());

        //Check if num1 value is greater than 0 and check if num2 value is greater then 0
        if(num1 > 0 && num2 > 0) {
            //If is true executed this statement
            System.out.println("First Quadrant");
        }
        //Check if num1 value is less than 0 and check if num2 value is greater than 0
        if(num1 < 0 && num2 > 0) {
            //If is true executed this statement
            System.out.println("Second Quadrant");
        }
        //Check if num1 value is less than 0 and check if num2 value is less than 0
        if(num1 < 0 && num2 < 0) {
            //If is true executed this statement
            System.out.println("Third Quadrant");
        }
        //Check if num1 value is greater than 0 and check if num2 value is less than 0
        if(num1 > 0 && num2 < 0) {
            //If is true executed this statement
            System.out.println("Fourth Quadrant");
        }
    }
}
