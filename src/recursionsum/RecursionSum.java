package recursionsum;

public class RecursionSum {
    public static void main(String[] args) {
        System.out.println("Sum of (5) is: " + sum(5));
        System.out.println("Sum of (1) is: " + sum(1));
        System.out.println("Sum of (12) is: " + sum(12));
    }

    public static int sum(int n) {
        if (n == 1)
            return 1;
        else
            return n + sum(n-1);
    }
}
