package while_loop;

public class TenTenSquare {
    public static void main(String[] args) {
        //Initialize integer data type dollarSign and assign the initial value 1 and store the initial value into dollarSign variable
        int dollarSign = 1;

        //Initialize integer data type iteration and assign the initial value 1 and store the initial value into iteration variable
        int iteration = 1;

        //while dollarSign value is less or equal 10 iterate the loop
        while(dollarSign  <= 10) {
            //Display message on the screen
            System.out.println(iteration + " iteration -> $$$$$$$$$$");

            //Increase dollarSign by 1 after each iteration
            dollarSign++;

            //Increase dollarSign by 1 after each iteration
            iteration++;
        }
    }
}
