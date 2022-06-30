package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adding {
    //Add BufferedReader class to read keyboard from the user stream
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //Display message on the screen
        System.out.println("enter a number");

        //Initialize data type int with initial value of 0 and store the value into variable total
        int total = 0;

        while (true) {
            //Read the value from the keyboard and assign the value and store into num variable
            int num = Integer.parseInt(userInput.readLine());

            //Add the sum of num and store the value into total variable
            total = total + num;

            //Check if num value equality -1 if is break and finish the execution
            if (num == -1) {
                break;
            }
        }
        //Display the message on the screen
        System.out.println(total);
    }
}
