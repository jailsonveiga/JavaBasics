package array;

public class SmallestElementArray {
    public static void main(String[] args) {
        //Array of int that holds 11 elements
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        //Initialize integer data type min and assign the value of list on index 0 and store the value into min variable
        int min = list[0];

        //Initialize data type i and assign initial value to 1 and store the value into i
        //Check if i value is less than list element
        //Increase i value by 1 after each iteration
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }

        //Display message on the screen
        System.out.println("Min is " + min);
    }
}