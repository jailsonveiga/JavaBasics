package array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringArrayList {
    public static void main(String[] args) {
        //Initialize String data type name1, name2, name3, name4 and assign the value and store the value into variables name1, name2, name3, name4
        String name1 = "Lisa";
        String name2 = "Jorge";
        String name3 = "Fati";
        String name4 = "Arlinda";

        //Create an initial empty list and assign the future values and store the values into variable names
        List<String> names = new ArrayList<>();

        //add the value from variables name1, name2, name3, name4 and store the value into variable names
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);

        //Use the java class Collections and sort method the list of values of names
        Collections.sort(names);

        //Display the message on the screen and the values sorted from the list names array
        System.out.println("My sorted list of names: " + names);
    }
}
