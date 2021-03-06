package array_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerArrayListUserInput {
    //Add the BufferedReader java class to read the text from the keyboard user input
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //Display the message on the screen
        System.out.println("Enter a number?");

        //Initialize Integer data type num1 and assign the value from the user input and store the value into num1 variable
        //Convert the string readLine() to integer using the Integer.parseInt
        int num1 = Integer.parseInt(userInput.readLine());

        //Display the message on the screen
        System.out.println("Enter a number?");

        //Initialize Integer data type num2 and assign the value from the user input and store the value into num2 variable
        //Convert the string readLine() to integer using the Integer.parseInt
        int num2 = Integer.parseInt(userInput.readLine());

        //Display the message on the screen
        System.out.println("Enter a number?");

        //Initialize Integer data type num3 and assign the value from the user input and store the value into num3 variable
        //Convert the string readLine() to integer using the Integer.parseInt
        int num3 = Integer.parseInt(userInput.readLine());

        //Create an empty list array and assign the future value and store into numbers
        List<Integer> numbers = new ArrayList<>();

        //Add num1, num2, num3 values from the user input and store the value into numbers
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);

        //Use the Collections' java class and sort method to sort the list of numbers
        Collections.sort(numbers);

        //Display message on the screen and its variable values also use the + operator to join the text together
        System.out.println("The number you enter is: " + num1 + "-" + num2 + "-" + num3 + " and the sort number is: " + numbers);
    }
}
