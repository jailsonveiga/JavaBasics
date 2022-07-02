package array;

public class StaticInitializationSumOf {
    public static void main(String[] args) {

        int[] arrNum = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int sum = 0;

        for (int i = 0; i < arrNum.length; i++) {
            sum += arrNum[i];

            System.out.println("Sum is " + sum);
        }
    }
}
