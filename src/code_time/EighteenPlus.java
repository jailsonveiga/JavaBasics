package code_time;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EighteenPlus {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        if (age < 18) {
            System.out.println("Grow up a little more");
        }
    }
}
