package variable_visibility;

public class CountCats {

    public static void main(String[] args) {
        //Initialize total variable name as integer datatype and assign the value of adding this two variable Cat.catCount1(2) and Cat.catCount(5) and the value store into variable total
        int total = Cat.catCount1(2) + Cat.catCount2(5);

        //Display the value of total variable and use the + operator to join the text on the screen
        System.out.println("The cat count total is " + total);
    }

    public static class Cat {
        //Initialize count variable as integer datatype and assign the initial value and store the value into count
        public static int count = 0;

        //Create a method catCount1 that takes one parameter count1 as integer data type
        public static int catCount1(int count1) {
            //Assign count1 into Cat.count
          Cat.count = count1;
          //Return Cat.count1
          return Cat.count;
        }

        //Create a method catCount2 that takes one parameter count2 as integer data type
        public static int catCount2(int count2) {
            //Assign count2 into Cat.count
            Cat.count = count2;
            //Return Cat.count2
            return Cat.count;
        }
    }
}
