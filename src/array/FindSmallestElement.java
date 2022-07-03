package array;

public class FindSmallestElement {
    public static void main(String[] args) {
        int[] arrNum = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int min = arrNum[0];

        for (int i = 1; i < arrNum.length; i++) {
            if(arrNum[i] < min) {
                min = arrNum[i];
            }
            System.out.println ("Min is " + min);
        }
    }
}
