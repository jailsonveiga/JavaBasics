package for_loop;

public class TriangleOfEights {

    public static void main(String[] args) {
        //Initialize data type i and assign initial value to 1 and store the value into i
        //Check if i value is less than equal 10
        //add i value by 1 after each iteration
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                //Display message on the screen
                System.out.print("8");
            }
            //Display new line space on the screen
            System.out.println();
        }
    }
}
