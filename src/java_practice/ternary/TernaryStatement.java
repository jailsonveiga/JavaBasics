package java_practice.ternary;

public class TernaryStatement {
    public static void main(String[] args) {
        int i, j;
        i = 10;

        j = i < 0 ? -i : i; // get absolute value of 1
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + j);

        i = -10;
        j = i < 0 ? -i : i; // get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + j);
    }
}
