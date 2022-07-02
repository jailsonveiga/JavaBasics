package array;

public class DisplayArray {
    public static void main(String[] args) {
        //Integer array that hold 10 elements
        int[] arrNum = new int[10];

        //Fill the array
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = i;
        }
        //Display the contents of the array
        for (int i = 0; i < arrNum.length; i++) {
            System.out.println(arrNum[i]);
        }
    }
}
