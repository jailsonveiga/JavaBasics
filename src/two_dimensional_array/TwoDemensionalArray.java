package two_dimensional_array;

import java.util.Arrays;

public class TwoDemensionalArray {
    public static void main(String[] args) {
        //Two demensional array with integer data type with two rows and two columns
        int[][] numbers = new int[2][2];

        //assign value and store into numbers specifying rows and columns
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;

        //Display the value assign into numbers array
        System.out.println(Arrays.deepToString(numbers));
    }
}
