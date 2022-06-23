package while_loop;

public class TenNumbers {
    public static void main(String[] args) {
        //Initialize data type numTen and assign the value 1 and store the value 1 into numTen variable
        int numTen = 1;

        //While numTen is less or equal 10 iterator the loop
        while(numTen <= 10){
            //Display message on the screen and the value of numTen from each iteration
            System.out.println("Number - " + numTen);
            //Increase 1 after each iteration
            numTen++;
        }
    }
}
