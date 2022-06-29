package while_loop;

public class LoopOneToTen {
    public static void main(String[] args) {
        //Initialize data type i and assign the initial value to 1 and store the value into i variable
        int i = 1;

        //While value of i is less or equal 10 run the loop
        while(i <= 10) {
            //Display message on the screen
            System.out.println("Print number " + i);
            //after each iteration increase i value by 1
            i++;
        }
    }
}
