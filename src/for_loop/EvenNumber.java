package for_loop;

public class EvenNumber {
    public static void main(String[] args) {
        //Integer data type i assign initial value to 1 and store the future value into i
        //Check if i value is less or equal 100
        //Increment i by 1 after each iteration
        for(int i = 1; i <= 100; i++){
            //Check if i value modulo 2 is equal 0
            if(i % 2 == 0) {
                //If is true Display the value of i on the screen
                System.out.println(i);
            }
        }
    }
}
