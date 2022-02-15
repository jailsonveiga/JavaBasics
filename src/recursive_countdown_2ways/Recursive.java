package recursive_countdown_2ways;

public class Recursive {
    public static void main(String[] args) {
        countdownRecursive(5);
        System.out.println("------------");
        countdownRecursive(5);
    }
    public static void countdownIterative(int n) {
        while(n > 0) {
            System.out.println(n);
            n--;
        }
    }

    public static void countdownRecursive(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        countdownRecursive(n -1);
    }
}
