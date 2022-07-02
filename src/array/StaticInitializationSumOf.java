package array;

public class StaticInitializationSumOf {
    public static void main(String[] args) {

        //Integer array data type that hold this elements
        //Static initialization
        int[] arrNum = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        //Initialize a integer data type sum and assign the initial value to 0 and store the value into sum variable
        int sum = 0;

        for (int i = 0; i < arrNum.length; i++) {
            //Calculate the sum
            sum += arrNum[i];

            //Display the message on the screen
            System.out.println("Sum is " + sum);
        }
    }
}
