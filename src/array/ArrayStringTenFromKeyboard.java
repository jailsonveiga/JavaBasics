package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayStringTenFromKeyboard {
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] arrName = new String[10];

        System.out.println("Enter a text?");
        for ( int i = 0; i < arrName.length; i++) {
               arrName[i] = userInput.readLine();
        }
    }
}
