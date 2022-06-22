package array_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringArrayListUserInput {
    //Add the BufferedReader java class that reads text from the user stream
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main (String[] args) throws IOException {
        //Display message on the screen
        System.out.println("Enter a name?");
        //Initialize String data type name1 and assign the value from the user input and store the value into name1 variable
        String name1 = userInput.readLine();

        //Display message on the screen
        System.out.println("Enter a name?");
        //Initialize String data type name2 and assign the value from the user input and store the value into name2 variable
        String name2 = userInput.readLine();

        //Display message on the screen
        System.out.println("Enter a name?");
        //Initialize String data type name3 and assign the value from the user input and store the value into name3 variable
        String name3 = userInput.readLine();

        //Create an empty array list and assign the future value and store into names
        List<String> names = new ArrayList<>();

        //Add name1, name2, name3 values and store into names
        names.add(name1);
        names.add(name2);
        names.add(name3);

        //Use the Collections' java class and sort method to sort the names in a list
        Collections.sort(names);

        //Display the message on the screen and its variable values and use the + operator to join the text together
        System.out.println("you entered names " + name1 + "-" + name2 + "-" + name3 + " and sort name are: " + names);
    }
}
