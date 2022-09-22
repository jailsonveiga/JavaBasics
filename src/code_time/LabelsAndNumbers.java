package code_time;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LabelsAndNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number == 0) {
            System.out.println("Zero");
        } else if (number > 0 && number % 2 == 0) {
            System.out.println("Positive even number");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("Positive odd number");
        } else if (number < 0 && number % 2 == 0) {
            System.out.println("Negative even number");
        } else if (number < 0 && number % 2 != 0) {
            System.out.println("Negative odd number");
        }
    }
}
