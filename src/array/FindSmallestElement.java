package array;

import java.util.Arrays;

public class FindSmallestElement {
    public static void main(String[] args) {
        //Static initialization
        int[] arrNum = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        //assign the arrNum length array and store the value into size variable
        int size = arrNum.length;

        //Sort arrNum array
        Arrays.sort(arrNum);

        //Display message on the screen
        System.out.println("Sorted Array: " + Arrays.toString(arrNum));

    }
}
