package array;

public class FindSmallestElement {
    public static void main(String[] args) {
        //Static initialization
        int[] arrNum = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        //Integer data type min and assign the arrNum at index 0 and store the value into min variable
        int min = arrNum[0];

        for (int i = 1; i < arrNum.length; i++) {
            if(arrNum[i] < min) {
                //assign the value of arrNum variable into min variable
                min = arrNum[i];
            }
            //Display the message on the screen
            System.out.println ("Min is " + min);
        }
    }
}
