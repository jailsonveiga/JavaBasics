package comparing_and_setting_conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EighteenPlus {
    //Add the java class BufferedReader to read the input text from the stream
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //Display the statement on the screen
        System.out.println("Enter your name?");

        //Initialize the String data type name and assign the value from the input and store the value into name variable
        String name = userInput.readLine();

        //Display the statement on the screen
        System.out.println("Enter your age?");

        //Initialize the Integer age and assign the value from the user input and store the value into the age variable
        int age = Integer.parseInt(userInput.readLine());

        //Initialize the integer data type userAge and assign the initial value and store the value into userAge variable
        int userAge = 18;

        //Check if the value from the age is less than the value from userAge
        if (age < userAge) {
            //If is true executed this statement on the screen
            System.out.println("the age you enter is less than " + userAge);
            System.out.println("Please grow up little more");
        }
        //Otherwise, executed this statement on the screen
        else{
            System.out.println("You pass the age confirmation");
        }

    }
}
