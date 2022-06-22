package array_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringIntArrayListUserInput {
    public static BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        System.out.println("Enter your name?");
        String name1 = userInput.readLine();

        System.out.println("Enter your name?");
        String name2 = userInput.readLine();

        System.out.println("Enter your name?");
        String name3 = userInput.readLine();

        List<String> names = new ArrayList<>();

        names.add(name1);
        names.add(name2);
        names.add(name3);

        names.sort(Collections.reverseOrder());

        System.out.println("Sort names in descending order :\n" + names);

    }
}
