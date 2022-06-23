package for_loop;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Outer Loop
        //First statement we have our integer data type i with initial value of 1, second statement check if i is less or equal 10 and third statement increase i by 1 after each iteration
        for(int i = 1; i <= 10; i++) {
            //Inner Loop
            //First statement we have our integer data type j with initial value of 1, second statement check if j is less or equal 10 and third statement increase j by 1 after each iteration
            for(int j = 1; j <= 10; j++ ){
                //Display message on the screen
                System.out.print(i * j + " ");
            }
            //display space on the screen
            System.out.println();
        }
    }
}
