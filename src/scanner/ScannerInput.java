package scanner;

import java.util.Scanner;

public class ScannerInput {
    public static void main (String[] args) {
        //Creating a Scanner object, and specified its data source(a string of text)

        Scanner input = new Scanner("Learning a new program,\n" +
                "and this new program,\n" +
                "it's call Java Programing,\n" +
                "thank you for your time!!");

        //nextLine() method accesses the data source
        // We can use the nextLine() method several times and display the entire poem excerpt:
        String s = input.nextLine();

        //Each time, our scanner takes one step forward and reads the next line
        System.out.println(s);

        //nextLine() method accesses the data source
        //We can use the nextLine() method several times and display the entire poem excerpt:
        s = input.nextLine();
        //Each time, our scanner takes one step forward and reads the next line
        System.out.println(s);

        //nextLine() method accesses the data source
        //We can use the nextLine() method several times and display the entire poem excerpt:
        s = input.nextLine();
        //Each time, our scanner takes one step forward and reads the next line
        System.out.println(s);

        //nextLine() method accesses the data source
        //We can use the nextLine() method several times and display the entire poem excerpt:
        s = input.nextLine();
        //Each time, our scanner takes one step forward and reads the next line
        System.out.println(s);
    }
}
