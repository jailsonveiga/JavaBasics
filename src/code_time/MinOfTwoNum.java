package code_time;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinOfTwoNum {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());

        int min;
        if (number1 < number2) {
            min = number1;
        } else {
            min = number2;
        }
        System.out.println(min);
    }
}
