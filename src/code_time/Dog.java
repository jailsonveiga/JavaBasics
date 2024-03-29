package code_time;

// The Dog class represents a dog object, with a name and an age
public class Dog {
    //There are instance variables, representing the state of a Dog object.
    // They are private, so they can only be accessed directly within the Dog class
    private String name;
    private int age;

    // This is a constructor, which is a special method used to create new object
    // It has the same name as the class, and is used to initialize the object's state
    public Dog(String name, int age) {
        // The "this" keyword refers to the current object
        // We use it here to distinguish between the instance variables and the parameters.

        this.name = name;
        this.age = age;
    }

    // These are getter methods, which allow us to access the private instance variables
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // These are setter methods, which allow us to update the private instance variables
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}