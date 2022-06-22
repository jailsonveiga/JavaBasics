package array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntArrayList {
    public static void main(String[] args) {
        //Initialize integer data type num1, num2, num3, num4 and assign the value and store the value into variable num1, num2, num3, num4
        int num1 = 25;
        int num2 = 12;
        int num3 = 113;
        int num4 = 0;

        //Create an empty List array and assign the new value add it  and store into numbers
        List<Integer> numbers = new ArrayList<>();

        //Add the value of num1, num2, num3, num4 and store the value into numbers
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);

        //Use the Collections' java class and sort to sort the numbers
        Collections.sort(numbers);

        //Display the message on the screen and the values of num1, num2, num3, num4 and numbers and use the + operator to join the text together
        System.out.println("The numbers sort? "  + num1 + " - " + num2 + " - " + num3 + " - " + num4 + " -> " + numbers);


    }
}
