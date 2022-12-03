package code_time;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DayOfTheWeek {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());
        String result = "No such day of the week";

        if (day == 1) {
            result = "Monday";
        }
        if (day == 2) {
            result = "Tuesday";
        }
        if (day == 3) {
            result = "Wednesday";
        }
        if (day == 4) {
            result = "Thursday";
        }
        if (day == 5) {
            result = "Friday";
        }
        if (day == 6) {
            result = "Saturday";
        }
        if (day == 7) {
            result = "Sunday";
        }

        System.out.println(result);
    }
}
