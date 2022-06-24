package for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DraningRectangle {
    //add BufferedReader java class to read text from the keyboard
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //Display message on the screen
        System.out.println("Enter First Number?");
        //Get the value of user input as a string and convert to integer and assign and store the value into num1 variable int data type
        int num1 = Integer.parseInt(userInput.readLine());

        //Display message on the screen
        System.out.println("Enter a Second Number?");
        //Get the value of user input as a string and convert to integer and assign and store the value into num2 variable int data type
        int num2 = Integer.parseInt(userInput.readLine());

        //integer data type i and assign the initial value and store the value into i variable
        //Check if i value is less than num1 value
        //after each iteration increase i value by 1
        for(int i = 0; i < num1; i++){
            //integer data type j and assign the initial value and store the value into j variable
            //Check if j value is less than num2 value
            //after each iteration increase j value by 1
          for(int j = 0; j < num2; j++){
              //Display message on the screen
              System.out.print("8");
          }
          //Display a line space on the screen
            System.out.println();
        }

    }
}
