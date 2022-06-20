package if_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveAndNegativeNumber {

    //Add The BufferedReader object to allow user to input data
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //Display and execute the  statement on the screen
        System.out.println("Enter a number?");

        //initialize an integer data type num and assign the value from the user and store into variable num
        int num = Integer.parseInt(userInput.readLine());

        //Check if num is greater or equal 1
        if(num >= 1) {
            //Initialize an integer data type positiveNum and assign the value from the user input * 2 and store the value into positiveNum variable
           int positiveNum = num * 2;

           //If is true execute this line of code
            System.out.println("If the user input is positive number " + num + " double it " + positiveNum);
        }
        //Check if num is less than 0
        else if(num < 0){
            //Initialize an integer data type negativeNum and assign the value from the user input - 1 and store the value into negativeNum variable
            int negativeNum = num - 1;

            //If is true execute this line of code
            System.out.println("If the user input is negative number " + num + " add 1 " + negativeNum);
        }
        //Otherwise, execute this line of code
        else {
            System.out.println("Display number " + num + " on the screen");
        }
    }
}
