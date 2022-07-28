package code_time;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreetAndHouses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] countResidents = new int[15];
        for (int i = 0; i < 15; i++) {
            countResidents[i] = Integer.parseInt(reader.readLine());
        }

        int even = 0;
        int odd = 0;

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                even += countResidents[i];
            } else {
                odd += countResidents[i];
            }
        }

        if (even > odd) {
            System.out.println("Even-numbered houses have more residents.");
        } else if (odd > even) {
            System.out.println("Odd-numbered houses have more residents.");
        }
    }
}
