package hackerrank;

import java.util.Scanner;

class Calculator {

    public int divisorSum(int n)
    {
        int sum=0;
        for(int i=1 ; i<=n;i++)
        {
            if(n % i ==0)
                sum+=i;
        }
        return sum;
    }
}

public class Day19_Interfaces {
    public static <AdvancedArithmetic> void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = (AdvancedArithmetic) new Calculator();
        int sum = ((Calculator) myCalculator).divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
