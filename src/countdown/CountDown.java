package countdown;

import java.util.Scanner;

public class CountDown {
    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        countDown();
    }

    public static void countDown() {
        System.out.println("Enter a number?");
        int num = userInput.nextInt();
        for(int i = num; i >= 0; i--) {
            System.out.println(i + " CountDown" );
        }
    }
}
