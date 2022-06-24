package while_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyingACar {
    //Add a BufferedReader java class to read text from the keyboard
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        //Initialize Integer data type moneySaved and assign initial value of 2500 and store the value into moneySaved
        int moneySaved = 2500;

        //Initialize Integer data type carAmount and assign initial value of 30000 and store the value into carAmount
        int carAmount = 30000;

        //Declare Integer data type earnedMoney
        int earnedMoney;

        //Initialize a boolean data type hasApproved and assign value of false and store the value into haApproved
        boolean hasApproved = true;

        //While is true run the while loop
        while(hasApproved) {

            //Display message on the screen
            System.out.println("Enter money earned?");

            //read text from the user input and convert the test in to integer and assign the value and store the value into earnedMoney
            earnedMoney = Integer.parseInt(userInput.readLine());

            //Display message on the screen and variable value and use the + operator to join the text
            System.out.println("You earned -> " + earnedMoney);

            //arithmetic moneySaved = moneySaved + earnedMoney and store the value into moneySaved
            moneySaved += earnedMoney;

            //Display message on the screen and variable value and use the + operator to join the text
            System.out.println("Total money saved -> " + moneySaved);

            //Display message on the screen
            System.out.println("--------------------");

            //Check if moneySaved value is greater or equal carAmount value
            if(moneySaved >= carAmount){
                hasApproved = false;
                //If is true executed this message and the value of the variable and use the + operator to join the text together
                System.out.println("You saved enough to buy a car " + moneySaved);
            }
        }
    }
}
