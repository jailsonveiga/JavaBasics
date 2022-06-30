package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomewhereInTheMiddle {
    //Add the java class BufferedReader to read the text from the user input
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        //Display the message on the screen
        System.out.println("Please enter first number?");
        //assign the value from the user input and store the value into num1 and convert the string to an integer
        int num1 = Integer.parseInt(userInput.readLine());

        //Display the message on the screen
        System.out.println("Please enter second number?");
        //assign the value from the user input and store the value into num2 and convert the string to an integer
        int num2 = Integer.parseInt(userInput.readLine());

        //Display the message on the screen
        System.out.println("Please enter third number?");
        //assign the value from the user input and store the value into num3 and convert the string to an integer
        int num3 = Integer.parseInt(userInput.readLine());

        List<Integer> num = new ArrayList<>();

        //Add the value of the variable num1, num2, num3 and store the value into num list array
        num.add(num1);
        num.add(num2);
        num.add(num3);

        //use the Collections class the sort method to sort the values
        Collections.sort(num);

        //Display the message on the screen and use the list variable to get the second element from the list
        System.out.println("The middle number is: " + num.get(1));
    }
}
