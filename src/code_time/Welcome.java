package code_time;

public class Welcome {
    public static void main(String[] args) {
        signIn("Jay");
    }

    public static void signIn(String username) {
        if (username.equals("user")) {
            return;
        }
        System.out.println("Welcome, " + username);
        System.out.println("We've really missed you, " + username);
    }
}
