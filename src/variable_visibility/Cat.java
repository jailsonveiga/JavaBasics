package variable_visibility;

public class Cat {
    public static void main(String[] args) {
        //Create an object instance of Cat and store the value into the cat
        Cat cat = new Cat();

        //set a new value of cat name
        cat.setName("Charlie");

        //Display the value of cat name on the screen
        System.out.println(cat.name);
    }

    //Initialize the string datatype, assign the value and store the value into name variable
    private String name = "nameless cat";

    //create a method setName and pass one parameter String datatype name
    public void setName(String name) {
        this.name = name;
    }

}
