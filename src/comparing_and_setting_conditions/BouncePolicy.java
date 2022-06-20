package comparing_and_setting_conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BouncePolicy {
    //Add a java class BufferedReader that reads text from the user stream
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //Display this statement on the screen
        System.out.println("Enter your name?");

        //Initialize String data type name and assign the value from the user input and store the value into name variable
        String name = userInput.readLine();

        //Display the statement on the screen
        System.out.println("Enter your age?");

        //Initialize the integer data type and assign the value from user input and store the value into age variable
        int age = Integer.parseInt(userInput.readLine());

        //Initialize the integer data type ageUser and assign the initial value and store into ageUser variable
        int ageUser = 18;

        //Check if age value  is greater or equal to ageUser value
        if(age >= ageUser) {
            //If is true executed this statement
            System.out.println(name + " you can enter the club because you are " + age + " years old");
        }
        //Check if age value is greater or equal to ageUser value and Check if age value Is less Than 21
        if(age >= ageUser && age < 21) {
            //if is true executed this statement
            System.out.println("but you can not have a drink");
        }
        //Otherwise, executed this statement
        else{
            System.out.println("and you can have a drink");
        }

    }
}
