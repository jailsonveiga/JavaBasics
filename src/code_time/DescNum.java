package code_time;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DescNum {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number > 0 && number < 10 && number % 2 == 0) {
            System.out.println("even single-digit number");
        } else if (number > 0 && number < 10 && number % 2 != 0) {
            System.out.println("odd single-digit number");
        } else if (number > 9 && number < 100 && number % 2 == 0) {
            System.out.println("even two-digit number");
        } else if (number > 9 && number < 100 && number % 2 != 0) {
            System.out.println("odd two-digit number");
        } else if (number > 99 && number < 1000 && number % 2 == 0) {
            System.out.println("even three-digit number");
        } else if (number > 99 && number < 1000 && number % 2 != 0) {
            System.out.println("odd three-digit number");
        }
    }
}
