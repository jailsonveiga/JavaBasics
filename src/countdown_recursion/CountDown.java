package countdown_recursion;

import java.util.Scanner;

public class CountDown {
    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter a number?");
        int number = userInput.nextInt();
        countDown(number);
    }

    public static void countDown(int number) {
        if(number >= 0) {
            System.out.println(number);
            countDown(number - 1);
        }
    }
}

