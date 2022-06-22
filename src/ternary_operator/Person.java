package ternary_operator;

public class Person {
    //Attribute"properties"declaring Integer data type age with private access modifier
    private int age;

    //add Constructor
    public Person(int age) {
        this.age = age;
    }

    //add Getter/Setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        //Create an object person and assign the value and store the value into person
        Person person = new Person(22);

        //Declaring a String data type usherResponse
        String usherResponse;

        //Check if person age value is greater or equal 18
        if(person.getAge() >= 18) {
            //If is true executed this message on the screen
            usherResponse = "Everything is in order. Come in.";
        }
        //OtherWise, executed this message on the screen
        else{
            usherResponse = "This film is not suitable for your age";
        }
        //Display usherResponse value on the screen
        System.out.println(usherResponse);

        //using ternary operator
        //Condition ? true : false
        //Check if person age value is greater or equal 18
        //If is true executed block1
        //Otherwise executed block2
        String ternaryOperator = (person.getAge() >= 18)? "Everything is in order. Come in." : "This film is not suitable for your age";

        //Display the value of ternaryOperator and display the message on the screen
        System.out.println(ternaryOperator);

    }
}
