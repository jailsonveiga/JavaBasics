package array;

public class ArrayNumberOneToTen {
    public static void main(String[] args) {
        //Integer data type array that holds 10 elements
      int[] arrNum = new int[10];

         //use a for loop, starting i with initial value of 0
        //Check if i value is less than arrNum length
        //Increment 1 after each iteration
      for(int i = 0; i < arrNum.length; i++) {
          //Display the message on the screen
          //Do the arithmetic i value plus 1 after each iteration and store the value into arrNum array
          System.out.println("Number: " + (arrNum[i] = i + 1));
      }
    }
}
