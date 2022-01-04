public class JavaBasics {
    public static void main(String[] args){
        String firstName = "Jay";
        String lastName = "Veiga";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(createFullName("Jay", "Veiga"));
    }
    public static String createFullName(String firstName, String lastName){
        String fullName = firstName.concat(" " + lastName);
        return fullName;
    }

}
