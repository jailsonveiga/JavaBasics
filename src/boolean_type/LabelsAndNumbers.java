package boolean_type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LabelsAndNumbers {
    //Add a java class BufferedReader to read text from the user stream
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //Display this statement on the screen
        System.out.println("Enter a number?");

        //Initialize an integer data type num1 and assign the value from the user input and store into num1 variable
        int num1 = Integer.parseInt(userInput.readLine());

        //Check if num1 value modulo 2 equally 0 and Check if num1 value is less than 0
        if(num1 % 2 == 0 && num1 < 0) {
            //If is true executed this statement on the screen
            System.out.println("Negative even number");
        }
        //Check if num1 value modulo 2 is not equal 0 and num1 value less than 0
        else if(num1 % 2 != 0 && num1 < 0) {
            //If is true executed this statement on the screen
            System.out.println("Negative odd number");
        }
        //Check if num1 value is equal 0
        else if(num1 == 0) {
            //If is true executed this statement on the screen
            System.out.println("Zero");
        }
        //Check if num1 value modulo 2 equal 0
        else if(num1 % 2 == 0) {
            //If is true executed this statement on the screen
            System.out.println("Positive even number");
        }
        //Otherwise, executed this statement
        else {
            System.out.println("Positive odd number");
        }
    }
}
