package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loopUserInput {
    //Add a java class BufferedReader that read text from the keyboard
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //Display message on the screen
        System.out.println("Enter a text?");
        //Get the value from the user input and as a text and store the value into string variable
        String string = userInput.readLine();

        //Display the message on the screen
        System.out.println("Enter a number greater than zero?");
        //Get the value from the user input as a string and convert the string to an integer data type and store the value into number
        int number = Integer.parseInt(userInput.readLine());

        //Initialize integer data type n and assign the initial value and store the value into n variable
        int n = 1;

        //Initialize integer data type iteration and assign the initial value and store the value into iteration variable
        int iteration = 1;

        //While n value is less or equal a number value continue the iteration
        while(n <= number){
            //Display string value on the screen
            System.out.println(iteration + " iteration -> " + string);
            //Increase n value by 1 after each iteration
            n++;
            //Increase iteration value by 1 after each iteration
            iteration++;
        }
    }
}
