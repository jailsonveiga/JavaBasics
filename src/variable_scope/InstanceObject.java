package variable_scope;

public class InstanceObject {

    public static void main(String[] args) {
        //Create new instance of object
        Apple apple = new Apple();

        //Display "Apple quantity? " and passing the value storing in apple.quantity. use the + operator to join the text together
        System.out.println("Apple quantity? " + apple.quantity);

        //
        apple.priceCount(apple.quantity);

        //Display "Apple total "  and the value of apple.quantity, use a + operator to join the text together and show the data on the screen
        System.out.println("Apple total " + apple.quantity);
    }

    public static class Apple{
        int quantity = 10; //10

        public void priceCount(int priceUnit) {

            priceUnit = 10; //10
            this.quantity = priceUnit + this.quantity; //20

            //Display "Apple adjust " and the value of priceUnit, use a + operator to join the text together and show the data on the screen
            System.out.println("Apple adjust " + priceUnit);

        }


    }
}
