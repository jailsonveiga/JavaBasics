package boolean_type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNumber{
    //Add java class BufferedReade to read text from user stream
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeroNumber = 0;

        for (int i = 0; i < 3; i++) {
            //Display this message on the screen
            System.out.println("Enter a number?");

            //Initialize integer data type num1 and assign the value from user input and store the value into num1 variable
            int num1 = Integer.parseInt(userInput.readLine());

            //Check if num1 value is greater than 0
            if (num1 > 0) {
                //If is added 1 to it
                positiveNumber++;
            }
            if (num1 < 0) {
                //If is added 1 to it
                negativeNumber++;
            }
            if (num1 == 0) {
                //If is added 1 to it
                zeroNumber++;
            }

        }
        //Display this message on the screen
        System.out.println("Number of positive: " + positiveNumber);
        System.out.println("Number of negative: " + negativeNumber);
        System.out.println("Number of zero: " + zeroNumber);
    }
}
