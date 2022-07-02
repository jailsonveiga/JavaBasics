package array;

public class DisplayArray {
    public static void main(String[] args) {
        int[] arrNum = new int[10];

        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = i;
        }
        for (int i = 0; i < arrNum.length; i++) {
            System.out.println(arrNum[i]);
        }
    }
}
