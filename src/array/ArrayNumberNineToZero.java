package array;

public class ArrayNumberNineToZero {
    public static void main(String[] args) {
        int[] arrNum = new int[10];

        for (int i = 0; i < arrNum.length; i++) {
            System.out.println("Number: " + (arrNum[i] = 9 - i));
        }
    }
}
