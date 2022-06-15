package variable_scope;

public class VariableAge {

    public static void main(String[] args) {
        //Create a new instance object of Person
       Person person = new Person();

       //Display  "Age: "  and the value of the person.age on the screen, use the + operator to join the text together
       System.out.println("Age: " + person.age);


       person.adjustAge(person.age);

        //Display "Adjusted age: "  and the value of person.age, use a + operator to join the text together and show the data on the screen
       System.out.println("Adjusted age: " + person.age);
    }

    //Create a Person class
    public static class Person {
        //Initialize a integer datatype variable age and assign the initial value and store into variable age using public access modifier
       int age = 20; //20

        //Create a method adjustAge that takes one parameter age with int datatype. these methods are void does not return any data
        public void adjustAge(int age)  {
            this.age = age + 20; //40

            //Display "The age is adjustAge() is: " and the value of age, use a + operator to join the text together and show the data on the screen
            System.out.println("The age is adjustAge() is: " + age);
        }

    }
}
