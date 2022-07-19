package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day3_IntoToConditionalStatements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if(N % 2 != 0) {
            System.out.println("Weird");
        }

        else if( N >= 2 && N <= 5 && N % 2 == 0) {

            System.out.println("Not Weird");
        }

        else if(N >= 6  && N <= 20 && N % 2 == 0) {
            System.out.println("Weird");
        }
        else if(N > 20 && N % 2 == 0) {
            System.out.println("Not Weird");
        }
        else{
            System.out.println("Not Weird");
        }

        bufferedReader.close();
    }
}
