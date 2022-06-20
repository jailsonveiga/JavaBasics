package if_statement;

public class CheckInterval {
    public static void main(String[] args) {
        //Call the method and pass its argument value
        checkInterval(60);
    }

    //Create a method static void and name it checkInterval and this method takes one parameter as an integer data type
    public static void checkInterval(int a) {
        //Check whether an integer is between 50 and 100
        if(a >=50 && a <=100) {
            //if is true report the result on the screen in the following form
            System.out.println("The number " + a + " is in the interval.");
        }
        //Otherwise, report this result on the screen in the following form
        else{
            System.out.println("The number " + a + " is not in the interval");
        }
    }
}
