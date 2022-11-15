package code_time;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DeepAndPureLove {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();

        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Pure love. Ooo la-la!");
    }
}
