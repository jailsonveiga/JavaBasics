package code_time;

public class Interval {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        String in = "The number " + a + " is in the interval.";
        String out = "The number " + a + " is not in the interval.";

        if (a > 50) {
            if (a < 100) {
                System.out.println(in);
            } else {
                System.out.println(out);
            }
        } else {
            System.out.println(out);
        }
    }
}
