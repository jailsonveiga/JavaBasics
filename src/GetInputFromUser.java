import scanner.BufferedReaderInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GetInputFromUser {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Enter first number");
        int a = scan.nextInt();

        System.out.println("Enter second number");
        int b = scan.nextInt();

        System.out.println("Enter third number");
        int c = scan.nextInt();

        System.out.println(a);

        System.out.println(b);

        System.out.println(c);

        System.out.println("Enter first number");
        int d = Integer.parseInt(keyboard.readLine());

        System.out.println(d);

    }
}

