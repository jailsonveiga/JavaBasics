package variable_datatype;

public class PrintHelloJava {
    public static void main (String[] args) {
        //Few ways to display "Hello Java" on the screen

        //Initialize datatype String and call the variable helloJava and assign the value "hello Java" and store the into variable helloJava
        String helloJava = "Hello Java";

        //Display "Hello Java" on the screen calling the variable name helloJava
        System.out.println (helloJava);

        //Initialize datatype String and call the variable helloString and assign the value "Hello" and store the value into variable helloString
        String helloString = "Hello";

        //Initialize datatype String and call the variable javaString and assign the value "Java" and store the value into variable JavaString
        String javaString = "Java";

        //Display "Hello" "Java" and add space using the empty string " " and a + sign to joying the string together and calling the variable names helloString javaString values on the screen
        System.out.println (helloString + " " + javaString);

        //Display "Hello Java" on the screen
        System.out.println ("Hello Java");

        //Display "Hello " "java" on the screen and use the + operate to join the string
        System.out.println ("Hello " + "Java");

        //Display "Hello" " java" on the screen and use the + operate to join the string
        System.out.println ("Hello" + " Java");

        //Display "Hello" " " "java" on the screen and use the + operate to join the string and empty string literal
        System.out.println ("Hello" + " " + "Java");
    }
}
