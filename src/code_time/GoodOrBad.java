package code_time;

public class GoodOrBad {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        if (a < 5) {
            System.out.println("The number is less than 5");
        } else {
            System.out.println("The number is equal or greater than 5");
        }
    }
}
