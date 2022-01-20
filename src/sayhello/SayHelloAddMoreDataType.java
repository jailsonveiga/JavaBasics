package sayhello;

import java.util.Scanner;

public class SayHelloAddMoreDataType {
   public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        getInput();
    }

    public static void getInput() {
        System.out.println("What is your name?");
        String name = userInput.nextLine();

        System.out.println("What is your initial middle name?");
        char initial = userInput.nextLine().charAt(0);

        System.out.println("How old are you?");
        byte age = userInput.nextByte();

        System.out.println("Are you married?");
        boolean married = userInput.nextBoolean();
        userInput.nextLine();

        System.out.println("What is your work ID number?");
        short idNumber = userInput.nextShort();

        System.out.println("How much do you make a year?");
        float money = userInput.nextFloat();

        System.out.println("How much do you want to make in the future?");
        double moneyInFuture = userInput.nextDouble();

        System.out.println("How may followers do you have in your FaceBook?");
        long followers = userInput.nextLong();

        System.out.println("How many employees are in your company?");
        int company = userInput.nextInt();

        System.out.println("My name is: " + name);
        System.out.println("My middle initial name is: " + initial);
        System.out.println("I am " + age + " years old");
        System.out.println("I am married? -> " + married);
        System.out.println("My work ID number is: " + idNumber);
        System.out.println("I make about " + money + " a year");
        System.out.println("I would like to make " + moneyInFuture + " in the next few years");
        System.out.println("I have about " + followers + " followers in FaceBook");
        System.out.println("My company have about " + company + " employees");
    }
}
