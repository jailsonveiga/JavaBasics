package numeric_operators_java;

public class ArithmethicOperator {
    public static void main(String[] args) {
        //Initialize Integer data type x and assign the value 999 and store the value into x
        int x = 999;
        //Initialize Integer data type y and assign the value 33 and store the value into y
        int y = 33;

        //Display the arithmetic value and display the result on the screen
        System.out.println("Arithmetic Display:");
        System.out.println("Value of x 999 + value of y 33 \n=" + (x + y)); //1032
        System.out.println("Value of x 999 - value of y 33 \n=" + (x - y)); // 966
        System.out.println("Value of x 999 * value of y 33 \n=" + (x * y)); // 32,967
        System.out.println("Value of x 999 / value of y 33 \n=" + (x / y)); //30
        System.out.println("Value of x 999 % value of y 33 \n=" + (x % y)); //9
        System.out.println("----------------------");
        //Display the comparison relational operators value and display the result on the screen
        System.out.println("Comparison relational operators Display:");
        System.out.println("Value of x 999 == value of y 33 \n=" + (x == y)); //false
        System.out.println("----------------------");
        //Display the increment and decrement  value and display the result on the screen
        System.out.println("Display Increment and Decrement:");
        x++;
        System.out.println(x);//1000
        x--;
        System.out.println(x);//999
        y++;
        System.out.println(y);//34
        y--;
        System.out.println(y);//33
    }
}
