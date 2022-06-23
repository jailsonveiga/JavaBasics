package while_loop;

public class FromTenToOne {
    public static void main(String[] args) {
        //Initialize integer data type numTen and assign the value 10 and store the value 10 into numTen variable
        int numTen = 10;

        //While numTen value is greater than 10 iterator the loop
        while(numTen > 0) {
            //Display message on the screen and the value of numTen on each iteration
            System.out.println("Number - " + numTen);
            //Decrease 1 in after each iteration
            numTen--;
        }
    }
}
