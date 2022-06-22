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
        int num1 = Integer.parseInt(userInput.readLine());

        //Display the message on the screen
        System.out.println("Enter a number?");
        int num2 = Integer.parseInt(userInput.readLine());

        //Display the message on the screen
        System.out.println("Enter a number?");
        int num3 = Integer.parseInt(userInput.readLine());

        List<Integer> numbers = new ArrayList<>();

        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);

        Collections.sort(numbers);

        System.out.println("The number you enter is: " + num1 + "-" + num2 + "-" + num3 + " and the sort number is: " + numbers);
    }
}
