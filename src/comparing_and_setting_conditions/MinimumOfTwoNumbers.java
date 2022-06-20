package comparing_and_setting_conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumOfTwoNumbers {
    //Create a java class BufferedReader that reads text from the input stream
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //Display and executed the statement on the screen
        System.out.println("Enter first number?");

        //Initialize the integer num1 and assign its value from the user input and store the value into num1 variable
        int num1 = Integer.parseInt(userInput.readLine());

        //Display and executed the statement on the screen
        System.out.println("Enter second number?");

        //Initialize the integer num2 and assign its value from the user input and store the value into num2 variable
        int num2 = Integer.parseInt(userInput.readLine());

        //Check if num1 is less than num2
        if(num1 < num2) {
            //If is true executed this statement on the screen
            System.out.println("Display the minimum of the 2 numbers " + num1 + " and " + num2 + " end show the minimum number enter - " + num1);
        }
        //Check if num2 is less than num1
        else if(num2 < num1) {
            //If is true executed this statement on the screen
            System.out.println("Display the minimum of the 2 numbers " + num1 + " and " + num2 + " end show the minimum number enter - " + num2);
        }
        //Otherwise, executed this statement
        else {
            //If is true executed this statement on the screen
            System.out.println("Display any of the 2 numbers " + num1 + " and " + num2 + " if is the same show either number enter - " + num1);
        }
        userInput.close();
    }
}
