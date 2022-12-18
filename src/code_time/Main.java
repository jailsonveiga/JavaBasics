package code_time;


public class Main{
        public static void main(String[] args) {
            // here we create a new Main object using the constructor
            Dog d = new Dog("Neru", 3);

            // We use the getter method to retrieve the name and age of the Main
            System.out.println(d.getName()); // prints "Neru"
            System.out.println(d.getAge()); // prints 3
        }
    }

