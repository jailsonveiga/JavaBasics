package array;

public class ArrayNumberNineToZero {
    public static void main(String[] args) {
        //Integer data type array that holds 10 elements
        int[] arrNum = new int[10];

        //use a for loop, starting i with initial value of 0
        //Check if i value is less than arrNum length
        //Increment i value by 1 after each iteration
        for (int i = 0; i < arrNum.length; i++) {
            //Do the arithmetic 9 minus i value after each iteration and store the value into arrNum array
            System.out.println("Number: " + (arrNum[i] = 9 - i));
        }
    }
}
