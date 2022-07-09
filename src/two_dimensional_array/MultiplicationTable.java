package two_dimensional_array;

import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {

        int[][] multiplication = new int[10][10];

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                multiplication[i - 1][j - 1] = i * j;
                System.out.print(multiplication[i - 1][j - 1]);
                System.out.print(" ");
            }
            System.out.println();
        }

        }
    }

