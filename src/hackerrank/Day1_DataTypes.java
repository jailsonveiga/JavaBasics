package hackerrank;

import java.util.Scanner;

public class Day1_DataTypes {
    public static void main(String[] args) {

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int num;

        double decimal;

        String name;

        /* Read and save an integer, double, and String to your variables.*/

        num = scan.nextInt();

        decimal = scan.nextDouble();

        scan.nextLine();

        name = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + num);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + decimal);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        String nameConcat = s + name;

        System.out.println(nameConcat);

        scan.close();


    }
}
