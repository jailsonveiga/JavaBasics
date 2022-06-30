package array;

public class SmallestElementArray {
    public static void main(String[] args) {
        //Array of int that holds 11 elements
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        //Initialize integer data type min and assign the value of list on index 0 and store the value into min variable
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }

        System.out.println("Min is " + min);
    }
}