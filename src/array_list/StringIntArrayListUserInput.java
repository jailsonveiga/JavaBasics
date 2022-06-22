package array_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringIntArrayListUserInput {
    //Add BufferedReader java class to read text from the keyboard
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //Display message on the screen
        System.out.println("Enter your name?");
        //Initialize String datatype name1 and assign the value from the user input and store the value into name1 variable
        String name1 = userInput.readLine();

        //Display message on the screen
        System.out.println("Enter your name?");
        //Initialize String datatype name2 and assign the value from the user input and store the value into name2 variable
        String name2 = userInput.readLine();

        //Display message on the screen
        System.out.println("Enter your name?");
        //Initialize the String datatype name3 and assign the value from the user input and store the value into name3 variable
        String name3 = userInput.readLine();

        //Create an empty array list and assign the future value and store the value into names
        List<String> names = new ArrayList<>();

        //Add name1, name2, name3 value and store the value into names
        names.add(name1);
        names.add(name2);
        names.add(name3);

        //Use Sort method and java class Collections to sort names in reverse order "descending order"
        names.sort(Collections.reverseOrder());

        //Display the message on the screen and show the value from the variable, also use the + operator to join the text together
        System.out.println("Sort names in descending order :\n" + names);

    }
}
