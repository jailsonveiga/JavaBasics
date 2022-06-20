package if_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfTheWeek {
    //Create an object instance BufferedReader that allow users to input data
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //Display The statement on the screen
        System.out.println("Enter a number representing a the day of the week?");

        //Initialize an integer data type numberDay and assign the user value and store the value into numberDay
        int numberDay = Integer.parseInt(userInput.readLine());

        //Check if numberDay equal 1
        if(numberDay == 1) {
            //if is true executed this statement
            System.out.println("the day of the week is? Monday");
        }
        //Check if numberDay equal 2
        else if(numberDay == 2) {
            //if is true executed this statement
            System.out.println("The day of the week is? Tuesday");
        }
        //Check if numberDay equal 3
        else if(numberDay == 3) {
            //if is true executed this statement
            System.out.println("The number of the week is? Wednesday");
        }
        //Check if numberDay equal 4
        else if(numberDay == 4) {
            //if is true executed this statement
            System.out.println("The number of the week is? Thursday");
        }
        //Check if numberDay equal 5
        else if(numberDay == 5){
            //if is true executed this statement
            System.out.println("The number of the week is? Friday");
        }
        //Check if numberDay equal 6
        else if(numberDay == 6) {
            //if is true executed this statement
            System.out.println("The number of the weekend is? Saturday");
        }
        //Check if numberDay equal 7
        else if(numberDay == 7){
            //if is true executed this statement
            System.out.println("The number of the weekend is? Sunday");
        }
        //Otherwise, display this statement on the screen
        else{
            //Otherwise, executed this statement
            System.out.println("No such day of the week");
        }
    }
}
