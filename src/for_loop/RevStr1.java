package for_loop;

import java.util.Scanner;

public class RevStr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        input = input.toLowerCase();
        StringBuffer inputSB = new StringBuffer(input);
        System.out.print(inputSB.reverse());
    }
}
