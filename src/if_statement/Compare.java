package if_statement;

public class Compare {
    public static void main(String[] args) {
        //Call the method compare and passing the argument value
        compare(6);

    }
    //Create a method compare with one parameter as an integer data type
    public static void compare(int a){
        //Check if a is less or equal to 5 if is executed the statement on the screen
        if(a <= 5) {
            System.out.println("The number is less than 5");
        }
        //Otherwise, executed this statement
        else{
            System.out.println("The number is equal or greater than 5");
        }
    }
}
