package while_loop;

public class LoopTenToOne {
    public static void main(String[] args) {
        //Initialize data type i and assign the initial value to 10 and store the value into i variable
        int i = 10;

        //While value of i is dreater or equal 1 run the loop
        while(i >= 1) {
            //Display message on the screen
            System.out.println("Print number " + i);
            //after each iteration decrease i value by 1
            i--;
        }
    }
}
