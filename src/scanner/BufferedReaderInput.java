package scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {
    public static void main (String[] args) throws IOException {
        //Create a new instance object to read data from the keyboard
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        //Initialize a String DataType variable name and store the value from the keyboard into variable name
        String name = userInput.readLine();

        //Initialize a String DataType variable name1 and store the value from the keyboard into variable name1
        String name1 = userInput.readLine();

        //Initialize a String DataType variable name2 and store the value from the keyboard into variable name2
        String name2 = userInput.readLine();

        //Display the value store from the variable name, name1 and name2 and use the + operator to join the text
        System.out.println(name + " + " + name1 + " + " + name2 + " = Friends Ooo la-la!");
    }
}
