package code_time;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TakeOverTheWord {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String years = reader.readLine();
        System.out.println(name + " will take over the world in " + years + " years. Mwa-ha-ha!");
    }
}
