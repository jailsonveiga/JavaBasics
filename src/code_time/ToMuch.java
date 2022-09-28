package code_time;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToMuch {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        int number = Integer.parseInt(reader.readLine());

        while (number > 0) {
            System.out.println(string);
            number--;
        }
    }
}
