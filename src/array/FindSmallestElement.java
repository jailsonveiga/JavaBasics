package array;

import java.util.Arrays;

public class FindSmallestElement {
    public static void main(String[] args) {
        int[] arrNum = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int size = arrNum.length;

        Arrays.sort(arrNum);

        System.out.println("Sorted Array: " + Arrays.toString(arrNum));

        int min = arrNum[0];

        System.out.println("Smallest element is: " + min);
    }
}
