package variable_visibility;

public class NameRegister {
    public static void main(String[] args) {
        //Create an object instance of NameRegister and store the value into the cat
        NameRegister cat = new NameRegister();

        //add a value to the setName method
        cat.setName("Dora", "Pina");

        //Display the value of cat.fullName and join the text together using the + operator and show the on the screen
        System.out.println("The cat fullName is? " + cat.fullName);
    }

    ////Declare fullName variable as a String datatype
    private String fullName;

    //Create setName method and pass two parameter firstName, and lastName variable as String datatype
    public void setName(String firstName, String lastName) {
        //Concatenate the firstName and lastName and store into fullName variable

        //this.fullName is referring to the global variable "outside setName method" and firstName and LastName is the two parameter we declare in setName method with String datatype
        this.fullName = firstName + " " + lastName;
    }
}
