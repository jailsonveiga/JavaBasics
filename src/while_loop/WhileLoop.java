package while_loop;

public class WhileLoop {
    public static void main(String[] args) {
        //Initialize Integer data type timer and assign value 10 and store the value into timer
        int timer = 10;

        //Check if timer value 10 is greater than 0,
        while(timer > 0) {
            //Display message on the screen
            System.out.println(timer);
            //Decrease timer after each iterator
            timer--;
        }
    }
}
